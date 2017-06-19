/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-date-picker-item project by collaborne
 * that is licensed with Apache 2 license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>paper-datetime-picker-item</code> provides a Material Design item that shows a date and a time and opens a date/time picker dialog on tap.</p>
 * <h3 id="example">Example</h3>
 * <pre><code class="lang-html">&lt;paper-datetime-picker-item icon=&quot;icons:today&quot; date=&quot;{{date}}&quot; date-format=&quot;ll&quot; time-format=&quot;LT&quot;&gt;&lt;/paper-datetime-picker-item&gt;
 * </code></pre>
 */
public class PaperDatetimePickerItem extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperDatetimePickerItem() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperDatetimePickerItem(String html) {
        super(PaperDatetimePickerItemElement.TAG, PaperDatetimePickerItemElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperDatetimePickerItemElement getPolymerElement() {
        return (PaperDatetimePickerItemElement) getElement();
    }


    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getFocused() {
        return getPolymerElement().getFocused();
    }
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    public void setFocused(boolean value) {
        getPolymerElement().setFocused(value);
    }

    /**
     * <p>The maximum allowed date</p>
     *
     * JavaScript Info:
     * @property maxDate
     * @type Date
     * 
     */
    public JavaScriptObject getMaxDate() {
        return getPolymerElement().getMaxDate();
    }
    /**
     * <p>The maximum allowed date</p>
     *
     * JavaScript Info:
     * @property maxDate
     * @type Date
     * 
     */
    public void setMaxDate(JavaScriptObject value) {
        getPolymerElement().setMaxDate(value);
    }

    /**
     * <p>The minimum allowed date</p>
     *
     * JavaScript Info:
     * @property minDate
     * @type Date
     * 
     */
    public JavaScriptObject getMinDate() {
        return getPolymerElement().getMinDate();
    }
    /**
     * <p>The minimum allowed date</p>
     *
     * JavaScript Info:
     * @property minDate
     * @type Date
     * 
     */
    public void setMinDate(JavaScriptObject value) {
        getPolymerElement().setMinDate(value);
    }

    /**
     * <p>Date reflected by the component</p>
     *
     * JavaScript Info:
     * @property date
     * @type Date
     * 
     */
    public JavaScriptObject getDate() {
        return getPolymerElement().getDate();
    }
    /**
     * <p>Date reflected by the component</p>
     *
     * JavaScript Info:
     * @property date
     * @type Date
     * 
     */
    public void setDate(JavaScriptObject value) {
        getPolymerElement().setDate(value);
    }

    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getDisabled() {
        return getPolymerElement().getDisabled();
    }
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    public void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }

    /**
     * <p>Text for the OK button in the edit dialog. Use this property to localize the element.</p>
     *
     * JavaScript Info:
     * @property okButton
     * @type String
     * 
     */
    public String getOkButton() {
        return getPolymerElement().getOkButton();
    }
    /**
     * <p>Text for the OK button in the edit dialog. Use this property to localize the element.</p>
     *
     * JavaScript Info:
     * @property okButton
     * @type String
     * 
     */
    public void setOkButton(String value) {
        getPolymerElement().setOkButton(value);
    }

    /**
     * <p>Text shown when no date is set. Use this property to localize the element.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    public String getPlaceholder() {
        return getPolymerElement().getPlaceholder();
    }
    /**
     * <p>Text shown when no date is set. Use this property to localize the element.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    public void setPlaceholder(String value) {
        getPolymerElement().setPlaceholder(value);
    }

    /**
     * <p>Format to use for time, adhering to momentjs.com display formats.</p>
     *
     * JavaScript Info:
     * @property timeFormat
     * @type String
     * 
     */
    public String getTimeFormat() {
        return getPolymerElement().getTimeFormat();
    }
    /**
     * <p>Format to use for time, adhering to momentjs.com display formats.</p>
     *
     * JavaScript Info:
     * @property timeFormat
     * @type String
     * 
     */
    public void setTimeFormat(String value) {
        getPolymerElement().setTimeFormat(value);
    }

    /**
     * <p>Default time if none has been specified, in a string format HH:mm</p>
     *
     * JavaScript Info:
     * @property defaultTime
     * @type string
     * 
     */
    public String getDefaultTime() {
        return getPolymerElement().getDefaultTime();
    }
    /**
     * <p>Default time if none has been specified, in a string format HH:mm</p>
     *
     * JavaScript Info:
     * @property defaultTime
     * @type string
     * 
     */
    public void setDefaultTime(String value) {
        getPolymerElement().setDefaultTime(value);
    }

    /**
     * <p>Icon shown left of the date</p>
     *
     * JavaScript Info:
     * @property icon
     * @type string
     * 
     */
    public String getIcon() {
        return getPolymerElement().getIcon();
    }
    /**
     * <p>Icon shown left of the date</p>
     *
     * JavaScript Info:
     * @property icon
     * @type string
     * 
     */
    public void setIcon(String value) {
        getPolymerElement().setIcon(value);
    }

    /**
     * <p>Format to use for the date, adhering to momentjs.com display formats.</p>
     *
     * JavaScript Info:
     * @property dateFormat
     * @type String
     * @behavior PaperDatetimePickerItem
     */
    public String getDateFormat() {
        return getPolymerElement().getDateFormat();
    }
    /**
     * <p>Format to use for the date, adhering to momentjs.com display formats.</p>
     *
     * JavaScript Info:
     * @property dateFormat
     * @type String
     * @behavior PaperDatetimePickerItem
     */
    public void setDateFormat(String value) {
        getPolymerElement().setDateFormat(value);
    }

    /**
     * <p>The locale used for date and time formatting.</p>
     *
     * JavaScript Info:
     * @property locale
     * @type String
     * @behavior PaperDatetimePickerItem
     */
    public String getLocale() {
        return getPolymerElement().getLocale();
    }
    /**
     * <p>The locale used for date and time formatting.</p>
     *
     * JavaScript Info:
     * @property locale
     * @type String
     * @behavior PaperDatetimePickerItem
     */
    public void setLocale(String value) {
        getPolymerElement().setLocale(value);
    }

    /**
     * <p>Text for the cancel button in the edit dialog. Use this property to localize the element.</p>
     *
     * JavaScript Info:
     * @property cancelButton
     * @type String
     * 
     */
    public String getCancelButton() {
        return getPolymerElement().getCancelButton();
    }
    /**
     * <p>Text for the cancel button in the edit dialog. Use this property to localize the element.</p>
     *
     * JavaScript Info:
     * @property cancelButton
     * @type String
     * 
     */
    public void setCancelButton(String value) {
        getPolymerElement().setCancelButton(value);
    }


    // Needed in UIBinder
    /**
     * <p>The minimum allowed date</p>
     *
     * JavaScript Info:
     * @attribute min-date
     * 
     */
    public void setMinDate(String value) {
        Polymer.property(this.getPolymerElement(), "minDate", value);
    }

    // Needed in UIBinder
    /**
     * <p>Date reflected by the component</p>
     *
     * JavaScript Info:
     * @attribute date
     * 
     */
    public void setDate(String value) {
        Polymer.property(this.getPolymerElement(), "date", value);
    }

    // Needed in UIBinder
    /**
     * <p>The maximum allowed date</p>
     *
     * JavaScript Info:
     * @attribute max-date
     * @behavior PaperDatetimePickerItem
     */
    public void setMaxDate(String value) {
        Polymer.property(this.getPolymerElement(), "maxDate", value);
    }



}
