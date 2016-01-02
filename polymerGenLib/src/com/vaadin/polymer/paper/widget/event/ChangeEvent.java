/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toggle-button project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.shared.GwtEvent;

/**
 * <p>Fired when the checked state changes due to user interaction.</p>
 */
public class ChangeEvent extends GwtEvent<ChangeEventHandler> {

    public static Type<ChangeEventHandler> TYPE = new Type<ChangeEventHandler>();

    private com.vaadin.polymer.paper.event.ChangeEvent nativeEvent;

    public ChangeEvent(com.vaadin.polymer.paper.event.ChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<ChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ChangeEventHandler handler) {
        handler.onChange(this);
    }

    public com.vaadin.polymer.paper.event.ChangeEvent getNativeEvent() {
        return nativeEvent;
    }

}
