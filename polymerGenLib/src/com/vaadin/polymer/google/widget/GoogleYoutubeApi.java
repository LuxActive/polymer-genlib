/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-apis project by Scott Miles <sjmiles@google.com>,Eric Bidelman <ebidel@gmail.com>
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.google.widget;

import com.vaadin.polymer.google.*;

import com.vaadin.polymer.google.widget.event.ApiLoadEvent;
import com.vaadin.polymer.google.widget.event.ApiLoadEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Dynamically loads the Google Youtube Iframe API, firing the <code>api-load</code> event when ready.</p>
 * <p>Any number of components can use <code>&lt;google-youtube-api&gt;</code> elements, and the library will only be loaded once.</p>
 * <p><a href="https://developers.google.com/youtube/iframe_api_reference">https://developers.google.com/youtube/iframe_api_reference</a></p>
 */
public class GoogleYoutubeApi extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public GoogleYoutubeApi() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public GoogleYoutubeApi(String html) {
        super(GoogleYoutubeApiElement.TAG, GoogleYoutubeApiElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public GoogleYoutubeApiElement getPolymerElement() {
        return (GoogleYoutubeApiElement) getElement();
    }


    /**
     * 
     *
     * JavaScript Info:
     * @property callbackName
     * @type String
     * 
     */
    public String getCallbackName() {
        return getPolymerElement().getCallbackName();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property callbackName
     * @type String
     * 
     */
    public void setCallbackName(String value) {
        getPolymerElement().setCallbackName(value);
    }

    /**
     * <p>Name of event fired when library loads.</p>
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
     * <p>Name of event fired when library loads.</p>
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
