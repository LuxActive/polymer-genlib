/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-behaviors project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * <p><code>Polymer.PaperRippleBehavior</code> dynamically implements a ripple<br>when the element has focus via pointer or keyboard.</p>
 * <p>NOTE: This behavior is intended to be used in conjunction with and after<br><code>Polymer.IronButtonState</code> and <code>Polymer.IronControlState</code>.</p>
 */
@JsType(isNative=true)
public interface PaperRippleBehavior {

    @JsOverlay public static final String NAME = "Polymer.PaperRippleBehavior";
    @JsOverlay public static final String SRC = "paper-behaviors/paper-ripple-behavior.html";


    /**
     * <p>If true, the element will not produce a ripple effect when interacted<br>with via the pointer.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * @behavior PaperToggleButton
     */
    @JsProperty boolean getNoink();
    /**
     * <p>If true, the element will not produce a ripple effect when interacted<br>with via the pointer.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * @behavior PaperToggleButton
     */
    @JsProperty void setNoink(boolean value);


    /**
     * <p>Returns the <code>&lt;paper-ripple&gt;</code> element used by this element to create<br>ripple effects. The element’s ripple is created on demand, when<br>necessary, and calling this method will force the<br>ripple to be created.</p>
     *
     * JavaScript Info:
     * @method getRipple
     * @behavior PaperToggleButton
     * 
     */
    void getRipple();

    /**
     * <p>Returns true if this element currently contains a ripple effect.</p>
     *
     * JavaScript Info:
     * @method hasRipple
     * @behavior PaperToggleButton
     * @return {boolean}
     */
    boolean hasRipple();

    /**
     * <p>Ensures this element contains a ripple effect. For startup efficiency<br>the ripple effect is dynamically on demand when needed.</p>
     *
     * JavaScript Info:
     * @method ensureRipple
     * @param {!Event=} optTriggeringEvent  
     * @behavior PaperToggleButton
     * 
     */
    void ensureRipple(JavaScriptObject optTriggeringEvent);

}