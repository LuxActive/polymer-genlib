/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-swipeable-pages project by Pascal Gula aka MeTaNoV <pascal.gula@gmail.com>
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.iron.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Fired when an item is deselected</p>
 */
@JsType(isNative=true)
public interface IronDeselectEvent extends Event {

    @JsOverlay static final String NAME = "iron-deselect";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * 
         */
        @JsProperty JavaScriptObject getDetail();

        /**
         * <p>the item element</p>
         */
        @JsProperty JavaScriptObject getItem();

    }

}
