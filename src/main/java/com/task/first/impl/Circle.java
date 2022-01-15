/**
 *  THis is Circle class which calculate Area of Circle
 */
package com.task.first.impl;

/**
 **
 * @author  jai chavan   jai.chavan jai.chavan@clairvoyantsoft.com
 *
 * @version  11.1
 */

import com.task.first.Dimension;
import com.task.first.api.ErrorCode;
import com.task.first.api.Shape;
import com.task.first.exception.MyException;
import org.apache.log4j.Logger;
public class Circle implements Shape {
    //Circle class variables
      public static final double PI = 3.14;
    static Logger logger = Logger.getLogger(Circle.class);

    /* This method  is overridden
    * This method throws exception if radius is negative
    * otherwise it will calculate area of Circle
    * */
    public double calculateArea(Dimension dimension) throws MyException {

        double radius = dimension.getRadius();
        double areaofcircle;

            if (radius < 0) {
                throw new MyException(ErrorCode.NEGATIVE_NUMBER);

            } else {
                areaofcircle = PI * radius * radius;
     }

            return areaofcircle;

        }
    }

