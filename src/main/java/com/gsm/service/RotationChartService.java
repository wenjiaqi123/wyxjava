package com.gsm.service;

import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.RotationChartVo;

public interface RotationChartService {
    ListVo selectRotationChartList(RotationChartVo chartVo);
}
