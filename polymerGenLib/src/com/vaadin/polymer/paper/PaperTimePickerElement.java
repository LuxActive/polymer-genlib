/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-time-picker project by Ben Davis <bendavis78@gmail.com>
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
 * <p><a href="http://www.google.com/design/spec/components/pickers.html">Material Design Pickers</a></p>
 * <p>Provides a responsive time picker based on the material design spec. This<br>component aims to be a clone of the time picker introduced in Android Lollipop.</p>
 * <h2 id="examples-">Examples:</h2>
 * <p>Default picker:</p>
 * <pre><code>&lt;paper-time-picker&gt;&lt;/paper-time-picker&gt;
 * 
 * 
 * </code></pre><p>Setting the initial time to 4:20pm (note that hours given as 24-hour):</p>
 * <pre><code>&lt;paper-time-picker time=&quot;4:20pm&quot;&gt;&lt;/paper-time-picker&gt;
 * 
 * 
 * </code></pre><p>If you include this element as part of <code>paper-dialog</code>, use the class<br><code>&quot;paper-time-picker-dialog&quot;</code> on the dialog in order to give it proper styling.</p>
 * <pre><code>&lt;paper-dialog id=&quot;dialog&quot; modal class=&quot;paper-time-picker-dialog&quot;
 *   on-iron-overlay-closed=&quot;dismissDialog&quot;&gt;
 *   &lt;paper-time-picker id=&quot;timePicker&quot; time=&quot;[[time]]&quot;&gt;&lt;/paper-time-picker&gt;
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
public interface PaperTimePickerElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-time-picker";
    @JsOverlay public static final String SRC = "paper-time-picker/paper-time-picker.html";


    /**
     * <p>Whether or not to animate the clock hand between selections</p>
     *
     * JavaScript Info:
     * @property animated
     * @type Boolean
     * 
     */
    @JsProperty boolean getAnimated();
    /**
     * <p>Whether or not to animate the clock hand between selections</p>
     *
     * JavaScript Info:
     * @property animated
     * @type Boolean
     * 
     */
    @JsProperty void setAnimated(boolean value);

    /**
     * <p>The current 24-hour value (0-24)</p>
     *
     * JavaScript Info:
     * @property hour
     * @type Number
     * 
     */
    @JsProperty double getHour();
    /**
     * <p>The current 24-hour value (0-24)</p>
     *
     * JavaScript Info:
     * @property hour
     * @type Number
     * 
     */
    @JsProperty void setHour(double value);

    /**
     * <p>The current 12-hour value (0-12)</p>
     *
     * JavaScript Info:
     * @property hour12
     * @type Number
     * 
     */
    @JsProperty double getHour12();
    /**
     * <p>The current 12-hour value (0-12)</p>
     *
     * JavaScript Info:
     * @property hour12
     * @type Number
     * 
     */
    @JsProperty void setHour12(double value);

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
     * <p>The current minute (0-59)</p>
     *
     * JavaScript Info:
     * @property minute
     * @type Number
     * 
     */
    @JsProperty double getMinute();
    /**
     * <p>The current minute (0-59)</p>
     *
     * JavaScript Info:
     * @property minute
     * @type Number
     * 
     */
    @JsProperty void setMinute(double value);

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
     * <p>The time value as the number of minutes(if enableSeconds then number of seconds) from midnight</p>
     *
     * JavaScript Info:
     * @property rawValue
     * @type Number
     * 
     */
    @JsProperty double getRawValue();
    /**
     * <p>The time value as the number of minutes(if enableSeconds then number of seconds) from midnight</p>
     *
     * JavaScript Info:
     * @property rawValue
     * @type Number
     * 
     */
    @JsProperty void setRawValue(double value);

    /**
     * 
     *
     * JavaScript Info:
     * @property enableSeconds
     * @type Boolean
     * 
     */
    @JsProperty boolean getEnableSeconds();
    /**
     * 
     *
     * JavaScript Info:
     * @property enableSeconds
     * @type Boolean
     * 
     */
    @JsProperty void setEnableSeconds(boolean value);

    /**
     * <p>The current second (0-59)</p>
     *
     * JavaScript Info:
     * @property second
     * @type Number
     * 
     */
    @JsProperty double getSecond();
    /**
     * <p>The current second (0-59)</p>
     *
     * JavaScript Info:
     * @property second
     * @type Number
     * 
     */
    @JsProperty void setSecond(double value);

    /**
     * <p>The current selector view (‘hours’ or ‘minutes’)</p>
     *
     * JavaScript Info:
     * @property view
     * @type String
     * 
     */
    @JsProperty String getView();
    /**
     * <p>The current selector view (‘hours’ or ‘minutes’)</p>
     *
     * JavaScript Info:
     * @property view
     * @type String
     * 
     */
    @JsProperty void setView(String value);

    /**
     * <p>The selected time</p>
     *
     * JavaScript Info:
     * @property time
     * @type String
     * 
     */
    @JsProperty String getTime();
    /**
     * <p>The selected time</p>
     *
     * JavaScript Info:
     * @property time
     * @type String
     * 
     */
    @JsProperty void setTime(String value);

    /**
     * <p>The current period (‘AM’, ‘PM’)</p>
     *
     * JavaScript Info:
     * @property period
     * @type String
     * 
     */
    @JsProperty String getPeriod();
    /**
     * <p>The current period (‘AM’, ‘PM’)</p>
     *
     * JavaScript Info:
     * @property period
     * @type String
     * 
     */
    @JsProperty void setPeriod(String value);

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
     * 
     *
     * JavaScript Info:
     * @method formatTime
     * @param {} hour  
     * @param {} minute  
     * @param {} second  
     * 
     * 
     */
    void formatTime(Object hour, Object minute, Object second);

    /**
     * 
     *
     * JavaScript Info:
     * @method parseTime
     * @param {} timeString  
     * 
     * 
     */
    void parseTime(Object timeString);

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
     * 
     *
     * JavaScript Info:
     * @method togglePeriod
     * 
     * 
     */
    void togglePeriod();

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
