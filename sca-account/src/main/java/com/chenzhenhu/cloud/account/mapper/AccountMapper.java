package com.chenzhenhu.cloud.account.mapper;

import com.chenzhenhu.cloud.account.entity.AccountEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author john
 */
@Mapper
@Repository
public interface AccountMapper {

    void insert(AccountEntity entity);

    void update(AccountEntity entity);

    AccountEntity selectById(Integer id);
}
