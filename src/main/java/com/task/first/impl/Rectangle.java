/**
 **
 * @author  jai chavan   jai.chavan jai.chavan@clairvoyantsoft.com
 *
 * @version  11.1
 */
/*
This Program contains Rectangle class which implements interface Shape
It contain calculateArea() method implementation of abstract Method
 */
package com.task.first.impl;
import com.task.first.api.ErrorCode;
import com.task.first.api.Shape;
import com.task.first.Dimension;
import com.task.first.exception.MyException;
import org.apache.log4j.Logger;
/*
Rectangle class which implements Shape interface
 */
public class Rectangle implements Shape {
    //Rectangle class variables

    static Logger logger = Logger.getLogger(Rectangle.class);


    // Implementation of abstract method
    public double calculateArea(Dimension dimension) throws MyException {
        double width = dimension.getWidth();
        double length = dimension.getLength();
        double areaOfRect;

/*
It checks width and length is negative or not if it is negative it throws Exception
otherwise it will calculate Area od Rectangle
 */
        if (width < 0 || length<0) {
            throw new MyException(ErrorCode.NEGATIVE_NUMBER);

        } else {

            areaOfRect = width * length;

        }

        return areaOfRect;
    }


}
