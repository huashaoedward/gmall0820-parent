package com.huashao.gmall.service;

import com.huashao.gmall.bean.VisitorStats;

import java.util.List;

/**
 * Author: huashao
 * Date: 2021/8/13
 * Desc: 访客统计业务层接口
 */
public interface VisitorStatsService {

    List<VisitorStats> getVisitorStatsByNewFlag(int date);

    List<VisitorStats> getVisitorStatsByHr(int date);

}
