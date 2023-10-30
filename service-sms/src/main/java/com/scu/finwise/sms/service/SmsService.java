package com.scu.finwise.sms.service;

import java.util.Map;

/**
 * @Program: finwise
 * @Description:
 * @Author: MOATSH
 * @Create: 2023-10-30 14:26
 **/

public interface SmsService {

    void send(String mobile, String templateCode, Map<String,Object> param);

}
