/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from polymer project by The Polymer Authors (http://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.polymer;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * <p>Legacy element behavior to skip strict dirty-checking for objects and arrays,<br>(always consider them to be “dirty”) for use on legacy API Polymer elements.</p>
 * <p>By default, <code>Polymer.PropertyEffects</code> performs strict dirty checking on<br>objects, which means that any deep modifications to an object or array will<br>not be propagated unless “immutable” data patterns are used (i.e. all object<br>references from the root to the mutation were changed).</p>
 * <p>Polymer also provides a proprietary data mutation and path notification API<br>(e.g. <code>notifyPath</code>, <code>set</code>, and array mutation API’s) that allow efficient<br>mutation and notification of deep changes in an object graph to all elements<br>bound to the same object graph.</p>
 * <p>In cases where neither immutable patterns nor the data mutation API can be<br>used, applying this mixin will cause Polymer to skip dirty checking for<br>objects and arrays (always consider them to be “dirty”).  This allows a<br>user to make a deep modification to a bound object graph, and then either<br>simply re-set the object (e.g. <code>this.items = this.items</code>) or call <code>notifyPath</code><br>(e.g. <code>this.notifyPath(&#39;items&#39;)</code>) to update the tree.  Note that all<br>elements that wish to be updated based on deep mutations must apply this<br>mixin or otherwise skip strict dirty checking for objects/arrays.</p>
 * <p>In order to make the dirty check strategy configurable, see<br><code>Polymer.OptionalMutableDataBehavior</code>.</p>
 * <p>Note, the performance characteristics of propagating large object graphs<br>will be worse as opposed to using strict dirty checking with immutable<br>patterns or Polymer’s path notification API.</p>
 */
@JsType(isNative=true)
public interface MutableDataBehavior {

    @JsOverlay public static final String NAME = "Polymer.MutableDataBehavior";
    @JsOverlay public static final String SRC = "polymer/polymer.html";



}
