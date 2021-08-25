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
public class Application implements Serializable {
    private static final long serialVersionUID = 1L;

    public final String service;
    public final String environment;
    public final String id;
    public final long createTime;
    public final String createUser;
    public long updateTime;
    public String updateUser;
    public String description;
    public String url;
    public String company;
    public String repository;
    public String picture;

    @JsonCreator
    public Application(@JsonProperty("service") String service,
                       @JsonProperty("environment") String environment,
                       @JsonProperty("id") String id,
                       @JsonProperty("createTime") long createTime,
                       @JsonProperty("createUser") String createUser,
                       @JsonProperty("updateTime") long updateTime,
                       @JsonProperty("updateUser") String updateUser,
                       @JsonProperty("description") String description,
                       @JsonProperty("url") String url,
                       @JsonProperty("company") String company,
                       @JsonProperty("repository") String repository,
                       @JsonProperty("picture") String picture) {
        Argument.service("service", service);
        Argument.environment("environment", environment);
        Argument.application("id", id);
        Argument.inRangeLong("createTime", createTime, 0L, Long.MAX_VALUE);
        Argument.userNullable("createUser", createUser);
        Argument.inRangeLong("updateTime", updateTime, 0L, Long.MAX_VALUE);
        Argument.userNullable("updateUser", updateUser);

        this.service = service;
        this.environment = environment;
        this.id = id;
        this.createTime = createTime;
        this.createUser = createUser;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
        this.description = description;
        this.url = url;
        this.company = company;
        this.repository = repository;
        this.picture = picture;
    }
}
