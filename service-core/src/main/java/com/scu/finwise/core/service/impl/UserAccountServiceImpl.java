package com.scu.finwise.core.service.impl;

import com.scu.finwise.core.pojo.entity.UserAccount;
import com.scu.finwise.core.mapper.UserAccountMapper;
import com.scu.finwise.core.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author MOATSH
 * @since 2023-10-26
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
