/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-slider project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.shared.GwtEvent;

/**
 * <p>Fired when the slider’s value changes.</p>
 */
public class ValueChangeEvent extends GwtEvent<ValueChangeEventHandler> {

    public static Type<ValueChangeEventHandler> TYPE = new Type<ValueChangeEventHandler>();

    private com.vaadin.polymer.paper.event.ValueChangeEvent nativeEvent;

    public ValueChangeEvent(com.vaadin.polymer.paper.event.ValueChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<ValueChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ValueChangeEventHandler handler) {
        handler.onValueChange(this);
    }

    public com.vaadin.polymer.paper.event.ValueChangeEvent getNativeEvent() {
        return nativeEvent;
    }

}
