package com.chenzhenhu.cloud.order.mapper;

import com.chenzhenhu.cloud.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author john
 */
@Mapper
@Repository
public interface OrderMapper {

    void insert(OrderEntity entity);

    OrderEntity selectById(Integer id);
}
