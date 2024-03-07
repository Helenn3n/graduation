package com.sm.graduation.complaint.dao;

import com.sm.graduation.complaint.pojo.Complaint;
import com.sm.graduation.health.pojo.HealthRecords;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @Author HelenZhang
 * @Date 2024/3/6 09:38
 * @Description
 */
@Mapper
public interface ComplaintMapper {
    List<Complaint> listAll(Map map);

    @Select("select id,com_usr,com_inst,com_content,com_result,create_time from complaint where id=#{id}")
    Complaint getById(Long id);

    @Insert("insert into complaint(id,com_usr,com_inst,com_content,com_result,create_time) " +
            "values(#{id},#{comUsr},#{comInst},#{comContent},#{comResult},#{createTime})")
    int insert(Complaint complaint);


    @Update("update complaint set com_usr=#{comUsr}, com_inst=#{comInst}, com_content=#{comContent},com_result=#{comResult},create_time=#{createTime} where id=#{id}")
    int update(Complaint complaint);


    @Delete("delete from complaint where id=#{id}")
    int delete(Integer id);
}
