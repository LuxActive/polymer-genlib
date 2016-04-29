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
 * <pre><code>&lt;paper-toast id=&quot;toast0&quot; text=&quot;Welcome back!&quot;&gt;&lt;/paper-toast&gt;
 * &lt;button onclick=&quot;document.querySelector(&#39;#toast0&#39;).open()&quot;&gt;Login&lt;/button&gt;
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
 */
@JsType(isNative=true)
public interface PaperToastElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-toast";
    @JsOverlay public static final String SRC = "paper-toast/paper-toast.html";


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
     * <p>Set to true to disable canceling the overlay by clicking outside it.</p>
     *
     * JavaScript Info:
     * @property noCancelOnOutsideClick
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty boolean getNoCancelOnOutsideClick();
    /**
     * <p>Set to true to disable canceling the overlay by clicking outside it.</p>
     *
     * JavaScript Info:
     * @property noCancelOnOutsideClick
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty void setNoCancelOnOutsideClick(boolean value);

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
     * <p>Returns the reason this dialog was last closed.</p>
     *
     * JavaScript Info:
     * @property closingReason
     * @type Object
     * @behavior PaperToast
     */
    @JsProperty JavaScriptObject getClosingReason();
    /**
     * <p>Returns the reason this dialog was last closed.</p>
     *
     * JavaScript Info:
     * @property closingReason
     * @type Object
     * @behavior PaperToast
     */
    @JsProperty void setClosingReason(JavaScriptObject value);

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
     * <p>Show the toast. Same as <code>open()</code> from <code>IronOverlayBehavior</code>.</p>
     *
     * JavaScript Info:
     * @method show
     * 
     * 
     */
    void show();

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
     * <p>Toggle the opened state of the overlay.</p>
     *
     * JavaScript Info:
     * @method toggle
     * @behavior PaperToast
     * 
     */
    void toggle();

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
     * <p>Close the overlay.</p>
     *
     * JavaScript Info:
     * @method close
     * @behavior PaperToast
     * 
     */
    void close();

    /**
     * <p>Centers horizontally and vertically if not already positioned. This also sets<br><code>position:fixed</code>.</p>
     *
     * JavaScript Info:
     * @method center
     * @behavior PaperToast
     * 
     */
    void center();

    /**
     * <p>Constrains the size of the element to the window or <code>fitInfo</code> by setting <code>max-height</code><br>and/or <code>max-width</code>.</p>
     *
     * JavaScript Info:
     * @method constrain
     * @behavior PaperToast
     * 
     */
    void constrain();

    /**
     * <p>Fits and optionally centers the element into the window, or <code>fitInfo</code> if specified.</p>
     *
     * JavaScript Info:
     * @method fit
     * @behavior PaperToast
     * 
     */
    void fit();

    /**
     * <p>Equivalent to calling <code>resetFit()</code> and <code>fit()</code>. Useful to call this after the element,<br>the window, or the <code>fitInfo</code> element has been resized.</p>
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
