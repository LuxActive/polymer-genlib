/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-button project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.event;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;

/**
 * <pre><code>Fired when the animation finishes.
 * This is useful if you want to wait until
 * the ripple animation finishes to perform some action.
 * 
 * 
 * </code></pre>
 */
@JsType
public interface TransitionendEvent extends Event {

    static final String NAME = "transitionend";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType
    interface Detail extends Event.Detail {

        /**
         * <p>Contains the animated node.</p>
         */
        @JsProperty JavaScriptObject getDetail();

    }


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(TransitionendEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((TransitionendEvent) event);
        }
    }
}
