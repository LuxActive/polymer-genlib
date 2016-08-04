/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-dialog project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.*;

import com.vaadin.polymer.iron.widget.event.IronOverlayCanceledEvent;
import com.vaadin.polymer.iron.widget.event.IronOverlayCanceledEventHandler;

import com.vaadin.polymer.iron.widget.event.IronOverlayClosedEvent;
import com.vaadin.polymer.iron.widget.event.IronOverlayClosedEventHandler;

import com.vaadin.polymer.iron.widget.event.IronOverlayOpenedEvent;
import com.vaadin.polymer.iron.widget.event.IronOverlayOpenedEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Material design: <a href="https://www.google.com/design/spec/components/dialogs.html">Dialogs</a></p>
 * <p><code>&lt;paper-dialog&gt;</code> is a dialog with Material Design styling and optional animations when it is<br>opened or closed. It provides styles for a header, content area, and an action area for buttons.<br>You can use the <code>&lt;paper-dialog-scrollable&gt;</code> element (in its own repository) if you need a scrolling<br>content area. See <code>Polymer.PaperDialogBehavior</code> for specifics.</p>
 * <p>For example, the following code implements a dialog with a header, scrolling content area and<br>buttons.</p>
 * <pre><code>&lt;paper-dialog&gt;
 *   &lt;h2&gt;Header&lt;/h2&gt;
 *   &lt;paper-dialog-scrollable&gt;
 *     Lorem ipsum...
 *   &lt;/paper-dialog-scrollable&gt;
 *   &lt;div class=&quot;buttons&quot;&gt;
 *     &lt;paper-button dialog-dismiss&gt;Cancel&lt;/paper-button&gt;
 *     &lt;paper-button dialog-confirm&gt;Accept&lt;/paper-button&gt;
 *   &lt;/div&gt;
 * &lt;/paper-dialog&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>See the docs for <code>Polymer.PaperDialogBehavior</code> for the custom properties available for styling<br>this element.</p>
 * <h3 id="animations">Animations</h3>
 * <p>Set the <code>entry-animation</code> and/or <code>exit-animation</code> attributes to add an animation when the dialog<br>is opened or closed. See the documentation in<br><a href="https://github.com/PolymerElements/neon-animation">PolymerElements/neon-animation</a> for more info.</p>
 * <p>For example:</p>
 * <pre><code>&lt;link rel=&quot;import&quot; href=&quot;components/neon-animation/animations/scale-up-animation.html&quot;&gt;
 * &lt;link rel=&quot;import&quot; href=&quot;components/neon-animation/animations/fade-out-animation.html&quot;&gt;
 * 
 * &lt;paper-dialog entry-animation=&quot;scale-up-animation&quot;
 *               exit-animation=&quot;fade-out-animation&quot;&gt;
 *   &lt;h2&gt;Header&lt;/h2&gt;
 *   &lt;div&gt;Dialog body&lt;/div&gt;
 * &lt;/paper-dialog&gt;
 * 
 * 
 * </code></pre><h3 id="accessibility">Accessibility</h3>
 * <p>See the docs for <code>Polymer.PaperDialogBehavior</code> for accessibility features implemented by this<br>element.</p>
 */
public class PaperDialog extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperDialog() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperDialog(String html) {
        super(PaperDialogElement.TAG, PaperDialogElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperDialogElement getPolymerElement() {
        try {
            return (PaperDialogElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>The backdrop element.</p>
     *
     * JavaScript Info:
     * @property backdropElement
     * @type Element
     * @behavior PaperToast
     */
    public Element getBackdropElement() {
        return getPolymerElement().getBackdropElement();
    }
    /**
     * <p>The backdrop element.</p>
     *
     * JavaScript Info:
     * @property backdropElement
     * @type Element
     * @behavior PaperToast
     */
    public void setBackdropElement(Element value) {
        getPolymerElement().setBackdropElement(value);
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
     * <p>Will position the element around the positionTarget without overlapping it.</p>
     *
     * JavaScript Info:
     * @property noOverlap
     * @type Boolean
     * @behavior PaperToast
     */
    public boolean getNoOverlap() {
        return getPolymerElement().getNoOverlap();
    }
    /**
     * <p>Will position the element around the positionTarget without overlapping it.</p>
     *
     * JavaScript Info:
     * @property noOverlap
     * @type Boolean
     * @behavior PaperToast
     */
    public void setNoOverlap(boolean value) {
        getPolymerElement().setNoOverlap(value);
    }

    /**
     * <p>Set to true to keep overlay always on top.</p>
     *
     * JavaScript Info:
     * @property alwaysOnTop
     * @type Boolean
     * @behavior PaperToast
     */
    public boolean getAlwaysOnTop() {
        return getPolymerElement().getAlwaysOnTop();
    }
    /**
     * <p>Set to true to keep overlay always on top.</p>
     *
     * JavaScript Info:
     * @property alwaysOnTop
     * @type Boolean
     * @behavior PaperToast
     */
    public void setAlwaysOnTop(boolean value) {
        getPolymerElement().setAlwaysOnTop(value);
    }

    /**
     * <p>Set to true to enable restoring of focus when overlay is closed.</p>
     *
     * JavaScript Info:
     * @property restoreFocusOnClose
     * @type Boolean
     * @behavior PaperToast
     */
    public boolean getRestoreFocusOnClose() {
        return getPolymerElement().getRestoreFocusOnClose();
    }
    /**
     * <p>Set to true to enable restoring of focus when overlay is closed.</p>
     *
     * JavaScript Info:
     * @property restoreFocusOnClose
     * @type Boolean
     * @behavior PaperToast
     */
    public void setRestoreFocusOnClose(boolean value) {
        getPolymerElement().setRestoreFocusOnClose(value);
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
     * <p>If <code>modal</code> is true, this implies <code>no-cancel-on-outside-click</code> and <code>with-backdrop</code>.</p>
     *
     * JavaScript Info:
     * @property modal
     * @type Boolean
     * @behavior PaperDialog
     */
    public boolean getModal() {
        return getPolymerElement().getModal();
    }
    /**
     * <p>If <code>modal</code> is true, this implies <code>no-cancel-on-outside-click</code> and <code>with-backdrop</code>.</p>
     *
     * JavaScript Info:
     * @property modal
     * @type Boolean
     * @behavior PaperDialog
     */
    public void setModal(boolean value) {
        getPolymerElement().setModal(value);
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
     * <p>The same as setting margin-left and margin-right css properties.</p>
     *
     * JavaScript Info:
     * @property horizontalOffset
     * @type Number
     * @behavior PaperToast
     */
    public double getHorizontalOffset() {
        return getPolymerElement().getHorizontalOffset();
    }
    /**
     * <p>The same as setting margin-left and margin-right css properties.</p>
     *
     * JavaScript Info:
     * @property horizontalOffset
     * @type Number
     * @behavior PaperToast
     */
    public void setHorizontalOffset(double value) {
        getPolymerElement().setHorizontalOffset(value);
    }

    /**
     * <p>The same as setting margin-top and margin-bottom css properties.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * @behavior PaperToast
     */
    public double getVerticalOffset() {
        return getPolymerElement().getVerticalOffset();
    }
    /**
     * <p>The same as setting margin-top and margin-bottom css properties.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * @behavior PaperToast
     */
    public void setVerticalOffset(double value) {
        getPolymerElement().setVerticalOffset(value);
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
     * <p>Contains the reason(s) this overlay was last closed (see <code>iron-overlay-closed</code>).<br><code>IronOverlayBehavior</code> provides the <code>canceled</code> reason; implementers of the<br>behavior can provide other reasons in addition to <code>canceled</code>.</p>
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
     * <p>Contains the reason(s) this overlay was last closed (see <code>iron-overlay-closed</code>).<br><code>IronOverlayBehavior</code> provides the <code>canceled</code> reason; implementers of the<br>behavior can provide other reasons in addition to <code>canceled</code>.</p>
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
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * @behavior PaperTooltip
     */
    public JavaScriptObject getAnimationConfig() {
        return getPolymerElement().getAnimationConfig();
    }
    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @property animationConfig
     * @type Object
     * @behavior PaperTooltip
     */
    public void setAnimationConfig(JavaScriptObject value) {
        getPolymerElement().setAnimationConfig(value);
    }

    /**
     * <p>The element that should be used to position the element. If not set, it will<br>default to the parent node.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type !Element
     * @behavior PaperToast
     */
    public JavaScriptObject getPositionTarget() {
        return getPolymerElement().getPositionTarget();
    }
    /**
     * <p>The element that should be used to position the element. If not set, it will<br>default to the parent node.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type !Element
     * @behavior PaperToast
     */
    public void setPositionTarget(JavaScriptObject value) {
        getPolymerElement().setPositionTarget(value);
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
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * @behavior PaperTooltip
     */
    public String getExitAnimation() {
        return getPolymerElement().getExitAnimation();
    }
    /**
     * <p>Convenience property for setting an ‘exit’ animation. Do not set <code>animationConfig.exit</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property exitAnimation
     * @type String
     * @behavior PaperTooltip
     */
    public void setExitAnimation(String value) {
        getPolymerElement().setExitAnimation(value);
    }

    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * @behavior PaperTooltip
     */
    public String getEntryAnimation() {
        return getPolymerElement().getEntryAnimation();
    }
    /**
     * <p>Convenience property for setting an ‘entry’ animation. Do not set <code>animationConfig.entry</code><br>manually if using this. The animated node is set to <code>this</code> if using this property.</p>
     *
     * JavaScript Info:
     * @property entryAnimation
     * @type String
     * @behavior PaperTooltip
     */
    public void setEntryAnimation(String value) {
        getPolymerElement().setEntryAnimation(value);
    }

    /**
     * <p>The orientation against which to align the element vertically<br>relative to the <code>positionTarget</code>. Possible values are “top”, “bottom”, “auto”.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * @behavior PaperToast
     */
    public String getVerticalAlign() {
        return getPolymerElement().getVerticalAlign();
    }
    /**
     * <p>The orientation against which to align the element vertically<br>relative to the <code>positionTarget</code>. Possible values are “top”, “bottom”, “auto”.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * @behavior PaperToast
     */
    public void setVerticalAlign(String value) {
        getPolymerElement().setVerticalAlign(value);
    }

    /**
     * <p>The orientation against which to align the element horizontally<br>relative to the <code>positionTarget</code>. Possible values are “left”, “right”, “auto”.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * @behavior PaperToast
     */
    public String getHorizontalAlign() {
        return getPolymerElement().getHorizontalAlign();
    }
    /**
     * <p>The orientation against which to align the element horizontally<br>relative to the <code>positionTarget</code>. Possible values are “left”, “right”, “auto”.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * @behavior PaperToast
     */
    public void setHorizontalAlign(String value) {
        getPolymerElement().setHorizontalAlign(value);
    }


    /**
     * <p>Animation configuration. See README for more info.</p>
     *
     * JavaScript Info:
     * @attribute animation-config
     * @behavior PaperTooltip
     */
    public void setAnimationConfig(String value) {
        getPolymerElement().setAttribute("animation-config", value);
    }

    /**
     * <p>The same as setting margin-top and margin-bottom css properties.</p>
     *
     * JavaScript Info:
     * @attribute vertical-offset
     * @behavior PaperToast
     */
    public void setVerticalOffset(String value) {
        getPolymerElement().setAttribute("vertical-offset", value);
    }

    /**
     * <p>The same as setting margin-left and margin-right css properties.</p>
     *
     * JavaScript Info:
     * @attribute horizontal-offset
     * @behavior PaperToast
     */
    public void setHorizontalOffset(String value) {
        getPolymerElement().setAttribute("horizontal-offset", value);
    }

    /**
     * <p>Contains the reason(s) this overlay was last closed (see <code>iron-overlay-closed</code>).<br><code>IronOverlayBehavior</code> provides the <code>canceled</code> reason; implementers of the<br>behavior can provide other reasons in addition to <code>canceled</code>.</p>
     *
     * JavaScript Info:
     * @attribute closing-reason
     * @behavior PaperToast
     */
    public void setClosingReason(String value) {
        getPolymerElement().setAttribute("closing-reason", value);
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
     * <p>The element that should be used to position the element. If not set, it will<br>default to the parent node.</p>
     *
     * JavaScript Info:
     * @attribute position-target
     * @behavior PaperToast
     */
    public void setPositionTarget(String value) {
        getPolymerElement().setAttribute("position-target", value);
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
     * <p>The backdrop element.</p>
     *
     * JavaScript Info:
     * @attribute backdrop-element
     * @behavior PaperToast
     */
    public void setBackdropElement(String value) {
        getPolymerElement().setAttribute("backdrop-element", value);
    }


    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior VaadinComboBoxOverlay
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
     * @behavior VaadinComboBoxOverlay
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
     * <p>Constrains the size of the element to <code>fitInto</code> by setting <code>max-height</code><br>and/or <code>max-width</code>.</p>
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
     * <p>Positions and fits the element into the <code>fitInto</code> element.</p>
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
     * <p>Positions the element according to <code>horizontalAlign, verticalAlign</code>.</p>
     *
     * JavaScript Info:
     * @method position
     * @behavior PaperToast
     * 
     */
    public void position() {
        getPolymerElement().position();
    }

    /**
     * <p>Equivalent to calling <code>resetFit()</code> and <code>fit()</code>. Useful to call this after<br>the element or the <code>fitInto</code> element has been resized, or if any of the<br>positioning properties (e.g. <code>horizontalAlign, verticalAlign</code>) is updated.</p>
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
     * @behavior VaadinComboBoxOverlay
     * 
     */
    public void notifyResize() {
        getPolymerElement().notifyResize();
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
     * <p>Cancels the currently running animation.</p>
     *
     * JavaScript Info:
     * @method cancelAnimation
     * @behavior PaperTooltip
     * 
     */
    public void cancelAnimation() {
        getPolymerElement().cancelAnimation();
    }

    /**
     * <p>Cancels the overlay.</p>
     *
     * JavaScript Info:
     * @method cancel
     * @param {Event=} event  
     * @behavior PaperToast
     * 
     */
    public void cancel(JavaScriptObject event) {
        getPolymerElement().cancel(event);
    }

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior VaadinComboBoxOverlay
     * @return {boolean}
     */
    public boolean resizerShouldNotify(JavaScriptObject element) {
        return getPolymerElement().resizerShouldNotify(element);
    }

    /**
     * <p>Plays an animation with an optional <code>type</code>.</p>
     *
     * JavaScript Info:
     * @method playAnimation
     * @param {string=} type  
     * @param {!Object=} cookie  
     * @behavior PaperTooltip
     * 
     */
    public void playAnimation(String type, JavaScriptObject cookie) {
        getPolymerElement().playAnimation(type, cookie);
    }


    /**
     * <p>Fired when the overlay is canceled, but before it is closed.</p>
     *
     * JavaScript Info:
     * @event iron-overlay-canceled
     */
    public HandlerRegistration addIronOverlayCanceledHandler(IronOverlayCanceledEventHandler handler) {
        return addDomHandler(handler, IronOverlayCanceledEvent.TYPE);
    }

    /**
     * <p>Fired after the overlay closes.</p>
     *
     * JavaScript Info:
     * @event iron-overlay-closed
     */
    public HandlerRegistration addIronOverlayClosedHandler(IronOverlayClosedEventHandler handler) {
        return addDomHandler(handler, IronOverlayClosedEvent.TYPE);
    }

    /**
     * <p>Fired after the overlay opens.</p>
     *
     * JavaScript Info:
     * @event iron-overlay-opened
     */
    public HandlerRegistration addIronOverlayOpenedHandler(IronOverlayOpenedEventHandler handler) {
        return addDomHandler(handler, IronOverlayOpenedEvent.TYPE);
    }

}