/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toast project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.event;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;

/**
 * <p>Fired after the <code>iron-overlay</code> closes.</p>
 */
@JsType
public interface IronOverlayClosedEvent extends Event {

    static final String NAME = "iron-overlay-closed";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType
    interface Detail extends Event.Detail {

        /**
         * <p>to the <code>closingReason</code> attribute</p>
         */
        @JsProperty Object getSet();

    }


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(IronOverlayClosedEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((IronOverlayClosedEvent) event);
        }
    }
}
