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

package org.kaaproject.avro.ui.sandbox.client;

import com.google.gwt.i18n.client.ConstantsWithLookup;

public interface AvroUiSandboxConstants extends ConstantsWithLookup {

    @DefaultStringValue("Ok")
    String ok();

    @DefaultStringValue("Yes")
    String yes();

    @DefaultStringValue("No")
    String no();

    @DefaultStringValue("Cancel")
    String cancel();

    @DefaultStringValue("Close")
    String close();

    @DefaultStringValue("Unexpected service error occurred: ")
    String general_error();
    
    @DefaultStringValue("Avro json schema")
    String avroJsonSchema();
    
    @DefaultStringValue("Generate form")
    String generateForm();
    
    @DefaultStringValue("Generated form")
    String generatedForm();
    
    @DefaultStringValue("Reset")
    String reset();

}



