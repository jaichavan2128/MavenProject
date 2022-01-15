package com.task.first.test;
import com.task.first.Dimension;
import com.task.first.exception.MyException;
import com.task.first.impl.Rectangle;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
/*
Tests to run with a new test instance
 */
@RunWith(Parameterized.class)
public  class JunitRectangle {
    /*
    	The method annotated with @Before runs before each test
    	This method contains dimension object of Dimension class
    	which isPOJO class containing getter and setter method of width, length
    	of Rectangle and radius of Circle
     */

    Dimension dimension = new Dimension();
    private  double width;
    private double length;
    private double expectedResult;
    private Rectangle rectangle;

    public JunitRectangle(double width, double length, double expectedResult)
    {   super();
        this.width=width;
        this.length=length;
        this.expectedResult= expectedResult;

    }

/*
Setup resources run before each test case
 */
    @Before
    public void initialize()
    {
        rectangle=new Rectangle();
    }

/*
To create set of input data
 */
    @Parameterized.Parameters
        public static Collection Input(){
        return  Arrays.asList(new Object[][]{ {10.0,10.0,100},//Test Case 1
                {15.15,15.15,229.5225},// Test Case 2
                {-8,7,-56}});// Test Case 3
    }
    @Test
    public void testArea(){
        dimension.setWidth(width);
        dimension.setLength(length);
        if (width<0 || length<0) {
             try
             {
                 rectangle.calculateArea(dimension);
             }
             catch (MyException e)
             {
                Assert.assertTrue(true);
             }

        }
        else
            try
            {
                Assert.assertEquals(expectedResult, rectangle.calculateArea(dimension));
            }
            catch (MyException e)
            {
               Assert.assertFalse(true);
            }
        ;



    }

}



