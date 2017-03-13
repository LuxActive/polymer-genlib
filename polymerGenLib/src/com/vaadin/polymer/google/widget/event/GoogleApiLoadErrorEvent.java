/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-apis project by Scott Miles <sjmiles@google.com>,Eric Bidelman <ebidel@gmail.com>
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.google.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired if an error occurs while loading the requested API. Override this name<br>by setting <code>errorEventName</code>.</p>
 */
public class GoogleApiLoadErrorEvent extends DomEvent<GoogleApiLoadErrorEventHandler> {

    public static Type<GoogleApiLoadErrorEventHandler> TYPE = new Type<GoogleApiLoadErrorEventHandler>(
       com.vaadin.polymer.google.event.GoogleApiLoadErrorEvent.NAME, new GoogleApiLoadErrorEvent());


    public GoogleApiLoadErrorEvent() {
    }

    public Type<GoogleApiLoadErrorEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(GoogleApiLoadErrorEventHandler handler) {
        handler.onGoogleApiLoadError(this);
    }

    public com.vaadin.polymer.google.event.GoogleApiLoadErrorEvent getPolymerEvent() {
        return (com.vaadin.polymer.google.event.GoogleApiLoadErrorEvent)super.getNativeEvent();
    }


}
