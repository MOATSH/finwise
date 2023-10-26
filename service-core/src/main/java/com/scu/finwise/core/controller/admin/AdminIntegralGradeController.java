package com.scu.finwise.core.controller.admin;

import com.scu.finwise.common.exception.Assert;
import com.scu.finwise.common.result.R;
import com.scu.finwise.common.result.ResponseEnum;
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
    public R listAll() {
        List<IntegralGrade> list = integralGradeService.list();

        return R.ok().data("list", list).changeMessage("获取列表成功");
    }

    @ApiOperation(value = "根据id删除数据记录", notes = "逻辑删除数据记录")
    @DeleteMapping("/remove/{id}")
    public R removeById(@ApiParam("积分等级数据记录id") @PathVariable Long id) {
        boolean b = integralGradeService.removeById(id);

        if(b) {
            return R.ok().data("返回值", true).changeMessage("删除成功");
        }
        else {
            return R.error().data("返回值", false).changeMessage("删除失败");
        }
    }

    @ApiOperation("新增积分等级")
    @PostMapping("/save")
    public R save(@ApiParam(value = "积分等级对象") @RequestBody IntegralGrade integralGrade) {
        boolean result = integralGradeService.save(integralGrade);

        Assert.notNull(integralGrade.getBorrowAmount(), ResponseEnum.BORROW_AMOUNT_NULL_ERROR);

        if(result) {
            return R.ok().changeMessage("增加成功");
        }
        else {
            return R.error().changeMessage("增加失败");
        }
    }

    @ApiOperation("根据id获取积分等级数据记录")
    @GetMapping("/get/{id}")
    public R getById(@ApiParam("积分等级数据记录id") @PathVariable("id") Long id) {
        IntegralGrade integralGrade = integralGradeService.getById(id);

        if (integralGrade == null) {
            return R.error().changeMessage("未查询到数据");
        }
        else {
            return R.ok().changeMessage("查询成功").data("record", integralGrade);
        }
    }

    @ApiOperation("更新积分等级记录")
    @PutMapping("/update")
    public R updateById(@ApiParam(value = "积分等级对象") @RequestBody IntegralGrade integralGrade) {
        boolean result = integralGradeService.updateById(integralGrade);
        if (result) {
            return R.ok().changeMessage("更新成功");
        }
        else {
            return R.error().changeMessage("更新失败");
        }
    }
}
