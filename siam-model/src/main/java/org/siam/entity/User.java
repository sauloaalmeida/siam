package org.siam.entity;

import org.apache.commons.lang3.StringUtils;
import org.siam.exception.BusinessException;

public class User implements Identity {

    private long id;
    private String name;
    private  static final long serialVersionUID = 546475l;

    public User (long id){
        this.id = id;
    }

    public User(long id, String name) {

        if( StringUtils.isEmpty( name ) ){
            throw new BusinessException("mandatory.argument","Name");
        }

        this.id = id;
        this.name = name;
    }

    @Override
    public long getId() {
        return id;
    }

    public String getName(){
        return name;
    }
}
