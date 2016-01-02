/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-input project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.HTMLElement;

/**
 * <p><code>&lt;paper-textarea&gt;</code> is a multi-line text field with Material Design styling.</p>
 * <pre><code>&lt;paper-textarea label=&quot;Textarea label&quot;&gt;&lt;/paper-textarea&gt;
 * 
 * 
 * </code></pre><p>See <code>Polymer.PaperInputBehavior</code> for more API docs.</p>
 * <h3 id="validation">Validation</h3>
 * <p>Currently only <code>required</code> and <code>maxlength</code> validation is supported.</p>
 * <h3 id="styling">Styling</h3>
 * <p>See <code>Polymer.PaperInputContainer</code> for a list of custom properties used to<br>style this element.</p>
 */
@JsType
public interface PaperTextareaElement extends HTMLElement {

    public static final String TAG = "paper-textarea";
    public static final String SRC = "paper-input/paper-textarea.html";


    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>size</code> property.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * @behavior PaperTextarea
     */
    @JsProperty double getSize();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>size</code> property.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * @behavior PaperTextarea
     */
    @JsProperty void setSize(double value);

    /**
     * <p>The maximum length of the input value. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>maxlength</code> property.</p>
     *
     * JavaScript Info:
     * @property maxlength
     * @type Number
     * 
     */
    @JsProperty double getMaxlength();
    /**
     * <p>The maximum length of the input value. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>maxlength</code> property.</p>
     *
     * JavaScript Info:
     * @property maxlength
     * @type Number
     * 
     */
    @JsProperty void setMaxlength(double value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>minlength</code> property.</p>
     *
     * JavaScript Info:
     * @property minlength
     * @type Number
     * 
     */
    @JsProperty double getMinlength();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>minlength</code> property.</p>
     *
     * JavaScript Info:
     * @property minlength
     * @type Number
     * 
     */
    @JsProperty void setMinlength(double value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>results</code> property, used with type=search.</p>
     *
     * JavaScript Info:
     * @property results
     * @type Number
     * 
     */
    @JsProperty double getResults();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>results</code> property, used with type=search.</p>
     *
     * JavaScript Info:
     * @property results
     * @type Number
     * 
     */
    @JsProperty void setResults(double value);

    /**
     * <p>The maximum number of rows this element can grow to until it<br>scrolls. 0 means no maximum.</p>
     *
     * JavaScript Info:
     * @property maxRows
     * @type Number
     * 
     */
    @JsProperty double getMaxRows();
    /**
     * <p>The maximum number of rows this element can grow to until it<br>scrolls. 0 means no maximum.</p>
     *
     * JavaScript Info:
     * @property maxRows
     * @type Number
     * 
     */
    @JsProperty void setMaxRows(double value);

    /**
     * <p>The initial number of rows.</p>
     *
     * JavaScript Info:
     * @property rows
     * @type Number
     * 
     */
    @JsProperty double getRows();
    /**
     * <p>The initial number of rows.</p>
     *
     * JavaScript Info:
     * @property rows
     * @type Number
     * 
     */
    @JsProperty void setRows(double value);

    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getKeyBindings();
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * 
     */
    @JsProperty void setKeyBindings(JavaScriptObject value);

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
     * <p>Set to true to prevent the user from entering invalid input. Bind this to the<br><code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>preventInvalidInput</code> property.</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * 
     */
    @JsProperty boolean getPreventInvalidInput();
    /**
     * <p>Set to true to prevent the user from entering invalid input. Bind this to the<br><code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>preventInvalidInput</code> property.</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * 
     */
    @JsProperty void setPreventInvalidInput(boolean value);

    /**
     * <p>Returns true if the value is invalid. Bind this to both the <code>&lt;paper-input-container&gt;</code>‘s<br>and the input’s <code>invalid</code> property.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty boolean getInvalid();
    /**
     * <p>Returns true if the value is invalid. Bind this to both the <code>&lt;paper-input-container&gt;</code>‘s<br>and the input’s <code>invalid</code> property.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty void setInvalid(boolean value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>readonly</code> property.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * 
     */
    @JsProperty boolean getReadonly();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>readonly</code> property.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * 
     */
    @JsProperty void setReadonly(boolean value);

    /**
     * <p>Set to true to mark the input as required. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>required</code> property.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * 
     */
    @JsProperty boolean getRequired();
    /**
     * <p>Set to true to mark the input as required. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>required</code> property.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * 
     */
    @JsProperty void setRequired(boolean value);

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
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>multiple</code> property, used with type=file.</p>
     *
     * JavaScript Info:
     * @property multiple
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty boolean getMultiple();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>multiple</code> property, used with type=file.</p>
     *
     * JavaScript Info:
     * @property multiple
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty void setMultiple(boolean value);

    /**
     * <p>Set to true to disable the floating label. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>noLabelFloat</code> property.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty boolean getNoLabelFloat();
    /**
     * <p>Set to true to disable the floating label. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>noLabelFloat</code> property.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty void setNoLabelFloat(boolean value);

    /**
     * <p>Set to true to auto-validate the input value. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>autoValidate</code> property.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * 
     */
    @JsProperty boolean getAutoValidate();
    /**
     * <p>Set to true to auto-validate the input value. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>autoValidate</code> property.</p>
     *
     * JavaScript Info:
     * @property autoValidate
     * @type Boolean
     * 
     */
    @JsProperty void setAutoValidate(boolean value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autofocus</code> property.</p>
     *
     * JavaScript Info:
     * @property autofocus
     * @type Boolean
     * 
     */
    @JsProperty boolean getAutofocus();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autofocus</code> property.</p>
     *
     * JavaScript Info:
     * @property autofocus
     * @type Boolean
     * 
     */
    @JsProperty void setAutofocus(boolean value);

    /**
     * <p>Set to true to show a character counter.</p>
     *
     * JavaScript Info:
     * @property charCounter
     * @type Boolean
     * 
     */
    @JsProperty boolean getCharCounter();
    /**
     * <p>Set to true to show a character counter.</p>
     *
     * JavaScript Info:
     * @property charCounter
     * @type Boolean
     * 
     */
    @JsProperty void setCharCounter(boolean value);

    /**
     * <p>Set to true to disable this input. Bind this to both the <code>&lt;paper-input-container&gt;</code>‘s<br>and the input’s <code>disabled</code> property.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    @JsProperty boolean getDisabled();
    /**
     * <p>Set to true to disable this input. Bind this to both the <code>&lt;paper-input-container&gt;</code>‘s<br>and the input’s <code>disabled</code> property.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
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
     * <p>Set to true to always float the label. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>alwaysFloatLabel</code> property.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty boolean getAlwaysFloatLabel();
    /**
     * <p>Set to true to always float the label. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>alwaysFloatLabel</code> property.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty void setAlwaysFloatLabel(boolean value);

    /**
     * <p>The label for this input. Bind this to <code>&lt;label&gt;</code>‘s content and <code>hidden</code> property, e.g.<br><code>&lt;label hidden$=&quot;[[!label]]&quot;&gt;[[label]]&lt;/label&gt;</code> in your <code>template</code></p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * 
     */
    @JsProperty String getLabel();
    /**
     * <p>The label for this input. Bind this to <code>&lt;label&gt;</code>‘s content and <code>hidden</code> property, e.g.<br><code>&lt;label hidden$=&quot;[[!label]]&quot;&gt;[[label]]&lt;/label&gt;</code> in your <code>template</code></p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * 
     */
    @JsProperty void setLabel(String value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>inputmode</code> property.</p>
     *
     * JavaScript Info:
     * @property inputmode
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getInputmode();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>inputmode</code> property.</p>
     *
     * JavaScript Info:
     * @property inputmode
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setInputmode(String value);

    /**
     * <p>The datalist of the input (if any). This should match the id of an existing <code>&lt;datalist&gt;</code>. Bind this<br>to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>list</code> property.</p>
     *
     * JavaScript Info:
     * @property list
     * @type String
     * 
     */
    @JsProperty String getList();
    /**
     * <p>The datalist of the input (if any). This should match the id of an existing <code>&lt;datalist&gt;</code>. Bind this<br>to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>list</code> property.</p>
     *
     * JavaScript Info:
     * @property list
     * @type String
     * 
     */
    @JsProperty void setList(String value);

    /**
     * <p>The maximum (numeric or date-time) input value.<br>Can be a String (e.g. <code>&quot;2000-1-1&quot;</code>) or a Number (e.g. <code>2</code>).<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>max</code> property.</p>
     *
     * JavaScript Info:
     * @property max
     * @type String
     * 
     */
    @JsProperty String getMax();
    /**
     * <p>The maximum (numeric or date-time) input value.<br>Can be a String (e.g. <code>&quot;2000-1-1&quot;</code>) or a Number (e.g. <code>2</code>).<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>max</code> property.</p>
     *
     * JavaScript Info:
     * @property max
     * @type String
     * 
     */
    @JsProperty void setMax(String value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocapitalize</code> property.</p>
     *
     * JavaScript Info:
     * @property autocapitalize
     * @type String
     * 
     */
    @JsProperty String getAutocapitalize();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocapitalize</code> property.</p>
     *
     * JavaScript Info:
     * @property autocapitalize
     * @type String
     * 
     */
    @JsProperty void setAutocapitalize(String value);

    /**
     * <p>The minimum (numeric or date-time) input value.<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>min</code> property.</p>
     *
     * JavaScript Info:
     * @property min
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getMin();
    /**
     * <p>The minimum (numeric or date-time) input value.<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>min</code> property.</p>
     *
     * JavaScript Info:
     * @property min
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setMin(String value);

    /**
     * <p>Limits the numeric or date-time increments.<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>step</code> property.</p>
     *
     * JavaScript Info:
     * @property step
     * @type String
     * 
     */
    @JsProperty String getStep();
    /**
     * <p>Limits the numeric or date-time increments.<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>step</code> property.</p>
     *
     * JavaScript Info:
     * @property step
     * @type String
     * 
     */
    @JsProperty void setStep(String value);

    /**
     * <p>The type of the input. The supported types are <code>text</code>, <code>number</code> and <code>password</code>. Bind this<br>to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>type</code> property.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * 
     */
    @JsProperty String getType();
    /**
     * <p>The type of the input. The supported types are <code>text</code>, <code>number</code> and <code>password</code>. Bind this<br>to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>type</code> property.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * 
     */
    @JsProperty void setType(String value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>name</code> property.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getName();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>name</code> property.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setName(String value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocomplete</code> property.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * 
     */
    @JsProperty String getAutocomplete();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocomplete</code> property.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * 
     */
    @JsProperty void setAutocomplete(String value);

    /**
     * <p>A pattern to validate the <code>input</code> with. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>pattern</code> property.</p>
     *
     * JavaScript Info:
     * @property pattern
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getPattern();
    /**
     * <p>A pattern to validate the <code>input</code> with. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>pattern</code> property.</p>
     *
     * JavaScript Info:
     * @property pattern
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setPattern(String value);

    /**
     * <p>A placeholder string in addition to the label. If this is set, the label will always float.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getPlaceholder();
    /**
     * <p>A placeholder string in addition to the label. If this is set, the label will always float.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setPlaceholder(String value);

    /**
     * <p>Name of the validator to use. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>validator</code><br>property.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * 
     */
    @JsProperty String getValidator();
    /**
     * <p>Name of the validator to use. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>validator</code><br>property.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * 
     */
    @JsProperty void setValidator(String value);

    /**
     * <p>The value for this input. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>bindValue</code><br>property, or the value property of your input that is <code>notify:true</code>.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * 
     */
    @JsProperty String getValue();
    /**
     * <p>The value for this input. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>bindValue</code><br>property, or the value property of your input that is <code>notify:true</code>.</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * 
     */
    @JsProperty void setValue(String value);

    /**
     * <p>The error message to display when the input is invalid. Bind this to the<br><code>&lt;paper-input-error&gt;</code>‘s content, if using.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * 
     */
    @JsProperty String getErrorMessage();
    /**
     * <p>The error message to display when the input is invalid. Bind this to the<br><code>&lt;paper-input-error&gt;</code>‘s content, if using.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * 
     */
    @JsProperty void setErrorMessage(String value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocorrect</code> property.</p>
     *
     * JavaScript Info:
     * @property autocorrect
     * @type String
     * 
     */
    @JsProperty String getAutocorrect();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocorrect</code> property.</p>
     *
     * JavaScript Info:
     * @property autocorrect
     * @type String
     * 
     */
    @JsProperty void setAutocorrect(String value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>accept</code> property, used with type=file.</p>
     *
     * JavaScript Info:
     * @property accept
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getAccept();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>accept</code> property, used with type=file.</p>
     *
     * JavaScript Info:
     * @property accept
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setAccept(String value);

    /**
     * <p>Set this to specify the pattern allowed by <code>preventInvalidInput</code>. Bind this to the<br><code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>allowedPattern</code> property.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getAllowedPattern();
    /**
     * <p>Set this to specify the pattern allowed by <code>preventInvalidInput</code>. Bind this to the<br><code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>allowedPattern</code> property.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setAllowedPattern(String value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autosave</code> property, used with type=search.</p>
     *
     * JavaScript Info:
     * @property autosave
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getAutosave();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autosave</code> property, used with type=search.</p>
     *
     * JavaScript Info:
     * @property autosave
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setAutosave(String value);


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
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior PaperTab
     * 
     */
    void removeOwnKeyBindings();

    /**
     * <p>Validates the input element and sets an error style if needed.</p>
     *
     * JavaScript Info:
     * @method validate
     * @behavior PaperTextarea
     * @return {boolean}
     */
    boolean validate();

    /**
     * <p>Restores the cursor to its original position after updating the value.</p>
     *
     * JavaScript Info:
     * @method updateValueAndPreserveCaret
     * @param {string} newValue  
     * @behavior PaperTextarea
     * 
     */
    void updateValueAndPreserveCaret(String newValue);

}
