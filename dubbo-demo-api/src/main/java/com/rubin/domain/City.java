package com.rubin.domain;

import java.io.Serializable;

import lombok.Data;

/**
 * Created by RubinCarter on 16-1-20.
 */
@Data
public class City implements Serializable {

    private static final long serialVersionUID = 3875452423785148587L;

    private String id;
    private String name;
    private String age;

}
