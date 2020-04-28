package com.chenzhenhu.cloud.account.service;

import com.chenzhenhu.cloud.account.entity.AccountEntity;

/**
 * @author john
 */
public interface AccountService {

    void save(AccountEntity entity);

    void update(AccountEntity entity);

    AccountEntity getById(Integer id);
}
