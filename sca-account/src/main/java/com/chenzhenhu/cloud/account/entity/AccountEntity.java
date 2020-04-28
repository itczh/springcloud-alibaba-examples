package com.chenzhenhu.cloud.account.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author john
 */
@Data
public class AccountEntity implements Serializable {
    private static final long serialVersionUID = 1428303503422174112L;

    private Integer id;

    private String username;

    private String password;

    private String name;

    private String email;
}
