package com.huashao.gmall.service.impl;

import com.huashao.gmall.bean.ProvinceStats;
import com.huashao.gmall.mapper.ProvinceStatsMapper;
import com.huashao.gmall.service.ProvinceStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Felix
 * Date: 2021/2/27
 * Desc:按照地区统计的业务接口实现类
 */
@Service    //标识是Spring的Sevice层组件，将对象的创建交给Spring的IOC管理。这个注解如果不加，无法标识service
// 层，创建bean会失败
public class ProvinceStatsServiceImpl implements ProvinceStatsService {
    //注入mapper
    @Autowired
    ProvinceStatsMapper provinceStatsMapper;

    @Override
    public List<ProvinceStats> getProvinceStats(int date) {
        return provinceStatsMapper.selectProvinceStats(date);
    }
}
