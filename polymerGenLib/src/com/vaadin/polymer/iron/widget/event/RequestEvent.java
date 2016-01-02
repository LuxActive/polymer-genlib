/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-ajax project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.shared.GwtEvent;

/**
 * <p>Fired when a request is sent.</p>
 */
public class RequestEvent extends GwtEvent<RequestEventHandler> {

    public static Type<RequestEventHandler> TYPE = new Type<RequestEventHandler>();

    private com.vaadin.polymer.iron.event.RequestEvent nativeEvent;

    public RequestEvent(com.vaadin.polymer.iron.event.RequestEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<RequestEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(RequestEventHandler handler) {
        handler.onRequest(this);
    }

    public com.vaadin.polymer.iron.event.RequestEvent getNativeEvent() {
        return nativeEvent;
    }

}
