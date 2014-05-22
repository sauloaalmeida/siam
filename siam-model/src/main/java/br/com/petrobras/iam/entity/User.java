package br.com.petrobras.iam.entity;

import br.com.petrobras.iam.exception.BusinessException;

/**
 * Created by up23 on 5/13/14.
 */
public class User implements Identity {

    private long id;
    private String name;

    public User (long id){
        this.id = id;
    }

    public User(long id, String name) {

        if(name==null || "".equals(name.trim())){
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
        return getName();
    }
}
