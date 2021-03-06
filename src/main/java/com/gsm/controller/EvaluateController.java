package com.gsm.controller;

import com.gsm.pojo.database.CourseEvaluateDo;
import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.service.EvaluateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("评价模块")
@RestController
@RequestMapping("/evaluate")
public class EvaluateController {
    @Autowired
    private EvaluateService evaluateService;

    @ApiOperation("提交评价")
    @PostMapping("/insertEvaluate")
    public BoolVo insertEvaluate(CourseEvaluateDo courseEvaluateDo){
        BoolVo boolVo = evaluateService.insertEvaluate(courseEvaluateDo);
        return boolVo;
    }
}
