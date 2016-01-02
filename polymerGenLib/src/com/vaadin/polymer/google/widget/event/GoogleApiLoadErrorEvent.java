/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-apis project by Scott Miles <sjmiles@google.com>,Eric Bidelman <ebidel@gmail.com>
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google.widget.event;

import com.google.gwt.event.shared.GwtEvent;

/**
 * <p>Fired if an error occurs while loading the requested API. Override this name<br>by setting <code>errorEventName</code>.</p>
 */
public class GoogleApiLoadErrorEvent extends GwtEvent<GoogleApiLoadErrorEventHandler> {

    public static Type<GoogleApiLoadErrorEventHandler> TYPE = new Type<GoogleApiLoadErrorEventHandler>();

    private com.vaadin.polymer.google.event.GoogleApiLoadErrorEvent nativeEvent;

    public GoogleApiLoadErrorEvent(com.vaadin.polymer.google.event.GoogleApiLoadErrorEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<GoogleApiLoadErrorEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(GoogleApiLoadErrorEventHandler handler) {
        handler.onGoogleApiLoadError(this);
    }

    public com.vaadin.polymer.google.event.GoogleApiLoadErrorEvent getNativeEvent() {
        return nativeEvent;
    }

}
