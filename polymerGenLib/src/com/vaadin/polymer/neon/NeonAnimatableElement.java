/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from neon-animation project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.neon;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.HTMLElement;

/**
 * <p><code>&lt;neon-animatable&gt;</code> is a simple container element implementing <code>Polymer.NeonAnimatableBehavior</code>. This is a convenience element for use with <code>&lt;neon-animated-pages&gt;</code>.</p>
 * <pre><code>&lt;neon-animated-pages selected=&quot;0&quot;
 *                      entry-animation=&quot;slide-from-right-animation&quot;
 *                      exit-animation=&quot;slide-left-animation&quot;&gt;
 *   &lt;neon-animatable&gt;1&lt;/neon-animatable&gt;
 *   &lt;neon-animatable&gt;2&lt;/neon-animatable&gt;
 * &lt;/neon-animated-pages&gt;
 * </code></pre>
 */
@JsType
public interface NeonAnimatableElement extends HTMLElement {

    public static final String TAG = "neon-animatable";
    public static final String SRC = "neon-animation/neon-animation.html";


    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getAnimationConfig();
    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * 
     */
    @JsProperty void setAnimationConfig(JavaScriptObject value);

    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * 
     */
    @JsProperty String getEntryAnimation();
    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * 
     */
    @JsProperty void setEntryAnimation(String value);

    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * @behavior PaperTooltip
     */
    @JsProperty String getExitAnimation();
    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * @behavior PaperTooltip
     */
    @JsProperty void setExitAnimation(String value);


    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior PaperTabs
     * 
     */
    void stopResizeNotificationsFor(Object target);

    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior PaperTabs
     * 
     */
    void assignParentResizable(Object parentResizable);

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior PaperTabs
     * 
     */
    void notifyResize();

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior PaperTabs
     * @return {boolean}
     */
    boolean resizerShouldNotify(JavaScriptObject element);

}
