/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toast project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Fired when the <code>iron-overlay</code> is canceled, but before it is closed.<br>Cancel the event to prevent the <code>iron-overlay</code> from closing.</p>
 */
@JsType(isNative=true)
public interface IronOverlayCanceledEvent extends Event {

    @JsOverlay static final String NAME = "iron-overlay-canceled";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * <p>The closing of the <code>iron-overlay</code> can be prevented<br>by calling <code>event.preventDefault()</code>. The <code>event.detail</code> is the original event that originated<br>the canceling (e.g. ESC keyboard event or click event outside the <code>iron-overlay</code>).</p>
         */
        @JsProperty JavaScriptObject getEvent();

    }

}
