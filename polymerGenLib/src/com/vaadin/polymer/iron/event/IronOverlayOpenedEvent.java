/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toast project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.event;

import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;

/**
 * <p>Fired after the <code>iron-overlay</code> opens.</p>
 */
@JsType
public interface IronOverlayOpenedEvent extends Event {

    static final String NAME = "iron-overlay-opened";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(IronOverlayOpenedEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((IronOverlayOpenedEvent) event);
        }
    }
}
