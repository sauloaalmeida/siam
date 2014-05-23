package org.siam.exception;

public class BusinessException extends SIAMException {

    public BusinessException(String msg, Object... arguments) {
        super(msg,arguments);
    }
}
