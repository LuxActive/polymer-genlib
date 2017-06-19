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
 * <p>an <code>update</code> event is emitted when the value change by dragging the mouse</p>
 */
public class UpdateEvent extends DomEvent<UpdateEventHandler> {

    public static Type<UpdateEventHandler> TYPE = new Type<UpdateEventHandler>(
       com.vaadin.polymer.zdkelt.event.UpdateEvent.NAME, new UpdateEvent());


    public UpdateEvent() {
    }

    public Type<UpdateEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(UpdateEventHandler handler) {
        handler.onUpdate(this);
    }

    public com.vaadin.polymer.zdkelt.event.UpdateEvent getPolymerEvent() {
        return (com.vaadin.polymer.zdkelt.event.UpdateEvent)super.getNativeEvent();
    }


}
