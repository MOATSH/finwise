package com.scu.finwise.core.controller.admin;

import com.scu.finwise.core.pojo.entity.IntegralGrade;
import com.scu.finwise.core.service.IntegralGradeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Program: finwise
 * @Description: 积分等级表管理Controller
 * @Author: MOATSH
 * @Create: 2023-10-26 11:15
 **/

@CrossOrigin
@RestController
@RequestMapping("/admin/core/integralGrade")
public class AdminIntegralGradeController {
    @Resource
    private IntegralGradeService integralGradeService;


    @GetMapping("/list")
    public List<IntegralGrade> listAll() {
        return integralGradeService.list();
    }

    @DeleteMapping("/remove/{id}")
    public boolean removeById(@PathVariable Long id) {
        return integralGradeService.removeById(id);
    }
}
