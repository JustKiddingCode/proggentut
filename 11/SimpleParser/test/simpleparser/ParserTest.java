/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleparser;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author justkidding
 */
public class ParserTest {
    
    public ParserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of parse method, of class Parser.
     */
    @Test
    public void testParse() {
        System.out.println("parse");
        String toParse = "50 + 3";
        Parser instance = new Parser();
        instance.parse(toParse);
		assertEquals(53, instance.getResult());
    }
    
}
