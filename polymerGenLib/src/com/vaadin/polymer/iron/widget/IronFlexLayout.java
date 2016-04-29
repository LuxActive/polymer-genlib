/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-flex-layout project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>The <code>&lt;iron-flex-layout&gt;</code> component provides simple ways to use<br><a href="https://developer.mozilla.org/en-US/docs/Web/Guide/CSS/Flexible_boxes">CSS flexible box layout</a>,<br>also known as flexbox. This component provides two different ways to use flexbox:</p>
 * <ol>
 * <li><p><a href="https://github.com/PolymerElements/iron-flex-layout/tree/master/iron-flex-layout-classes.html">Layout classes</a>.<br>The layout class stylesheet provides a simple set of class-based flexbox rules, that<br>let you specify layout properties directly in markup. You must include this file<br>in every element that needs to use them.</p>
 * <p>Sample use:</p>
 * <p>  <link rel="import" href="../iron-flex-layout/iron-flex-layout-classes.html"></p>
 *   <style is="custom-style" include="iron-flex iron-flex-alignment"></style>
 * 
 *   <div class="layout horizontal layout-start">
 *     <div>cross axis start alignment</div>
 *   </div>
 * </li>
 * <li><p><a href="https://github.com/PolymerElements/iron-flex-layout/blob/master/iron-flex-layout.html">Custom CSS mixins</a>.<br>The mixin stylesheet includes custom CSS mixins that can be applied inside a CSS rule using the <code>@apply</code> function.</p>
 * </li>
 * </ol>
 * <p>Please note that the old <a href="https://github.com/PolymerElements/iron-flex-layout/tree/master/classes">/deep/ layout classes</a><br>are deprecated, and should not be used. To continue using layout properties<br>directly in markup, please switch to using the new <code>dom-module</code>-based<br><a href="https://github.com/PolymerElements/iron-flex-layout/tree/master/iron-flex-layout-classes.html">layout classes</a>.<br>Please note that the new version does not use <code>/deep/</code>, and therefore requires you<br>to import the <code>dom-modules</code> in every element that needs to use them.</p>
 * <p>A complete <a href="https://elements.polymer-project.org/guides/flex-layout">guide</a> to <code>&lt;iron-flex-layout&gt;</code> is available.</p>
 */
public class IronFlexLayout extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronFlexLayout() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronFlexLayout(String html) {
        super(IronFlexLayoutElement.TAG, IronFlexLayoutElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronFlexLayoutElement getPolymerElement() {
        try {
            return (IronFlexLayoutElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }





}
