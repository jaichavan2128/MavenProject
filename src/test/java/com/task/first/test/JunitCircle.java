package com.task.first.test;
import com.task.first.Dimension;
import com.task.first.exception.MyException;
import com.task.first.impl.Circle;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
 /*
    	The method annotated with @Before runs before each test
    	This method contains dimension object of Dimension class
    	which isPOJO class containing getter and setter method of width, length
    	of Rectangle and radius of Circle
     */

@RunWith(Parameterized.class)
public class JunitCircle {

    Dimension dimension = new Dimension();
    private Circle circle;
    private double expectedResult;
    private double radius;

    public JunitCircle(double radius, double expectedResult) {
        super();
        this.radius = radius;
        this.expectedResult = expectedResult;
    }

    /*
    Setup resources run before each test case
     */
    @Before
    public void initialize() {

        circle = new Circle();
    }
    /*
    To create set of input data
     */
    @Parameterized.Parameters
    public static Collection Input() {
        return Arrays.asList(new Object[][]{{10.0, 314},//Test Case 1
                {15.15, 720.7006500000001},// Test Case 2
                {0, 0}});// Test Case 3
    }

    @Test
    public void testArea() {
        dimension.setRadius(radius);
        if (radius < 0) {
            try {
                circle.calculateArea(dimension);
            } catch (MyException e) {
                Assert.assertTrue(true);
            }

        } else
            try {
                Assert.assertEquals(expectedResult, circle.calculateArea(dimension));
            } catch (MyException e) {
                Assert.assertFalse(true);
            }


    }
}
