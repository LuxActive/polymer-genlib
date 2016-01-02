/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-ajax project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.shared.GwtEvent;

/**
 * <p>Fired when a response is received.</p>
 */
public class ResponseEvent extends GwtEvent<ResponseEventHandler> {

    public static Type<ResponseEventHandler> TYPE = new Type<ResponseEventHandler>();

    private com.vaadin.polymer.iron.event.ResponseEvent nativeEvent;

    public ResponseEvent(com.vaadin.polymer.iron.event.ResponseEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<ResponseEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ResponseEventHandler handler) {
        handler.onResponse(this);
    }

    public com.vaadin.polymer.iron.event.ResponseEvent getNativeEvent() {
        return nativeEvent;
    }

}
