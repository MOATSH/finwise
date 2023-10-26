package com.scu.finwise.core.service.impl;

import com.scu.finwise.core.pojo.entity.UserLoginRecord;
import com.scu.finwise.core.mapper.UserLoginRecordMapper;
import com.scu.finwise.core.service.UserLoginRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author MOATSH
 * @since 2023-10-26
 */
@Service
public class UserLoginRecordServiceImpl extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord> implements UserLoginRecordService {

}
