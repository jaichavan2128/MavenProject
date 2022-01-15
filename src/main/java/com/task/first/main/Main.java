/*
 * @author @author  jai chavan   jai.chavan jai.chavan@clairvoyantsoft.com
 *
 */
package com.task.first.main;
import java.util.*;
import com.task.first.Dimension;
import com.task.first.api.Shape;
import com.task.first.exception.MyException;
import com.task.first.impl.Circle;
import com.task.first.impl.Rectangle;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
/*
This is the main class which calls the method calculateArea()
of Rectangle and Circle class
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws MyException {
        int ch;


        Shape r1=new Rectangle();
        Shape c1= new Circle();
        Scanner sc=new Scanner(System.in);
        BasicConfigurator.configure();
        Logger logger = Logger.getLogger(Main.class);
        logger.info("1.Area of Rectangle\n2. Area of Circle");
        logger.info("Enter your choice");
        ch=sc.nextInt();

        switch(ch)
        {
            case 1:
                logger.info("Enter length and width of Rectangle");
                double width=sc.nextDouble();
                double length=sc.nextDouble();
                Dimension obj=new Dimension();
                 obj.setWidth(width);
                 obj.setLength(length);
                logger.info("Area of Rectangle is:"+r1.calculateArea(obj));
                break;
            case 2:
                logger.info("Enter radius of Circle");
                double radius=sc.nextDouble();
                Dimension obj1=new Dimension();
                obj1.setRadius(radius);
                logger.info("Area of Circle  is:"+c1.calculateArea(obj1));
                break;
            default:
               logger.info("Wrong Choice");
        }





    }



}


