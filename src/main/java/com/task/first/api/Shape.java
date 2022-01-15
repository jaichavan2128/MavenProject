/**
 *
 * @author  jai chavan   jai.chavan jai.chavan@clairvoyantsoft.com
 * @version  11.1
 *
 */
package com.task.first.api;
import com.task.first.Dimension;
import com.task.first.exception.MyException;

/*
 *  This program defines Interface Shape
 * It contains abstract Method calculateArea() to calculate Area of Rectangle
 * and Area of Circle
 *
 */
//Interface Shape
public interface   Shape
{
/*
    This is the Abstract method which has parameter object of Dimension class
    which contains all getters and setters method
 */
    public double calculateArea(Dimension dimension) throws MyException;
}

