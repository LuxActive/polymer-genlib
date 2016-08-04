/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-slider project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the slider’s immediateValue changes.</p>
 */
public class ImmediateValueChangeEvent extends DomEvent<ImmediateValueChangeEventHandler> {

    public static Type<ImmediateValueChangeEventHandler> TYPE = new Type<ImmediateValueChangeEventHandler>(
       com.vaadin.polymer.paper.event.ImmediateValueChangeEvent.NAME, new ImmediateValueChangeEvent());


    public ImmediateValueChangeEvent() {
    }

    public Type<ImmediateValueChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ImmediateValueChangeEventHandler handler) {
        handler.onImmediateValueChange(this);
    }

    public com.vaadin.polymer.paper.event.ImmediateValueChangeEvent getPolymerEvent() {
        return (com.vaadin.polymer.paper.event.ImmediateValueChangeEvent)super.getNativeEvent();
    }


}
