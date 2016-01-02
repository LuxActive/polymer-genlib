/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toast project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.HandlerRegistration;
import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.iron.widget.event.IronOverlayCanceledEvent;
import com.vaadin.polymer.iron.widget.event.IronOverlayCanceledEventHandler;
import com.vaadin.polymer.iron.widget.event.IronOverlayClosedEvent;
import com.vaadin.polymer.iron.widget.event.IronOverlayClosedEventHandler;
import com.vaadin.polymer.iron.widget.event.IronOverlayOpenedEvent;
import com.vaadin.polymer.iron.widget.event.IronOverlayOpenedEventHandler;
import com.vaadin.polymer.paper.PaperToastElement;
import com.vaadin.polymer.paper.widget.event.IronAnnounceEvent;
import com.vaadin.polymer.paper.widget.event.IronAnnounceEventHandler;

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
public class PaperToast extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperToast() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperToast(String html) {
        super(PaperToastElement.TAG, PaperToastElement.SRC, html);

        getPolymerElement().addEventListener(
                com.vaadin.polymer.paper.event.IronAnnounceEvent.NAME,
                new com.vaadin.polymer.paper.event.IronAnnounceEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.paper.event.IronAnnounceEvent event) {
                fireEvent(new IronAnnounceEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.event.IronOverlayCanceledEvent.NAME,
                new com.vaadin.polymer.iron.event.IronOverlayCanceledEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.event.IronOverlayCanceledEvent event) {
                fireEvent(new IronOverlayCanceledEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.event.IronOverlayClosedEvent.NAME,
                new com.vaadin.polymer.iron.event.IronOverlayClosedEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.event.IronOverlayClosedEvent event) {
                fireEvent(new IronOverlayClosedEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.event.IronOverlayOpenedEvent.NAME,
                new com.vaadin.polymer.iron.event.IronOverlayOpenedEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.event.IronOverlayOpenedEvent event) {
                fireEvent(new IronOverlayOpenedEvent(event));
            }
        });

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperToastElement getPolymerElement() {
        try {
            return (PaperToastElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>The duration in milliseconds to show the toast.<br>Set to <code>0</code>, a negative number, or <code>Infinity</code>, to disable the<br>toast auto-closing.</p>
     *
     * JavaScript Info:
     * @property duration
     * @type Number
     * 
     */
    public double getDuration() {
        return getPolymerElement().getDuration();
    }
    /**
     * <p>The duration in milliseconds to show the toast.<br>Set to <code>0</code>, a negative number, or <code>Infinity</code>, to disable the<br>toast auto-closing.</p>
     *
     * JavaScript Info:
     * @property duration
     * @type Number
     * 
     */
    public void setDuration(double value) {
        getPolymerElement().setDuration(value);
    }

    /**
     * <p>True if the overlay was canceled when it was last closed.</p>
     *
     * JavaScript Info:
     * @property canceled
     * @type Boolean
     * @behavior PaperToast
     */
    public boolean getCanceled() {
        return getPolymerElement().getCanceled();
    }
    /**
     * <p>True if the overlay was canceled when it was last closed.</p>
     *
     * JavaScript Info:
     * @property canceled
     * @type Boolean
     * @behavior PaperToast
     */
    public void setCanceled(boolean value) {
        getPolymerElement().setCanceled(value);
    }

    /**
     * <p>Set to true to disable auto-focusing the overlay or child nodes with<br>the <code>autofocus</code> attribute` when the overlay is opened.</p>
     *
     * JavaScript Info:
     * @property noAutoFocus
     * @type Boolean
     * @behavior PaperToast
     */
    public boolean getNoAutoFocus() {
        return getPolymerElement().getNoAutoFocus();
    }
    /**
     * <p>Set to true to disable auto-focusing the overlay or child nodes with<br>the <code>autofocus</code> attribute` when the overlay is opened.</p>
     *
     * JavaScript Info:
     * @property noAutoFocus
     * @type Boolean
     * @behavior PaperToast
     */
    public void setNoAutoFocus(boolean value) {
        getPolymerElement().setNoAutoFocus(value);
    }

    /**
     * <p>Set to true to disable canceling the overlay with the ESC key.</p>
     *
     * JavaScript Info:
     * @property noCancelOnEscKey
     * @type Boolean
     * @behavior PaperToast
     */
    public boolean getNoCancelOnEscKey() {
        return getPolymerElement().getNoCancelOnEscKey();
    }
    /**
     * <p>Set to true to disable canceling the overlay with the ESC key.</p>
     *
     * JavaScript Info:
     * @property noCancelOnEscKey
     * @type Boolean
     * @behavior PaperToast
     */
    public void setNoCancelOnEscKey(boolean value) {
        getPolymerElement().setNoCancelOnEscKey(value);
    }

    /**
     * <p>Set to true to disable canceling the overlay by clicking outside it.</p>
     *
     * JavaScript Info:
     * @property noCancelOnOutsideClick
     * @type Boolean
     * @behavior PaperToast
     */
    public boolean getNoCancelOnOutsideClick() {
        return getPolymerElement().getNoCancelOnOutsideClick();
    }
    /**
     * <p>Set to true to disable canceling the overlay by clicking outside it.</p>
     *
     * JavaScript Info:
     * @property noCancelOnOutsideClick
     * @type Boolean
     * @behavior PaperToast
     */
    public void setNoCancelOnOutsideClick(boolean value) {
        getPolymerElement().setNoCancelOnOutsideClick(value);
    }

    /**
     * <p>True if the overlay is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior PaperToast
     */
    public boolean getOpened() {
        return getPolymerElement().getOpened();
    }
    /**
     * <p>True if the overlay is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * @behavior PaperToast
     */
    public void setOpened(boolean value) {
        getPolymerElement().setOpened(value);
    }

    /**
     * <p>Set to true to display a backdrop behind the overlay.</p>
     *
     * JavaScript Info:
     * @property withBackdrop
     * @type Boolean
     * @behavior PaperToast
     */
    public boolean getWithBackdrop() {
        return getPolymerElement().getWithBackdrop();
    }
    /**
     * <p>Set to true to display a backdrop behind the overlay.</p>
     *
     * JavaScript Info:
     * @property withBackdrop
     * @type Boolean
     * @behavior PaperToast
     */
    public void setWithBackdrop(boolean value) {
        getPolymerElement().setWithBackdrop(value);
    }

    /**
     * <p>Set to true to auto-fit on attach.</p>
     *
     * JavaScript Info:
     * @property autoFitOnAttach
     * @type Boolean
     * @behavior PaperToast
     */
    public boolean getAutoFitOnAttach() {
        return getPolymerElement().getAutoFitOnAttach();
    }
    /**
     * <p>Set to true to auto-fit on attach.</p>
     *
     * JavaScript Info:
     * @property autoFitOnAttach
     * @type Boolean
     * @behavior PaperToast
     */
    public void setAutoFitOnAttach(boolean value) {
        getPolymerElement().setAutoFitOnAttach(value);
    }

    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @property sizingTarget
     * @type !Element
     * @behavior PaperToast
     */
    public JavaScriptObject getSizingTarget() {
        return getPolymerElement().getSizingTarget();
    }
    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @property sizingTarget
     * @type !Element
     * @behavior PaperToast
     */
    public void setSizingTarget(JavaScriptObject value) {
        getPolymerElement().setSizingTarget(value);
    }

    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @property fitInto
     * @type Object
     * @behavior PaperToast
     */
    public JavaScriptObject getFitInto() {
        return getPolymerElement().getFitInto();
    }
    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @property fitInto
     * @type Object
     * @behavior PaperToast
     */
    public void setFitInto(JavaScriptObject value) {
        getPolymerElement().setFitInto(value);
    }

    /**
     * <p>Returns the reason this dialog was last closed.</p>
     *
     * JavaScript Info:
     * @property closingReason
     * @type Object
     * @behavior PaperToast
     */
    public JavaScriptObject getClosingReason() {
        return getPolymerElement().getClosingReason();
    }
    /**
     * <p>Returns the reason this dialog was last closed.</p>
     *
     * JavaScript Info:
     * @property closingReason
     * @type Object
     * @behavior PaperToast
     */
    public void setClosingReason(JavaScriptObject value) {
        getPolymerElement().setClosingReason(value);
    }

    /**
     * <p>The text to display in the toast.</p>
     *
     * JavaScript Info:
     * @property text
     * @type String
     * 
     */
    public String getText() {
        return getPolymerElement().getText();
    }
    /**
     * <p>The text to display in the toast.</p>
     *
     * JavaScript Info:
     * @property text
     * @type String
     * 
     */
    public void setText(String value) {
        getPolymerElement().setText(value);
    }


    /**
     * <p>The duration in milliseconds to show the toast.<br>Set to <code>0</code>, a negative number, or <code>Infinity</code>, to disable the<br>toast auto-closing.</p>
     *
     * JavaScript Info:
     * @attribute duration
     * 
     */
    public void setDuration(String value) {
        getPolymerElement().setAttribute("duration", value);
    }

    /**
     * <p>Returns the reason this dialog was last closed.</p>
     *
     * JavaScript Info:
     * @attribute closing-reason
     * @behavior PaperToast
     */
    public void setClosingReason(String value) {
        getPolymerElement().setAttribute("closing-reason", value);
    }

    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @attribute sizing-target
     * @behavior PaperToast
     */
    public void setSizingTarget(String value) {
        getPolymerElement().setAttribute("sizing-target", value);
    }

    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @attribute fit-into
     * @behavior PaperToast
     */
    public void setFitInto(String value) {
        getPolymerElement().setAttribute("fit-into", value);
    }


    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior PaperTabs
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
     * @behavior PaperTabs
     * 
     */
    public void stopResizeNotificationsFor(Object target) {
        getPolymerElement().stopResizeNotificationsFor(target);
    }

    /**
     * <p>Close the overlay.</p>
     *
     * JavaScript Info:
     * @method close
     * @behavior PaperToast
     * 
     */
    public void close() {
        getPolymerElement().close();
    }

    /**
     * <p>Cancels the overlay.</p>
     *
     * JavaScript Info:
     * @method cancel
     * @behavior PaperToast
     * 
     */
    public void cancel() {
        getPolymerElement().cancel();
    }

    /**
     * <p>Hide the toast. Same as <code>close()</code> from <code>IronOverlayBehavior</code>.</p>
     *
     * JavaScript Info:
     * @method hide
     * 
     * 
     */
    public void hide() {
        getPolymerElement().hide();
    }

    /**
     * <p>Centers horizontally and vertically if not already positioned. This also sets<br><code>position:fixed</code>.</p>
     *
     * JavaScript Info:
     * @method center
     * @behavior PaperToast
     * 
     */
    public void center() {
        getPolymerElement().center();
    }

    /**
     * <p>Constrains the size of the element to the window or <code>fitInfo</code> by setting <code>max-height</code><br>and/or <code>max-width</code>.</p>
     *
     * JavaScript Info:
     * @method constrain
     * @behavior PaperToast
     * 
     */
    public void constrain() {
        getPolymerElement().constrain();
    }

    /**
     * <p>Fits and optionally centers the element into the window, or <code>fitInfo</code> if specified.</p>
     *
     * JavaScript Info:
     * @method fit
     * @behavior PaperToast
     * 
     */
    public void fit() {
        getPolymerElement().fit();
    }

    /**
     * <p>Equivalent to calling <code>resetFit()</code> and <code>fit()</code>. Useful to call this after the element,<br>the window, or the <code>fitInfo</code> element has been resized.</p>
     *
     * JavaScript Info:
     * @method refit
     * @behavior PaperToast
     * 
     */
    public void refit() {
        getPolymerElement().refit();
    }

    /**
     * <p>Resets the target element’s position and size constraints, and clear<br>the memoized data.</p>
     *
     * JavaScript Info:
     * @method resetFit
     * @behavior PaperToast
     * 
     */
    public void resetFit() {
        getPolymerElement().resetFit();
    }

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior PaperTabs
     * 
     */
    public void notifyResize() {
        getPolymerElement().notifyResize();
    }

    /**
     * <p>Toggle the opened state of the overlay.</p>
     *
     * JavaScript Info:
     * @method toggle
     * @behavior PaperToast
     * 
     */
    public void toggle() {
        getPolymerElement().toggle();
    }

    /**
     * <p>Show the toast. Same as <code>open()</code> from <code>IronOverlayBehavior</code>.</p>
     *
     * JavaScript Info:
     * @method show
     * 
     * 
     */
    public void show() {
        getPolymerElement().show();
    }

    /**
     * <p>Open the overlay.</p>
     *
     * JavaScript Info:
     * @method open
     * @behavior PaperToast
     * 
     */
    public void open() {
        getPolymerElement().open();
    }

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior PaperTabs
     * @return {boolean}
     */
    public boolean resizerShouldNotify(JavaScriptObject element) {
        return getPolymerElement().resizerShouldNotify(element);
    }


    /**
     * <p>Fired when <code>paper-toast</code> is opened.</p>
     *
     * JavaScript Info:
     * @event 'iron-announce'
     */
    public HandlerRegistration addIronAnnounceHandler(IronAnnounceEventHandler handler) {
        return addHandler(handler, IronAnnounceEvent.TYPE);
    }

    /**
     * <p>Fired when the <code>iron-overlay</code> is canceled, but before it is closed.<br>Cancel the event to prevent the <code>iron-overlay</code> from closing.</p>
     *
     * JavaScript Info:
     * @event iron-overlay-canceled
     */
    public HandlerRegistration addIronOverlayCanceledHandler(IronOverlayCanceledEventHandler handler) {
        return addHandler(handler, IronOverlayCanceledEvent.TYPE);
    }

    /**
     * <p>Fired after the <code>iron-overlay</code> closes.</p>
     *
     * JavaScript Info:
     * @event iron-overlay-closed
     */
    public HandlerRegistration addIronOverlayClosedHandler(IronOverlayClosedEventHandler handler) {
        return addHandler(handler, IronOverlayClosedEvent.TYPE);
    }

    /**
     * <p>Fired after the <code>iron-overlay</code> opens.</p>
     *
     * JavaScript Info:
     * @event iron-overlay-opened
     */
    public HandlerRegistration addIronOverlayOpenedHandler(IronOverlayOpenedEventHandler handler) {
        return addHandler(handler, IronOverlayOpenedEvent.TYPE);
    }

}
