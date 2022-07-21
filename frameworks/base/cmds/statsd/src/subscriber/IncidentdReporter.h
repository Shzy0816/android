/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#pragma once

#include "HashableDimensionKey.h"
#include "config/ConfigKey.h"
#include "frameworks/base/cmds/statsd/src/statsd_config.pb.h"  // Alert, IncidentdDetails

namespace android {
namespace os {
namespace statsd {

/**
 * Calls incidentd to trigger an incident report and put in dropbox for uploading.
 */
bool GenerateIncidentReport(const IncidentdDetails& config, int64_t rule_id, int64_t metricId,
                            const MetricDimensionKey& dimensionKey, int64_t metricValue,
                            const ConfigKey& configKey);

}  // namespace statsd
}  // namespace os
}  // namespace android
