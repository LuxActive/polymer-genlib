/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-apis project by Scott Miles <sjmiles@google.com>,Eric Bidelman <ebidel@gmail.com>
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google.widget;

import com.google.gwt.event.shared.HandlerRegistration;
import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.google.GoogleYoutubeApiElement;
import com.vaadin.polymer.google.widget.event.ApiLoadEvent;
import com.vaadin.polymer.google.widget.event.ApiLoadEventHandler;

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

        getPolymerElement().addEventListener(
                com.vaadin.polymer.google.event.ApiLoadEvent.NAME,
                new com.vaadin.polymer.google.event.ApiLoadEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.google.event.ApiLoadEvent event) {
                fireEvent(new ApiLoadEvent(event));
            }
        });

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public GoogleYoutubeApiElement getPolymerElement() {
        try {
            return (GoogleYoutubeApiElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
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
        return addHandler(handler, ApiLoadEvent.TYPE);
    }

}
