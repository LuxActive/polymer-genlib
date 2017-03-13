/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-apis project by Scott Miles <sjmiles@google.com>,Eric Bidelman <ebidel@gmail.com>
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.google.widget;

import com.vaadin.polymer.google.*;

import com.vaadin.polymer.google.widget.event.JsApiLoadEvent;
import com.vaadin.polymer.google.widget.event.JsApiLoadEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Dynamically loads the legacy Google JavaScript API Loader (<a href="https://developers.google.com/loader/">https://developers.google.com/loader/</a>).</p>
 * <p>Fires <code>api-load</code> event when ready.</p>
 */
public class GoogleLegacyLoader extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public GoogleLegacyLoader() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public GoogleLegacyLoader(String html) {
        super(GoogleLegacyLoaderElement.TAG, GoogleLegacyLoaderElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public GoogleLegacyLoaderElement getPolymerElement() {
        return (GoogleLegacyLoaderElement) getElement();
    }


    /**
     * <p>Name of event fired when library is loaded and available.</p>
     *
     * JavaScript Info:
     * @property notifyEvent
     * @type String
     * 
     */
    public String getNotifyEvent() {
        return getPolymerElement().getNotifyEvent();
    }
    /**
     * <p>Name of event fired when library is loaded and available.</p>
     *
     * JavaScript Info:
     * @property notifyEvent
     * @type String
     * 
     */
    public void setNotifyEvent(String value) {
        getPolymerElement().setNotifyEvent(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property libraryUrl
     * @type String
     * 
     */
    public String getLibraryUrl() {
        return getPolymerElement().getLibraryUrl();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property libraryUrl
     * @type String
     * 
     */
    public void setLibraryUrl(String value) {
        getPolymerElement().setLibraryUrl(value);
    }




    /**
     * <p>Fired when the API library is loaded and available.</p>
     *
     * JavaScript Info:
     * @event js-api-load
     */
    public HandlerRegistration addJsApiLoadHandler(JsApiLoadEventHandler handler) {
        return addDomHandler(handler, JsApiLoadEvent.TYPE);
    }

}
