/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-overlay-behavior project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * <p>Use <code>Polymer.IronOverlayBehavior</code> to implement an element that can be hidden or shown, and displays<br>on top of other content. It includes an optional backdrop, and can be used to implement a variety<br>of UI controls including dialogs and drop downs. Multiple overlays may be displayed at once.</p>
 * <h3 id="closing-and-canceling">Closing and canceling</h3>
 * <p>A dialog may be hidden by closing or canceling. The difference between close and cancel is user<br>intent. Closing generally implies that the user acknowledged the content on the overlay. By default,<br>it will cancel whenever the user taps outside it or presses the escape key. This behavior is<br>configurable with the <code>no-cancel-on-esc-key</code> and the <code>no-cancel-on-outside-click</code> properties.<br><code>close()</code> should be called explicitly by the implementer when the user interacts with a control<br>in the overlay element. When the dialog is canceled, the overlay fires an ‘iron-overlay-canceled’<br>event. Call <code>preventDefault</code> on this event to prevent the overlay from closing.</p>
 * <h3 id="positioning">Positioning</h3>
 * <p>By default the element is sized and positioned to fit and centered inside the window. You can<br>position and size it manually using CSS. See <code>Polymer.IronFitBehavior</code>.</p>
 * <h3 id="backdrop">Backdrop</h3>
 * <p>Set the <code>with-backdrop</code> attribute to display a backdrop behind the overlay. The backdrop is<br>appended to <code>&lt;body&gt;</code> and is of type <code>&lt;iron-overlay-backdrop&gt;</code>. See its doc page for styling<br>options.</p>
 * <h3 id="limitations">Limitations</h3>
 * <p>The element is styled to appear on top of other content by setting its <code>z-index</code> property. You<br>must ensure no element has a stacking context with a higher <code>z-index</code> than its parent stacking<br>context. You should place this element as a child of <code>&lt;body&gt;</code> whenever possible.</p>
 */
@JsType(isNative=true)
public interface IronOverlayBehavior {

    @JsOverlay public static final String NAME = "Polymer.IronOverlayBehavior";
    @JsOverlay public static final String SRC = "iron-overlay-behavior/iron-overlay-behavior.html";


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
     * <p>Close the overlay.</p>
     *
     * JavaScript Info:
     * @method close
     * @behavior PaperToast
     * 
     */
    void close();

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
     * <p>Cancels the overlay.</p>
     *
     * JavaScript Info:
     * @method cancel
     * @param {Event=} event  
     * @behavior PaperToast
     * 
     */
    void cancel(JavaScriptObject event);

}
