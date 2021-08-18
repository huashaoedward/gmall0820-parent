package com.huashao.gmall.service.impl;

import com.huashao.gmall.bean.ProductStats;
import com.huashao.gmall.mapper.ProductStatsMapper;
import com.huashao.gmall.service.ProductStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Author: huashao
 * Date: 2021/8/12
 * Desc: 商品统计Service接口实现类
 */

@Service
/*标识是Spring的Sevice层组件，将对象的创建交给Spring的IOC管理。这个注解如果不加，无法标识service层，创建bean会失败*/
public class ProductStatsServiceImpl implements ProductStatsService {

    //自动注入   在容器中，寻找ProductStatsMapper类型的对象，赋值给当前属性
    @Autowired
    ProductStatsMapper productStatsMapper;

    @Override
    public BigDecimal getGMV(int date) {
        //调用的是mapper的方法getGMV
        return productStatsMapper.getGMV(date);
    }

    @Override
    public List<ProductStats> getProductStatsByTrademark(int date, int limit) {
        return productStatsMapper.getProductStatsByTrademark(date,limit);
    }

    @Override
    public List<ProductStats> getProductStatsByCategory3(int date, int limit) {
        return productStatsMapper.getProductStatsByCategory3(date,limit);
    }

    @Override
    public List<ProductStats> getProductStatsBySPU(int date, int limit) {
        return productStatsMapper.getProductStatsBySPU(date,limit);
    }
}
