package org.siam.exception;

public abstract class SIAMException extends RuntimeException{

    public SIAMException(String msg, Object... arguments) {
        super(msg.format(msg,arguments));
    }

}
