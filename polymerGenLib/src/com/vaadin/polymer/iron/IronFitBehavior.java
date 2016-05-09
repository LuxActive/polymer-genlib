/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-fit-behavior project by The Polymer Authors
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
 * <p><code>Polymer.IronFitBehavior</code> fits an element in another element using <code>max-height</code> and <code>max-width</code>, and<br>optionally centers it in the window or another element.</p>
 * <p>The element will only be sized and/or positioned if it has not already been sized and/or positioned<br>by CSS.</p>
 * <table>
 * <thead>
 * <tr>
 * <th>CSS properties</th>
 * <th>Action</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>position</code> set</td>
 * <td>Element is not centered horizontally or vertically</td>
 * </tr>
 * <tr>
 * <td><code>top</code> or <code>bottom</code> set</td>
 * <td>Element is not vertically centered</td>
 * </tr>
 * <tr>
 * <td><code>left</code> or <code>right</code> set</td>
 * <td>Element is not horizontally centered</td>
 * </tr>
 * <tr>
 * <td><code>max-height</code> set</td>
 * <td>Element respects <code>max-height</code></td>
 * </tr>
 * <tr>
 * <td><code>max-width</code> set</td>
 * <td>Element respects <code>max-width</code></td>
 * </tr>
 * </tbody>
 * </table>
 * <p><code>Polymer.IronFitBehavior</code> can position an element into another element using<br><code>verticalAlign</code> and <code>horizontalAlign</code>. This will override the element’s css position.</p>
 * <pre><code>  &lt;div class=&quot;container&quot;&gt;
 *     &lt;iron-fit-impl vertical-align=&quot;top&quot; horizontal-align=&quot;auto&quot;&gt;
 *       Positioned into the container
 *     &lt;/iron-fit-impl&gt;
 *   &lt;/div&gt;
 * 
 * 
 * </code></pre><p>Use <code>noOverlap</code> to position the element around another element without overlapping it.</p>
 * <pre><code>  &lt;div class=&quot;container&quot;&gt;
 *     &lt;iron-fit-impl no-overlap vertical-align=&quot;auto&quot; horizontal-align=&quot;auto&quot;&gt;
 *       Positioned around the container
 *     &lt;/iron-fit-impl&gt;
 *   &lt;/div&gt;
 * 
 * 
 * </code></pre>
 */
@JsType(isNative=true)
public interface IronFitBehavior {

    @JsOverlay public static final String NAME = "Polymer.IronFitBehavior";
    @JsOverlay public static final String SRC = "iron-fit-behavior/iron-fit-behavior.html";


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
     * <p>The same as setting margin-top and margin-bottom css properties.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * @behavior PaperToast
     */
    @JsProperty double getVerticalOffset();
    /**
     * <p>The same as setting margin-top and margin-bottom css properties.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * @behavior PaperToast
     */
    @JsProperty void setVerticalOffset(double value);

    /**
     * <p>The same as setting margin-left and margin-right css properties.</p>
     *
     * JavaScript Info:
     * @property horizontalOffset
     * @type Number
     * @behavior PaperToast
     */
    @JsProperty double getHorizontalOffset();
    /**
     * <p>The same as setting margin-left and margin-right css properties.</p>
     *
     * JavaScript Info:
     * @property horizontalOffset
     * @type Number
     * @behavior PaperToast
     */
    @JsProperty void setHorizontalOffset(double value);

    /**
     * <p>Will position the element around the positionTarget without overlapping it.</p>
     *
     * JavaScript Info:
     * @property noOverlap
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty boolean getNoOverlap();
    /**
     * <p>Will position the element around the positionTarget without overlapping it.</p>
     *
     * JavaScript Info:
     * @property noOverlap
     * @type Boolean
     * @behavior PaperToast
     */
    @JsProperty void setNoOverlap(boolean value);

    /**
     * <p>The element that should be used to position the element. If not set, it will<br>default to the parent node.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type !Element
     * @behavior PaperToast
     */
    @JsProperty JavaScriptObject getPositionTarget();
    /**
     * <p>The element that should be used to position the element. If not set, it will<br>default to the parent node.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type !Element
     * @behavior PaperToast
     */
    @JsProperty void setPositionTarget(JavaScriptObject value);

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
     * <p>The orientation against which to align the element vertically<br>relative to the <code>positionTarget</code>. Possible values are “top”, “bottom”, “auto”.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * @behavior PaperToast
     */
    @JsProperty String getVerticalAlign();
    /**
     * <p>The orientation against which to align the element vertically<br>relative to the <code>positionTarget</code>. Possible values are “top”, “bottom”, “auto”.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * @behavior PaperToast
     */
    @JsProperty void setVerticalAlign(String value);

    /**
     * <p>The orientation against which to align the element horizontally<br>relative to the <code>positionTarget</code>. Possible values are “left”, “right”, “auto”.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * @behavior PaperToast
     */
    @JsProperty String getHorizontalAlign();
    /**
     * <p>The orientation against which to align the element horizontally<br>relative to the <code>positionTarget</code>. Possible values are “left”, “right”, “auto”.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * @behavior PaperToast
     */
    @JsProperty void setHorizontalAlign(String value);


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
     * <p>Constrains the size of the element to <code>fitInto</code> by setting <code>max-height</code><br>and/or <code>max-width</code>.</p>
     *
     * JavaScript Info:
     * @method constrain
     * @behavior PaperToast
     * 
     */
    void constrain();

    /**
     * <p>Equivalent to calling <code>resetFit()</code> and <code>fit()</code>. Useful to call this after<br>the element or the <code>fitInto</code> element has been resized, or if any of the<br>positioning properties (e.g. <code>horizontalAlign, verticalAlign</code>) is updated.</p>
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
     * <p>Positions and fits the element into the <code>fitInto</code> element.</p>
     *
     * JavaScript Info:
     * @method fit
     * @behavior PaperToast
     * 
     */
    void fit();

    /**
     * <p>Positions the element according to <code>horizontalAlign, verticalAlign</code>.</p>
     *
     * JavaScript Info:
     * @method position
     * @behavior PaperToast
     * 
     */
    void position();

}
