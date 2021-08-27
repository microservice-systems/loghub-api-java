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
    public int cpuCount;
    public String osArch;
    public String osName;
    public String osVersion;
    public String variables;
    public String properties;
    public String cmdline;
    public String io;
    public String limits;
    public String mounts;
    public String netDev;
    public String netProtocols;
    public String hostName;
    public String hostIP;

    @JsonCreator
    public Process(@JsonProperty("service") String service,
                   @JsonProperty("environment") String environment,
                   @JsonProperty("application") String application,
                   @JsonProperty("version") String version,
                   @JsonProperty("revision") String revision,
                   @JsonProperty("instance") String instance,
                   @JsonProperty("uuid") UUID uuid,
                   @JsonProperty("createTime") long createTime,
                   @JsonProperty("id") long id,
                   @JsonProperty("start") long start,
                   @JsonProperty("finish") long finish,
                   @JsonProperty("cpuCount") int cpuCount,
                   @JsonProperty("osArch") String osArch,
                   @JsonProperty("osName") String osName,
                   @JsonProperty("osVersion") String osVersion,
                   @JsonProperty("variables") String variables,
                   @JsonProperty("properties") String properties,
                   @JsonProperty("cmdline") String cmdline,
                   @JsonProperty("io") String io,
                   @JsonProperty("limits") String limits,
                   @JsonProperty("mounts") String mounts,
                   @JsonProperty("netDev") String netDev,
                   @JsonProperty("netProtocols") String netProtocols,
                   @JsonProperty("hostName") String hostName,
                   @JsonProperty("hostIP") String hostIP) {
        Argument.service("service", service);
        Argument.environment("environment", environment);
        Argument.application("application", application);
        Argument.version("version", version);
        Argument.revision("revision", revision);
        Argument.instance("instance", instance);
        Argument.notNull("uuid", uuid);
        Argument.inRangeLong("createTime", createTime, 0L, Long.MAX_VALUE);
        Argument.inRangeLong("start", start, 0L, Long.MAX_VALUE);
        Argument.inRangeLong("finish", finish, -1L, Long.MAX_VALUE);
        Argument.inRangeInt("cpuCount", cpuCount, 0, Integer.MAX_VALUE);
        Argument.notNull("osArch", osArch);
        Argument.notNull("osName", osName);
        Argument.notNull("osVersion", osVersion);
        Argument.notNull("variables", variables);
        Argument.notNull("properties", properties);
        Argument.notNull("hostName", hostName);
        Argument.notNull("hostIP", hostIP);

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
        this.cpuCount = cpuCount;
        this.osArch = osArch;
        this.osName = osName;
        this.osVersion = osVersion;
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
    }
}
