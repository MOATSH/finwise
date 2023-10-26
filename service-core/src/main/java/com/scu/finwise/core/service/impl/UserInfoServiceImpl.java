package com.scu.finwise.core.service.impl;

import com.scu.finwise.core.pojo.entity.UserInfo;
import com.scu.finwise.core.mapper.UserInfoMapper;
import com.scu.finwise.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author MOATSH
 * @since 2023-10-26
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
