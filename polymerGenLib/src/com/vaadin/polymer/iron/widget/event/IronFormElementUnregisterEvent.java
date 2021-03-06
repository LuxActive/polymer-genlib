/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toggle-button project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the element is removed from an <code>iron-form</code>.</p>
 */
public class IronFormElementUnregisterEvent extends DomEvent<IronFormElementUnregisterEventHandler> {

    public static Type<IronFormElementUnregisterEventHandler> TYPE = new Type<IronFormElementUnregisterEventHandler>(
       com.vaadin.polymer.iron.event.IronFormElementUnregisterEvent.NAME, new IronFormElementUnregisterEvent());


    public IronFormElementUnregisterEvent() {
    }

    public Type<IronFormElementUnregisterEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronFormElementUnregisterEventHandler handler) {
        handler.onIronFormElementUnregister(this);
    }

    public com.vaadin.polymer.iron.event.IronFormElementUnregisterEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronFormElementUnregisterEvent)super.getNativeEvent();
    }


}
