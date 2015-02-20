/*
 * Copyright 2014-2015 CyberVision, Inc.
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

package org.kaaproject.avro.ui.sandbox.client.mvp.view;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface MainView extends IsWidget {

    void setTitle(String title);

    void clearMessages();

    void setErrorMessage(String message);
    
    void setInfoMessage(String message);
    
    HasClickHandlers getGenerateFormButton();
    
    HasClickHandlers getResetButton();
    
    FormConstructorView getSchemaConstructorView();
    
    FormConstructorView getRecordConstructorView();
    
    void reset();
    
    void setPresenter(Presenter presenter);
    
    public interface Presenter {
        void goTo(Place place);
    }

}
