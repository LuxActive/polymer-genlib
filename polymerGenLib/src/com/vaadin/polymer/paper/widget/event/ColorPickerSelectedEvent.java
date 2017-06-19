/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-swatch-picker project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when a color has been selected</p>
 */
public class ColorPickerSelectedEvent extends DomEvent<ColorPickerSelectedEventHandler> {

    public static Type<ColorPickerSelectedEventHandler> TYPE = new Type<ColorPickerSelectedEventHandler>(
       com.vaadin.polymer.paper.event.ColorPickerSelectedEvent.NAME, new ColorPickerSelectedEvent());


    public ColorPickerSelectedEvent() {
    }

    public Type<ColorPickerSelectedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ColorPickerSelectedEventHandler handler) {
        handler.onColorPickerSelected(this);
    }

    public com.vaadin.polymer.paper.event.ColorPickerSelectedEvent getPolymerEvent() {
        return (com.vaadin.polymer.paper.event.ColorPickerSelectedEvent)super.getNativeEvent();
    }


}
