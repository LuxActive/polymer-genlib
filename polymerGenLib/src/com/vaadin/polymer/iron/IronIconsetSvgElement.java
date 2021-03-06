/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-iconset-svg project by The Polymer Authors
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
 * <p>The <code>iron-iconset-svg</code> element allows users to define their own icon sets<br>that contain svg icons. The svg icon elements should be children of the<br><code>iron-iconset-svg</code> element. Multiple icons should be given distinct id’s.</p>
 * <p>Using svg elements to create icons has a few advantages over traditional<br>bitmap graphics like jpg or png. Icons that use svg are vector based so<br>they are resolution independent and should look good on any device. They<br>are stylable via css. Icons can be themed, colorized, and even animated.</p>
 * <p>Example:</p>
 * <pre><code>&lt;iron-iconset-svg name=&quot;my-svg-icons&quot; size=&quot;24&quot;&gt;
 *   &lt;svg&gt;
 *     &lt;defs&gt;
 *       &lt;g id=&quot;shape&quot;&gt;
 *         &lt;rect x=&quot;12&quot; y=&quot;0&quot; width=&quot;12&quot; height=&quot;24&quot; /&gt;
 *         &lt;circle cx=&quot;12&quot; cy=&quot;12&quot; r=&quot;12&quot; /&gt;
 *       &lt;/g&gt;
 *     &lt;/defs&gt;
 *   &lt;/svg&gt;
 * &lt;/iron-iconset-svg&gt;
 * 
 * 
 * </code></pre><p>This will automatically register the icon set “my-svg-icons” to the iconset<br>database.  To use these icons from within another element, make a<br><code>iron-iconset</code> element and call the <code>byId</code> method<br>to retrieve a given iconset. To apply a particular icon inside an<br>element use the <code>applyIcon</code> method. For example:</p>
 * <pre><code>iconset.applyIcon(iconNode, &#39;car&#39;);
 * 
 * 
 * </code></pre>
 */
@JsType(isNative=true)
public interface IronIconsetSvgElement extends HTMLElement {

    @JsOverlay public static final String TAG = "iron-iconset-svg";
    @JsOverlay public static final String SRC = "iron-iconset-svg/iron-iconset-svg.html";


    /**
     * <p>Set to true to enable mirroring of icons where specified when they are<br>stamped. Icons that should be mirrored should be decorated with a<br><code>mirror-in-rtl</code> attribute.</p>
     * <p>NOTE: For performance reasons, direction will be resolved once per<br>document per iconset, so moving icons in and out of RTL subtrees will<br>not cause their mirrored state to change.</p>
     *
     * JavaScript Info:
     * @property rtlMirroring
     * @type Boolean
     * 
     */
    @JsProperty boolean getRtlMirroring();
    /**
     * <p>Set to true to enable mirroring of icons where specified when they are<br>stamped. Icons that should be mirrored should be decorated with a<br><code>mirror-in-rtl</code> attribute.</p>
     * <p>NOTE: For performance reasons, direction will be resolved once per<br>document per iconset, so moving icons in and out of RTL subtrees will<br>not cause their mirrored state to change.</p>
     *
     * JavaScript Info:
     * @property rtlMirroring
     * @type Boolean
     * 
     */
    @JsProperty void setRtlMirroring(boolean value);

    /**
     * <p>The size of an individual icon. Note that icons must be square.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    @JsProperty double getSize();
    /**
     * <p>The size of an individual icon. Note that icons must be square.</p>
     *
     * JavaScript Info:
     * @property size
     * @type Number
     * 
     */
    @JsProperty void setSize(double value);

    /**
     * <p>The name of the iconset.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    @JsProperty String getName();
    /**
     * <p>The name of the iconset.</p>
     *
     * JavaScript Info:
     * @property name
     * @type String
     * 
     */
    @JsProperty void setName(String value);


    /**
     * <p>Remove an icon from the given element by undoing the changes effected<br>by <code>applyIcon</code>.</p>
     *
     * JavaScript Info:
     * @method removeIcon
     * @param {Element} element  
     * 
     * 
     */
    void removeIcon(Element element);

    /**
     * <p>Construct an array of all icon names in this iconset.</p>
     *
     * JavaScript Info:
     * @method getIconNames
     * 
     * @return {JavaScriptObject}
     */
    JavaScriptObject getIconNames();

    /**
     * <p>Applies an icon to the given element.</p>
     * <p>An svg icon is prepended to the element’s shadowRoot if it exists,<br>otherwise to the element itself.</p>
     * <p>If RTL mirroring is enabled, and the icon is marked to be mirrored in<br>RTL, the element will be tested (once and only once ever for each<br>iconset) to determine the direction of the subtree the element is in.<br>This direction will apply to all future icon applications, although only<br>icons marked to be mirrored will be affected.</p>
     *
     * JavaScript Info:
     * @method applyIcon
     * @param {Element} element  
     * @param {string} iconName  
     * 
     * @return {JavaScriptObject}
     */
    JavaScriptObject applyIcon(Element element, String iconName);

}
