/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from polymer project by The Polymer Authors (http://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.polymer.widget;

import com.vaadin.polymer.polymer.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>Polymer.Base</code> acts as a base prototype for all Polymer elements. It is composed via various calls to <code>Polymer.Base._addFeature()</code>.</p>
 * <p>The properties reflected here are the combined view of all features found in this library. There may be more properties added via other libraries, as well.</p>
 */
public class Base extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public Base() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public Base(String html) {
        super(BaseElement.TAG, BaseElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public BaseElement getPolymerElement() {
        return (BaseElement) getElement();
    }


    /**
     * 
     *
     * JavaScript Info:
     * @property customStyle
     * @type object
     * 
     */
    public JavaScriptObject getCustomStyle() {
        return getPolymerElement().getCustomStyle();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property customStyle
     * @type object
     * 
     */
    public void setCustomStyle(JavaScriptObject value) {
        getPolymerElement().setCustomStyle(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    public JavaScriptObject getListeners() {
        return getPolymerElement().getListeners();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    public void setListeners(JavaScriptObject value) {
        getPolymerElement().setListeners(value);
    }


    // Needed in UIBinder
    /**
     * 
     *
     * JavaScript Info:
     * @attribute listeners
     * 
     */
    public void setListeners(String value) {
        Polymer.property(this.getPolymerElement(), "listeners", value);
    }

    // Needed in UIBinder
    /**
     * 
     *
     * JavaScript Info:
     * @attribute custom-style
     * 
     */
    public void setCustomStyle(String value) {
        Polymer.property(this.getPolymerElement(), "customStyle", value);
    }


    /**
     * 
     *
     * JavaScript Info:
     * @method arrayDelete
     * @param {} path  
     * @param {} item  
     * 
     * 
     */
    public void arrayDelete(Object path, Object item) {
        getPolymerElement().arrayDelete(path, item);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method translate3d
     * @param {} x  
     * @param {} y  
     * @param {} z  
     * @param {} node  
     * 
     * 
     */
    public void translate3d(Object x, Object y, Object z, Object node) {
        getPolymerElement().translate3d(x, y, z, node);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method importHref
     * @param {} href  
     * @param {} onload  
     * @param {} onerror  
     * @param {} optAsync  
     * 
     * 
     */
    public void importHref(Object href, Object onload, Object onerror, Object optAsync) {
        getPolymerElement().importHref(href, onload, onerror, optAsync);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method isLightDescendant
     * @param {} node  
     * 
     * 
     */
    public void isLightDescendant(Object node) {
        getPolymerElement().isLightDescendant(node);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method getComputedStyleValue
     * @param {} property  
     * 
     * 
     */
    public void getComputedStyleValue(Object property) {
        getPolymerElement().getComputedStyleValue(property);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method unlisten
     * @param {} node  
     * @param {} eventName  
     * @param {} methodName  
     * 
     * 
     */
    public void unlisten(Object node, Object eventName, Object methodName) {
        getPolymerElement().unlisten(node, eventName, methodName);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method listen
     * @param {} node  
     * @param {} eventName  
     * @param {} methodName  
     * 
     * 
     */
    public void listen(Object node, Object eventName, Object methodName) {
        getPolymerElement().listen(node, eventName, methodName);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method async
     * @param {} callback  
     * @param {} waitTime  
     * 
     * 
     */
    public void async(Object callback, Object waitTime) {
        getPolymerElement().async(callback, waitTime);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method transform
     * @param {} transform  
     * @param {} node  
     * 
     * 
     */
    public void transform(Object transform, Object node) {
        getPolymerElement().transform(transform, node);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method notifySplices
     * @param {} path  
     * @param {} splices  
     * 
     * 
     */
    public void notifySplices(Object path, Object splices) {
        getPolymerElement().notifySplices(path, splices);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method prepareModelNotifyPath
     * @param {} model  
     * 
     * 
     */
    public void prepareModelNotifyPath(Object model) {
        getPolymerElement().prepareModelNotifyPath(model);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method cancelAsync
     * @param {} handle  
     * 
     * 
     */
    public void cancelAsync(Object handle) {
        getPolymerElement().cancelAsync(handle);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method getContentChildren
     * @param {} slctr  
     * 
     * 
     */
    public void getContentChildren(Object slctr) {
        getPolymerElement().getContentChildren(slctr);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method queryEffectiveChildren
     * @param {} slctr  
     * 
     * 
     */
    public void queryEffectiveChildren(Object slctr) {
        getPolymerElement().queryEffectiveChildren(slctr);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method getContentChildNodes
     * @param {} slctr  
     * 
     * 
     */
    public void getContentChildNodes(Object slctr) {
        getPolymerElement().getContentChildNodes(slctr);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method queryAllEffectiveChildren
     * @param {} slctr  
     * 
     * 
     */
    public void queryAllEffectiveChildren(Object slctr) {
        getPolymerElement().queryAllEffectiveChildren(slctr);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method get
     * @param {} path  
     * @param {} root  
     * 
     * 
     */
    public void get(Object path, Object root) {
        getPolymerElement().get(path, root);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method resolveUrl
     * @param {} url  
     * 
     * 
     */
    public void resolveUrl(Object url) {
        getPolymerElement().resolveUrl(url);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method fire
     * @param {} type  
     * @param {} detail  
     * @param {} options  
     * 
     * 
     */
    public void fire(Object type, Object detail, Object options) {
        getPolymerElement().fire(type, detail, options);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method scopeSubtree
     * @param {} container  
     * @param {} shouldObserve  
     * 
     * 
     */
    public void scopeSubtree(Object container, Object shouldObserve) {
        getPolymerElement().scopeSubtree(container, shouldObserve);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method $$
     * @param {} slctr  
     * 
     * 
     */
    public void $$(Object slctr) {
        getPolymerElement().$$(slctr);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method serializeValueToAttribute
     * @param {} value  
     * @param {} attribute  
     * @param {} node  
     * 
     * 
     */
    public void serializeValueToAttribute(Object value, Object attribute, Object node) {
        getPolymerElement().serializeValueToAttribute(value, attribute, node);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method create
     * @param {} tag  
     * @param {} props  
     * 
     * 
     */
    public void create(Object tag, Object props) {
        getPolymerElement().create(tag, props);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method set
     * @param {} path  
     * @param {} value  
     * @param {} root  
     * 
     * 
     */
    public void set(Object path, Object value, Object root) {
        getPolymerElement().set(path, value, root);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method classFollows
     * @param {} name  
     * @param {} toElement  
     * @param {} fromElement  
     * 
     * 
     */
    public void classFollows(Object name, Object toElement, Object fromElement) {
        getPolymerElement().classFollows(name, toElement, fromElement);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method setScrollDirection
     * @param {} direction  
     * @param {} node  
     * 
     * 
     */
    public void setScrollDirection(Object direction, Object node) {
        getPolymerElement().setScrollDirection(direction, node);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method isLocalDescendant
     * @param {} node  
     * 
     * 
     */
    public void isLocalDescendant(Object node) {
        getPolymerElement().isLocalDescendant(node);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method push
     * @param {} path  
     * 
     * 
     */
    public void push(Object path) {
        getPolymerElement().push(path);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method shift
     * @param {} path  
     * 
     * 
     */
    public void shift(Object path) {
        getPolymerElement().shift(path);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method pop
     * @param {} path  
     * 
     * 
     */
    public void pop(Object path) {
        getPolymerElement().pop(path);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method unlinkPaths
     * @param {} path  
     * 
     * 
     */
    public void unlinkPaths(Object path) {
        getPolymerElement().unlinkPaths(path);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method attributeFollows
     * @param {} name  
     * @param {} toElement  
     * @param {} fromElement  
     * 
     * 
     */
    public void attributeFollows(Object name, Object toElement, Object fromElement) {
        getPolymerElement().attributeFollows(name, toElement, fromElement);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method splice
     * @param {} path  
     * @param {} start  
     * 
     * 
     */
    public void splice(Object path, Object start) {
        getPolymerElement().splice(path, start);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method unshift
     * @param {} path  
     * 
     * 
     */
    public void unshift(Object path) {
        getPolymerElement().unshift(path);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method toggleClass
     * @param {} name  
     * @param {} bool  
     * @param {} node  
     * 
     * 
     */
    public void toggleClass(Object name, Object bool, Object node) {
        getPolymerElement().toggleClass(name, bool, node);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method toggleAttribute
     * @param {} name  
     * @param {} bool  
     * @param {} node  
     * 
     * 
     */
    public void toggleAttribute(Object name, Object bool, Object node) {
        getPolymerElement().toggleAttribute(name, bool, node);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method linkPaths
     * @param {} to  
     * @param {} from  
     * 
     * 
     */
    public void linkPaths(Object to, Object from) {
        getPolymerElement().linkPaths(to, from);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method updateStyles
     * @param {} properties  
     * 
     * 
     */
    public void updateStyles(Object properties) {
        getPolymerElement().updateStyles(properties);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method notifyPath
     * @param {} path  
     * @param {} value  
     * @param {} fromAbove  
     * 
     * 
     */
    public void notifyPath(Object path, Object value, Object fromAbove) {
        getPolymerElement().notifyPath(path, value, fromAbove);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method getEffectiveTextContent
     * 
     * 
     */
    public void getEffectiveTextContent() {
        getPolymerElement().getEffectiveTextContent();
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method getEffectiveChildren
     * 
     * 
     */
    public void getEffectiveChildren() {
        getPolymerElement().getEffectiveChildren();
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method getEffectiveChildNodes
     * 
     * 
     */
    public void getEffectiveChildNodes() {
        getPolymerElement().getEffectiveChildNodes();
    }


}
