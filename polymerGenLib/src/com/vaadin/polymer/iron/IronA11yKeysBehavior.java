/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-a11y-keys-behavior project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>Polymer.IronA11yKeysBehavior</code> provides a normalized interface for processing<br>keyboard commands that pertain to <a href="http://www.w3.org/TR/wai-aria-practices/#kbd_general_binding">WAI-ARIA best practices</a>.<br>The element takes care of browser differences with respect to Keyboard events<br>and uses an expressive syntax to filter key presses.</p>
 * <p>Use the <code>keyBindings</code> prototype property to express what combination of keys<br>will trigger the event to fire.</p>
 * <p>Use the <code>key-event-target</code> attribute to set up event handlers on a specific<br>node.<br>The <code>keys-pressed</code> event will fire when one of the key combinations set with the<br><code>keys</code> property is pressed.</p>
 */
@JsType
public interface IronA11yKeysBehavior {

    public static final String TAG = "Polymer.IronA11yKeysBehavior";
    public static final String SRC = "iron-a11y-keys-behavior/iron-a11y-keys-behavior.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty JavaScriptObject getKeyBindings();
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty void setKeyBindings(JavaScriptObject value);

    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty JavaScriptObject getKeyEventTarget();
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty void setKeyEventTarget(JavaScriptObject value);

    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getStopKeyboardEventPropagation();
    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setStopKeyboardEventPropagation(boolean value);


    /**
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior PaperTab
     * 
     */
    void addOwnKeyBinding(Object eventString, Object handlerName);

    /**
     * 
     *
     * JavaScript Info:
     * @method keyboardEventMatchesKeys
     * @param {} event  
     * @param {} eventString  
     * @behavior PaperTab
     * 
     */
    void keyboardEventMatchesKeys(Object event, Object eventString);

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior PaperTab
     * 
     */
    void removeOwnKeyBindings();

}
