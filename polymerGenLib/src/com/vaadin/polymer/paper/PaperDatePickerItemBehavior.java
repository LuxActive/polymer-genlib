/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-date-picker-item project by collaborne
 * that is licensed with Apache 2 license.
 */
package com.vaadin.polymer.paper;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * <p>Shared functionality for date picker</p>
 */
@JsType(isNative=true)
public interface PaperDatePickerItemBehavior {

    @JsOverlay public static final String NAME = "Polymer.PaperDatePickerItemBehavior";
    @JsOverlay public static final String SRC = "paper-date-picker-item/paper-datetime-picker-item.html";


    /**
     * <p>Date reflected by the component</p>
     *
     * JavaScript Info:
     * @property date
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getDate();
    /**
     * <p>Date reflected by the component</p>
     *
     * JavaScript Info:
     * @property date
     * @type Date
     * 
     */
    @JsProperty void setDate(JavaScriptObject value);

    /**
     * <p>The maximum allowed date</p>
     *
     * JavaScript Info:
     * @property maxDate
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getMaxDate();
    /**
     * <p>The maximum allowed date</p>
     *
     * JavaScript Info:
     * @property maxDate
     * @type Date
     * 
     */
    @JsProperty void setMaxDate(JavaScriptObject value);

    /**
     * <p>The minimum allowed date</p>
     *
     * JavaScript Info:
     * @property minDate
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getMinDate();
    /**
     * <p>The minimum allowed date</p>
     *
     * JavaScript Info:
     * @property minDate
     * @type Date
     * 
     */
    @JsProperty void setMinDate(JavaScriptObject value);

    /**
     * <p>Text for the cancel button in the edit dialog. Use this property to localize the element.</p>
     *
     * JavaScript Info:
     * @property cancelButton
     * @type String
     * 
     */
    @JsProperty String getCancelButton();
    /**
     * <p>Text for the cancel button in the edit dialog. Use this property to localize the element.</p>
     *
     * JavaScript Info:
     * @property cancelButton
     * @type String
     * 
     */
    @JsProperty void setCancelButton(String value);

    /**
     * <p>Format to use for the date, adhering to momentjs.com display formats.</p>
     *
     * JavaScript Info:
     * @property dateFormat
     * @type String
     * 
     */
    @JsProperty String getDateFormat();
    /**
     * <p>Format to use for the date, adhering to momentjs.com display formats.</p>
     *
     * JavaScript Info:
     * @property dateFormat
     * @type String
     * 
     */
    @JsProperty void setDateFormat(String value);

    /**
     * <p>Default time if none has been specified, in a string format HH:mm</p>
     *
     * JavaScript Info:
     * @property defaultTime
     * @type string
     * 
     */
    @JsProperty String getDefaultTime();
    /**
     * <p>Default time if none has been specified, in a string format HH:mm</p>
     *
     * JavaScript Info:
     * @property defaultTime
     * @type string
     * 
     */
    @JsProperty void setDefaultTime(String value);

    /**
     * <p>The locale used for date and time formatting.</p>
     *
     * JavaScript Info:
     * @property locale
     * @type String
     * 
     */
    @JsProperty String getLocale();
    /**
     * <p>The locale used for date and time formatting.</p>
     *
     * JavaScript Info:
     * @property locale
     * @type String
     * 
     */
    @JsProperty void setLocale(String value);

    /**
     * <p>Text for the OK button in the edit dialog. Use this property to localize the element.</p>
     *
     * JavaScript Info:
     * @property okButton
     * @type String
     * 
     */
    @JsProperty String getOkButton();
    /**
     * <p>Text for the OK button in the edit dialog. Use this property to localize the element.</p>
     *
     * JavaScript Info:
     * @property okButton
     * @type String
     * 
     */
    @JsProperty void setOkButton(String value);

    /**
     * <p>Text shown when no date is set. Use this property to localize the element.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    @JsProperty String getPlaceholder();
    /**
     * <p>Text shown when no date is set. Use this property to localize the element.</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    @JsProperty void setPlaceholder(String value);

    /**
     * <p>Format to use for time, adhering to momentjs.com display formats.</p>
     *
     * JavaScript Info:
     * @property timeFormat
     * @type String
     * 
     */
    @JsProperty String getTimeFormat();
    /**
     * <p>Format to use for time, adhering to momentjs.com display formats.</p>
     *
     * JavaScript Info:
     * @property timeFormat
     * @type String
     * 
     */
    @JsProperty void setTimeFormat(String value);


}
