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
 * <p>Material Design <a href="http://www.google.com/design/spec/components/pickers.html">Pickers</a></p>
 * <p>Provides a responsive date picker based on the material design spec.</p>
 * <h2 id="examples-">Examples:</h2>
 * <p>Default picker:</p>
 * <pre><code>&lt;paper-date-picker&gt;&lt;/paper-date-picker&gt;
 * 
 * 
 * </code></pre><p>Setting the initial date to April 20, 2015:</p>
 * <pre><code>&lt;paper-date-picker date=&quot;April 20, 2015&quot;&gt;&lt;/paper-date-picker&gt;
 * 
 * 
 * </code></pre><p>You may also specify a minimum and/or maximum date allowed in this picker using<br>the same date notation:</p>
 * <pre><code>&lt;paper-date-picker min-date=&quot;April 1, 2015&quot; max-date=&quot;June 30, 2015&quot;&gt;&lt;/paper-date-picker&gt;
 * 
 * 
 * </code></pre><p>If you include this element as part of <code>paper-dialog</code>, use the class<br><code>&quot;paper-date-picker-dialog&quot;</code> on the dialog element in order to give it proper<br>styling:</p>
 * <pre><code>&lt;paper-dialog id=&quot;dialog&quot; class=&quot;paper-date-picker-dialog&quot; modal
 *   on-iron-overlay-closed=&quot;dismissDialog&quot;&gt;
 *   &lt;paper-date-picker id=&quot;picker&quot; date=&quot;[[date]]&quot;&gt;&lt;/paper-date-picker&gt;
 *   &lt;div class=&quot;buttons&quot;&gt;
 *     &lt;paper-button dialog-dismiss&gt;Cancel&lt;/paper-button&gt;
 *     &lt;paper-button dialog-confirm&gt;OK&lt;/paper-button&gt;
 *   &lt;/div&gt;
 * &lt;/paper-dialog&gt;
 * 
 * 
 * </code></pre>
 */
public class PaperDatePicker extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperDatePicker() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperDatePicker(String html) {
        super(PaperDatePickerElement.TAG, PaperDatePickerElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperDatePickerElement getPolymerElement() {
        return (PaperDatePickerElement) getElement();
    }


    /**
     * <p>The selected date (YYYY-MM-DD)</p>
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
     * <p>The selected date (YYYY-MM-DD)</p>
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
     * <p>Force narrow layout</p>
     *
     * JavaScript Info:
     * @property forceNarrow
     * @type Boolean
     * 
     */
    public boolean getForceNarrow() {
        return getPolymerElement().getForceNarrow();
    }
    /**
     * <p>Force narrow layout</p>
     *
     * JavaScript Info:
     * @property forceNarrow
     * @type Boolean
     * 
     */
    public void setForceNarrow(boolean value) {
        getPolymerElement().setForceNarrow(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property isTouch
     * @type Boolean
     * 
     */
    public boolean getIsTouch() {
        return getPolymerElement().getIsTouch();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property isTouch
     * @type Boolean
     * 
     */
    public void setIsTouch(boolean value) {
        getPolymerElement().setIsTouch(value);
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
     * 
     *
     * JavaScript Info:
     * @property narrow
     * @type Boolean
     * 
     */
    public boolean getNarrow() {
        return getPolymerElement().getNarrow();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property narrow
     * @type Boolean
     * 
     */
    public void setNarrow(boolean value) {
        getPolymerElement().setNarrow(value);
    }

    /**
     * <p>Maximum screen width at which the picker uses a vertical layout</p>
     *
     * JavaScript Info:
     * @property responsiveWidth
     * @type String
     * 
     */
    public String getResponsiveWidth() {
        return getPolymerElement().getResponsiveWidth();
    }
    /**
     * <p>Maximum screen width at which the picker uses a vertical layout</p>
     *
     * JavaScript Info:
     * @property responsiveWidth
     * @type String
     * 
     */
    public void setResponsiveWidth(String value) {
        getPolymerElement().setResponsiveWidth(value);
    }

    /**
     * <p>The current locale</p>
     *
     * JavaScript Info:
     * @property locale
     * @type String
     * 
     */
    public String getLocale() {
        return getPolymerElement().getLocale();
    }
    /**
     * <p>The current locale</p>
     *
     * JavaScript Info:
     * @property locale
     * @type String
     * 
     */
    public void setLocale(String value) {
        getPolymerElement().setLocale(value);
    }

    /**
     * <p>The format of the date displayed in the heading.<br>See docuemntation for Moment.js for more info.</p>
     *
     * JavaScript Info:
     * @property headingFormat
     * @type String
     * 
     */
    public String getHeadingFormat() {
        return getPolymerElement().getHeadingFormat();
    }
    /**
     * <p>The format of the date displayed in the heading.<br>See docuemntation for Moment.js for more info.</p>
     *
     * JavaScript Info:
     * @property headingFormat
     * @type String
     * 
     */
    public void setHeadingFormat(String value) {
        getPolymerElement().setHeadingFormat(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property headingBreak
     * @type String
     * 
     */
    public String getHeadingBreak() {
        return getPolymerElement().getHeadingBreak();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property headingBreak
     * @type String
     * 
     */
    public void setHeadingBreak(String value) {
        getPolymerElement().setHeadingBreak(value);
    }


    // Needed in UIBinder
    /**
     * <p>The selected date (YYYY-MM-DD)</p>
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
     * 
     *
     * JavaScript Info:
     * @method dateFormat
     * 
     * 
     */
    public void dateFormat() {
        getPolymerElement().dateFormat();
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
