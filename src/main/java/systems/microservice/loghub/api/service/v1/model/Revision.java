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

package systems.microservice.loghub.api.service.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import systems.microservice.loghub.sdk.util.Argument;

import java.io.Serializable;

/**
 * @author Dmitry Kotlyarov
 * @since 1.0
 */
public class Revision implements Serializable {
    private static final long serialVersionUID = 1L;

    public final String service;
    public final String environment;
    public final String application;
    public final String version;
    public final String id;
    public final long createTime;

    @JsonCreator
    public Revision(@JsonProperty("service") String service,
                    @JsonProperty("environment") String environment,
                    @JsonProperty("application") String application,
                    @JsonProperty("version") String version,
                    @JsonProperty("id") String id,
                    @JsonProperty("createTime") long createTime) {
        Argument.service("service", service);
        Argument.environment("environment", environment);
        Argument.application("application", application);
        Argument.version("version", version);
        Argument.revision("id", id);
        Argument.inRangeLong("createTime", createTime, 0L, Long.MAX_VALUE);

        this.service = service;
        this.environment = environment;
        this.application = application;
        this.version = version;
        this.id = id;
        this.createTime = createTime;
    }
}
