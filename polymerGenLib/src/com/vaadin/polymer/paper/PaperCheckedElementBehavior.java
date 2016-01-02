/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-behaviors project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>Use <code>Polymer.PaperCheckedElementBehavior</code> to implement a custom element<br>that has a <code>checked</code> property similar to <code>Polymer.IronCheckedElementBehavior</code><br>and is compatible with having a ripple effect.</p>
 */
@JsType
public interface PaperCheckedElementBehavior {

    public static final String TAG = "Polymer.PaperCheckedElementBehavior";
    public static final String SRC = "paper-behaviors/paper-checked-element-behavior.html";


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
