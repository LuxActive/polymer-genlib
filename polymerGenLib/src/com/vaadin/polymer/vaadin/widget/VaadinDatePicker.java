/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-date-picker project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget;

import com.vaadin.polymer.vaadin.*;

import com.vaadin.polymer.vaadin.widget.event.ValueChangedEvent;
import com.vaadin.polymer.vaadin.widget.event.ValueChangedEventHandler;

import com.vaadin.polymer.iron.widget.event.IronFormElementRegisterEvent;
import com.vaadin.polymer.iron.widget.event.IronFormElementRegisterEventHandler;

import com.vaadin.polymer.iron.widget.event.IronFormElementUnregisterEvent;
import com.vaadin.polymer.iron.widget.event.IronFormElementUnregisterEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>&lt;vaadin-date-picker&gt;</code> is a date selection field which includes a scrollable<br>month calendar view.</p>
 * <pre><code class="lang-html">&lt;vaadin-date-picker label=&quot;Birthday&quot;&gt;&lt;/vaadin-date-picker&gt;
 * </code></pre>
 * <pre><code class="lang-js">datePicker.value = &#39;2016-03-02&#39;;
 * </code></pre>
 * <p>When the selected <code>value</code> is changed, a <code>value-changed</code> event is triggered.</p>
 * <p>This element is also extended with the <code>IronFormElementBehavior</code> to<br>enable usage within an <code>iron-form</code>.</p>
 * <h3 id="styling">Styling</h3>
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
 * <td><code>--vaadin-date-picker-overlay</code></td>
 * <td>Mixin applied to the overlay</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-date-picker-yearscroller</code></td>
 * <td>Mixin applied to the year scroller</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-date-picker-yearscroller-indicator</code></td>
 * <td>Mixin applied to the year scroller indicator</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-date-picker-calendar-icon</code></td>
 * <td>Mixin applied to the calendar icon</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-date-picker-clear-icon</code></td>
 * <td>Mixin applied to the clear icon</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-date-picker-scrollers-fade</code></td>
 * <td>Mixin applied to the scrollers fade element</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-date-picker-header</code></td>
 * <td>Mixin applied to the picker header</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-date-picker-toolbar</code></td>
 * <td>Mixin applied to the picker toolbar</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-date-picker-toolbar-icon</code></td>
 * <td>Mixin applied to the picker toolbar icon</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-date-picker-footer</code></td>
 * <td>Mixin applied to the picker footer</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-date-picker-calendar</code></td>
 * <td>Mixin applied to a month calendar element</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-date-picker-calendar-title</code></td>
 * <td>Mixin applied to a month calendar title</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-date-picker-calendar-cell</code></td>
 * <td>Mixin applied to a month calendar cell</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-date-picker-calendar-date-cell</code></td>
 * <td>Mixin applied to a month calendar date cell</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-date-picker-calendar-weekday-cell</code></td>
 * <td>Mixin applied to a month calendar weekday cell</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-date-picker-calendar-cell-today</code></td>
 * <td>Mixin applied to a month calendar today cell</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-date-picker-calendar-cell-selected</code></td>
 * <td>Mixin applied to a month calendar selected cell</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-date-picker-calendar-cell-focused</code></td>
 * <td>Mixin applied to a month calendar focused cell</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-date-picker-calendar-cell-today-selected</code></td>
 * <td>Mixin applied to a month calendar selected today cell</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 * <p>See paper-input-container documentation for styling the included input fields</p>
 */
public class VaadinDatePicker extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public VaadinDatePicker() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public VaadinDatePicker(String html) {
        super(VaadinDatePickerElement.TAG, VaadinDatePickerElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public VaadinDatePickerElement getPolymerElement() {
        try {
            return (VaadinDatePickerElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>Set to true to make this element read-only.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * 
     */
    public boolean getReadonly() {
        return getPolymerElement().getReadonly();
    }
    /**
     * <p>Set to true to make this element read-only.</p>
     *
     * JavaScript Info:
     * @property readonly
     * @type Boolean
     * 
     */
    public void setReadonly(boolean value) {
        getPolymerElement().setReadonly(value);
    }

    /**
     * <p>Set to true to disable this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    public boolean getDisabled() {
        return getPolymerElement().getDisabled();
    }
    /**
     * <p>Set to true to disable this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    public void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }

    /**
     * <p>The object used to localize this component.<br>To change the default localization, replace the entire<br><em>i18n</em> object or just the property you want to modify.</p>
     * <p>The object has the following JSON structure and default values:</p>
     * <pre><code>  {
     *     // An array with the full names of months starting
     *     // with January.
     *     monthNames: [
     *       &#39;January&#39;, &#39;February&#39;, &#39;March&#39;, &#39;April&#39;, &#39;May&#39;,
     *       &#39;June&#39;, &#39;July&#39;, &#39;August&#39;, &#39;September&#39;,
     *       &#39;October&#39;, &#39;November&#39;, &#39;December&#39;
     *     ],
     * 
     *     // An array with the short names of days starting
     *     // with Sunday.
     *     weekdaysShort: [
     *       &#39;Sun&#39;, &#39;Mon&#39;, &#39;Tue&#39;, &#39;Wed&#39;, &#39;Thu&#39;, &#39;Fri&#39;, &#39;Sat&#39;
     *     ],
     * 
     *     // An integer indicating the first day of the week
     *     // (0 = Sunday, 1 = Monday, etc.).
     *     firstDayOfWeek: 0,
     * 
     *     // Translation of the Today shortcut button text.
     *     today: &#39;Today&#39;,
     * 
     *     // Translation of the Cancel button text.
     *     cancel: &#39;Cancel&#39;,
     * 
     *     // A function to format given `Date` object as
     *     // string.
     *     formatDate: function(d) {
     *       // returns a string representation of the given
     *       // Date object in &#39;MM/DD/YYYY&#39; -format
     *     }
     *   }
     * 
     * 
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @property i18n
     * @type Object
     * 
     */
    public JavaScriptObject getI18n() {
        return getPolymerElement().getI18n();
    }
    /**
     * <p>The object used to localize this component.<br>To change the default localization, replace the entire<br><em>i18n</em> object or just the property you want to modify.</p>
     * <p>The object has the following JSON structure and default values:</p>
     * <pre><code>  {
     *     // An array with the full names of months starting
     *     // with January.
     *     monthNames: [
     *       &#39;January&#39;, &#39;February&#39;, &#39;March&#39;, &#39;April&#39;, &#39;May&#39;,
     *       &#39;June&#39;, &#39;July&#39;, &#39;August&#39;, &#39;September&#39;,
     *       &#39;October&#39;, &#39;November&#39;, &#39;December&#39;
     *     ],
     * 
     *     // An array with the short names of days starting
     *     // with Sunday.
     *     weekdaysShort: [
     *       &#39;Sun&#39;, &#39;Mon&#39;, &#39;Tue&#39;, &#39;Wed&#39;, &#39;Thu&#39;, &#39;Fri&#39;, &#39;Sat&#39;
     *     ],
     * 
     *     // An integer indicating the first day of the week
     *     // (0 = Sunday, 1 = Monday, etc.).
     *     firstDayOfWeek: 0,
     * 
     *     // Translation of the Today shortcut button text.
     *     today: &#39;Today&#39;,
     * 
     *     // Translation of the Cancel button text.
     *     cancel: &#39;Cancel&#39;,
     * 
     *     // A function to format given `Date` object as
     *     // string.
     *     formatDate: function(d) {
     *       // returns a string representation of the given
     *       // Date object in &#39;MM/DD/YYYY&#39; -format
     *     }
     *   }
     * 
     * 
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @property i18n
     * @type Object
     * 
     */
    public void setI18n(JavaScriptObject value) {
        getPolymerElement().setI18n(value);
    }

    /**
     * <p>True if the last call to <code>validate</code> is invalid.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * @behavior VaadinDatePicker
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
     * @behavior VaadinDatePicker
     */
    public void setInvalid(boolean value) {
        getPolymerElement().setInvalid(value);
    }

    /**
     * <p>Set to true to mark the input as required. If used in a form, a<br>custom element that uses this behavior should also use<br>Polymer.IronValidatableBehavior and define a custom validation method.<br>Otherwise, a <code>required</code> element will always be considered valid.<br>It’s also strongly recommended to provide a visual style for the element<br>when its value is invalid.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public boolean getRequired() {
        return getPolymerElement().getRequired();
    }
    /**
     * <p>Set to true to mark the input as required. If used in a form, a<br>custom element that uses this behavior should also use<br>Polymer.IronValidatableBehavior and define a custom validation method.<br>Otherwise, a <code>required</code> element will always be considered valid.<br>It’s also strongly recommended to provide a visual style for the element<br>when its value is invalid.</p>
     *
     * JavaScript Info:
     * @property required
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public void setRequired(boolean value) {
        getPolymerElement().setRequired(value);
    }

    /**
     * <p>The value for this element.</p>
     * <p>Supported date formats:</p>
     * <ul>
     * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
     * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;</code></li>
     * </ul>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * 
     */
    public String getValue() {
        return getPolymerElement().getValue();
    }
    /**
     * <p>The value for this element.</p>
     * <p>Supported date formats:</p>
     * <ul>
     * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
     * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;</code></li>
     * </ul>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * 
     */
    public void setValue(String value) {
        getPolymerElement().setValue(value);
    }

    /**
     * <p>The label for this element.</p>
     *
     * JavaScript Info:
     * @property label
     * @type string
     * 
     */
    public String getLabel() {
        return getPolymerElement().getLabel();
    }
    /**
     * <p>The label for this element.</p>
     *
     * JavaScript Info:
     * @property label
     * @type string
     * 
     */
    public void setLabel(String value) {
        getPolymerElement().setLabel(value);
    }

    /**
     * <p>Namespace for this validator.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior VaadinDatePicker
     */
    public String getValidatorType() {
        return getPolymerElement().getValidatorType();
    }
    /**
     * <p>Namespace for this validator.</p>
     *
     * JavaScript Info:
     * @property validatorType
     * @type String
     * @behavior VaadinDatePicker
     */
    public void setValidatorType(String value) {
        getPolymerElement().setValidatorType(value);
    }

    /**
     * <p>Date which should be visible when there is no value selected.</p>
     * <p>The same date formats as for the <code>value</code> property are supported.</p>
     *
     * JavaScript Info:
     * @property initialPosition
     * @type string
     * 
     */
    public String getInitialPosition() {
        return getPolymerElement().getInitialPosition();
    }
    /**
     * <p>Date which should be visible when there is no value selected.</p>
     * <p>The same date formats as for the <code>value</code> property are supported.</p>
     *
     * JavaScript Info:
     * @property initialPosition
     * @type string
     * 
     */
    public void setInitialPosition(String value) {
        getPolymerElement().setInitialPosition(value);
    }

    /**
     * <p>Name of the validator to use.</p>
     *
     * JavaScript Info:
     * @property validator
     * @type String
     * @behavior VaadinDatePicker
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
     * @behavior VaadinDatePicker
     */
    public void setValidator(String value) {
        getPolymerElement().setValidator(value);
    }

    /**
     * <p>The name of this element.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior VaadinDatePicker
     */
    public String getName() {
        return getPolymerElement().getName();
    }
    /**
     * <p>The name of this element.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * @behavior VaadinDatePicker
     */
    public void setName(String value) {
        getPolymerElement().setName(value);
    }


    /**
     * <p>The object used to localize this component.<br>To change the default localization, replace the entire<br><em>i18n</em> object or just the property you want to modify.</p>
     * <p>The object has the following JSON structure and default values:</p>
     * <pre><code>  {
     *     // An array with the full names of months starting
     *     // with January.
     *     monthNames: [
     *       &#39;January&#39;, &#39;February&#39;, &#39;March&#39;, &#39;April&#39;, &#39;May&#39;,
     *       &#39;June&#39;, &#39;July&#39;, &#39;August&#39;, &#39;September&#39;,
     *       &#39;October&#39;, &#39;November&#39;, &#39;December&#39;
     *     ],
     * 
     *     // An array with the short names of days starting
     *     // with Sunday.
     *     weekdaysShort: [
     *       &#39;Sun&#39;, &#39;Mon&#39;, &#39;Tue&#39;, &#39;Wed&#39;, &#39;Thu&#39;, &#39;Fri&#39;, &#39;Sat&#39;
     *     ],
     * 
     *     // An integer indicating the first day of the week
     *     // (0 = Sunday, 1 = Monday, etc.).
     *     firstDayOfWeek: 0,
     * 
     *     // Translation of the Today shortcut button text.
     *     today: &#39;Today&#39;,
     * 
     *     // Translation of the Cancel button text.
     *     cancel: &#39;Cancel&#39;,
     * 
     *     // A function to format given `Date` object as
     *     // string.
     *     formatDate: function(d) {
     *       // returns a string representation of the given
     *       // Date object in &#39;MM/DD/YYYY&#39; -format
     *     }
     *   }
     * 
     * 
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @attribute i18n
     * 
     */
    public void setI18n(String value) {
        getPolymerElement().setAttribute("i18n", value);
    }


    /**
     * <p>Opens the dropdown.</p>
     *
     * JavaScript Info:
     * @method open
     * @param {} e  
     * 
     * 
     */
    public void open(Object e) {
        getPolymerElement().open(e);
    }

    /**
     * <p>Closes the dropdown.</p>
     *
     * JavaScript Info:
     * @method close
     * 
     * 
     */
    public void close() {
        getPolymerElement().close();
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method hasValidator
     * @behavior VaadinDatePicker
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
     * @behavior VaadinDatePicker
     * @return {boolean}
     */
    public boolean validate(JavaScriptObject value) {
        return getPolymerElement().validate(value);
    }


    /**
     * <p>Fired when the value changes.</p>
     *
     * JavaScript Info:
     * @event value-changed
     */
    public HandlerRegistration addValueChangedHandler(ValueChangedEventHandler handler) {
        return addDomHandler(handler, ValueChangedEvent.TYPE);
    }

    /**
     * <p>Fired when the element is added to an <code>iron-form</code>.</p>
     *
     * JavaScript Info:
     * @event iron-form-element-register
     */
    public HandlerRegistration addIronFormElementRegisterHandler(IronFormElementRegisterEventHandler handler) {
        return addDomHandler(handler, IronFormElementRegisterEvent.TYPE);
    }

    /**
     * <p>Fired when the element is removed from an <code>iron-form</code>.</p>
     *
     * JavaScript Info:
     * @event iron-form-element-unregister
     */
    public HandlerRegistration addIronFormElementUnregisterHandler(IronFormElementUnregisterEventHandler handler) {
        return addDomHandler(handler, IronFormElementUnregisterEvent.TYPE);
    }

}
