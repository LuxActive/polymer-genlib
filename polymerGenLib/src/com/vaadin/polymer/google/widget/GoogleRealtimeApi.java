/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-apis project by Scott Miles <sjmiles@google.com>,Eric Bidelman <ebidel@gmail.com>
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google.widget;

import com.vaadin.polymer.google.*;

import com.vaadin.polymer.google.widget.event.ApiLoadEvent;
import com.vaadin.polymer.google.widget.event.ApiLoadEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Dynamically loads the Google Drive Realtime API, firing the <code>api-load</code> event when ready.</p>
 * <p>Any number of components can use <code>&lt;google-realtime-api&gt;</code> elements, and the library will only be loaded once.</p>
 */
public class GoogleRealtimeApi extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public GoogleRealtimeApi() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public GoogleRealtimeApi(String html) {
        super(GoogleRealtimeApiElement.TAG, GoogleRealtimeApiElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public GoogleRealtimeApiElement getPolymerElement() {
        try {
            return (GoogleRealtimeApiElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
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
     * @event api-load
     */
    public HandlerRegistration addApiLoadHandler(ApiLoadEventHandler handler) {
        return addDomHandler(handler, ApiLoadEvent.TYPE);
    }

}
