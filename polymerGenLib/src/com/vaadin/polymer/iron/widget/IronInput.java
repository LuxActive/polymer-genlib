/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-input project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.iron.widget.event.IronInputValidateEvent;
import com.vaadin.polymer.iron.widget.event.IronInputValidateEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>&lt;iron-input&gt;</code> is a wrapper to a native <code>&lt;input&gt;</code> element, that adds two-way binding<br>and prevention of invalid input. To use it, you must distribute a native <code>&lt;input&gt;</code><br>yourself. You can continue to use the native <code>input</code> as you would normally:</p>
 * <pre><code>&lt;iron-input&gt;
 *   &lt;input&gt;
 * &lt;/iron-input&gt;
 * 
 * &lt;iron-input&gt;
 *   &lt;input type=&quot;email&quot; disabled&gt;
 * &lt;/iron-input&gt;
 * 
 * 
 * </code></pre><h3 id="two-way-binding">Two-way binding</h3>
 * <p>By default you can only get notified of changes to a native <code>&lt;input&gt;</code>‘s <code>value</code><br>due to user input:</p>
 * <pre><code>&lt;input value=&quot;{{myValue::input}}&quot;&gt;
 * 
 * 
 * </code></pre><p>This means that if you imperatively set the value (i.e. <code>someNativeInput.value = &#39;foo&#39;</code>),<br>no events will be fired and this change cannot be observed.</p>
 * <p><code>iron-input</code> adds the <code>bind-value</code> property that mirrors the native <code>input</code>‘s ‘<code>value</code> property; this<br>property can be used for two-way data binding.<br><code>bind-value</code> will notify if it is changed either by user input or by script.</p>
 * <pre><code>&lt;iron-input bind-value=&quot;{{myValue}}&quot;&gt;
 *   &lt;input&gt;
 * &lt;/iron-input&gt;
 * 
 * 
 * </code></pre><p>Note: this means that if you want to imperatively set the native <code>input</code>‘s, you <em>must</em><br>set <code>bind-value</code> instead, so that the wrapper <code>iron-input</code> can be notified.</p>
 * <h3 id="validation">Validation</h3>
 * <p><code>iron-input</code> uses the native <code>input</code>‘s validation. For simplicity, <code>iron-input</code><br>has a <code>validate()</code> method (which internally just checks the distributed <code>input</code>‘s<br>validity), which sets an <code>invalid</code> attribute that can also be used for styling.</p>
 * <p>To validate automatically as you type, you can use the <code>auto-validate</code> attribute.</p>
 * <p><code>iron-input</code> also fires an <code>iron-input-validate</code> event after <code>validate()</code> is<br>called. You can use it to implement a custom validator:</p>
 * <pre><code>var CatsOnlyValidator = {
 *   validate: function(ironInput) {
 *     var valid = !ironInput.bindValue || ironInput.bindValue === &#39;cat&#39;;
 *     ironInput.invalid = !valid;
 *     return valid;
 *   }
 * }
 * ironInput.addEventListener(&#39;iron-input-validate&#39;, function() {
 *   CatsOnly.validate(input2);
 * });
 * 
 * 
 * </code></pre><p>You can also use an element implementing an <a href="/element/PolymerElements/iron-validatable-behavior"><code>IronValidatorBehavior</code></a>.<br>This example can also be found in the demo for this element:</p>
 * <pre><code>&lt;iron-input validator=&quot;cats-only&quot;&gt;
 *   &lt;input&gt;
 * &lt;/iron-input&gt;
 * 
 * 
 * </code></pre><h3 id="preventing-invalid-input">Preventing invalid input</h3>
 * <p>It may be desirable to only allow users to enter certain characters. You can use the<br><code>allowed-pattern</code> attribute to accomplish this. This feature<br>is separate from validation, and <code>allowed-pattern</code> does not affect how the input is validated.</p>
 * <pre><code>// Only allow typing digits, but a valid input has exactly 5 digits.
 * &lt;iron-input allowed-pattern=&quot;[0-9]&quot;&gt;
 *   &lt;input pattern=&quot;\d{5}&quot;&gt;
 * &lt;/iron-input&gt;
 * 
 * 
 * </code></pre>
 */
public class IronInput extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronInput() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronInput(String html) {
        super(IronInputElement.TAG, IronInputElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronInputElement getPolymerElement() {
        return (IronInputElement) getElement();
    }


    /**
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior PaperToggleButton
     */
    public boolean getInvalid() {
        return getPolymerElement().getInvalid();
    }
    /**
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior PaperToggleButton
     */
    public void setInvalid(boolean value) {
        getPolymerElement().setInvalid(value);
    }

    /**
     * <p>Computed property that echoes <code>bindValue</code> (mostly used for Polymer 1.0<br>backcompatibility, if you were one-way binding to the Polymer 1.0<br><code>input is=&quot;iron-input&quot;</code> value attribute).</p>
     *
     * JavaScript Info:
     * @property value
     * @type Object
     * 
     */
    public JavaScriptObject getValue() {
        return getPolymerElement().getValue();
    }
    /**
     * <p>Computed property that echoes <code>bindValue</code> (mostly used for Polymer 1.0<br>backcompatibility, if you were one-way binding to the Polymer 1.0<br><code>input is=&quot;iron-input&quot;</code> value attribute).</p>
     *
     * JavaScript Info:
     * @property value
     * @type Object
     * 
     */
    public void setValue(JavaScriptObject value) {
        getPolymerElement().setValue(value);
    }

    /**
     * <p>Set to true to auto-validate the input value as you type.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * 
     */
    public boolean getAutoValidate() {
        return getPolymerElement().getAutoValidate();
    }
    /**
     * <p>Set to true to auto-validate the input value as you type.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * 
     */
    public void setAutoValidate(boolean value) {
        getPolymerElement().setAutoValidate(value);
    }

    /**
     * <p>Use this property instead of <code>value</code> for two-way data binding, or to<br>set a default value for the input. <strong>Do not</strong> use the distributed<br>input’s <code>value</code> property to set a default value.</p>
     *
     * JavaScript Info:
     * @property bindValue
     * @type String
     * 
     */
    public String getBindValue() {
        return getPolymerElement().getBindValue();
    }
    /**
     * <p>Use this property instead of <code>value</code> for two-way data binding, or to<br>set a default value for the input. <strong>Do not</strong> use the distributed<br>input’s <code>value</code> property to set a default value.</p>
     *
     * JavaScript Info:
     * @property bindValue
     * @type String
     * 
     */
    public void setBindValue(String value) {
        getPolymerElement().setBindValue(value);
    }

    /**
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior PaperToggleButton
     */
    public String getValidator() {
        return getPolymerElement().getValidator();
    }
    /**
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior PaperToggleButton
     */
    public void setValidator(String value) {
        getPolymerElement().setValidator(value);
    }

    /**
     * <p>Namespace for this validator. This property is deprecated and should<br>not be used. For all intents and purposes, please consider it a<br>read-only, config-time property.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior PaperToggleButton
     */
    public String getValidatorType() {
        return getPolymerElement().getValidatorType();
    }
    /**
     * <p>Namespace for this validator. This property is deprecated and should<br>not be used. For all intents and purposes, please consider it a<br>read-only, config-time property.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior PaperToggleButton
     */
    public void setValidatorType(String value) {
        getPolymerElement().setValidatorType(value);
    }

    /**
     * <p>Regex-like list of characters allowed as input; all characters not in the list<br>will be rejected. The recommended format should be a list of allowed characters,<br>for example, <code>[a-zA-Z0-9.+-!;:]</code>.</p>
     * <p>This pattern represents the allowed characters for the field; as the user inputs text,<br>each individual character will be checked against the pattern (rather than checking<br>the entire value as a whole). If a character is not a match, it will be rejected.</p>
     * <p>Pasted input will have each character checked individually; if any character<br>doesn’t match <code>allowedPattern</code>, the entire pasted string will be rejected.</p>
     * <p>Note: if you were using <code>iron-input</code> in 1.0, you were also required to<br>set <code>prevent-invalid-input</code>. This is no longer needed as of Polymer 2.0,<br>and will be set automatically for you if an <code>allowedPattern</code> is provided.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * 
     */
    public String getAllowedPattern() {
        return getPolymerElement().getAllowedPattern();
    }
    /**
     * <p>Regex-like list of characters allowed as input; all characters not in the list<br>will be rejected. The recommended format should be a list of allowed characters,<br>for example, <code>[a-zA-Z0-9.+-!;:]</code>.</p>
     * <p>This pattern represents the allowed characters for the field; as the user inputs text,<br>each individual character will be checked against the pattern (rather than checking<br>the entire value as a whole). If a character is not a match, it will be rejected.</p>
     * <p>Pasted input will have each character checked individually; if any character<br>doesn’t match <code>allowedPattern</code>, the entire pasted string will be rejected.</p>
     * <p>Note: if you were using <code>iron-input</code> in 1.0, you were also required to<br>set <code>prevent-invalid-input</code>. This is no longer needed as of Polymer 2.0,<br>and will be set automatically for you if an <code>allowedPattern</code> is provided.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * 
     */
    public void setAllowedPattern(String value) {
        getPolymerElement().setAllowedPattern(value);
    }


    // Needed in UIBinder
    /**
     * <p>Computed property that echoes <code>bindValue</code> (mostly used for Polymer 1.0<br>backcompatibility, if you were one-way binding to the Polymer 1.0<br><code>input is=&quot;iron-input&quot;</code> value attribute).</p>
     *
     * JavaScript Info:
     * @attribute value
     * 
     */
    public void setValue(String value) {
        Polymer.property(this.getPolymerElement(), "value", value);
    }


    /**
     * <p>Returns true if <code>value</code> is valid. The validator provided in <code>validator</code> will be used first,<br>then any constraints.</p>
     *
     * JavaScript Info:
     * @method validate
     * 
     * @return {boolean}
     */
    public boolean validate() {
        return getPolymerElement().validate();
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method hasValidator
     * @behavior PaperToggleButton
     * @return {boolean}
     */
    public boolean hasValidator() {
        return getPolymerElement().hasValidator();
    }

    /**
     * <p>Returns true if the <code>value</code> is valid, and updates <code>invalid</code>. If you want<br>your element to have custom validation logic, do not override this method;<br>override <code>_getValidity(value)</code> instead.</p>
     *
     * JavaScript Info:
     * @method validate
     * @param {Object} value  
     * @behavior PaperToggleButton
     * @return {boolean}
     */
    public boolean validate(JavaScriptObject value) {
        return getPolymerElement().validate(value);
    }


    /**
     * <p>Fired whenever <code>validate()</code> is called.</p>
     *
     * JavaScript Info:
     * @event iron-input-validate
     */
    public HandlerRegistration addIronInputValidateHandler(IronInputValidateEventHandler handler) {
        return addDomHandler(handler, IronInputValidateEvent.TYPE);
    }

}
