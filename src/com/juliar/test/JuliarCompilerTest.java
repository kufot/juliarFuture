package com.juliar.test;

import com.juliar.ImportsInterface;
import com.juliar.JuliarCompiler;
import junit.framework.TestCase;
import org.junit.Assert;

import java.lang.reflect.Method;
import java.util.List;

import static java.lang.System.out;

/**
 * Created by donreamey on 10/25/16.
 */
public class JuliarCompilerTest extends TestCase {
    public void setUp() throws Exception {
        super.setUp();

    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testInterpreter() throws Exception{
        JuliarCompiler compiler = new JuliarCompiler();
        compiler.isDebugMode = true;
        List<String> errorList = compiler.compile("test.jrl", ".",  false,false);
    }

    public void testCompile() throws Exception {
        try {
            JuliarCompiler compiler = new JuliarCompiler();
            List<String> errorList = compiler.compile("test.jrl", ".",  false,false);

            for(String s : errorList){
                out.println(s);
            }
            Assert.assertTrue( errorList.size() == 0 );
        }
        catch(Exception ex) {
            throw ex;
        }
    }
}