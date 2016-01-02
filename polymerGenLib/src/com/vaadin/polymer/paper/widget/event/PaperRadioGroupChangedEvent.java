/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-radio-group project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.shared.GwtEvent;

/**
 * <p>Fired when the radio group selection changes.</p>
 */
public class PaperRadioGroupChangedEvent extends GwtEvent<PaperRadioGroupChangedEventHandler> {

    public static Type<PaperRadioGroupChangedEventHandler> TYPE = new Type<PaperRadioGroupChangedEventHandler>();

    private com.vaadin.polymer.paper.event.PaperRadioGroupChangedEvent nativeEvent;

    public PaperRadioGroupChangedEvent(com.vaadin.polymer.paper.event.PaperRadioGroupChangedEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<PaperRadioGroupChangedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperRadioGroupChangedEventHandler handler) {
        handler.onPaperRadioGroupChanged(this);
    }

    public com.vaadin.polymer.paper.event.PaperRadioGroupChangedEvent getNativeEvent() {
        return nativeEvent;
    }

}
