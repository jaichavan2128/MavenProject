/**
 Exception class which defines Custom Exception
 When Rectangle width or length is negative and Circle radius is negative
 Exception will be thrown
 *
 */
package com.task.first.exception;

import com.task.first.api.ErrorCode;

/**
 * *
 * @author  jai chavan   jai.chavan jai.chavan@clairvoyantsoft.com
 * @version  11.1
 */
public class MyException extends Exception {

    private static final long serialVersionUID = 1L;
     ErrorCode errorCode;
    // constructor for MyException class
    public MyException(String errorMessage ) {
        super(errorMessage);
    }
    /**
     * @param errorCode
     */
    public MyException(ErrorCode errorCode) {
        super(errorCode.getMsg());
        this.errorCode = errorCode;
    }

}
