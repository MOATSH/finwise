package com.scu.finwise.sms;

import com.scu.finwise.sms.util.SmsProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Program: finwise
 * @Description:
 * @Author: MOATSH
 * @Create: 2023-10-30 14:23
 **/

@SpringBootTest
@RunWith(SpringRunner.class)
public class UtilTests {

    @Test
    public void testProperties(){
        System.out.println(SmsProperties.KEY_ID);
        System.out.println(SmsProperties.KEY_SECRET);
        System.out.println(SmsProperties.REGION_Id);
    }

}
