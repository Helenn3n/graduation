package com.sm.graduation.registry.dao;

import com.sm.graduation.older.pojo.OlderInfo;
import com.sm.graduation.registry.pojo.Registry;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @Author HelenZhang
 * @Date 2024/3/4 10:42
 * @Description
 */
@Mapper
public interface RegistryMapper {
    List<Registry> listAll(Map map);


    @Select("select elder_id,elder_name,elder_sex,elder_tel,elder_addr,elder_idcard,in_time,out_time from registry where elder_id=#{elderId}")
    Registry getById(Long elderId);

    @Insert("insert into registry(elder_name,elder_sex,elder_tel,elder_addr,elder_idcard,in_time,out_time) values(#{elderName},#{elderSex},#{elderTel},#{elderAddr},#{elderIdcard}),#{inTime},#{outTime}")
    int insert(Registry elderInfo);


    @Update("update registry set elder_name=#{elderName},elder_sex=#{elderSex},elder_tel=#{elderTel},elder_addr=#{elderAddr},elder_idcard=#{elderIdcard},in_time=#{inTime},out_time=#{outTime} where elder_id=#{elderId}")
    int update(Registry elderInfo);


    @Delete("delete from registry where elder_id=#{id}")
    int delete(Integer id);
}
