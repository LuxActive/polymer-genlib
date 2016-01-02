/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-apis project by Scott Miles <sjmiles@google.com>,Eric Bidelman <ebidel@gmail.com>
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google.widget.event;

import com.google.gwt.event.shared.GwtEvent;

/**
 * <p>Fired when the API library is loaded and available.</p>
 */
public class JsApiLoadEvent extends GwtEvent<JsApiLoadEventHandler> {

    public static Type<JsApiLoadEventHandler> TYPE = new Type<JsApiLoadEventHandler>();

    private com.vaadin.polymer.google.event.JsApiLoadEvent nativeEvent;

    public JsApiLoadEvent(com.vaadin.polymer.google.event.JsApiLoadEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<JsApiLoadEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(JsApiLoadEventHandler handler) {
        handler.onJsApiLoad(this);
    }

    public com.vaadin.polymer.google.event.JsApiLoadEvent getNativeEvent() {
        return nativeEvent;
    }

}
