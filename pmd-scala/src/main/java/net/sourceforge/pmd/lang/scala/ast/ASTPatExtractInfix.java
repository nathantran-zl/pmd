/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.scala.ast;

import scala.meta.Pat;

/**
 * The ASTPatExtractInfix node implementation.
 */
public class ASTPatExtractInfix extends AbstractScalaNode<Pat.ExtractInfix> {

    /**
     * Create the AST node for this Scala node.
     * 
     * @param scalaNode
     *            the underlying Scala node
     */
    public ASTPatExtractInfix(Pat.ExtractInfix scalaNode) {
        super(scalaNode);
    }

    @Override
    public <D, R> R accept(ScalaParserVisitor<D, R> visitor, D data) {
        return visitor.visit(this, data);
    }
}
