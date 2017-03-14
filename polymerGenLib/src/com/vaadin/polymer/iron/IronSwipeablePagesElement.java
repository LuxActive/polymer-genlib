/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-swipeable-pages project by Pascal Gula aka MeTaNoV <pascal.gula@gmail.com>
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.iron;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

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
@JsType(isNative=true)
public interface IronSwipeablePagesElement extends HTMLElement {

    @JsOverlay public static final String TAG = "iron-swipeable-pages";
    @JsOverlay public static final String SRC = "iron-swipeable-pages/iron-swipeable-pages.html";


    /**
     * <p>This option could be used for example to check in <code>on-selected-changed</code> that<br>the selection was initiated by gesture or via data-binding or programmatically</p>
     *
     * JavaScript Info:
     * @property isGesture
     * @type Boolean
     * 
     */
    @JsProperty boolean getIsGesture();
    /**
     * <p>This option could be used for example to check in <code>on-selected-changed</code> that<br>the selection was initiated by gesture or via data-binding or programmatically</p>
     *
     * JavaScript Info:
     * @property isGesture
     * @type Boolean
     * 
     */
    @JsProperty void setIsGesture(boolean value);

    /**
     * <p>The maximum global CSS transition duration applied if swiping involves more than one<br>page transition using selection instead of manual swiping.</p>
     *
     * JavaScript Info:
     * @property maximumTransitionDuration
     * @type Number
     * 
     */
    @JsProperty double getMaximumTransitionDuration();
    /**
     * <p>The maximum global CSS transition duration applied if swiping involves more than one<br>page transition using selection instead of manual swiping.</p>
     *
     * JavaScript Info:
     * @property maximumTransitionDuration
     * @type Number
     * 
     */
    @JsProperty void setMaximumTransitionDuration(double value);

    /**
     * <p>Prevent cycling between first and last pages by swiping.</p>
     *
     * JavaScript Info:
     * @property noCycle
     * @type Boolean
     * 
     */
    @JsProperty boolean getNoCycle();
    /**
     * <p>Prevent cycling between first and last pages by swiping.</p>
     *
     * JavaScript Info:
     * @property noCycle
     * @type Boolean
     * 
     */
    @JsProperty void setNoCycle(boolean value);

    /**
     * <p>How many pixels on the side of the screen are not sensitive to edge swipes.</p>
     *
     * JavaScript Info:
     * @property edgeSwipeSensitivity
     * @type Number
     * 
     */
    @JsProperty double getEdgeSwipeSensitivity();
    /**
     * <p>How many pixels on the side of the screen are not sensitive to edge swipes.</p>
     *
     * JavaScript Info:
     * @property edgeSwipeSensitivity
     * @type Number
     * 
     */
    @JsProperty void setEdgeSwipeSensitivity(double value);

    /**
     * <p>The value used to decide if a transition is effective and therefore<br>if the page get swiped.</p>
     *
     * JavaScript Info:
     * @property threshold
     * @type Number
     * 
     */
    @JsProperty double getThreshold();
    /**
     * <p>The value used to decide if a transition is effective and therefore<br>if the page get swiped.</p>
     *
     * JavaScript Info:
     * @property threshold
     * @type Number
     * 
     */
    @JsProperty void setThreshold(double value);

    /**
     * <p>The CSS transition duration applied swiping to next/previous page</p>
     *
     * JavaScript Info:
     * @property transitionDuration
     * @type Number
     * 
     */
    @JsProperty double getTransitionDuration();
    /**
     * <p>The CSS transition duration applied swiping to next/previous page</p>
     *
     * JavaScript Info:
     * @property transitionDuration
     * @type Number
     * 
     */
    @JsProperty void setTransitionDuration(double value);

    /**
     * <p>This option could be used to disable swiping.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    @JsProperty boolean getDisabled();
    /**
     * <p>This option could be used to disable swiping.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    @JsProperty void setDisabled(boolean value);

    /**
     * <p>animate wrap-around between first and last as a direct transition<br>like a carousel. this animation is only used when iron-select is<br>fired from something OTHER a swipe. e.g. a call to selectNext()<br>like you might make from a button or an a11y arrow-key binding.<br>if false the wrap around flips backwards across all the pages.</p>
     *
     * JavaScript Info:
     * @property carousel
     * @type Boolean
     * 
     */
    @JsProperty boolean getCarousel();
    /**
     * <p>animate wrap-around between first and last as a direct transition<br>like a carousel. this animation is only used when iron-select is<br>fired from something OTHER a swipe. e.g. a call to selectNext()<br>like you might make from a button or an a11y arrow-key binding.<br>if false the wrap around flips backwards across all the pages.</p>
     *
     * JavaScript Info:
     * @property carousel
     * @type Boolean
     * 
     */
    @JsProperty void setCarousel(boolean value);

    /**
     * <p>The list of items from which a selection can be made.</p>
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * @behavior IronSwipeablePages
     */
    @JsProperty JsArray getItems();
    /**
     * <p>The list of items from which a selection can be made.</p>
     *
     * JavaScript Info:
     * @property items
     * @type Array
     * @behavior IronSwipeablePages
     */
    @JsProperty void setItems(JsArray value);

    /**
     * <p>Add extra padding to the offsetWidth while swiping<br>Useful if the element is nested within other elements that enforce a padding</p>
     *
     * JavaScript Info:
     * @property padding
     * @type Number
     * 
     */
    @JsProperty double getPadding();
    /**
     * <p>Add extra padding to the offsetWidth while swiping<br>Useful if the element is nested within other elements that enforce a padding</p>
     *
     * JavaScript Info:
     * @property padding
     * @type Number
     * 
     */
    @JsProperty void setPadding(double value);

    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type (string|number)
     * @behavior IronSwipeablePages
     */
    @JsProperty Object getSelected();
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type (string|number)
     * @behavior IronSwipeablePages
     */
    @JsProperty void setSelected(Object value);

    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type ?Object
     * @behavior IronSwipeablePages
     */
    @JsProperty JavaScriptObject getSelectedItem();
    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type ?Object
     * @behavior IronSwipeablePages
     */
    @JsProperty void setSelectedItem(JavaScriptObject value);

    /**
     * <p>The attribute to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type String
     * @behavior IronSwipeablePages
     */
    @JsProperty String getSelectedAttribute();
    /**
     * <p>The attribute to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type String
     * @behavior IronSwipeablePages
     */
    @JsProperty void setSelectedAttribute(String value);

    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type String
     * @behavior IronSwipeablePages
     */
    @JsProperty String getSelectedClass();
    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type String
     * @behavior IronSwipeablePages
     */
    @JsProperty void setSelectedClass(String value);

    /**
     * <p>This is a CSS selector string.  If this is set, only items that match the CSS selector<br>are selectable.</p>
     *
     * JavaScript Info:
     * @property selectable
     * @type string
     * @behavior IronSwipeablePages
     */
    @JsProperty String getSelectable();
    /**
     * <p>This is a CSS selector string.  If this is set, only items that match the CSS selector<br>are selectable.</p>
     *
     * JavaScript Info:
     * @property selectable
     * @type string
     * @behavior IronSwipeablePages
     */
    @JsProperty void setSelectable(String value);

    /**
     * <p>Default fallback if the selection based on selected with <code>attrForSelected</code><br>is not found.</p>
     *
     * JavaScript Info:
     * @property fallbackSelection
     * @type String
     * @behavior IronSwipeablePages
     */
    @JsProperty String getFallbackSelection();
    /**
     * <p>Default fallback if the selection based on selected with <code>attrForSelected</code><br>is not found.</p>
     *
     * JavaScript Info:
     * @property fallbackSelection
     * @type String
     * @behavior IronSwipeablePages
     */
    @JsProperty void setFallbackSelection(String value);

    /**
     * <p>If you want to use an attribute value or property of an element for<br><code>selected</code> instead of the index, set this to the name of the attribute<br>or property. Hyphenated values are converted to camel case when used to<br>look up the property of a selectable element. Camel cased values are<br><em>not</em> converted to hyphenated values for attribute lookup. It’s<br>recommended that you provide the hyphenated form of the name so that<br>selection works in both cases. (Use <code>attr-or-property-name</code> instead of<br><code>attrOrPropertyName</code>.)</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type String
     * @behavior IronSwipeablePages
     */
    @JsProperty String getAttrForSelected();
    /**
     * <p>If you want to use an attribute value or property of an element for<br><code>selected</code> instead of the index, set this to the name of the attribute<br>or property. Hyphenated values are converted to camel case when used to<br>look up the property of a selectable element. Camel cased values are<br><em>not</em> converted to hyphenated values for attribute lookup. It’s<br>recommended that you provide the hyphenated form of the name so that<br>selection works in both cases. (Use <code>attr-or-property-name</code> instead of<br><code>attrOrPropertyName</code>.)</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type String
     * @behavior IronSwipeablePages
     */
    @JsProperty void setAttrForSelected(String value);

    /**
     * <p>The event that fires from items when they are selected. Selectable<br>will listen for this event from items and update the selection state.<br>Set to empty string to listen to no events.</p>
     *
     * JavaScript Info:
     * @property activateEvent
     * @type String
     * @behavior IronSwipeablePages
     */
    @JsProperty String getActivateEvent();
    /**
     * <p>The event that fires from items when they are selected. Selectable<br>will listen for this event from items and update the selection state.<br>Set to empty string to listen to no events.</p>
     *
     * JavaScript Info:
     * @property activateEvent
     * @type String
     * @behavior IronSwipeablePages
     */
    @JsProperty void setActivateEvent(String value);

    /**
     * <p>The CSS transition timing function applied.</p>
     *
     * JavaScript Info:
     * @property transitionTimingFunction
     * @type String
     * 
     */
    @JsProperty String getTransitionTimingFunction();
    /**
     * <p>The CSS transition timing function applied.</p>
     *
     * JavaScript Info:
     * @property transitionTimingFunction
     * @type String
     * 
     */
    @JsProperty void setTransitionTimingFunction(String value);


    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior IronSwipeablePages
     * 
     */
    void stopResizeNotificationsFor(Object target);

    /**
     * <p>Selects the item at the given index.</p>
     *
     * JavaScript Info:
     * @method selectIndex
     * @param {} index  
     * @behavior IronSwipeablePages
     * 
     */
    void selectIndex(Object index);

    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior IronSwipeablePages
     * 
     */
    void assignParentResizable(Object parentResizable);

    /**
     * <p>Selects the given value.</p>
     *
     * JavaScript Info:
     * @method select
     * @param {(string|number)} value  
     * @behavior IronSwipeablePages
     * 
     */
    void select(Object value);

    /**
     * <p>Selects the next item.</p>
     *
     * JavaScript Info:
     * @method selectNext
     * @behavior IronSwipeablePages
     * 
     */
    void selectNext();

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior IronSwipeablePages
     * 
     */
    void notifyResize();

    /**
     * <p>Selects the previous item.</p>
     *
     * JavaScript Info:
     * @method selectPrevious
     * @behavior IronSwipeablePages
     * 
     */
    void selectPrevious();

    /**
     * <p>Force a synchronous update of the <code>items</code> property.</p>
     * <p>NOTE: Consider listening for the <code>iron-items-changed</code> event to respond to<br>updates to the set of selectable items after updates to the DOM list and<br>selection state have been made.</p>
     * <p>WARNING: If you are using this method, you should probably consider an<br>alternate approach. Synchronously querying for items is potentially<br>slow for many use cases. The <code>items</code> property will update asynchronously<br>on its own to reflect selectable items in the DOM.</p>
     *
     * JavaScript Info:
     * @method forceSynchronousItemUpdate
     * @behavior IronSwipeablePages
     * 
     */
    void forceSynchronousItemUpdate();

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior IronSwipeablePages
     * @return {boolean}
     */
    boolean resizerShouldNotify(JavaScriptObject element);

    /**
     * <p>Returns the index of the given item.</p>
     *
     * JavaScript Info:
     * @method indexOf
     * @param {Object} item  
     * @behavior IronSwipeablePages
     * 
     */
    void indexOf(JavaScriptObject item);

}
