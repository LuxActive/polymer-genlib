/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-apis project by Scott Miles <sjmiles@google.com>,Eric Bidelman <ebidel@gmail.com>
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Dynamically loads the Google Drive Realtime API, firing the <code>api-load</code> event when ready.</p>
 * <p>Any number of components can use <code>&lt;google-realtime-api&gt;</code> elements, and the library will only be loaded once.</p>
 */
@JsType(isNative=true)
public interface GoogleRealtimeApiElement extends HTMLElement {

    @JsOverlay public static final String TAG = "google-realtime-api";
    @JsOverlay public static final String SRC = "google-apis/google-realtime-api.html";


    /**
     * <p>Name of event fired when library is loaded and available.</p>
     *
     * JavaScript Info:
     * @property notifyEvent
     * @type String
     * 
     */
    @JsProperty String getNotifyEvent();
    /**
     * <p>Name of event fired when library is loaded and available.</p>
     *
     * JavaScript Info:
     * @property notifyEvent
     * @type String
     * 
     */
    @JsProperty void setNotifyEvent(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property libraryUrl
     * @type String
     * 
     */
    @JsProperty String getLibraryUrl();
    /**
     * 
     *
     * JavaScript Info:
     * @property libraryUrl
     * @type String
     * 
     */
    @JsProperty void setLibraryUrl(String value);


}
