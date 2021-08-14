/*
 * Copyright (C) 2020 Microservice Systems, Inc.
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package systems.microservice.loghub.api.service.v1.service;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import systems.microservice.loghub.api.service.v1.model.Environment;
import systems.microservice.loghub.sdk.http.HttpClient;
import systems.microservice.loghub.sdk.http.HttpException;
import systems.microservice.loghub.sdk.util.Argument;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;

/**
 * @author Dmitry Kotlyarov
 * @since 1.0
 */
public class EnvironmentService implements Serializable {
    private static final long serialVersionUID = 1L;

    protected final HttpClient client;
    protected final String contentType;
    protected final ObjectMapper contentMapper;
    protected final String acceptType;
    protected final ObjectMapper acceptMapper;

    public EnvironmentService(HttpClient client) {
        Argument.notNull("client", client);

        this.client = client;
        this.contentType = "application/json";
        this.contentMapper = new ObjectMapper(new JsonFactory());
        this.acceptType = "application/json";
        this.acceptMapper = new ObjectMapper(new JsonFactory());
    }

    public HttpClient getClient() {
        return client;
    }

    public String getContentType() {
        return contentType;
    }

    public ObjectMapper getContentMapper() {
        return contentMapper;
    }

    public String getAcceptType() {
        return acceptType;
    }

    public ObjectMapper getAcceptMapper() {
        return acceptMapper;
    }

    public Environment get(String id) {
        Argument.notNull("id", id);

        try {
            HttpURLConnection conn = client.get("/loghub/api/service/v1/environment", null, acceptType);
            try {
                conn.setRequestProperty("loghub-id", id);
                conn.connect();
                try {
                    int rc = conn.getResponseCode();
                    if (rc == HttpURLConnection.HTTP_OK) {
                        try (InputStream in = conn.getInputStream()) {
                            return acceptMapper.readValue(in, Environment.class);
                        }
                    } else {
                        throw new HttpException(conn);
                    }
                } finally {
                    conn.disconnect();
                }
            } catch (IOException e) {
                throw new HttpException(conn, e);
            }
        } catch (IOException e) {
            throw new HttpException(e);
        }
    }
}
