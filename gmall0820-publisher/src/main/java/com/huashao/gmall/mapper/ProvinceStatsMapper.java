package com.huashao.gmall.mapper;

import com.huashao.gmall.bean.ProvinceStats;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Author: huashao
 * Date: 2021/8/13
 * Desc: 按照地区统计交易额
 */
public interface ProvinceStatsMapper {
    @Select("select province_name,sum(order_amount) order_amount from province_stats_0820 " +
        "where toYYYYMMDD(stt)=#{date} group by province_id,province_name")
    List<ProvinceStats> selectProvinceStats(int date);
}
