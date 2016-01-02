/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-drawer-panel project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.GwtEvent;

/**
 * <p>Fired when the narrow layout changes.</p>
 */
public class PaperResponsiveChangeEvent extends GwtEvent<PaperResponsiveChangeEventHandler> {

    public static Type<PaperResponsiveChangeEventHandler> TYPE = new Type<PaperResponsiveChangeEventHandler>();

    private com.vaadin.polymer.paper.event.PaperResponsiveChangeEvent nativeEvent;

    public PaperResponsiveChangeEvent(com.vaadin.polymer.paper.event.PaperResponsiveChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<PaperResponsiveChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperResponsiveChangeEventHandler handler) {
        handler.onPaperResponsiveChange(this);
    }

    public com.vaadin.polymer.paper.event.PaperResponsiveChangeEvent getNativeEvent() {
        return nativeEvent;
    }

    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getNativeEvent().getDetail().getDetail();
    }

    /**
     * <p>narrow: true if the panel is in narrow layout.</p>
     */
    public boolean getNarrow() {
        return getNativeEvent().getDetail().getNarrow();
    }

}
