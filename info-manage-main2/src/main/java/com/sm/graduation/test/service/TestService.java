package com.sm.graduation.test.service;

import com.sm.graduation.checkin.pojo.CheckIn;
import com.sm.graduation.test.dao.TestMapper;
import com.sm.graduation.test.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author HelenZhang
 * @Date 2024/1/22 02:03
 * @Description
 */
@Service
public class TestService {
    @Autowired
    private TestMapper testMapper;

    public List<Test> listAll(Map map) {
        return testMapper.listAll(map);
    }

    public Test getById(Long id) {
        return testMapper.getById(id);
    }

    public int insert(Test test) {
        return testMapper.insert(test);
    }

    public int update(Test test) {
        return testMapper.update(test);
    }

    public int delete(Integer id) {
        return testMapper.delete(id);
    }
}
