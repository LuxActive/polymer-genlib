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
public class PaperTimePicker extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperTimePicker() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperTimePicker(String html) {
        super(PaperTimePickerElement.TAG, PaperTimePickerElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperTimePickerElement getPolymerElement() {
        return (PaperTimePickerElement) getElement();
    }


    /**
     * <p>Whether or not to animate the clock hand between selections</p>
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
     * <p>Whether or not to animate the clock hand between selections</p>
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
     * <p>The current 24-hour value (0-24)</p>
     *
     * JavaScript Info:
     * @property hour
     * @type Number
     * 
     */
    public double getHour() {
        return getPolymerElement().getHour();
    }
    /**
     * <p>The current 24-hour value (0-24)</p>
     *
     * JavaScript Info:
     * @property hour
     * @type Number
     * 
     */
    public void setHour(double value) {
        getPolymerElement().setHour(value);
    }

    /**
     * <p>The current 12-hour value (0-12)</p>
     *
     * JavaScript Info:
     * @property hour12
     * @type Number
     * 
     */
    public double getHour12() {
        return getPolymerElement().getHour12();
    }
    /**
     * <p>The current 12-hour value (0-12)</p>
     *
     * JavaScript Info:
     * @property hour12
     * @type Number
     * 
     */
    public void setHour12(double value) {
        getPolymerElement().setHour12(value);
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
     * <p>The current minute (0-59)</p>
     *
     * JavaScript Info:
     * @property minute
     * @type Number
     * 
     */
    public double getMinute() {
        return getPolymerElement().getMinute();
    }
    /**
     * <p>The current minute (0-59)</p>
     *
     * JavaScript Info:
     * @property minute
     * @type Number
     * 
     */
    public void setMinute(double value) {
        getPolymerElement().setMinute(value);
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
     * <p>The time value as the number of minutes(if enableSeconds then number of seconds) from midnight</p>
     *
     * JavaScript Info:
     * @property rawValue
     * @type Number
     * 
     */
    public double getRawValue() {
        return getPolymerElement().getRawValue();
    }
    /**
     * <p>The time value as the number of minutes(if enableSeconds then number of seconds) from midnight</p>
     *
     * JavaScript Info:
     * @property rawValue
     * @type Number
     * 
     */
    public void setRawValue(double value) {
        getPolymerElement().setRawValue(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property enableSeconds
     * @type Boolean
     * 
     */
    public boolean getEnableSeconds() {
        return getPolymerElement().getEnableSeconds();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property enableSeconds
     * @type Boolean
     * 
     */
    public void setEnableSeconds(boolean value) {
        getPolymerElement().setEnableSeconds(value);
    }

    /**
     * <p>The current second (0-59)</p>
     *
     * JavaScript Info:
     * @property second
     * @type Number
     * 
     */
    public double getSecond() {
        return getPolymerElement().getSecond();
    }
    /**
     * <p>The current second (0-59)</p>
     *
     * JavaScript Info:
     * @property second
     * @type Number
     * 
     */
    public void setSecond(double value) {
        getPolymerElement().setSecond(value);
    }

    /**
     * <p>The current selector view (‘hours’ or ‘minutes’)</p>
     *
     * JavaScript Info:
     * @property view
     * @type String
     * 
     */
    public String getView() {
        return getPolymerElement().getView();
    }
    /**
     * <p>The current selector view (‘hours’ or ‘minutes’)</p>
     *
     * JavaScript Info:
     * @property view
     * @type String
     * 
     */
    public void setView(String value) {
        getPolymerElement().setView(value);
    }

    /**
     * <p>The selected time</p>
     *
     * JavaScript Info:
     * @property time
     * @type String
     * 
     */
    public String getTime() {
        return getPolymerElement().getTime();
    }
    /**
     * <p>The selected time</p>
     *
     * JavaScript Info:
     * @property time
     * @type String
     * 
     */
    public void setTime(String value) {
        getPolymerElement().setTime(value);
    }

    /**
     * <p>The current period (‘AM’, ‘PM’)</p>
     *
     * JavaScript Info:
     * @property period
     * @type String
     * 
     */
    public String getPeriod() {
        return getPolymerElement().getPeriod();
    }
    /**
     * <p>The current period (‘AM’, ‘PM’)</p>
     *
     * JavaScript Info:
     * @property period
     * @type String
     * 
     */
    public void setPeriod(String value) {
        getPolymerElement().setPeriod(value);
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


    // Needed in UIBinder
    /**
     * <p>The current minute (0-59)</p>
     *
     * JavaScript Info:
     * @attribute minute
     * 
     */
    public void setMinute(String value) {
        Polymer.property(this.getPolymerElement(), "minute", value);
    }

    // Needed in UIBinder
    /**
     * <p>The current 12-hour value (0-12)</p>
     *
     * JavaScript Info:
     * @attribute hour12
     * 
     */
    public void setHour12(String value) {
        Polymer.property(this.getPolymerElement(), "hour12", value);
    }

    // Needed in UIBinder
    /**
     * <p>The current second (0-59)</p>
     *
     * JavaScript Info:
     * @attribute second
     * 
     */
    public void setSecond(String value) {
        Polymer.property(this.getPolymerElement(), "second", value);
    }

    // Needed in UIBinder
    /**
     * <p>The current 24-hour value (0-24)</p>
     *
     * JavaScript Info:
     * @attribute hour
     * 
     */
    public void setHour(String value) {
        Polymer.property(this.getPolymerElement(), "hour", value);
    }

    // Needed in UIBinder
    /**
     * <p>The time value as the number of minutes(if enableSeconds then number of seconds) from midnight</p>
     *
     * JavaScript Info:
     * @attribute raw-value
     * 
     */
    public void setRawValue(String value) {
        Polymer.property(this.getPolymerElement(), "rawValue", value);
    }


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
    public void formatTime(Object hour, Object minute, Object second) {
        getPolymerElement().formatTime(hour, minute, second);
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
     * 
     *
     * JavaScript Info:
     * @method parseTime
     * @param {} timeString  
     * 
     * 
     */
    public void parseTime(Object timeString) {
        getPolymerElement().parseTime(timeString);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method togglePeriod
     * 
     * 
     */
    public void togglePeriod() {
        getPolymerElement().togglePeriod();
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
