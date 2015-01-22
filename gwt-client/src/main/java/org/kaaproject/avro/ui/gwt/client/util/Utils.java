/*
 * Copyright 2014 CyberVision, Inc.
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

package org.kaaproject.avro.ui.gwt.client.util;

import org.kaaproject.avro.ui.gwt.client.AvroUiResources;
import org.kaaproject.avro.ui.gwt.client.AvroUiResources.AvroUiStyle;
import org.kaaproject.avro.ui.gwt.client.i18n.AvroUiConstants;
import org.kaaproject.avro.ui.gwt.client.i18n.AvroUiMessages;

import com.google.gwt.core.client.GWT;

public class Utils {
    
    public static final AvroUiResources resources = GWT
            .create(AvroUiResources.class);
    
    public static final AvroUiMessages messages = GWT.create(
            AvroUiMessages.class);
    
    public static final AvroUiConstants constants = GWT.create(
            AvroUiConstants.class);
    
    public static final AvroUiStyle avroUiStyle = resources.avroUiStyle();
    
    public static boolean isNotBlank(String string) {
        return string != null && string.length() > 0;
    }
    
    public static boolean isNotBlank(CharSequence cs) {
        return cs != null && cs.length() > 0;
    }
    
    public static boolean isBlank(String string) {
        return string == null || string.length() == 0;
    }
    
    public static boolean isBlank(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

}
