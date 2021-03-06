/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toast project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Fired after the overlay closes.</p>
 */
@JsType(isNative=true)
public interface IronOverlayClosedEvent extends Event {

    @JsOverlay static final String NAME = "iron-overlay-closed";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * <p>The <code>event.detail</code> is the <code>closingReason</code> property<br>(contains <code>canceled</code>, whether the overlay was canceled).</p>
         */
        @JsProperty JavaScriptObject getEvent();

    }

}
