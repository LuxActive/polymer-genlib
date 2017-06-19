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
 * 
 */
public class PaperDatePickerEditDialog extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperDatePickerEditDialog() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperDatePickerEditDialog(String html) {
        super(PaperDatePickerEditDialogElement.TAG, PaperDatePickerEditDialogElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperDatePickerEditDialogElement getPolymerElement() {
        return (PaperDatePickerEditDialogElement) getElement();
    }


    /**
     * 
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
     * 
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

    /**
     * <p>Locale used for formatting dates</p>
     *
     * JavaScript Info:
     * @property locale
     * @type string
     * 
     */
    public String getLocale() {
        return getPolymerElement().getLocale();
    }
    /**
     * <p>Locale used for formatting dates</p>
     *
     * JavaScript Info:
     * @property locale
     * @type string
     * 
     */
    public void setLocale(String value) {
        getPolymerElement().setLocale(value);
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


    // Needed in UIBinder
    /**
     * 
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
     * 
     */
    public void setMaxDate(String value) {
        Polymer.property(this.getPolymerElement(), "maxDate", value);
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


    /**
     * <p>Open modal dialog containing the date picker</p>
     *
     * JavaScript Info:
     * @method open
     * 
     * 
     */
    public void open() {
        getPolymerElement().open();
    }


}
