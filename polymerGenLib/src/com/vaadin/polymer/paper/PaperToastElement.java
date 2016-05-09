/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toast project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Material design: <a href="https://www.google.com/design/spec/components/snackbars-toasts.html">Snackbards &amp; toasts</a></p>
 * <p><code>paper-toast</code> provides a subtle notification toast. Only one <code>paper-toast</code> will<br>be visible on screen.</p>
 * <p>Use <code>opened</code> to show the toast:</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-toast text=&quot;Hello world!&quot; opened&gt;&lt;/paper-toast&gt;
 * 
 * 
 * </code></pre><p>Also <code>open()</code> or <code>show()</code> can be used to show the toast:</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-button on-click=&quot;openToast&quot;&gt;Open Toast&lt;/paper-button&gt;
 * &lt;paper-toast id=&quot;toast&quot; text=&quot;Hello world!&quot;&gt;&lt;/paper-toast&gt;
 * 
 * ...
 * 
 * openToast: function() {
 *   this.$.toast.open();
 * }
 * 
 * 
 * </code></pre><p>Set <code>duration</code> to 0, a negative number or Infinity to persist the toast on screen:</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-toast text=&quot;Terms and conditions&quot; opened duration=&quot;0&quot;&gt;
 *   &lt;a href=&quot;#&quot;&gt;Show more&lt;/a&gt;
 * &lt;/paper-toast&gt;
 * 
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling:</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--paper-toast-background-color</code></td>
 * <td>The paper-toast background-color</td>
 * <td><code>#323232</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toast-color</code></td>
 * <td>The paper-toast color</td>
 * <td><code>#f1f1f1</code></td>
 * </tr>
 * </tbody>
 * </table>
 * <p>This element applies the mixin <code>--paper-font-common-base</code> but does not import <code>paper-styles/typography.html</code>.<br>In order to apply the <code>Roboto</code> font to this element, make sure you’ve imported <code>paper-styles/typography.html</code>.</p>
 */
@JsType(isNative=true)
public interface PaperToastElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-toast";
    @JsOverlay public static final String SRC = "paper-toast/paper-toast.html";


    /**
     * <p>The backdrop element.</p>
     *
     * JavaScript Info:
     * @property backdropElement
     * @type Element
     * @behavior PaperToast
     */
    @JsProperty Element getBackdropElement();
    /**
     * <p>The backdrop element.</p>
     *
     * JavaScript Info:
     * @property backdropElement
     * @type Element
     * @behavior PaperToast
     */
    @JsProperty void setBackdropElement(Element value);

    /**
     * <p>Will position the element around the positionTarget without overlapping it.</p>
     *
     * JavaScript Info:
     * @property noOverlap
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty boolean getNoOverlap();
    /**
     * <p>Will position the element around the positionTarget without overlapping it.</p>
     *
     * JavaScript Info:
     * @property noOverlap
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty void setNoOverlap(boolean value);

    /**
     * <p>True if the overlay was canceled when it was last closed.</p>
     *
     * JavaScript Info:
     * @property canceled
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty boolean getCanceled();
    /**
     * <p>True if the overlay was canceled when it was last closed.</p>
     *
     * JavaScript Info:
     * @property canceled
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty void setCanceled(boolean value);

    /**
     * <p>Set to true to disable auto-focusing the overlay or child nodes with<br>the <code>autofocus</code> attribute` when the overlay is opened.</p>
     *
     * JavaScript Info:
     * @property noAutoFocus
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty boolean getNoAutoFocus();
    /**
     * <p>Set to true to disable auto-focusing the overlay or child nodes with<br>the <code>autofocus</code> attribute` when the overlay is opened.</p>
     *
     * JavaScript Info:
     * @property noAutoFocus
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty void setNoAutoFocus(boolean value);

    /**
     * <p>Set to true to disable canceling the overlay with the ESC key.</p>
     *
     * JavaScript Info:
     * @property noCancelOnEscKey
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty boolean getNoCancelOnEscKey();
    /**
     * <p>Set to true to disable canceling the overlay with the ESC key.</p>
     *
     * JavaScript Info:
     * @property noCancelOnEscKey
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty void setNoCancelOnEscKey(boolean value);

    /**
     * <p>Set to true to keep overlay always on top.</p>
     *
     * JavaScript Info:
     * @property alwaysOnTop
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty boolean getAlwaysOnTop();
    /**
     * <p>Set to true to keep overlay always on top.</p>
     *
     * JavaScript Info:
     * @property alwaysOnTop
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty void setAlwaysOnTop(boolean value);

    /**
     * <p>Set to true to enable restoring of focus when overlay is closed.</p>
     *
     * JavaScript Info:
     * @property restoreFocusOnClose
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty boolean getRestoreFocusOnClose();
    /**
     * <p>Set to true to enable restoring of focus when overlay is closed.</p>
     *
     * JavaScript Info:
     * @property restoreFocusOnClose
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty void setRestoreFocusOnClose(boolean value);

    /**
     * <p>Set to true to display a backdrop behind the overlay.</p>
     *
     * JavaScript Info:
     * @property withBackdrop
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty boolean getWithBackdrop();
    /**
     * <p>Set to true to display a backdrop behind the overlay.</p>
     *
     * JavaScript Info:
     * @property withBackdrop
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty void setWithBackdrop(boolean value);

    /**
     * <p>Set to true to auto-fit on attach.</p>
     *
     * JavaScript Info:
     * @property autoFitOnAttach
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty boolean getAutoFitOnAttach();
    /**
     * <p>Set to true to auto-fit on attach.</p>
     *
     * JavaScript Info:
     * @property autoFitOnAttach
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty void setAutoFitOnAttach(boolean value);

    /**
     * <p>Overridden from <code>IronOverlayBehavior</code>.<br>Set to false to enable closing of the toast by clicking outside it.</p>
     *
     * JavaScript Info:
     * @property noCancelOnOutsideClick
     * @type Boolean
     * 
     */
    @JsProperty boolean getNoCancelOnOutsideClick();
    /**
     * <p>Overridden from <code>IronOverlayBehavior</code>.<br>Set to false to enable closing of the toast by clicking outside it.</p>
     *
     * JavaScript Info:
     * @property noCancelOnOutsideClick
     * @type Boolean
     * 
     */
    @JsProperty void setNoCancelOnOutsideClick(boolean value);

    /**
     * <p>Contains the reason(s) this overlay was last closed (see <code>iron-overlay-closed</code>).<br><code>IronOverlayBehavior</code> provides the <code>canceled</code> reason; implementers of the<br>behavior can provide other reasons in addition to <code>canceled</code>.</p>
     *
     * JavaScript Info:
     * @property closingReason
     * @type Object
     * @behavior PaperToast
     */
    @JsProperty JavaScriptObject getClosingReason();
    /**
     * <p>Contains the reason(s) this overlay was last closed (see <code>iron-overlay-closed</code>).<br><code>IronOverlayBehavior</code> provides the <code>canceled</code> reason; implementers of the<br>behavior can provide other reasons in addition to <code>canceled</code>.</p>
     *
     * JavaScript Info:
     * @property closingReason
     * @type Object
     * @behavior PaperToast
     */
    @JsProperty void setClosingReason(JavaScriptObject value);

    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @property fitInto
     * @type Object
     * @behavior PaperToast
     */
    @JsProperty JavaScriptObject getFitInto();
    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @property fitInto
     * @type Object
     * @behavior PaperToast
     */
    @JsProperty void setFitInto(JavaScriptObject value);

    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @property sizingTarget
     * @type !Element
     * @behavior PaperToast
     */
    @JsProperty JavaScriptObject getSizingTarget();
    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @property sizingTarget
     * @type !Element
     * @behavior PaperToast
     */
    @JsProperty void setSizingTarget(JavaScriptObject value);

    /**
     * <p>The element that should be used to position the element. If not set, it will<br>default to the parent node.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type !Element
     * @behavior PaperToast
     */
    @JsProperty JavaScriptObject getPositionTarget();
    /**
     * <p>The element that should be used to position the element. If not set, it will<br>default to the parent node.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type !Element
     * @behavior PaperToast
     */
    @JsProperty void setPositionTarget(JavaScriptObject value);

    /**
     * <p>The duration in milliseconds to show the toast.<br>Set to <code>0</code>, a negative number, or <code>Infinity</code>, to disable the<br>toast auto-closing.</p>
     *
     * JavaScript Info:
     * @property duration
     * @type Number
     * 
     */
    @JsProperty double getDuration();
    /**
     * <p>The duration in milliseconds to show the toast.<br>Set to <code>0</code>, a negative number, or <code>Infinity</code>, to disable the<br>toast auto-closing.</p>
     *
     * JavaScript Info:
     * @property duration
     * @type Number
     * 
     */
    @JsProperty void setDuration(double value);

    /**
     * <p>The same as setting margin-top and margin-bottom css properties.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * @behavior PaperToast
     */
    @JsProperty double getVerticalOffset();
    /**
     * <p>The same as setting margin-top and margin-bottom css properties.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * @behavior PaperToast
     */
    @JsProperty void setVerticalOffset(double value);

    /**
     * <p>The same as setting margin-left and margin-right css properties.</p>
     *
     * JavaScript Info:
     * @property horizontalOffset
     * @type Number
     * @behavior PaperToast
     */
    @JsProperty double getHorizontalOffset();
    /**
     * <p>The same as setting margin-left and margin-right css properties.</p>
     *
     * JavaScript Info:
     * @property horizontalOffset
     * @type Number
     * @behavior PaperToast
     */
    @JsProperty void setHorizontalOffset(double value);

    /**
     * <p>True if the overlay is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty boolean getOpened();
    /**
     * <p>True if the overlay is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty void setOpened(boolean value);

    /**
     * <p>The orientation against which to align the element vertically<br>relative to the <code>positionTarget</code>. Possible values are “top”, “bottom”, “auto”.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * @behavior PaperToast
     */
    @JsProperty String getVerticalAlign();
    /**
     * <p>The orientation against which to align the element vertically<br>relative to the <code>positionTarget</code>. Possible values are “top”, “bottom”, “auto”.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * @behavior PaperToast
     */
    @JsProperty void setVerticalAlign(String value);

    /**
     * <p>The orientation against which to align the element horizontally<br>relative to the <code>positionTarget</code>. Possible values are “left”, “right”, “auto”.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * @behavior PaperToast
     */
    @JsProperty String getHorizontalAlign();
    /**
     * <p>The orientation against which to align the element horizontally<br>relative to the <code>positionTarget</code>. Possible values are “left”, “right”, “auto”.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * @behavior PaperToast
     */
    @JsProperty void setHorizontalAlign(String value);

    /**
     * <p>The text to display in the toast.</p>
     *
     * JavaScript Info:
     * @property text
     * @type String
     * 
     */
    @JsProperty String getText();
    /**
     * <p>The text to display in the toast.</p>
     *
     * JavaScript Info:
     * @property text
     * @type String
     * 
     */
    @JsProperty void setText(String value);


    /**
     * <p>Show the toast. Without arguments, this is the same as <code>open()</code> from <code>IronOverlayBehavior</code>.</p>
     *
     * JavaScript Info:
     * @method show
     * @param {(Object|string)=} properties  
     * 
     * 
     */
    void show(Object properties);

    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior VaadinComboBoxOverlay
     * 
     */
    void stopResizeNotificationsFor(Object target);

    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior VaadinComboBoxOverlay
     * 
     */
    void assignParentResizable(Object parentResizable);

    /**
     * <p>Overridden from <code>IronFitBehavior</code>.<br>Positions the toast at the bottom left of fitInto.</p>
     *
     * JavaScript Info:
     * @method center
     * 
     * 
     */
    void center();

    /**
     * <p>Hide the toast. Same as <code>close()</code> from <code>IronOverlayBehavior</code>.</p>
     *
     * JavaScript Info:
     * @method hide
     * 
     * 
     */
    void hide();

    /**
     * <p>Constrains the size of the element to <code>fitInto</code> by setting <code>max-height</code><br>and/or <code>max-width</code>.</p>
     *
     * JavaScript Info:
     * @method constrain
     * @behavior PaperToast
     * 
     */
    void constrain();

    /**
     * <p>Positions and fits the element into the <code>fitInto</code> element.</p>
     *
     * JavaScript Info:
     * @method fit
     * @behavior PaperToast
     * 
     */
    void fit();

    /**
     * <p>Open the overlay.</p>
     *
     * JavaScript Info:
     * @method open
     * @behavior PaperToast
     * 
     */
    void open();

    /**
     * <p>Positions the element according to <code>horizontalAlign, verticalAlign</code>.</p>
     *
     * JavaScript Info:
     * @method position
     * @behavior PaperToast
     * 
     */
    void position();

    /**
     * <p>Equivalent to calling <code>resetFit()</code> and <code>fit()</code>. Useful to call this after<br>the element or the <code>fitInto</code> element has been resized, or if any of the<br>positioning properties (e.g. <code>horizontalAlign, verticalAlign</code>) is updated.</p>
     *
     * JavaScript Info:
     * @method refit
     * @behavior PaperToast
     * 
     */
    void refit();

    /**
     * <p>Resets the target element’s position and size constraints, and clear<br>the memoized data.</p>
     *
     * JavaScript Info:
     * @method resetFit
     * @behavior PaperToast
     * 
     */
    void resetFit();

    /**
     * <p>Toggle the opened state of the overlay.</p>
     *
     * JavaScript Info:
     * @method toggle
     * @behavior PaperToast
     * 
     */
    void toggle();

    /**
     * <p>Close the overlay.</p>
     *
     * JavaScript Info:
     * @method close
     * @behavior PaperToast
     * 
     */
    void close();

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior VaadinComboBoxOverlay
     * 
     */
    void notifyResize();

    /**
     * <p>Cancels the overlay.</p>
     *
     * JavaScript Info:
     * @method cancel
     * @param {Event=} event  
     * @behavior PaperToast
     * 
     */
    void cancel(JavaScriptObject event);

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior VaadinComboBoxOverlay
     * @return {boolean}
     */
    boolean resizerShouldNotify(JavaScriptObject element);

}
