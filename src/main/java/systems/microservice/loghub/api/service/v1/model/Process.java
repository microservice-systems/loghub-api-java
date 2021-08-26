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
import java.util.Map;
import java.util.UUID;

/**
 * @author Dmitry Kotlyarov
 * @since 1.0
 */
public class Process implements Serializable {
    private static final long serialVersionUID = 1L;

    public final String service;
    public final String environment;
    public final String application;
    public final String version;
    public final String revision;
    public final String instance;
    public final UUID uuid;
    public final long createTime;
    public final long id;
    public final long start;
    public long finish;
    public Map<String, String> variables;
    public Map<String, String> properties;
    public String cmdline;
    public String io;
    public String limits;
    public String mounts;
    public String netDev;
    public String netProtocols;
    public String hostName;
    public String hostIP;
    public final int cpuCount;
    public final String osArch;
    public final String osName;
    public final String osVersion;

    @JsonCreator
    public Process(String service,
                   String environment,
                   String application,
                   String version,
                   String revision,
                   String instance,
                   UUID uuid,
                   long createTime,
                   long id,
                   long start,
                   long finish,
                   Map<String, String> variables,
                   Map<String, String> properties,
                   String cmdline,
                   String io,
                   String limits,
                   String mounts,
                   String netDev,
                   String netProtocols,
                   String hostName,
                   String hostIP,
                   int cpuCount,
                   String osArch,
                   String osName,
                   String osVersion) {
        this.service = service;
        this.environment = environment;
        this.application = application;
        this.version = version;
        this.revision = revision;
        this.instance = instance;
        this.uuid = uuid;
        this.createTime = createTime;
        this.id = id;
        this.start = start;
        this.finish = finish;
        this.variables = variables;
        this.properties = properties;
        this.cmdline = cmdline;
        this.io = io;
        this.limits = limits;
        this.mounts = mounts;
        this.netDev = netDev;
        this.netProtocols = netProtocols;
        this.hostName = hostName;
        this.hostIP = hostIP;
        this.cpuCount = cpuCount;
        this.osArch = osArch;
        this.osName = osName;
        this.osVersion = osVersion;
    }
}
