/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-ripple project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.paper.PaperRippleElement;

/**
 * <p>Material design: <a href="https://www.google.com/design/spec/animation/responsive-interaction.html#responsive-interaction-surface-reaction">Surface reaction</a></p>
 * <p><code>paper-ripple</code> provides a visual effect that other paper elements can<br>use to simulate a rippling effect emanating from the point of contact.  The<br>effect can be visualized as a concentric circle with motion.</p>
 * <p>Example:</p>
 * <pre><code>&lt;div style=&quot;position:relative&quot;&gt;
 *   &lt;paper-ripple&gt;&lt;/paper-ripple&gt;
 * &lt;/div&gt;
 * 
 * 
 * </code></pre><p>Note, it’s important that the parent container of the ripple be relative position, otherwise<br>the ripple will emanate outside of the desired container.</p>
 * <p><code>paper-ripple</code> listens to “mousedown” and “mouseup” events so it would display ripple<br>effect when touches on it.  You can also defeat the default behavior and<br>manually route the down and up actions to the ripple element.  Note that it is<br>important if you call <code>downAction()</code> you will have to make sure to call<br><code>upAction()</code> so that <code>paper-ripple</code> would end the animation loop.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-ripple id=&quot;ripple&quot; style=&quot;pointer-events: none;&quot;&gt;&lt;/paper-ripple&gt;
 * ...
 * downAction: function(e) {
 *   this.$.ripple.downAction({x: e.x, y: e.y});
 * },
 * upAction: function(e) {
 *   this.$.ripple.upAction();
 * }
 * 
 * 
 * </code></pre><p>Styling ripple effect:</p>
 * <p>  Use CSS color property to style the ripple:</p>
 * <pre><code>paper-ripple {
 *   color: #4285f4;
 * }
 * 
 * 
 * </code></pre><p>  Note that CSS color property is inherited so it is not required to set it on<br>  the <code>paper-ripple</code> element directly.</p>
 * <p>By default, the ripple is centered on the point of contact.  Apply the <code>recenters</code><br>attribute to have the ripple grow toward the center of its container.</p>
 * <pre><code>&lt;paper-ripple recenters&gt;&lt;/paper-ripple&gt;
 * 
 * 
 * </code></pre><p>You can also  center the ripple inside its container from the start.</p>
 * <pre><code>&lt;paper-ripple center&gt;&lt;/paper-ripple&gt;
 * 
 * 
 * </code></pre><p>Apply <code>circle</code> class to make the rippling effect within a circle.</p>
 * <pre><code>&lt;paper-ripple class=&quot;circle&quot;&gt;&lt;/paper-ripple&gt;
 * 
 * 
 * </code></pre>
 */
public class PaperRipple extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperRipple() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperRipple(String html) {
        super(PaperRippleElement.TAG, PaperRippleElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperRippleElement getPolymerElement() {
        try {
            return (PaperRippleElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>The initial opacity set on the wave.</p>
     *
     * JavaScript Info:
     * @property initialOpacity
     * @type Number
     * 
     */
    public double getInitialOpacity() {
        return getPolymerElement().getInitialOpacity();
    }
    /**
     * <p>The initial opacity set on the wave.</p>
     *
     * JavaScript Info:
     * @property initialOpacity
     * @type Number
     * 
     */
    public void setInitialOpacity(double value) {
        getPolymerElement().setInitialOpacity(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * 
     */
    public JavaScriptObject getKeyBindings() {
        return getPolymerElement().getKeyBindings();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * 
     */
    public void setKeyBindings(JavaScriptObject value) {
        getPolymerElement().setKeyBindings(value);
    }

    /**
     * <p>How fast (opacity per second) the wave fades out.</p>
     *
     * JavaScript Info:
     * @property opacityDecayVelocity
     * @type Number
     * 
     */
    public double getOpacityDecayVelocity() {
        return getPolymerElement().getOpacityDecayVelocity();
    }
    /**
     * <p>How fast (opacity per second) the wave fades out.</p>
     *
     * JavaScript Info:
     * @property opacityDecayVelocity
     * @type Number
     * 
     */
    public void setOpacityDecayVelocity(double value) {
        getPolymerElement().setOpacityDecayVelocity(value);
    }

    /**
     * <p>A list of the visual ripples.</p>
     *
     * JavaScript Info:
     * @property ripples
     * @type Array
     * 
     */
    public JsArray getRipples() {
        return getPolymerElement().getRipples();
    }
    /**
     * <p>A list of the visual ripples.</p>
     *
     * JavaScript Info:
     * @property ripples
     * @type Array
     * 
     */
    public void setRipples(JsArray value) {
        getPolymerElement().setRipples(value);
    }

    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTab
     */
    public JavaScriptObject getKeyEventTarget() {
        return getPolymerElement().getKeyEventTarget();
    }
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTab
     */
    public void setKeyEventTarget(JavaScriptObject value) {
        getPolymerElement().setKeyEventTarget(value);
    }

    /**
     * <p>If true, the ripple will remain in the “down” state until <code>holdDown</code><br>is set to false again.</p>
     *
     * JavaScript Info:
     * @property holdDown
     * @type Boolean
     * 
     */
    public boolean getHoldDown() {
        return getPolymerElement().getHoldDown();
    }
    /**
     * <p>If true, the ripple will remain in the “down” state until <code>holdDown</code><br>is set to false again.</p>
     *
     * JavaScript Info:
     * @property holdDown
     * @type Boolean
     * 
     */
    public void setHoldDown(boolean value) {
        getPolymerElement().setHoldDown(value);
    }

    /**
     * <p>If true, ripples will exhibit a gravitational pull towards<br>the center of their container as they fade away.</p>
     *
     * JavaScript Info:
     * @property recenters
     * @type Boolean
     * 
     */
    public boolean getRecenters() {
        return getPolymerElement().getRecenters();
    }
    /**
     * <p>If true, ripples will exhibit a gravitational pull towards<br>the center of their container as they fade away.</p>
     *
     * JavaScript Info:
     * @property recenters
     * @type Boolean
     * 
     */
    public void setRecenters(boolean value) {
        getPolymerElement().setRecenters(value);
    }

    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getStopKeyboardEventPropagation() {
        return getPolymerElement().getStopKeyboardEventPropagation();
    }
    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior PaperTab
     */
    public void setStopKeyboardEventPropagation(boolean value) {
        getPolymerElement().setStopKeyboardEventPropagation(value);
    }

    /**
     * <p>If true, ripples will center inside its container</p>
     *
     * JavaScript Info:
     * @property center
     * @type Boolean
     * 
     */
    public boolean getCenter() {
        return getPolymerElement().getCenter();
    }
    /**
     * <p>If true, ripples will center inside its container</p>
     *
     * JavaScript Info:
     * @property center
     * @type Boolean
     * 
     */
    public void setCenter(boolean value) {
        getPolymerElement().setCenter(value);
    }

    /**
     * <p>True when there are visible ripples animating within the<br>element.</p>
     *
     * JavaScript Info:
     * @property animating
     * @type Boolean
     * 
     */
    public boolean getAnimating() {
        return getPolymerElement().getAnimating();
    }
    /**
     * <p>True when there are visible ripples animating within the<br>element.</p>
     *
     * JavaScript Info:
     * @property animating
     * @type Boolean
     * 
     */
    public void setAnimating(boolean value) {
        getPolymerElement().setAnimating(value);
    }

    /**
     * <p>If true, the ripple will not generate a ripple effect<br>via pointer interaction.<br>Calling ripple’s imperative api like <code>simulatedRipple</code> will<br>still generate the ripple effect.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * 
     */
    public boolean getNoink() {
        return getPolymerElement().getNoink();
    }
    /**
     * <p>If true, the ripple will not generate a ripple effect<br>via pointer interaction.<br>Calling ripple’s imperative api like <code>simulatedRipple</code> will<br>still generate the ripple effect.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * 
     */
    public void setNoink(boolean value) {
        getPolymerElement().setNoink(value);
    }


    /**
     * <p>A list of the visual ripples.</p>
     *
     * JavaScript Info:
     * @attribute ripples
     * 
     */
    public void setRipples(String value) {
        getPolymerElement().setAttribute("ripples", value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @attribute key-bindings
     * @behavior PaperTab
     */
    public void setKeyBindings(String value) {
        getPolymerElement().setAttribute("key-bindings", value);
    }

    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @attribute key-event-target
     * @behavior PaperTab
     */
    public void setKeyEventTarget(String value) {
        getPolymerElement().setAttribute("key-event-target", value);
    }

    /**
     * <p>How fast (opacity per second) the wave fades out.</p>
     *
     * JavaScript Info:
     * @attribute opacity-decay-velocity
     * 
     */
    public void setOpacityDecayVelocity(String value) {
        getPolymerElement().setAttribute("opacity-decay-velocity", value);
    }

    /**
     * <p>The initial opacity set on the wave.</p>
     *
     * JavaScript Info:
     * @attribute initial-opacity
     * 
     */
    public void setInitialOpacity(String value) {
        getPolymerElement().setAttribute("initial-opacity", value);
    }


    /**
     * 
     *
     * JavaScript Info:
     * @method removeRipple
     * @param {} ripple  
     * 
     * 
     */
    public void removeRipple(Object ripple) {
        getPolymerElement().removeRipple(ripple);
    }

    /**
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior PaperTab
     * 
     */
    public void addOwnKeyBinding(Object eventString, Object handlerName) {
        getPolymerElement().addOwnKeyBinding(eventString, handlerName);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method keyboardEventMatchesKeys
     * @param {} event  
     * @param {} eventString  
     * @behavior PaperTab
     * 
     */
    public void keyboardEventMatchesKeys(Object event, Object eventString) {
        getPolymerElement().keyboardEventMatchesKeys(event, eventString);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method simulatedRipple
     * 
     * 
     */
    public void simulatedRipple() {
        getPolymerElement().simulatedRipple();
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method onAnimationComplete
     * 
     * 
     */
    public void onAnimationComplete() {
        getPolymerElement().onAnimationComplete();
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method animate
     * 
     * 
     */
    public void animate() {
        getPolymerElement().animate();
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method addRipple
     * 
     * 
     */
    public void addRipple() {
        getPolymerElement().addRipple();
    }

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior PaperTab
     * 
     */
    public void removeOwnKeyBindings() {
        getPolymerElement().removeOwnKeyBindings();
    }

    /**
     * <p>Provokes a ripple down effect via a UI event,<br><em>not</em> respecting the <code>noink</code> property.</p>
     *
     * JavaScript Info:
     * @method downAction
     * @param {Event=} event  
     * 
     * 
     */
    public void downAction(JavaScriptObject event) {
        getPolymerElement().downAction(event);
    }

    /**
     * <p>Provokes a ripple up effect via a UI event,<br><em>not</em> respecting the <code>noink</code> property.</p>
     *
     * JavaScript Info:
     * @method upAction
     * @param {Event=} event  
     * 
     * 
     */
    public void upAction(JavaScriptObject event) {
        getPolymerElement().upAction(event);
    }

    /**
     * <p>Provokes a ripple up effect via a UI event,<br>respecting the <code>noink</code> property.</p>
     *
     * JavaScript Info:
     * @method uiUpAction
     * @param {Event=} event  
     * 
     * 
     */
    public void uiUpAction(JavaScriptObject event) {
        getPolymerElement().uiUpAction(event);
    }

    /**
     * <p>Provokes a ripple down effect via a UI event,<br>respecting the <code>noink</code> property.</p>
     *
     * JavaScript Info:
     * @method uiDownAction
     * @param {Event=} event  
     * 
     * 
     */
    public void uiDownAction(JavaScriptObject event) {
        getPolymerElement().uiDownAction(event);
    }


}
