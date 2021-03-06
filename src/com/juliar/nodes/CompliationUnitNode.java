package com.juliar.nodes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by donreamey on 10/21/16.
 */
public class CompliationUnitNode extends NodeImpl  {
    public List<Node> statementNodes = new ArrayList<>();

    @Override
    public NodeType getType() {
        return NodeType.CompliationUnitType;
    }

    @Override
    public String getNodeName() {
        return "CompliationUnitNode";
    }
}
