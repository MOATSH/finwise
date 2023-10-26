package com.scu.finwise.core.controller.admin;

import com.scu.finwise.core.pojo.entity.IntegralGrade;
import com.scu.finwise.core.service.IntegralGradeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Program: finwise
 * @Description: 积分等级表管理Controller
 * @Author: MOATSH
 * @Create: 2023-10-26 11:15
 **/

@Api(tags = "积分等级管理")
@CrossOrigin
@RestController
@RequestMapping("/admin/core/integralGrade")
public class AdminIntegralGradeController {
    @Resource
    private IntegralGradeService integralGradeService;


    @ApiOperation("积分等级列表")
    @GetMapping("/list")
    public List<IntegralGrade> listAll() {
        return integralGradeService.list();
    }

    @ApiOperation(value = "根据id删除数据记录", notes = "逻辑删除数据记录")
    @DeleteMapping("/remove/{id}")
    public boolean removeById(
            @ApiParam("积分等级数据记录id")
            @PathVariable Long id) {
        return integralGradeService.removeById(id);
    }
}
