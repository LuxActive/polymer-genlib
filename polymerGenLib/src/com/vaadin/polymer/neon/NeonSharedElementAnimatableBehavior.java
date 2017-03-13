/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from neon-animation project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.neon;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * <p>Use <code>Polymer.NeonSharedElementAnimatableBehavior</code> to implement elements containing shared element<br>animations.</p>
 */
@JsType(isNative=true)
public interface NeonSharedElementAnimatableBehavior {

    @JsOverlay public static final String NAME = "Polymer.NeonSharedElementAnimatableBehavior";
    @JsOverlay public static final String SRC = "neon-animation/neon-shared-element-animatable-behavior.html";


    /**
     * <p>A map of shared element id to node.</p>
     *
     * JavaScript Info:
     * @property sharedElements
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getSharedElements();
    /**
     * <p>A map of shared element id to node.</p>
     *
     * JavaScript Info:
     * @property sharedElements
     * @type Object
     * 
     */
    @JsProperty void setSharedElements(JavaScriptObject value);


}
