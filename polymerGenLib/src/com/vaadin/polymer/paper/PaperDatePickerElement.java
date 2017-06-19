/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-date-picker project by Ben Davis <bendavis78@gmail.com>
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.paper;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

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
@JsType(isNative=true)
public interface PaperDatePickerElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-date-picker";
    @JsOverlay public static final String SRC = "paper-date-picker/paper-date-picker.html";


    /**
     * <p>The selected date (YYYY-MM-DD)</p>
     *
     * JavaScript Info:
     * @property date
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getDate();
    /**
     * <p>The selected date (YYYY-MM-DD)</p>
     *
     * JavaScript Info:
     * @property date
     * @type Date
     * 
     */
    @JsProperty void setDate(JavaScriptObject value);

    /**
     * <p>Force narrow layout</p>
     *
     * JavaScript Info:
     * @property forceNarrow
     * @type Boolean
     * 
     */
    @JsProperty boolean getForceNarrow();
    /**
     * <p>Force narrow layout</p>
     *
     * JavaScript Info:
     * @property forceNarrow
     * @type Boolean
     * 
     */
    @JsProperty void setForceNarrow(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property isTouch
     * @type Boolean
     * 
     */
    @JsProperty boolean getIsTouch();
    /**
     * 
     *
     * JavaScript Info:
     * @property isTouch
     * @type Boolean
     * 
     */
    @JsProperty void setIsTouch(boolean value);

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
     * 
     *
     * JavaScript Info:
     * @property narrow
     * @type Boolean
     * 
     */
    @JsProperty boolean getNarrow();
    /**
     * 
     *
     * JavaScript Info:
     * @property narrow
     * @type Boolean
     * 
     */
    @JsProperty void setNarrow(boolean value);

    /**
     * <p>Maximum screen width at which the picker uses a vertical layout</p>
     *
     * JavaScript Info:
     * @property responsiveWidth
     * @type String
     * 
     */
    @JsProperty String getResponsiveWidth();
    /**
     * <p>Maximum screen width at which the picker uses a vertical layout</p>
     *
     * JavaScript Info:
     * @property responsiveWidth
     * @type String
     * 
     */
    @JsProperty void setResponsiveWidth(String value);

    /**
     * <p>The current locale</p>
     *
     * JavaScript Info:
     * @property locale
     * @type String
     * 
     */
    @JsProperty String getLocale();
    /**
     * <p>The current locale</p>
     *
     * JavaScript Info:
     * @property locale
     * @type String
     * 
     */
    @JsProperty void setLocale(String value);

    /**
     * <p>The format of the date displayed in the heading.<br>See docuemntation for Moment.js for more info.</p>
     *
     * JavaScript Info:
     * @property headingFormat
     * @type String
     * 
     */
    @JsProperty String getHeadingFormat();
    /**
     * <p>The format of the date displayed in the heading.<br>See docuemntation for Moment.js for more info.</p>
     *
     * JavaScript Info:
     * @property headingFormat
     * @type String
     * 
     */
    @JsProperty void setHeadingFormat(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property headingBreak
     * @type String
     * 
     */
    @JsProperty String getHeadingBreak();
    /**
     * 
     *
     * JavaScript Info:
     * @property headingBreak
     * @type String
     * 
     */
    @JsProperty void setHeadingBreak(String value);


    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior PaperClockSelector
     * 
     */
    void stopResizeNotificationsFor(Object target);

    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior PaperClockSelector
     * 
     */
    void assignParentResizable(Object parentResizable);

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior PaperClockSelector
     * 
     */
    void notifyResize();

    /**
     * 
     *
     * JavaScript Info:
     * @method dateFormat
     * 
     * 
     */
    void dateFormat();

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior PaperClockSelector
     * @return {boolean}
     */
    boolean resizerShouldNotify(JavaScriptObject element);

}
