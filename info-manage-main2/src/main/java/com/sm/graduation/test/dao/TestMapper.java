package com.sm.graduation.test.dao;

import com.sm.graduation.test.pojo.Test;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @Author HelenZhang
 * @Date 2024/1/22 02:03
 * @Description
 */
@Mapper
public interface TestMapper {
    List<Test> listAll(Map map);

    @Select("select id,cost,year from test_info where id=#{id}")
    Test getById(Long id);

    @Insert("insert into test_info(cost,year) values(#{cost},#{year})")
    int insert(Test test);

    @Update("update test_info set cost=#{cost}, year=#{year} where id=#{id}")
    int update(Test test);

    @Delete("delete from test_info where id=#{id}")
    int delete(Integer id);
}
