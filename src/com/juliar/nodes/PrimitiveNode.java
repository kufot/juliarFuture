package com.juliar.nodes;

/**
 * Created by Don on 12/24/2016.
 */
public class PrimitiveNode extends NodeImpl {
    private String primitiveName;
    private IntegralTypeNode primitiveArgument;

    public PrimitiveNode(){
    }

    public String getPrimitiveName(){
        return primitiveName;
    }

    public IntegralTypeNode getGetPrimitiveArgument(){
        return primitiveArgument;
    }

    public IntegralType getArgumentType(){
        return primitiveArgument.getIntegralType();
    }

    @Override
    public NodeType getType() {
        return NodeType.PrimitiveType;
    }
}
