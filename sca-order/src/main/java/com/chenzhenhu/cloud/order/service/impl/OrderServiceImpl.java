package com.chenzhenhu.cloud.order.service.impl;

import com.chenzhenhu.cloud.order.entity.OrderEntity;
import com.chenzhenhu.cloud.order.mapper.OrderMapper;
import com.chenzhenhu.cloud.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author john
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(OrderEntity entity) {
        orderMapper.insert(entity);
    }
}
