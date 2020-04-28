package com.chenzhenhu.cloud.storage.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author john
 */
@Data
public class StorageEntity implements Serializable {

    private static final long serialVersionUID = 2353601193638862905L;

    private Integer id;

    private String name;

    private Integer count;
}
