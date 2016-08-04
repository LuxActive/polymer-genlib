/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toolbar project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Material design: <a href="https://www.google.com/design/spec/components/toolbars.html">Toolbars</a></p>
 * <p><code>paper-toolbar</code> is a horizontal bar containing items that can be used for<br>label, navigation, search and actions.  The items placed inside the<br><code>paper-toolbar</code> are projected into a <code>class=&quot;horizontal center layout&quot;</code> container inside of<br><code>paper-toolbar</code>‘s Shadow DOM.  You can use flex attributes to control the items’<br>sizing.</p>
 * <p>Example:</p>
 * <pre><code class="lang-html">&lt;paper-toolbar&gt;
 *   &lt;paper-icon-button icon=&quot;menu&quot; on-tap=&quot;menuAction&quot;&gt;&lt;/paper-icon-button&gt;
 *   &lt;div class=&quot;title&quot;&gt;Title&lt;/div&gt;
 *   &lt;paper-icon-button icon=&quot;more-vert&quot; on-tap=&quot;moreAction&quot;&gt;&lt;/paper-icon-button&gt;
 * &lt;/paper-toolbar&gt;
 * </code></pre>
 * <p><code>paper-toolbar</code> has a standard height, but can made be taller by setting <code>tall</code><br>class on the <code>paper-toolbar</code>. This will make the toolbar 3x the normal height.</p>
 * <pre><code class="lang-html">&lt;paper-toolbar class=&quot;tall&quot;&gt;
 *   &lt;paper-icon-button icon=&quot;menu&quot;&gt;&lt;/paper-icon-button&gt;
 * &lt;/paper-toolbar&gt;
 * </code></pre>
 * <p>Apply <code>medium-tall</code> class to make the toolbar medium tall.  This will make the<br>toolbar 2x the normal height.</p>
 * <pre><code class="lang-html">&lt;paper-toolbar class=&quot;medium-tall&quot;&gt;
 *   &lt;paper-icon-button icon=&quot;menu&quot;&gt;&lt;/paper-icon-button&gt;
 * &lt;/paper-toolbar&gt;
 * </code></pre>
 * <p>When <code>tall</code>, items can pin to either the top (default), middle or bottom.  Use<br><code>middle</code> class for middle content and <code>bottom</code> class for bottom content.</p>
 * <pre><code class="lang-html">&lt;paper-toolbar class=&quot;tall&quot;&gt;
 *   &lt;paper-icon-button icon=&quot;menu&quot;&gt;&lt;/paper-icon-button&gt;
 *   &lt;div class=&quot;middle title&quot;&gt;Middle Title&lt;/div&gt;
 *   &lt;div class=&quot;bottom title&quot;&gt;Bottom Title&lt;/div&gt;
 * &lt;/paper-toolbar&gt;
 * </code></pre>
 * <p>For <code>medium-tall</code> toolbar, the middle and bottom contents overlap and are<br>pinned to the bottom.  But <code>middleJustify</code> and <code>bottomJustify</code> attributes are<br>still honored separately.</p>
 * <p>To make an element completely fit at the bottom of the toolbar, use <code>fit</code> along<br>with <code>bottom</code>.</p>
 * <pre><code class="lang-html">&lt;paper-toolbar class=&quot;tall&quot;&gt;
 *   &lt;div id=&quot;progressBar&quot; class=&quot;bottom fit&quot;&gt;&lt;/div&gt;
 * &lt;/paper-toolbar&gt;
 * </code></pre>
 * <p>When inside a <code>paper-header-panel</code> element, the class <code>.animate</code> is toggled to animate<br>the height change in the toolbar.</p>
 * <h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling:</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--paper-toolbar-title</code></td>
 * <td>Mixin applied to the title of the toolbar</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toolbar-background</code></td>
 * <td>Toolbar background color</td>
 * <td><code>--primary-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toolbar-color</code></td>
 * <td>Toolbar foreground color</td>
 * <td><code>--dark-theme-text-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toolbar-height</code></td>
 * <td>Custom height for toolbar</td>
 * <td><code>64px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toolbar-sm-height</code></td>
 * <td>Custom height for small screen toolbar</td>
 * <td><code>56px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toolbar</code></td>
 * <td>Mixin applied to the toolbar</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toolbar-content</code></td>
 * <td>Mixin applied to the content section of the toolbar</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toolbar-medium</code></td>
 * <td>Mixin applied to medium height toolbar</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toolbar-tall</code></td>
 * <td>Mixin applied to tall height toolbar</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toolbar-transition</code></td>
 * <td>Transition applied to the <code>.animate</code> class</td>
 * <td><code>height 0.18s ease-in</code></td>
 * </tr>
 * </tbody>
 * </table>
 * <h3 id="accessibility">Accessibility</h3>
 * <p><code>&lt;paper-toolbar&gt;</code> has <code>role=&quot;toolbar&quot;</code> by default. Any elements with the class <code>title</code> will<br>be used as the label of the toolbar via <code>aria-labelledby</code>.</p>
 */
public class PaperToolbar extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperToolbar() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperToolbar(String html) {
        super(PaperToolbarElement.TAG, PaperToolbarElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperToolbarElement getPolymerElement() {
        try {
            return (PaperToolbarElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>Controls how the items are aligned horizontally when they are placed<br>at the bottom.<br>Options are <code>start</code>, <code>center</code>, <code>end</code>, <code>justified</code> and <code>around</code>.</p>
     *
     * JavaScript Info:
     * @property bottomJustify
     * @type String
     * 
     */
    public String getBottomJustify() {
        return getPolymerElement().getBottomJustify();
    }
    /**
     * <p>Controls how the items are aligned horizontally when they are placed<br>at the bottom.<br>Options are <code>start</code>, <code>center</code>, <code>end</code>, <code>justified</code> and <code>around</code>.</p>
     *
     * JavaScript Info:
     * @property bottomJustify
     * @type String
     * 
     */
    public void setBottomJustify(String value) {
        getPolymerElement().setBottomJustify(value);
    }

    /**
     * <p>Controls how the items are aligned horizontally.<br>Options are <code>start</code>, <code>center</code>, <code>end</code>, <code>justified</code> and <code>around</code>.</p>
     *
     * JavaScript Info:
     * @property justify
     * @type String
     * 
     */
    public String getJustify() {
        return getPolymerElement().getJustify();
    }
    /**
     * <p>Controls how the items are aligned horizontally.<br>Options are <code>start</code>, <code>center</code>, <code>end</code>, <code>justified</code> and <code>around</code>.</p>
     *
     * JavaScript Info:
     * @property justify
     * @type String
     * 
     */
    public void setJustify(String value) {
        getPolymerElement().setJustify(value);
    }

    /**
     * <p>Controls how the items are aligned horizontally when they are placed<br>in the middle.<br>Options are <code>start</code>, <code>center</code>, <code>end</code>, <code>justified</code> and <code>around</code>.</p>
     *
     * JavaScript Info:
     * @property middleJustify
     * @type String
     * 
     */
    public String getMiddleJustify() {
        return getPolymerElement().getMiddleJustify();
    }
    /**
     * <p>Controls how the items are aligned horizontally when they are placed<br>in the middle.<br>Options are <code>start</code>, <code>center</code>, <code>end</code>, <code>justified</code> and <code>around</code>.</p>
     *
     * JavaScript Info:
     * @property middleJustify
     * @type String
     * 
     */
    public void setMiddleJustify(String value) {
        getPolymerElement().setMiddleJustify(value);
    }




}