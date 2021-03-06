/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-layout project by The Polymer Authors
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the layout of app-drawer has changed.</p>
 */
public class AppResetLayoutEvent extends DomEvent<AppResetLayoutEventHandler> {

    public static Type<AppResetLayoutEventHandler> TYPE = new Type<AppResetLayoutEventHandler>(
       com.vaadin.polymer.app.event.AppResetLayoutEvent.NAME, new AppResetLayoutEvent());


    public AppResetLayoutEvent() {
    }

    public Type<AppResetLayoutEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(AppResetLayoutEventHandler handler) {
        handler.onAppResetLayout(this);
    }

    public com.vaadin.polymer.app.event.AppResetLayoutEvent getPolymerEvent() {
        return (com.vaadin.polymer.app.event.AppResetLayoutEvent)super.getNativeEvent();
    }


}
