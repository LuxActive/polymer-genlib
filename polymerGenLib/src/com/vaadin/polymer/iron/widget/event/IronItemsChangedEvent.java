/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-tabs project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.shared.GwtEvent;

/**
 * 
 */
public class IronItemsChangedEvent extends GwtEvent<IronItemsChangedEventHandler> {

    public static Type<IronItemsChangedEventHandler> TYPE = new Type<IronItemsChangedEventHandler>();

    private com.vaadin.polymer.iron.event.IronItemsChangedEvent nativeEvent;

    public IronItemsChangedEvent(com.vaadin.polymer.iron.event.IronItemsChangedEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<IronItemsChangedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronItemsChangedEventHandler handler) {
        handler.onIronItemsChanged(this);
    }

    public com.vaadin.polymer.iron.event.IronItemsChangedEvent getNativeEvent() {
        return nativeEvent;
    }

}
