package tttdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tha
 */
public class TTTDemoTest {
    
    TTTDemo instance;
    
    
    public TTTDemoTest() {
          System.out.println("TTTDemoTest");
          instance = new TTTDemo();
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass");
         System.out.println("");   
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("setUp");
        
        instance = new TTTDemo(5);
    }
    
    @After
    public void tearDown() {
        System.out.println("tearDown");
        
        instance = null;
    }

    /**
     * Test of calculate1 method, of class TTTDemo.
     */
    @Test
    public void testCalculate1() {
        System.out.println("calculate1");
        int n = 0;
        
        int expResult = 7;
        int result = instance.calculate1(n);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calculate2 method, of class TTTDemo.
     */
    @Test
    public void testCalculate2() {
        System.out.println("calculate2");
        int n = 0;
        
        int expResult = 89;
        int result = instance.calculate2(n);
        assertEquals(expResult, result);
       
    }
    
}
