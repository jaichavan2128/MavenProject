package com.task.first.api;

/**
 * @author   jaee chavan   jai.chavan@clairvoyantsoft.com
   @version   1.11
 *
 */
/*
It is enum class create errorcode for negative number
*/
public enum ErrorCode {


    NEGATIVE_NUMBER("Given input is negative");
    private String msg;

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param string
     */
    ErrorCode(String string) {

        this.msg=string;

    }
}
