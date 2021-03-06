package com.juliar.nodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.io.*;

import static com.juliar.nodes.IntegralType.*;

/**
 * Created by Don on 1/13/2017.
 */
public abstract class NodeImpl implements Node , Serializable{
    protected List<Node> instructions = new ArrayList<>();
    protected String nodeName;
    private IntegralType integralType;

    public NodeImpl(){
        setNodeName();
    }

    @Override
    public void AddInst(Node parent, Node instruction) {
    /*add instruction given parent*/
    }

    @Override
    public void AddInst(Node instruction) {
        instructions.add( instruction );
    }

    @Override
    public void AddInst(Stack<Node> contextStack, Node instruction) {
        Node n = contextStack.peek();
        n.AddInst(instruction);
    }

    @Override
    public List<Node> getInstructions(){
        return instructions;
    }

    @Override
    public void setNodeName(){
        nodeName = this.toString();
    }

    @Override
    public String getNodeName(){
        return nodeName;
    }

    @Override
    public IntegralType getIntegralType(){
        return integralType;
    }

    @Override
    public void setVariableTypeByIntegralType( IntegralType type){
        integralType = type;
    }

    @Override
    public void setVariableType(String variableType){
        switch (variableType) {
            case "int":
                integralType = jinteger;
                break;
            case "double":
                integralType = jdouble;
                break;
            case "float":
                integralType = jfloat;
                break;
            case "long":
                integralType = jlong;
                break;
            case "string":
                integralType = jstring;
                break;
            case "object":
                integralType = jobject;
                break;
            case "boolean":
                integralType = jboolean;
                break;
        }
    }
}
