package br.com.petrobras.iam.exception;

public abstract class IAMException extends RuntimeException{

    public IAMException(String msg, Object... arguments) {
        super(msg.format(msg,arguments));
    }

}
