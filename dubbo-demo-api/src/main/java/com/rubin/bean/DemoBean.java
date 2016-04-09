package com.rubin.bean;

import java.io.Serializable;

import lombok.Data;

/**
 * Created by RubinCarter on 16-1-20.
 */
@Data
public class DemoBean implements Serializable {

    private String id;
    private String name;
    private String age;

}
