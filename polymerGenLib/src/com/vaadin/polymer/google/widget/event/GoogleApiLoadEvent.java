/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-apis project by Scott Miles <sjmiles@google.com>,Eric Bidelman <ebidel@gmail.com>
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the requested API is loaded. Override this name<br>by setting <code>successEventName</code>.</p>
 */
public class GoogleApiLoadEvent extends DomEvent<GoogleApiLoadEventHandler> {

    public static Type<GoogleApiLoadEventHandler> TYPE = new Type<GoogleApiLoadEventHandler>(
       com.vaadin.polymer.google.event.GoogleApiLoadEvent.NAME, new GoogleApiLoadEvent());


    public GoogleApiLoadEvent() {
    }

    public Type<GoogleApiLoadEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(GoogleApiLoadEventHandler handler) {
        handler.onGoogleApiLoad(this);
    }

    public com.vaadin.polymer.google.event.GoogleApiLoadEvent getPolymerEvent() {
        return (com.vaadin.polymer.google.event.GoogleApiLoadEvent)super.getNativeEvent();
    }


}
