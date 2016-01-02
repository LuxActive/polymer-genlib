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
 * <p>Material design: <a href="https://www.google.com/design/spec/components/text-fields.html">Text fields</a></p>
 * <p><code>&lt;paper-input&gt;</code> is a single-line text field with Material Design styling.</p>
 * <pre><code>&lt;paper-input label=&quot;Input label&quot;&gt;&lt;/paper-input&gt;
 * 
 * 
 * </code></pre><p>It may include an optional error message or character counter.</p>
 * <pre><code>&lt;paper-input error-message=&quot;Invalid input!&quot; label=&quot;Input label&quot;&gt;&lt;/paper-input&gt;
 * &lt;paper-input char-counter label=&quot;Input label&quot;&gt;&lt;/paper-input&gt;
 * 
 * 
 * </code></pre><p>It can also include custom prefix or suffix elements, which are displayed<br>before or after the text input itself. In order for an element to be<br>considered as a prefix, it must have the <code>prefix</code> attribute (and similarly<br>for <code>suffix</code>).</p>
 * <pre><code>&lt;paper-input label=&quot;total&quot;&gt;
 *   &lt;div prefix&gt;$&lt;/div&gt;
 *   &lt;paper-icon-button suffix icon=&quot;clear&quot;&gt;&lt;/paper-icon-button&gt;
 * &lt;/paper-input&gt;
 * 
 * 
 * </code></pre><p>A <code>paper-input</code> can use the native <code>type=search</code> or <code>type=file</code> features.<br>However, since we can’t control the native styling of the input, in these cases<br>it’s recommended to use a placeholder text, or <code>always-float-label</code>,<br>as to not overlap the native UI (search icon, file button, etc.).</p>
 * <pre><code>&lt;paper-input label=&quot;search!&quot; type=&quot;search&quot;
 *     placeholder=&quot;search for cats&quot; autosave=&quot;test&quot; results=&quot;5&quot;&gt;
 * &lt;/paper-input&gt;
 * 
 * 
 * </code></pre><p>See <code>Polymer.PaperInputBehavior</code> for more API docs.</p>
 * <h3 id="focus">Focus</h3>
 * <p>To focus a paper-input, you can call the native <code>focus()</code> method as long as the<br>paper input has a tab index.</p>
 * <h3 id="styling">Styling</h3>
 * <p>See <code>Polymer.PaperInputContainer</code> for a list of custom properties used to<br>style this element.</p>
 */
@JsType
public interface PaperInputElement extends HTMLElement {

    public static final String TAG = "paper-input";
    public static final String SRC = "paper-input/paper-input.html";


    /**
     * <p>The maximum length of the input value. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>maxlength</code> property.</p>
     *
     * JavaScript Info:
     * @property maxlength
     * @type Number
     * @behavior PaperTextarea
     */
    @JsProperty double getMaxlength();
    /**
     * <p>The maximum length of the input value. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>maxlength</code> property.</p>
     *
     * JavaScript Info:
     * @property maxlength
     * @type Number
     * @behavior PaperTextarea
     */
    @JsProperty void setMaxlength(double value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>results</code> property, used with type=search.</p>
     *
     * JavaScript Info:
     * @property results
     * @type Number
     * @behavior PaperTextarea
     */
    @JsProperty double getResults();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>results</code> property, used with type=search.</p>
     *
     * JavaScript Info:
     * @property results
     * @type Number
     * @behavior PaperTextarea
     */
    @JsProperty void setResults(double value);

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
     * <p>Set to true to mark the input as required. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>required</code> property.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty boolean getRequired();
    /**
     * <p>Set to true to mark the input as required. Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s<br><code>required</code> property.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty void setRequired(boolean value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>multiple</code> property, used with type=file.</p>
     *
     * JavaScript Info:
     * @property multiple
     * @type Boolean
     * 
     */
    @JsProperty boolean getMultiple();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>multiple</code> property, used with type=file.</p>
     *
     * JavaScript Info:
     * @property multiple
     * @type Boolean
     * 
     */
    @JsProperty void setMultiple(boolean value);

    /**
     * <p>Set to true to always float the label. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>alwaysFloatLabel</code> property.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * 
     */
    @JsProperty boolean getAlwaysFloatLabel();
    /**
     * <p>Set to true to always float the label. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>alwaysFloatLabel</code> property.</p>
     *
     * JavaScript Info:
     * @property alwaysFloatLabel
     * @type Boolean
     * 
     */
    @JsProperty void setAlwaysFloatLabel(boolean value);

    /**
     * <p>Set to true to disable the floating label. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>noLabelFloat</code> property.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * 
     */
    @JsProperty boolean getNoLabelFloat();
    /**
     * <p>Set to true to disable the floating label. Bind this to the <code>&lt;paper-input-container&gt;</code>‘s<br><code>noLabelFloat</code> property.</p>
     *
     * JavaScript Info:
     * @property noLabelFloat
     * @type Boolean
     * 
     */
    @JsProperty void setNoLabelFloat(boolean value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>readonly</code> property.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty boolean getReadonly();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>readonly</code> property.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty void setReadonly(boolean value);

    /**
     * <p>Set to true to prevent the user from entering invalid input. Bind this to the<br><code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>preventInvalidInput</code> property.</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty boolean getPreventInvalidInput();
    /**
     * <p>Set to true to prevent the user from entering invalid input. Bind this to the<br><code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>preventInvalidInput</code> property.</p>
     *
     * JavaScript Info:
     * @property preventInvalidInput
     * @type Boolean
     * @behavior PaperTextarea
     */
    @JsProperty void setPreventInvalidInput(boolean value);

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
     * <p>Returns true if the value is invalid. Bind this to both the <code>&lt;paper-input-container&gt;</code>‘s<br>and the input’s <code>invalid</code> property.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * 
     */
    @JsProperty boolean getInvalid();
    /**
     * <p>Returns true if the value is invalid. Bind this to both the <code>&lt;paper-input-container&gt;</code>‘s<br>and the input’s <code>invalid</code> property.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * 
     */
    @JsProperty void setInvalid(boolean value);

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
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocorrect</code> property.</p>
     *
     * JavaScript Info:
     * @property autocorrect
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getAutocorrect();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocorrect</code> property.</p>
     *
     * JavaScript Info:
     * @property autocorrect
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setAutocorrect(String value);

    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocomplete</code> property.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getAutocomplete();
    /**
     * <p>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>autocomplete</code> property.</p>
     *
     * JavaScript Info:
     * @property autocomplete
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setAutocomplete(String value);

    /**
     * <p>The label for this input. Bind this to <code>&lt;label&gt;</code>‘s content and <code>hidden</code> property, e.g.<br><code>&lt;label hidden$=&quot;[[!label]]&quot;&gt;[[label]]&lt;/label&gt;</code> in your <code>template</code></p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getLabel();
    /**
     * <p>The label for this input. Bind this to <code>&lt;label&gt;</code>‘s content and <code>hidden</code> property, e.g.<br><code>&lt;label hidden$=&quot;[[!label]]&quot;&gt;[[label]]&lt;/label&gt;</code> in your <code>template</code></p>
     *
     * JavaScript Info:
     * @property label
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setLabel(String value);

    /**
     * <p>The datalist of the input (if any). This should match the id of an existing <code>&lt;datalist&gt;</code>. Bind this<br>to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>list</code> property.</p>
     *
     * JavaScript Info:
     * @property list
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getList();
    /**
     * <p>The datalist of the input (if any). This should match the id of an existing <code>&lt;datalist&gt;</code>. Bind this<br>to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>list</code> property.</p>
     *
     * JavaScript Info:
     * @property list
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setList(String value);

    /**
     * <p>The maximum (numeric or date-time) input value.<br>Can be a String (e.g. <code>&quot;2000-1-1&quot;</code>) or a Number (e.g. <code>2</code>).<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>max</code> property.</p>
     *
     * JavaScript Info:
     * @property max
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getMax();
    /**
     * <p>The maximum (numeric or date-time) input value.<br>Can be a String (e.g. <code>&quot;2000-1-1&quot;</code>) or a Number (e.g. <code>2</code>).<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>max</code> property.</p>
     *
     * JavaScript Info:
     * @property max
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setMax(String value);

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
     * <p>Set this to specify the pattern allowed by <code>preventInvalidInput</code>. Bind this to the<br><code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>allowedPattern</code> property.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * 
     */
    @JsProperty String getAllowedPattern();
    /**
     * <p>Set this to specify the pattern allowed by <code>preventInvalidInput</code>. Bind this to the<br><code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>allowedPattern</code> property.</p>
     *
     * JavaScript Info:
     * @property allowedPattern
     * @type String
     * 
     */
    @JsProperty void setAllowedPattern(String value);

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
     * <p>The error message to display when the input is invalid. Bind this to the<br><code>&lt;paper-input-error&gt;</code>‘s content, if using.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getErrorMessage();
    /**
     * <p>The error message to display when the input is invalid. Bind this to the<br><code>&lt;paper-input-error&gt;</code>‘s content, if using.</p>
     *
     * JavaScript Info:
     * @property errorMessage
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setErrorMessage(String value);

    /**
     * <p>Limits the numeric or date-time increments.<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>step</code> property.</p>
     *
     * JavaScript Info:
     * @property step
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty String getStep();
    /**
     * <p>Limits the numeric or date-time increments.<br>Bind this to the <code>&lt;input is=&quot;iron-input&quot;&gt;</code>‘s <code>step</code> property.</p>
     *
     * JavaScript Info:
     * @property step
     * @type String
     * @behavior PaperTextarea
     */
    @JsProperty void setStep(String value);


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
     * <p>Validates the input element and sets an error style if needed.</p>
     *
     * JavaScript Info:
     * @method validate
     * @behavior PaperTextarea
     * @return {boolean}
     */
    boolean validate();

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
     * <p>Restores the cursor to its original position after updating the value.</p>
     *
     * JavaScript Info:
     * @method updateValueAndPreserveCaret
     * @param {string} newValue  
     * 
     * 
     */
    void updateValueAndPreserveCaret(String newValue);

}
