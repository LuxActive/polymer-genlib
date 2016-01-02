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
public class ApiLoadEvent extends GwtEvent<ApiLoadEventHandler> {

    public static Type<ApiLoadEventHandler> TYPE = new Type<ApiLoadEventHandler>();

    private com.vaadin.polymer.google.event.ApiLoadEvent nativeEvent;

    public ApiLoadEvent(com.vaadin.polymer.google.event.ApiLoadEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<ApiLoadEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ApiLoadEventHandler handler) {
        handler.onApiLoad(this);
    }

    public com.vaadin.polymer.google.event.ApiLoadEvent getNativeEvent() {
        return nativeEvent;
    }

}
