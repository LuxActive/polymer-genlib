/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-swipeable-pages project by Pascal Gula aka MeTaNoV <pascal.gula@gmail.com>
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.iron.widget.event.IronActivateEvent;
import com.vaadin.polymer.iron.widget.event.IronActivateEventHandler;

import com.vaadin.polymer.iron.widget.event.IronDeselectEvent;
import com.vaadin.polymer.iron.widget.event.IronDeselectEventHandler;

import com.vaadin.polymer.iron.widget.event.IronItemsChangedEvent;
import com.vaadin.polymer.iron.widget.event.IronItemsChangedEventHandler;

import com.vaadin.polymer.iron.widget.event.IronSelectEvent;
import com.vaadin.polymer.iron.widget.event.IronSelectEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>&lt;iron-swipeable-pages&gt;</code> manages a set of pages and and provides the ability to switch<br>between them by swiping gesture.</p>
 * <p>Example:</p>
 * <pre><code>&lt;iron-swipeable-pages selected=&quot;0&quot;&gt;
 *   &lt;div&gt;One&lt;/div&gt;
 *   &lt;div&gt;Two&lt;/div&gt;
 *   &lt;div&gt;Three&lt;/div&gt;
 * &lt;/iron-swipeable-pages&gt;
 * 
 * 
 * </code></pre><p>Additionnally, you can specify the following properties regarding the sensitivity of the swipe,<br>the transition used, and the possibility of cycling. For more details, see below.</p>
 * <p>It could be a good idea to disable text selection on any of the children that you<br>want to be swiped:</p>
 * <pre><code>.swipe {
 *   -moz-user-select: none;
 *   -ms-user-select: none;
 *   -webkit-user-select: none;
 *   user-select: none;
 *   cursor: default;
 * }
 * 
 * 
 * </code></pre><p>Note: if you are using a <code>&lt;paper-drawer-panel&gt;</code>, it might be wise to use the following property: edgeSwipeSensitivity.</p>
 */
public class IronSwipeablePages extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronSwipeablePages() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronSwipeablePages(String html) {
        super(IronSwipeablePagesElement.TAG, IronSwipeablePagesElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronSwipeablePagesElement getPolymerElement() {
        return (IronSwipeablePagesElement) getElement();
    }


    /**
     * <p>This option could be used for example to check in <code>on-selected-changed</code> that<br>the selection was initiated by gesture or via data-binding or programmatically</p>
     *
     * JavaScript Info:
     * @property isGesture
     * @type Boolean
     * 
     */
    public boolean getIsGesture() {
        return getPolymerElement().getIsGesture();
    }
    /**
     * <p>This option could be used for example to check in <code>on-selected-changed</code> that<br>the selection was initiated by gesture or via data-binding or programmatically</p>
     *
     * JavaScript Info:
     * @property isGesture
     * @type Boolean
     * 
     */
    public void setIsGesture(boolean value) {
        getPolymerElement().setIsGesture(value);
    }

    /**
     * <p>The maximum global CSS transition duration applied if swiping involves more than one<br>page transition using selection instead of manual swiping.</p>
     *
     * JavaScript Info:
     * @property maximumTransitionDuration
     * @type Number
     * 
     */
    public double getMaximumTransitionDuration() {
        return getPolymerElement().getMaximumTransitionDuration();
    }
    /**
     * <p>The maximum global CSS transition duration applied if swiping involves more than one<br>page transition using selection instead of manual swiping.</p>
     *
     * JavaScript Info:
     * @property maximumTransitionDuration
     * @type Number
     * 
     */
    public void setMaximumTransitionDuration(double value) {
        getPolymerElement().setMaximumTransitionDuration(value);
    }

    /**
     * <p>Prevent cycling between first and last pages by swiping.</p>
     *
     * JavaScript Info:
     * @property noCycle
     * @type Boolean
     * 
     */
    public boolean getNoCycle() {
        return getPolymerElement().getNoCycle();
    }
    /**
     * <p>Prevent cycling between first and last pages by swiping.</p>
     *
     * JavaScript Info:
     * @property noCycle
     * @type Boolean
     * 
     */
    public void setNoCycle(boolean value) {
        getPolymerElement().setNoCycle(value);
    }

    /**
     * <p>How many pixels on the side of the screen are not sensitive to edge swipes.</p>
     *
     * JavaScript Info:
     * @property edgeSwipeSensitivity
     * @type Number
     * 
     */
    public double getEdgeSwipeSensitivity() {
        return getPolymerElement().getEdgeSwipeSensitivity();
    }
    /**
     * <p>How many pixels on the side of the screen are not sensitive to edge swipes.</p>
     *
     * JavaScript Info:
     * @property edgeSwipeSensitivity
     * @type Number
     * 
     */
    public void setEdgeSwipeSensitivity(double value) {
        getPolymerElement().setEdgeSwipeSensitivity(value);
    }

    /**
     * <p>The value used to decide if a transition is effective and therefore<br>if the page get swiped.</p>
     *
     * JavaScript Info:
     * @property threshold
     * @type Number
     * 
     */
    public double getThreshold() {
        return getPolymerElement().getThreshold();
    }
    /**
     * <p>The value used to decide if a transition is effective and therefore<br>if the page get swiped.</p>
     *
     * JavaScript Info:
     * @property threshold
     * @type Number
     * 
     */
    public void setThreshold(double value) {
        getPolymerElement().setThreshold(value);
    }

    /**
     * <p>The CSS transition duration applied swiping to next/previous page</p>
     *
     * JavaScript Info:
     * @property transitionDuration
     * @type Number
     * 
     */
    public double getTransitionDuration() {
        return getPolymerElement().getTransitionDuration();
    }
    /**
     * <p>The CSS transition duration applied swiping to next/previous page</p>
     *
     * JavaScript Info:
     * @property transitionDuration
     * @type Number
     * 
     */
    public void setTransitionDuration(double value) {
        getPolymerElement().setTransitionDuration(value);
    }

    /**
     * <p>This option could be used to disable swiping.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    public boolean getDisabled() {
        return getPolymerElement().getDisabled();
    }
    /**
     * <p>This option could be used to disable swiping.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    public void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }

    /**
     * <p>animate wrap-around between first and last as a direct transition<br>like a carousel. this animation is only used when iron-select is<br>fired from something OTHER a swipe. e.g. a call to selectNext()<br>like you might make from a button or an a11y arrow-key binding.<br>if false the wrap around flips backwards across all the pages.</p>
     *
     * JavaScript Info:
     * @property carousel
     * @type Boolean
     * 
     */
    public boolean getCarousel() {
        return getPolymerElement().getCarousel();
    }
    /**
     * <p>animate wrap-around between first and last as a direct transition<br>like a carousel. this animation is only used when iron-select is<br>fired from something OTHER a swipe. e.g. a call to selectNext()<br>like you might make from a button or an a11y arrow-key binding.<br>if false the wrap around flips backwards across all the pages.</p>
     *
     * JavaScript Info:
     * @property carousel
     * @type Boolean
     * 
     */
    public void setCarousel(boolean value) {
        getPolymerElement().setCarousel(value);
    }

    /**
     * <p>The list of items from which a selection can be made.</p>
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * @behavior PaperTabs
     */
    public JsArray getItems() {
        return getPolymerElement().getItems();
    }
    /**
     * <p>The list of items from which a selection can be made.</p>
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * @behavior PaperTabs
     */
    public void setItems(JsArray value) {
        getPolymerElement().setItems(value);
    }

    /**
     * <p>Add extra padding to the offsetWidth while swiping<br>Useful if the element is nested within other elements that enforce a padding</p>
     *
     * JavaScript Info:
     * @property padding
     * @type Number
     * 
     */
    public double getPadding() {
        return getPolymerElement().getPadding();
    }
    /**
     * <p>Add extra padding to the offsetWidth while swiping<br>Useful if the element is nested within other elements that enforce a padding</p>
     *
     * JavaScript Info:
     * @property padding
     * @type Number
     * 
     */
    public void setPadding(double value) {
        getPolymerElement().setPadding(value);
    }

    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type (string|number)
     * @behavior PaperTabs
     */
    public Object getSelected() {
        return getPolymerElement().getSelected();
    }
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type (string|number)
     * @behavior PaperTabs
     */
    public void setSelected(Object value) {
        getPolymerElement().setSelected(value);
    }

    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type ?Object
     * @behavior PaperTabs
     */
    public JavaScriptObject getSelectedItem() {
        return getPolymerElement().getSelectedItem();
    }
    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type ?Object
     * @behavior PaperTabs
     */
    public void setSelectedItem(JavaScriptObject value) {
        getPolymerElement().setSelectedItem(value);
    }

    /**
     * <p>The attribute to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type String
     * @behavior PaperTabs
     */
    public String getSelectedAttribute() {
        return getPolymerElement().getSelectedAttribute();
    }
    /**
     * <p>The attribute to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type String
     * @behavior PaperTabs
     */
    public void setSelectedAttribute(String value) {
        getPolymerElement().setSelectedAttribute(value);
    }

    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type String
     * @behavior PaperTabs
     */
    public String getSelectedClass() {
        return getPolymerElement().getSelectedClass();
    }
    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type String
     * @behavior PaperTabs
     */
    public void setSelectedClass(String value) {
        getPolymerElement().setSelectedClass(value);
    }

    /**
     * <p>This is a CSS selector string.  If this is set, only items that match the CSS selector<br>are selectable.</p>
     *
     * JavaScript Info:
     * @property selectable
     * @type string
     * @behavior PaperTabs
     */
    public String getSelectable() {
        return getPolymerElement().getSelectable();
    }
    /**
     * <p>This is a CSS selector string.  If this is set, only items that match the CSS selector<br>are selectable.</p>
     *
     * JavaScript Info:
     * @property selectable
     * @type string
     * @behavior PaperTabs
     */
    public void setSelectable(String value) {
        getPolymerElement().setSelectable(value);
    }

    /**
     * <p>Default fallback if the selection based on selected with <code>attrForSelected</code><br>is not found.</p>
     *
     * JavaScript Info:
     * @property fallbackSelection
     * @type String
     * @behavior PaperTabs
     */
    public String getFallbackSelection() {
        return getPolymerElement().getFallbackSelection();
    }
    /**
     * <p>Default fallback if the selection based on selected with <code>attrForSelected</code><br>is not found.</p>
     *
     * JavaScript Info:
     * @property fallbackSelection
     * @type String
     * @behavior PaperTabs
     */
    public void setFallbackSelection(String value) {
        getPolymerElement().setFallbackSelection(value);
    }

    /**
     * <p>If you want to use an attribute value or property of an element for<br><code>selected</code> instead of the index, set this to the name of the attribute<br>or property. Hyphenated values are converted to camel case when used to<br>look up the property of a selectable element. Camel cased values are<br><em>not</em> converted to hyphenated values for attribute lookup. It’s<br>recommended that you provide the hyphenated form of the name so that<br>selection works in both cases. (Use <code>attr-or-property-name</code> instead of<br><code>attrOrPropertyName</code>.)</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type String
     * @behavior PaperTabs
     */
    public String getAttrForSelected() {
        return getPolymerElement().getAttrForSelected();
    }
    /**
     * <p>If you want to use an attribute value or property of an element for<br><code>selected</code> instead of the index, set this to the name of the attribute<br>or property. Hyphenated values are converted to camel case when used to<br>look up the property of a selectable element. Camel cased values are<br><em>not</em> converted to hyphenated values for attribute lookup. It’s<br>recommended that you provide the hyphenated form of the name so that<br>selection works in both cases. (Use <code>attr-or-property-name</code> instead of<br><code>attrOrPropertyName</code>.)</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type String
     * @behavior PaperTabs
     */
    public void setAttrForSelected(String value) {
        getPolymerElement().setAttrForSelected(value);
    }

    /**
     * <p>The event that fires from items when they are selected. Selectable<br>will listen for this event from items and update the selection state.<br>Set to empty string to listen to no events.</p>
     *
     * JavaScript Info:
     * @property activateEvent
     * @type String
     * @behavior PaperTabs
     */
    public String getActivateEvent() {
        return getPolymerElement().getActivateEvent();
    }
    /**
     * <p>The event that fires from items when they are selected. Selectable<br>will listen for this event from items and update the selection state.<br>Set to empty string to listen to no events.</p>
     *
     * JavaScript Info:
     * @property activateEvent
     * @type String
     * @behavior PaperTabs
     */
    public void setActivateEvent(String value) {
        getPolymerElement().setActivateEvent(value);
    }

    /**
     * <p>The CSS transition timing function applied.</p>
     *
     * JavaScript Info:
     * @property transitionTimingFunction
     * @type String
     * 
     */
    public String getTransitionTimingFunction() {
        return getPolymerElement().getTransitionTimingFunction();
    }
    /**
     * <p>The CSS transition timing function applied.</p>
     *
     * JavaScript Info:
     * @property transitionTimingFunction
     * @type String
     * 
     */
    public void setTransitionTimingFunction(String value) {
        getPolymerElement().setTransitionTimingFunction(value);
    }


    // Needed in UIBinder
    /**
     * <p>How many pixels on the side of the screen are not sensitive to edge swipes.</p>
     *
     * JavaScript Info:
     * @attribute edge-swipe-sensitivity
     * 
     */
    public void setEdgeSwipeSensitivity(String value) {
        Polymer.property(this.getPolymerElement(), "edgeSwipeSensitivity", value);
    }

    // Needed in UIBinder
    /**
     * <p>The value used to decide if a transition is effective and therefore<br>if the page get swiped.</p>
     *
     * JavaScript Info:
     * @attribute threshold
     * 
     */
    public void setThreshold(String value) {
        Polymer.property(this.getPolymerElement(), "threshold", value);
    }

    // Needed in UIBinder
    /**
     * <p>The CSS transition duration applied swiping to next/previous page</p>
     *
     * JavaScript Info:
     * @attribute transition-duration
     * 
     */
    public void setTransitionDuration(String value) {
        Polymer.property(this.getPolymerElement(), "transitionDuration", value);
    }

    // Needed in UIBinder
    /**
     * <p>The maximum global CSS transition duration applied if swiping involves more than one<br>page transition using selection instead of manual swiping.</p>
     *
     * JavaScript Info:
     * @attribute maximum-transition-duration
     * 
     */
    public void setMaximumTransitionDuration(String value) {
        Polymer.property(this.getPolymerElement(), "maximumTransitionDuration", value);
    }

    // Needed in UIBinder
    /**
     * <p>The list of items from which a selection can be made.</p>
     *
     * JavaScript Info:
     * @attribute items
     * @behavior PaperTabs
     */
    public void setItems(String value) {
        Polymer.property(this.getPolymerElement(), "items", value);
    }

    // Needed in UIBinder
    /**
     * <p>Add extra padding to the offsetWidth while swiping<br>Useful if the element is nested within other elements that enforce a padding</p>
     *
     * JavaScript Info:
     * @attribute padding
     * 
     */
    public void setPadding(String value) {
        Polymer.property(this.getPolymerElement(), "padding", value);
    }

    // Needed in UIBinder
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @attribute selected
     * @behavior PaperTabs
     */
    public void setSelected(String value) {
        Polymer.property(this.getPolymerElement(), "selected", value);
    }

    // Needed in UIBinder
    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @attribute selected-item
     * @behavior PaperTabs
     */
    public void setSelectedItem(String value) {
        Polymer.property(this.getPolymerElement(), "selectedItem", value);
    }


    /**
     * <p>Selects the item at the given index.</p>
     *
     * JavaScript Info:
     * @method selectIndex
     * @param {} index  
     * @behavior PaperTabs
     * 
     */
    public void selectIndex(Object index) {
        getPolymerElement().selectIndex(index);
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
     * <p>Selects the given value.</p>
     *
     * JavaScript Info:
     * @method select
     * @param {(string|number)} value  
     * @behavior PaperTabs
     * 
     */
    public void select(Object value) {
        getPolymerElement().select(value);
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

    /**
     * <p>Selects the previous item.</p>
     *
     * JavaScript Info:
     * @method selectPrevious
     * @behavior PaperTabs
     * 
     */
    public void selectPrevious() {
        getPolymerElement().selectPrevious();
    }

    /**
     * <p>Selects the next item.</p>
     *
     * JavaScript Info:
     * @method selectNext
     * @behavior PaperTabs
     * 
     */
    public void selectNext() {
        getPolymerElement().selectNext();
    }

    /**
     * <p>Force a synchronous update of the <code>items</code> property.</p>
     * <p>NOTE: Consider listening for the <code>iron-items-changed</code> event to respond to<br>updates to the set of selectable items after updates to the DOM list and<br>selection state have been made.</p>
     * <p>WARNING: If you are using this method, you should probably consider an<br>alternate approach. Synchronously querying for items is potentially<br>slow for many use cases. The <code>items</code> property will update asynchronously<br>on its own to reflect selectable items in the DOM.</p>
     *
     * JavaScript Info:
     * @method forceSynchronousItemUpdate
     * @behavior PaperTabs
     * 
     */
    public void forceSynchronousItemUpdate() {
        getPolymerElement().forceSynchronousItemUpdate();
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
     * <p>Returns the index of the given item.</p>
     *
     * JavaScript Info:
     * @method indexOf
     * @param {Object} item  
     * @behavior PaperTabs
     * 
     */
    public void indexOf(JavaScriptObject item) {
        getPolymerElement().indexOf(item);
    }


    /**
     * <p>Fired when iron-selector is activated (selected or deselected).<br>It is fired before the selected items are changed.<br>Cancel the event to abort selection.</p>
     *
     * JavaScript Info:
     * @event iron-activate
     */
    public HandlerRegistration addIronActivateHandler(IronActivateEventHandler handler) {
        return addDomHandler(handler, IronActivateEvent.TYPE);
    }

    /**
     * <p>Fired when an item is deselected</p>
     *
     * JavaScript Info:
     * @event iron-deselect
     */
    public HandlerRegistration addIronDeselectHandler(IronDeselectEventHandler handler) {
        return addDomHandler(handler, IronDeselectEvent.TYPE);
    }

    /**
     * <p>Fired when the list of selectable items changes (e.g., items are<br>added or removed). The detail of the event is a mutation record that<br>describes what changed.</p>
     *
     * JavaScript Info:
     * @event iron-items-changed
     */
    public HandlerRegistration addIronItemsChangedHandler(IronItemsChangedEventHandler handler) {
        return addDomHandler(handler, IronItemsChangedEvent.TYPE);
    }

    /**
     * <p>Fired when an item is selected</p>
     *
     * JavaScript Info:
     * @event iron-select
     */
    public HandlerRegistration addIronSelectHandler(IronSelectEventHandler handler) {
        return addDomHandler(handler, IronSelectEvent.TYPE);
    }

}
