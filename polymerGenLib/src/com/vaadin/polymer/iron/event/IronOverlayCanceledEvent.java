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
 * <p>Fired when the <code>iron-overlay</code> is canceled, but before it is closed.<br>Cancel the event to prevent the <code>iron-overlay</code> from closing.</p>
 */
@JsType
public interface IronOverlayCanceledEvent extends Event {

    static final String NAME = "iron-overlay-canceled";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(IronOverlayCanceledEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((IronOverlayCanceledEvent) event);
        }
    }
}
