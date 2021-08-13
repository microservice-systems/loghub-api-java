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

package systems.microservice.loghub.api.service.v1.model.page;

import systems.microservice.loghub.api.service.v1.model.entity.Environment;

import java.io.Serializable;

/**
 * @author Dmitry Kotlyarov
 * @since 1.0
 */
public class EnvironmentPage implements Serializable {
    private static final long serialVersionUID = 1L;

    public Environment environment;
    public long applications;
    public long versions;
    public long revisions;
    public long instances;
    public long eventsTotalCount;
    public long eventsTotalSize;
    public long eventsSentCount;
    public long eventsSentSize;
    public long eventsLostCount;
    public long eventsLostSize;
    public long eventsPerMonth;
    public long eventsPerWeek;
    public long eventsPerDay;
    public long eventsPerHour;
    public long eventsPerMinute;
    public long metricsTotalCount;
    public long metricsTotalSize;
    public long metricsSentCount;
    public long metricsSentSize;
    public long metricsLostCount;
    public long metricsLostSize;
    public long metricsPerMonth;
    public long metricsPerWeek;
    public long metricsPerDay;
    public long metricsPerHour;
    public long metricsPerMinute;
}
