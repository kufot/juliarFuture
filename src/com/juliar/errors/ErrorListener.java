package com.juliar.errors;

import org.antlr.v4.runtime.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/**
 * Created by Don on 10/28/2016.
 */
public class ErrorListener extends BaseErrorListener {

    private List<String> errorList = new ArrayList<>();
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String errorMessage = "error on line " + line +" at column "+ charPositionInLine +" " +msg.toString();
        errorList.add(errorMessage);
        Object context = ((Parser)recognizer).getRuleInvocationStack();
        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
    }

    public List<String> ErrorList(){
        return errorList;
    }
}
