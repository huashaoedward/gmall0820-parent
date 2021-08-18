package com.huashao.gmall.service;

import com.huashao.gmall.bean.KeywordStats;

import java.util.List;

/**
 * Author: huashao
 * Date: 2021/8/14
 * Desc: 关键词统计接口
 */
public interface KeywordStatsService {
    public List<KeywordStats> getKeywordStats(int date, int limit);
}

