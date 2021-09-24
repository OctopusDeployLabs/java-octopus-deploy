/*
 * Copyright (c) Octopus Deploy and contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 *  these files except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.octopus.sdk.logging;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;

public class SdkLogAppenderHelper implements AutoCloseable {

  private static final LoggerContext CONTEXT = (LoggerContext) LogManager.getContext(false);
  private static final Configuration LOG_CONFIG = CONTEXT.getConfiguration();
  private static final Level INITIAL_SDK_LOG_LEVEL =
      LOG_CONFIG.getLoggerConfig("com.octopus").getLevel();

  private final String appenderName;

  private SdkLogAppenderHelper(String appenderName) {
    this.appenderName = appenderName;
  }

  @SuppressWarnings("unused")
  public static SdkLogAppenderHelper registerLogAppender(
      final Appender appender, final Level level) {
    LOG_CONFIG.getRootLogger().addAppender(appender, level, null);
    LOG_CONFIG.getLoggerConfig("com.octopus").setLevel(level);
    CONTEXT.updateLoggers();
    return new SdkLogAppenderHelper(appender.getName());
  }

  @Override
  public void close() {
    LOG_CONFIG.getRootLogger().removeAppender(appenderName);
    LOG_CONFIG.getLoggerConfig("com.octopus").setLevel(INITIAL_SDK_LOG_LEVEL);
  }
}
