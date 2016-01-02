/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toggle-button project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.HTMLElement;

/**
 * <p>Material design: <a href="https://www.google.com/design/spec/components/selection-controls.html#selection-controls-switch">Switch</a></p>
 * <p><code>paper-toggle-button</code> provides a ON/OFF switch that user can toggle the state<br>by tapping or by dragging the switch.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-toggle-button&gt;&lt;/paper-toggle-button&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling:</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--paper-toggle-button-unchecked-bar-color</code></td>
 * <td>Slider color when the input is not checked</td>
 * <td><code>#000000</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toggle-button-unchecked-button-color</code></td>
 * <td>Button color when the input is not checked</td>
 * <td><code>--paper-grey-50</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toggle-button-unchecked-ink-color</code></td>
 * <td>Selected/focus ripple color when the input is not checked</td>
 * <td><code>--dark-primary-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toggle-button-checked-bar-color</code></td>
 * <td>Slider button color when the input is checked</td>
 * <td><code>--default-primary-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toggle-button-checked-button-color</code></td>
 * <td>Button color when the input is checked</td>
 * <td><code>--default-primary-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toggle-button-checked-ink-color</code></td>
 * <td>Selected/focus ripple color when the input is checked</td>
 * <td><code>--default-primary-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toggle-button-unchecked-bar</code></td>
 * <td>Mixin applied to the slider when the input is not checked</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toggle-button-unchecked-button</code></td>
 * <td>Mixin applied to the slider button when the input is not checked</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toggle-button-checked-bar</code></td>
 * <td>Mixin applied to the slider when the input is checked</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toggle-button-checked-button</code></td>
 * <td>Mixin applied to the slider button when the input is checked</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toggle-button-label-color</code></td>
 * <td>Label color</td>
 * <td><code>--primary-text-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toggle-button-label-spacing</code></td>
 * <td>Spacing between the label and the button</td>
 * <td><code>8px</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType
public interface PaperToggleButtonElement extends HTMLElement {

    public static final String TAG = "paper-toggle-button";
    public static final String SRC = "paper-toggle-button/paper-toggle-button.html";


    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty JavaScriptObject getKeyEventTarget();
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty void setKeyEventTarget(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty JavaScriptObject getKeyBindings();
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty void setKeyBindings(JavaScriptObject value);

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
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getActive();
    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setActive(boolean value);

    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getDisabled();
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setDisabled(boolean value);

    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getFocused();
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setFocused(boolean value);

    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getStopKeyboardEventPropagation();
    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setStopKeyboardEventPropagation(boolean value);

    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getPointerDown();
    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setPointerDown(boolean value);

    /**
     * <p>Gets or sets the state, <code>true</code> is checked and <code>false</code> is unchecked.</p>
     *
     * JavaScript Info:
     * @property checked
     * @type Boolean
     * @behavior PaperToggleButton
     */
    @JsProperty boolean getChecked();
    /**
     * <p>Gets or sets the state, <code>true</code> is checked and <code>false</code> is unchecked.</p>
     *
     * JavaScript Info:
     * @property checked
     * @type Boolean
     * @behavior PaperToggleButton
     */
    @JsProperty void setChecked(boolean value);

    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperToggleButton
     */
    @JsProperty boolean getToggles();
    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * @behavior PaperToggleButton
     */
    @JsProperty void setToggles(boolean value);

    /**
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior PaperToggleButton
     */
    @JsProperty boolean getInvalid();
    /**
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior PaperToggleButton
     */
    @JsProperty void setInvalid(boolean value);

    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getPressed();
    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setPressed(boolean value);

    /**
     * <p>Set to true to mark the input as required. If used in a form, a<br>custom element that uses this behavior should also use<br>Polymer.IronValidatableBehavior and define a custom validation method.<br>Otherwise, a <code>required</code> element will always be considered valid.<br>It’s also strongly recommended to provide a visual style for the element<br>when its value is invalid.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior PaperToggleButton
     */
    @JsProperty boolean getRequired();
    /**
     * <p>Set to true to mark the input as required. If used in a form, a<br>custom element that uses this behavior should also use<br>Polymer.IronValidatableBehavior and define a custom validation method.<br>Otherwise, a <code>required</code> element will always be considered valid.<br>It’s also strongly recommended to provide a visual style for the element<br>when its value is invalid.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior PaperToggleButton
     */
    @JsProperty void setRequired(boolean value);

    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getReceivedFocusFromKeyboard();
    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setReceivedFocusFromKeyboard(boolean value);

    /**
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior PaperToggleButton
     */
    @JsProperty String getValue();
    /**
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * @behavior PaperToggleButton
     */
    @JsProperty void setValue(String value);

    /**
     * <p>The name of this element.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior PaperToggleButton
     */
    @JsProperty String getName();
    /**
     * <p>The name of this element.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior PaperToggleButton
     */
    @JsProperty void setName(String value);

    /**
     * <p>The aria attribute to be set if the button is a toggle and in the<br>active state.</p>
     *
     * JavaScript Info:
     * @property ariaActiveAttribute
     * @type String
     * @behavior PaperTab
     */
    @JsProperty String getAriaActiveAttribute();
    /**
     * <p>The aria attribute to be set if the button is a toggle and in the<br>active state.</p>
     *
     * JavaScript Info:
     * @property ariaActiveAttribute
     * @type String
     * @behavior PaperTab
     */
    @JsProperty void setAriaActiveAttribute(String value);

    /**
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior PaperToggleButton
     */
    @JsProperty String getValidator();
    /**
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior PaperToggleButton
     */
    @JsProperty void setValidator(String value);

    /**
     * <p>Namespace for this validator.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior PaperToggleButton
     */
    @JsProperty String getValidatorType();
    /**
     * <p>Namespace for this validator.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior PaperToggleButton
     */
    @JsProperty void setValidatorType(String value);


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
    void addOwnKeyBinding(Object eventString, Object handlerName);

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
    void keyboardEventMatchesKeys(Object event, Object eventString);

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
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior PaperTab
     * 
     */
    void removeOwnKeyBindings();

    /**
     * 
     *
     * JavaScript Info:
     * @method hasValidator
     * @behavior PaperToggleButton
     * @return {boolean}
     */
    boolean hasValidator();

    /**
     * <p>Returns true if the <code>value</code> is valid, and updates <code>invalid</code>. If you want<br>your element to have custom validation logic, do not override this method;<br>override <code>_getValidity(value)</code> instead.</p>
     *
     * JavaScript Info:
     * @method validate
     * @param {Object} value  
     * @behavior PaperToggleButton
     * @return {boolean}
     */
    boolean validate(JavaScriptObject value);

    /**
     * <p>Ensures this element contains a ripple effect. For startup efficiency<br>the ripple effect is dynamically on demand when needed.</p>
     *
     * JavaScript Info:
     * @method ensureRipple
     * @param {!Event=} optTriggeringEvent  
     * @behavior PaperTab
     * 
     */
    void ensureRipple(JavaScriptObject optTriggeringEvent);

}
