package com.datamanager.server.api.systemmanager.demomanager.model;

import java.io.Serializable;

/**
 * @program: com.datamanager.server.api.systemmanager.demomanager.model
 * @description:
 * @author: liujinghui
 * @create: 2019-03-10 14:39
 **/
public class DemoVO implements Serializable {

    private long id;
    private String name;
    private String email;
    private String detail;

    public DemoVO(long id, String name, String email, String detail) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.detail = detail;
    }

    public DemoVO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
