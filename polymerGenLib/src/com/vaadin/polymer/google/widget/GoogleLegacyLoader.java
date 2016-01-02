/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-apis project by Scott Miles <sjmiles@google.com>,Eric Bidelman <ebidel@gmail.com>
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google.widget;

import com.google.gwt.event.shared.HandlerRegistration;
import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.google.GoogleLegacyLoaderElement;
import com.vaadin.polymer.google.widget.event.JsApiLoadEvent;
import com.vaadin.polymer.google.widget.event.JsApiLoadEventHandler;

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

        getPolymerElement().addEventListener(
                com.vaadin.polymer.google.event.JsApiLoadEvent.NAME,
                new com.vaadin.polymer.google.event.JsApiLoadEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.google.event.JsApiLoadEvent event) {
                fireEvent(new JsApiLoadEvent(event));
            }
        });

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public GoogleLegacyLoaderElement getPolymerElement() {
        try {
            return (GoogleLegacyLoaderElement) getElement();
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
     * @event js-api-load
     */
    public HandlerRegistration addJsApiLoadHandler(JsApiLoadEventHandler handler) {
        return addHandler(handler, JsApiLoadEvent.TYPE);
    }

}
