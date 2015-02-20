/*
 * Copyright 20142-2015 CyberVision, Inc.
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

package org.kaaproject.avro.ui.sandbox.services.util;

import org.kaaproject.avro.ui.sandbox.shared.services.AvroUiSandboxServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utils {

    /** The Constant logger. */
    private static final Logger logger = LoggerFactory.getLogger(Utils.class);

    public static AvroUiSandboxServiceException handleException(Exception exception) {
        return handleException(exception, true);
    }

    public static AvroUiSandboxServiceException handleException(Exception exception, boolean logException) {
        if (logException) {
            logger.error("Unexpected exception catched!", exception);
        }
        if (exception instanceof AvroUiSandboxServiceException) {
            return (AvroUiSandboxServiceException)exception;
        }
        else {
            AvroUiSandboxServiceException sandboxServiceException =
                    new AvroUiSandboxServiceException(exception.getMessage());
            return sandboxServiceException;
        }
    }

}
