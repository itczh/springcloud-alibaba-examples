package com.chenzhenhu.cloud.account.service.impl;

import com.chenzhenhu.cloud.account.entity.AccountEntity;
import com.chenzhenhu.cloud.account.mapper.AccountMapper;
import com.chenzhenhu.cloud.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author john
 */
@Service
public class AccountServiceImpl implements AccountService {

    private final AccountMapper accountMapper;

    public AccountServiceImpl(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @Override
    public void save(AccountEntity entity) {
        accountMapper.insert(entity);
    }

    @Override
    public void update(AccountEntity entity) {
        accountMapper.update(entity);
    }
}
