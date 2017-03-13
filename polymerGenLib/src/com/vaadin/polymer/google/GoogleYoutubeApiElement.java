/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-apis project by Scott Miles <sjmiles@google.com>,Eric Bidelman <ebidel@gmail.com>
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.google;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Dynamically loads the Google Youtube Iframe API, firing the <code>api-load</code> event when ready.</p>
 * <p>Any number of components can use <code>&lt;google-youtube-api&gt;</code> elements, and the library will only be loaded once.</p>
 * <p><a href="https://developers.google.com/youtube/iframe_api_reference">https://developers.google.com/youtube/iframe_api_reference</a></p>
 */
@JsType(isNative=true)
public interface GoogleYoutubeApiElement extends HTMLElement {

    @JsOverlay public static final String TAG = "google-youtube-api";
    @JsOverlay public static final String SRC = "google-apis/google-youtube-api.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property callbackName
     * @type String
     * 
     */
    @JsProperty String getCallbackName();
    /**
     * 
     *
     * JavaScript Info:
     * @property callbackName
     * @type String
     * 
     */
    @JsProperty void setCallbackName(String value);

    /**
     * <p>Name of event fired when library loads.</p>
     *
     * JavaScript Info:
     * @property notifyEvent
     * @type String
     * 
     */
    @JsProperty String getNotifyEvent();
    /**
     * <p>Name of event fired when library loads.</p>
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
