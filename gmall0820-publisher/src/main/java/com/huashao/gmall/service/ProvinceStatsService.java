package com.huashao.gmall.service;

import com.huashao.gmall.bean.ProvinceStats;

import java.util.List;

/**
 * Author: huashao
 * Date: 2021/8/13
 * Desc:  按照地区统计的业务接口
 */
public interface ProvinceStatsService {
    List<ProvinceStats> getProvinceStats(int date);
}
