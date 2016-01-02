/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-apis project by Scott Miles <sjmiles@google.com>,Eric Bidelman <ebidel@gmail.com>
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google.widget.event;

import com.google.gwt.event.shared.GwtEvent;

/**
 * <p>Fired when the requested API is loaded. Override this name<br>by setting <code>successEventName</code>.</p>
 */
public class GoogleApiLoadEvent extends GwtEvent<GoogleApiLoadEventHandler> {

    public static Type<GoogleApiLoadEventHandler> TYPE = new Type<GoogleApiLoadEventHandler>();

    private com.vaadin.polymer.google.event.GoogleApiLoadEvent nativeEvent;

    public GoogleApiLoadEvent(com.vaadin.polymer.google.event.GoogleApiLoadEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<GoogleApiLoadEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(GoogleApiLoadEventHandler handler) {
        handler.onGoogleApiLoad(this);
    }

    public com.vaadin.polymer.google.event.GoogleApiLoadEvent getNativeEvent() {
        return nativeEvent;
    }

}
