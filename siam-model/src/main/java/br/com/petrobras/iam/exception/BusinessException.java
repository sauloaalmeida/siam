package br.com.petrobras.iam.exception;

public class BusinessException extends IAMException{

    public BusinessException(String msg, Object... arguments) {
        super(msg,arguments);
    }
}
