/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from app-layout project by The Polymer Authors
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.app.widget;

import com.vaadin.polymer.app.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>app-drawer-layout is a wrapper element that positions an app-drawer and other content. When<br>the viewport width is smaller than <code>responsiveWidth</code>, this element changes to narrow layout.<br>In narrow layout, the drawer will be stacked on top of the main content. The drawer will slide<br>in/out to hide/reveal the main content.</p>
 * <p>By default the drawer is aligned to the start, which is left in LTR layouts:</p>
 * <pre><code class="lang-html">&lt;app-drawer-layout&gt;
 *   &lt;app-drawer slot=&quot;drawer&quot;&gt;
 *     drawer content
 *   &lt;/app-drawer&gt;
 *   &lt;div&gt;
 *     main content
 *   &lt;/div&gt;
 * &lt;/app-drawer-layout&gt;
 * </code></pre>
 * <p>Align the drawer at the end:</p>
 * <pre><code class="lang-html">&lt;app-drawer-layout&gt;
 *   &lt;app-drawer slot=&quot;drawer&quot; align=&quot;end&quot;&gt;
 *      drawer content
 *   &lt;/app-drawer&gt;
 *   &lt;div&gt;
 *     main content
 *   &lt;/div&gt;
 * &lt;/app-drawer-layout&gt;
 * </code></pre>
 * <p>With an app-header-layout:</p>
 * <pre><code class="lang-html">&lt;app-drawer-layout&gt;
 *   &lt;app-drawer slot=&quot;drawer&quot;&gt;
 *     drawer-content
 *   &lt;/app-drawer&gt;
 *   &lt;app-header-layout&gt;
 *     &lt;app-header slot=&quot;header&quot;&gt;
 *       &lt;app-toolbar&gt;
 *         &lt;div main-title&gt;App name&lt;/div&gt;
 *       &lt;/app-toolbar&gt;
 *     &lt;/app-header&gt;
 * 
 *     main content
 * 
 *   &lt;/app-header-layout&gt;
 * &lt;/app-drawer-layout&gt;
 * </code></pre>
 * <p>Add the <code>drawer-toggle</code> attribute to elements inside <code>app-drawer-layout</code> that toggle the drawer on click events:</p>
 * <pre><code class="lang-html">&lt;app-drawer-layout&gt;
 *   &lt;app-drawer slot=&quot;drawer&quot;&gt;
 *     drawer-content
 *   &lt;/app-drawer&gt;
 *   &lt;app-header-layout&gt;
 *     &lt;app-header slot=&quot;header&quot;&gt;
 *       &lt;app-toolbar&gt;
 *         &lt;paper-icon-button icon=&quot;menu&quot; drawer-toggle&gt;&lt;/paper-icon-button&gt;
 *         &lt;div main-title&gt;App name&lt;/div&gt;
 *       &lt;/app-toolbar&gt;
 *     &lt;/app-header&gt;
 * 
 *     main content
 * 
 *   &lt;/app-header-layout&gt;
 * &lt;/app-drawer-layout&gt;
 * </code></pre>
 * <p><em>NOTE:*</em> With app-layout 2.0, the <code>drawer-toggle</code> element will not be automatically hidden<br>when app-drawer-layout is not in narrow layout. To add this, add the following CSS rule where<br>app-drawer-layout is used:</p>
 * <pre><code class="lang-css">app-drawer-layout:not([narrow]) [drawer-toggle] {
 *   display: none;
 * }
 * </code></pre>
 * <p>Add the <code>fullbleed</code> attribute to app-drawer-layout to make it fit the size of its container:</p>
 * <pre><code class="lang-html">&lt;app-drawer-layout fullbleed&gt;
 *   &lt;app-drawer slot=&quot;drawer&quot;&gt;
 *      drawer content
 *   &lt;/app-drawer&gt;
 *   &lt;div&gt;
 *     main content
 *   &lt;/div&gt;
 * &lt;/app-drawer-layout&gt;
 * </code></pre>
 * <h3 id="styling">Styling</h3>
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
 * <td><code>--app-drawer-width</code></td>
 * <td>Width of the drawer</td>
 * <td>256px</td>
 * </tr>
 * <tr>
 * <td><code>--app-drawer-layout-content-transition</code></td>
 * <td>Transition for the content container</td>
 * <td>none</td>
 * </tr>
 * </tbody>
 * </table>
 * <p><em>NOTE:*</em> If you use <app-drawer> with <app-drawer-layout> and specify a value for<br><code>--app-drawer-width</code>, that value must be accessible by both elements. This can be done by<br>defining the value on the <code>:host</code> that contains <app-drawer-layout> (or <code>html</code> if outside<br>a shadow root):</p>
 * <pre><code class="lang-css">:host {
 *   --app-drawer-width: 300px;
 * }
 * </code></pre>
 */
public class AppDrawerLayout extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public AppDrawerLayout() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public AppDrawerLayout(String html) {
        super(AppDrawerLayoutElement.TAG, AppDrawerLayoutElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public AppDrawerLayoutElement getPolymerElement() {
        return (AppDrawerLayoutElement) getElement();
    }


    /**
     * <p>Returns true if it is in narrow layout. This is useful if you need to show/hide<br>elements based on the layout.</p>
     *
     * JavaScript Info:
     * @property narrow
     * @type Boolean
     * 
     */
    public boolean getNarrow() {
        return getPolymerElement().getNarrow();
    }
    /**
     * <p>Returns true if it is in narrow layout. This is useful if you need to show/hide<br>elements based on the layout.</p>
     *
     * JavaScript Info:
     * @property narrow
     * @type Boolean
     * 
     */
    public void setNarrow(boolean value) {
        getPolymerElement().setNarrow(value);
    }

    /**
     * <p>If true, the drawer will initially be opened when in narrow layout mode.</p>
     *
     * JavaScript Info:
     * @property openedWhenNarrow
     * @type Boolean
     * 
     */
    public boolean getOpenedWhenNarrow() {
        return getPolymerElement().getOpenedWhenNarrow();
    }
    /**
     * <p>If true, the drawer will initially be opened when in narrow layout mode.</p>
     *
     * JavaScript Info:
     * @property openedWhenNarrow
     * @type Boolean
     * 
     */
    public void setOpenedWhenNarrow(boolean value) {
        getPolymerElement().setOpenedWhenNarrow(value);
    }

    /**
     * <p>If true, ignore <code>responsiveWidth</code> setting and force the narrow layout.</p>
     *
     * JavaScript Info:
     * @property forceNarrow
     * @type Boolean
     * 
     */
    public boolean getForceNarrow() {
        return getPolymerElement().getForceNarrow();
    }
    /**
     * <p>If true, ignore <code>responsiveWidth</code> setting and force the narrow layout.</p>
     *
     * JavaScript Info:
     * @property forceNarrow
     * @type Boolean
     * 
     */
    public void setForceNarrow(boolean value) {
        getPolymerElement().setForceNarrow(value);
    }

    /**
     * <p>If the viewport’s width is smaller than this value, the panel will change to narrow<br>layout. In the mode the drawer will be closed.</p>
     *
     * JavaScript Info:
     * @property responsiveWidth
     * @type String
     * 
     */
    public String getResponsiveWidth() {
        return getPolymerElement().getResponsiveWidth();
    }
    /**
     * <p>If the viewport’s width is smaller than this value, the panel will change to narrow<br>layout. In the mode the drawer will be closed.</p>
     *
     * JavaScript Info:
     * @property responsiveWidth
     * @type String
     * 
     */
    public void setResponsiveWidth(String value) {
        getPolymerElement().setResponsiveWidth(value);
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
     * <p>Resets the layout. If you changed the size of this element via CSS<br>you can notify the changes by either firing the <code>iron-resize</code> event<br>or calling <code>resetLayout</code> directly.</p>
     *
     * JavaScript Info:
     * @method resetLayout
     * 
     * 
     */
    public void resetLayout() {
        getPolymerElement().resetLayout();
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


}
