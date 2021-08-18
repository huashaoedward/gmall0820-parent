package com.huashao.gmall.service.impl;

import com.huashao.gmall.bean.KeywordStats;
import com.huashao.gmall.mapper.KeywordStatsMapper;
import com.huashao.gmall.service.KeywordStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: huashao
 * Date: 2021/8/14
 * Desc:关键词统计接口实现类
 */
@Service
public class KeywordStatsServiceImpl implements KeywordStatsService {

    @Autowired  //自动注入mapper
    KeywordStatsMapper keywordStatsMapper;

    @Override
    public List<KeywordStats> getKeywordStats(int date, int limit) {
        return keywordStatsMapper.selectKeywordStats(date,limit);
    }
}
