/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from zdkelt-time-picker project by zeDesk <dev@zedesk.net>
 * that is licensed with https://github.com/zedesk/zdkElt-time-picker/LICENCE license.
 */
package com.vaadin.polymer.zdkelt.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>an <code>change</code> event is emitted when the mouse is released</p>
 */
public class ChangeEvent extends DomEvent<ChangeEventHandler> {

    public static Type<ChangeEventHandler> TYPE = new Type<ChangeEventHandler>(
       com.vaadin.polymer.zdkelt.event.ChangeEvent.NAME, new ChangeEvent());


    public ChangeEvent() {
    }

    public Type<ChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ChangeEventHandler handler) {
        handler.onChange(this);
    }

    public com.vaadin.polymer.zdkelt.event.ChangeEvent getPolymerEvent() {
        return (com.vaadin.polymer.zdkelt.event.ChangeEvent)super.getNativeEvent();
    }


}
