package com.scu.finwise.core.service;

import com.scu.finwise.core.pojo.vo.LoginVO;
import com.scu.finwise.core.pojo.vo.RegisterVO;
import com.scu.finwise.core.pojo.entity.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.scu.finwise.core.pojo.vo.UserInfoVO;

/**
 * <p>
 * 用户基本信息 服务类
 * </p>
 *
 * @author MOATSH
 * @since 2023-10-26
 */
public interface UserInfoService extends IService<UserInfo> {

    void register(RegisterVO registerVO);
    UserInfoVO login(LoginVO loginVO, String ip);

}
