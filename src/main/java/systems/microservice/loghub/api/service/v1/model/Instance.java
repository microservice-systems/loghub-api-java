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

import java.io.Serializable;
import java.util.UUID;

/**
 * @author Dmitry Kotlyarov
 * @since 1.0
 */
public class Instance implements Serializable {
    private static final long serialVersionUID = 1L;

    public final String service;
    public final String environment;
    public final String application;
    public final String version;
    public final String revision;
    public final String id;
    public final long createTime;
    public String hostName;
    public String hostIP;
    public int cpuCount;
    public String osArch;
    public String osName;
    public String osVersion;
    public UUID processUUID;
    public long processID;
    public long processStart;
    public String processCmdline;

    @JsonCreator
    public Instance(@JsonProperty("service") String service,
                    @JsonProperty("environment") String environment,
                    @JsonProperty("application") String application,
                    @JsonProperty("version") String version,
                    @JsonProperty("revision") String revision,
                    @JsonProperty("id") String id,
                    @JsonProperty("createTime") long createTime,
                    @JsonProperty("hostName") String hostName,
                    @JsonProperty("hostIP") String hostIP,
                    @JsonProperty("cpuCount") int cpuCount,
                    @JsonProperty("osArch") String osArch,
                    @JsonProperty("osName") String osName,
                    @JsonProperty("osVersion") String osVersion,
                    @JsonProperty("processUUID") UUID processUUID,
                    @JsonProperty("processID") long processID,
                    @JsonProperty("processStart") long processStart,
                    @JsonProperty("processCmdline") String processCmdline) {
        this.service = service;
        this.environment = environment;
        this.application = application;
        this.version = version;
        this.revision = revision;
        this.id = id;
        this.createTime = createTime;
        this.hostName = hostName;
        this.hostIP = hostIP;
        this.cpuCount = cpuCount;
        this.osArch = osArch;
        this.osName = osName;
        this.osVersion = osVersion;
        this.processUUID = processUUID;
        this.processID = processID;
        this.processStart = processStart;
        this.processCmdline = processCmdline;
    }
}
