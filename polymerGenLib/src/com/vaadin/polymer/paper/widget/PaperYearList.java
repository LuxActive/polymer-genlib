/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-date-picker project by Ben Davis <bendavis78@gmail.com>
 * that is licensed with MIT license.
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
public class PaperYearList extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperYearList() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperYearList(String html) {
        super(PaperYearListElement.TAG, PaperYearListElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperYearListElement getPolymerElement() {
        return (PaperYearListElement) getElement();
    }


    /**
     * <p>Maximum allowed year.</p>
     *
     * JavaScript Info:
     * @property max
     * @type Number
     * 
     */
    public double getMax() {
        return getPolymerElement().getMax();
    }
    /**
     * <p>Maximum allowed year.</p>
     *
     * JavaScript Info:
     * @property max
     * @type Number
     * 
     */
    public void setMax(double value) {
        getPolymerElement().setMax(value);
    }

    /**
     * <p>Minimum allowed year.</p>
     *
     * JavaScript Info:
     * @property min
     * @type Number
     * 
     */
    public double getMin() {
        return getPolymerElement().getMin();
    }
    /**
     * <p>Minimum allowed year.</p>
     *
     * JavaScript Info:
     * @property min
     * @type Number
     * 
     */
    public void setMin(double value) {
        getPolymerElement().setMin(value);
    }

    /**
     * <p>The selected year, sync with the year of the given date<br>or null if year isn’t within range.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type Number
     * 
     */
    public double getSelected() {
        return getPolymerElement().getSelected();
    }
    /**
     * <p>The selected year, sync with the year of the given date<br>or null if year isn’t within range.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type Number
     * 
     */
    public void setSelected(double value) {
        getPolymerElement().setSelected(value);
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


    // Needed in UIBinder
    /**
     * <p>Minimum allowed year.</p>
     *
     * JavaScript Info:
     * @attribute min
     * 
     */
    public void setMin(String value) {
        Polymer.property(this.getPolymerElement(), "min", value);
    }

    // Needed in UIBinder
    /**
     * <p>The selected year, sync with the year of the given date<br>or null if year isn’t within range.</p>
     *
     * JavaScript Info:
     * @attribute selected
     * 
     */
    public void setSelected(String value) {
        Polymer.property(this.getPolymerElement(), "selected", value);
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
     * <p>Maximum allowed year.</p>
     *
     * JavaScript Info:
     * @attribute max
     * 
     */
    public void setMax(String value) {
        Polymer.property(this.getPolymerElement(), "max", value);
    }


    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior PaperTimePicker
     * 
     */
    public void assignParentResizable(Object parentResizable) {
        getPolymerElement().assignParentResizable(parentResizable);
    }

    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior PaperTimePicker
     * 
     */
    public void stopResizeNotificationsFor(Object target) {
        getPolymerElement().stopResizeNotificationsFor(target);
    }

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior PaperTimePicker
     * 
     */
    public void notifyResize() {
        getPolymerElement().notifyResize();
    }

    /**
     * <p>Scroll in the years list to center the selected year.</p>
     *
     * JavaScript Info:
     * @method centerSelected
     * 
     * 
     */
    public void centerSelected() {
        getPolymerElement().centerSelected();
    }

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior PaperTimePicker
     * @return {boolean}
     */
    public boolean resizerShouldNotify(JavaScriptObject element) {
        return getPolymerElement().resizerShouldNotify(element);
    }


}
