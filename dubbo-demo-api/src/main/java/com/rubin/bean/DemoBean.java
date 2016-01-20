package com.rubin.bean;

import java.io.Serializable;

/**
 * Created by rubin on 16-1-20.
 */
public class DemoBean implements Serializable {

    private String id;
    private String name;
    private String age;

    public DemoBean() {
    }

    public DemoBean(String id) {
        this.id = id;
    }

    public DemoBean(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public DemoBean setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DemoBean setName(String name) {
        this.name = name;
        return this;
    }

    public String getAge() {
        return age;
    }

    public DemoBean setAge(String age) {
        this.age = age;
        return this;
    }
}
