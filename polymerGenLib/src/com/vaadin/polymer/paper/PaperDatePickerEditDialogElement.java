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
 * 
 */
@JsType(isNative=true)
public interface PaperDatePickerEditDialogElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-date-picker-edit-dialog";
    @JsOverlay public static final String SRC = "paper-date-picker-item/paper-datetime-picker-item.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property date
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getDate();
    /**
     * 
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
     * <p>Locale used for formatting dates</p>
     *
     * JavaScript Info:
     * @property locale
     * @type string
     * 
     */
    @JsProperty String getLocale();
    /**
     * <p>Locale used for formatting dates</p>
     *
     * JavaScript Info:
     * @property locale
     * @type string
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
     * <p>Open modal dialog containing the date picker</p>
     *
     * JavaScript Info:
     * @method open
     * 
     * 
     */
    void open();

}
