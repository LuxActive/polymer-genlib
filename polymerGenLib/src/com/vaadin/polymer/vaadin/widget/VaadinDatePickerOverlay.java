/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-date-picker project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget;

import com.vaadin.polymer.vaadin.*;

import com.vaadin.polymer.vaadin.widget.event.ScrollAnimationFinishedEvent;
import com.vaadin.polymer.vaadin.widget.event.ScrollAnimationFinishedEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class VaadinDatePickerOverlay extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public VaadinDatePickerOverlay() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public VaadinDatePickerOverlay(String html) {
        super(VaadinDatePickerOverlayElement.TAG, VaadinDatePickerOverlayElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public VaadinDatePickerOverlayElement getPolymerElement() {
        try {
            return (VaadinDatePickerOverlayElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>Date value which is focused using keyboard.</p>
     *
     * JavaScript Info:
     * @property focusedDate
     * @type Date
     * 
     */
    public JavaScriptObject getFocusedDate() {
        return getPolymerElement().getFocusedDate();
    }
    /**
     * <p>Date value which is focused using keyboard.</p>
     *
     * JavaScript Info:
     * @property focusedDate
     * @type Date
     * 
     */
    public void setFocusedDate(JavaScriptObject value) {
        getPolymerElement().setFocusedDate(value);
    }

    /**
     * 
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
     * 
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
     * <p>Date which should be visible when there is no value selected.</p>
     *
     * JavaScript Info:
     * @property initialPosition
     * @type Date
     * 
     */
    public JavaScriptObject getInitialPosition() {
        return getPolymerElement().getInitialPosition();
    }
    /**
     * <p>Date which should be visible when there is no value selected.</p>
     *
     * JavaScript Info:
     * @property initialPosition
     * @type Date
     * 
     */
    public void setInitialPosition(JavaScriptObject value) {
        getPolymerElement().setInitialPosition(value);
    }

    /**
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property selectedDate
     * @type Date
     * 
     */
    public JavaScriptObject getSelectedDate() {
        return getPolymerElement().getSelectedDate();
    }
    /**
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property selectedDate
     * @type Date
     * 
     */
    public void setSelectedDate(JavaScriptObject value) {
        getPolymerElement().setSelectedDate(value);
    }


    /**
     * <p>Date value which is focused using keyboard.</p>
     *
     * JavaScript Info:
     * @attribute focused-date
     * 
     */
    public void setFocusedDate(String value) {
        getPolymerElement().setAttribute("focused-date", value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @attribute i18n
     * 
     */
    public void setI18n(String value) {
        getPolymerElement().setAttribute("i18n", value);
    }

    /**
     * <p>Date which should be visible when there is no value selected.</p>
     *
     * JavaScript Info:
     * @attribute initial-position
     * 
     */
    public void setInitialPosition(String value) {
        getPolymerElement().setAttribute("initial-position", value);
    }

    /**
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @attribute selected-date
     * 
     */
    public void setSelectedDate(String value) {
        getPolymerElement().setAttribute("selected-date", value);
    }


    /**
     * <p>Scrolls the list to the given Date.</p>
     *
     * JavaScript Info:
     * @method scrollToDate
     * @param {} date  
     * @param {} animate  
     * 
     * 
     */
    public void scrollToDate(Object date, Object animate) {
        getPolymerElement().scrollToDate(date, animate);
    }


    /**
     * <p>Fired when the scroller reaches the target scrolling position.</p>
     *
     * JavaScript Info:
     * @event scroll-animation-finished
     */
    public HandlerRegistration addScrollAnimationFinishedHandler(ScrollAnimationFinishedEventHandler handler) {
        return addDomHandler(handler, ScrollAnimationFinishedEvent.TYPE);
    }

}
