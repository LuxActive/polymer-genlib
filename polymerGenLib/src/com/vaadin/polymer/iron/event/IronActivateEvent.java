/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-tabs project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.event;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;

/**
 * 
 */
@JsType
public interface IronActivateEvent extends Event {

    static final String NAME = "iron-activate";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType
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


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(IronActivateEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((IronActivateEvent) event);
        }
    }
}
