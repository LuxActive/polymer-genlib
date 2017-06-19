/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-time-picker project by Ben Davis <bendavis78@gmail.com>
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
public class PaperClockSelector extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperClockSelector() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperClockSelector(String html) {
        super(PaperClockSelectorElement.TAG, PaperClockSelectorElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperClockSelectorElement getPolymerElement() {
        return (PaperClockSelectorElement) getElement();
    }


    /**
     * 
     *
     * JavaScript Info:
     * @property animated
     * @type Boolean
     * 
     */
    public boolean getAnimated() {
        return getPolymerElement().getAnimated();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property animated
     * @type Boolean
     * 
     */
    public void setAnimated(boolean value) {
        getPolymerElement().setAnimated(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property step
     * @type Number
     * 
     */
    public double getStep() {
        return getPolymerElement().getStep();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property step
     * @type Number
     * 
     */
    public void setStep(double value) {
        getPolymerElement().setStep(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property useZero
     * @type Boolean
     * 
     */
    public boolean getUseZero() {
        return getPolymerElement().getUseZero();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property useZero
     * @type Boolean
     * 
     */
    public void setUseZero(boolean value) {
        getPolymerElement().setUseZero(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property zeroPad
     * @type Boolean
     * 
     */
    public boolean getZeroPad() {
        return getPolymerElement().getZeroPad();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property zeroPad
     * @type Boolean
     * 
     */
    public void setZeroPad(boolean value) {
        getPolymerElement().setZeroPad(value);
    }

    /**
     * 
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
     * 
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
     * @property count
     * @type Number
     * 
     */
    public double getCount() {
        return getPolymerElement().getCount();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property count
     * @type Number
     * 
     */
    public void setCount(double value) {
        getPolymerElement().setCount(value);
    }


    // Needed in UIBinder
    /**
     * 
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
     * @attribute count
     * 
     */
    public void setCount(String value) {
        Polymer.property(this.getPolymerElement(), "count", value);
    }

    // Needed in UIBinder
    /**
     * 
     *
     * JavaScript Info:
     * @attribute step
     * 
     */
    public void setStep(String value) {
        Polymer.property(this.getPolymerElement(), "step", value);
    }


    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior PaperClockSelector
     * 
     */
    public void assignParentResizable(Object parentResizable) {
        getPolymerElement().assignParentResizable(parentResizable);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method setClockHand
     * @param {} deg  
     * @param {} animate  
     * @param {} callback  
     * 
     * 
     */
    public void setClockHand(Object deg, Object animate, Object callback) {
        getPolymerElement().setClockHand(deg, animate, callback);
    }

    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior PaperClockSelector
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
     * @behavior PaperClockSelector
     * 
     */
    public void notifyResize() {
        getPolymerElement().notifyResize();
    }

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior PaperClockSelector
     * @return {boolean}
     */
    public boolean resizerShouldNotify(JavaScriptObject element) {
        return getPolymerElement().resizerShouldNotify(element);
    }


}
