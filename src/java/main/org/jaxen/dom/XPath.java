// XPath.java - top-level entry point for DOM XPath matching.

package org.jaxen.dom;

import org.jaxen.JaxenException;

import org.jaxen.Navigator;
import org.jaxen.BaseXPath;

/** An XPath implementation for the W3C DOM model
 *
 * <p>This is the main entry point for matching an XPath against a DOM
 * tree.  You create a compiled XPath object, then match it against
 * one or more context nodes using the {@link #selectNodes}
 * method, as in the following example:</p>
 *
 * <pre>
 * XPath path = new XPath("a/b/c");
 * List results = path.selectNodes(domContextNode);
 * </pre>
 *
 * @see BaseXPath
 *
 * @author <a href="mailto:jstrachan@apache.org">James Strachan</a>
 *
 * @version $Revision$
 */
public class XPath extends BaseXPath
{
    /** Construct given an XPath expression string.
     *
     *  @param xpathExpr The XPath expression.
     *
     *  @throws JaxenException if there is a syntax error while
     *          parsing the expression.
     */
    public XPath(String xpathExpr) throws JaxenException
    {
        super( xpathExpr, DocumentNavigator.getInstance() );
    }

} 
