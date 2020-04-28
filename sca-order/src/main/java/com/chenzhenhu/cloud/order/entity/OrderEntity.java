package com.chenzhenhu.cloud.order.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author john
 */
@Data
public class OrderEntity implements Serializable {

    private Integer id;

    private LocalDateTime createTime;

    private String name;

    private Integer accountId;

    private Integer productId;
}
