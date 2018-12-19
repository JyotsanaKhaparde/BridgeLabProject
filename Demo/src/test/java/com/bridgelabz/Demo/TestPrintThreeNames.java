package com.bridgelabz.Demo;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.bridgelabz.javaprogram.PrintThreeName;

public class TestPrintThreeNames {

	 private final InputStream systemIn = System.in;
	    private final PrintStream systemOut = System.out;

	    private ByteArrayInputStream testIn;
	    private ByteArrayOutputStream testOut;

	    @Before
	    public void setUpOutput() {
	        testOut = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(testOut));
	    }

	    private void provideInput(String data) {
	        testIn = new ByteArrayInputStream(data.getBytes());
	        System.setIn(testIn);
	    }

	    private String getOutput() {
	        return testOut.toString();
	    }

	    @After
	    public void restoreSystemInputOutput() {
	        System.setIn(systemIn);
	        System.setOut(systemOut);
	    }

	    @Test
	    public void testCase1() {
	        PrintThreeName.main(new String[0]);

	        final String testString = "Enter name: \n" +systemIn+"\n" +systemIn+"\n" +"hii"+systemIn;
	        provideInput(testString);


	        assertEquals(testString, getOutput());
	       
	    }

}
