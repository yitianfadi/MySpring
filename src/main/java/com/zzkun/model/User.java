package com.zzkun.model;

import java.io.Serializable;
import java.io.SerializablePermission;

/**
 * Created by kun on 2016/5/5.
 */
public class User implements Serializable {
    private int id;
    private String isbnNumber;
    private String path;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getIsbnNumber() {

        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {

        this.isbnNumber = isbnNumber;
    }

    public String getPath() {

        return path;
    }

    public void setPath(String path) {

        this.path = path;
    }
}
