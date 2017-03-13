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
 * <p>Fired when the API library is loaded and available.</p>
 */
public class JsApiLoadEvent extends DomEvent<JsApiLoadEventHandler> {

    public static Type<JsApiLoadEventHandler> TYPE = new Type<JsApiLoadEventHandler>(
       com.vaadin.polymer.google.event.JsApiLoadEvent.NAME, new JsApiLoadEvent());


    public JsApiLoadEvent() {
    }

    public Type<JsApiLoadEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(JsApiLoadEventHandler handler) {
        handler.onJsApiLoad(this);
    }

    public com.vaadin.polymer.google.event.JsApiLoadEvent getPolymerEvent() {
        return (com.vaadin.polymer.google.event.JsApiLoadEvent)super.getNativeEvent();
    }


}
