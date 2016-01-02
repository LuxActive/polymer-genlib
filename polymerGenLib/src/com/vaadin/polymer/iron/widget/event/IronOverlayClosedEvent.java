/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toast project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.shared.GwtEvent;

/**
 * <p>Fired after the <code>iron-overlay</code> closes.</p>
 */
public class IronOverlayClosedEvent extends GwtEvent<IronOverlayClosedEventHandler> {

    public static Type<IronOverlayClosedEventHandler> TYPE = new Type<IronOverlayClosedEventHandler>();

    private com.vaadin.polymer.iron.event.IronOverlayClosedEvent nativeEvent;

    public IronOverlayClosedEvent(com.vaadin.polymer.iron.event.IronOverlayClosedEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<IronOverlayClosedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronOverlayClosedEventHandler handler) {
        handler.onIronOverlayClosed(this);
    }

    public com.vaadin.polymer.iron.event.IronOverlayClosedEvent getNativeEvent() {
        return nativeEvent;
    }

    /**
     * <p>to the <code>closingReason</code> attribute</p>
     */
    public Object getSet() {
        return getNativeEvent().getDetail().getSet();
    }

}
