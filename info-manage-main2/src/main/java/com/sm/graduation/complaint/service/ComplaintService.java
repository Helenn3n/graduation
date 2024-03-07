package com.sm.graduation.complaint.service;

import com.sm.graduation.complaint.dao.ComplaintMapper;
import com.sm.graduation.complaint.pojo.Complaint;
import com.sm.graduation.test.dao.TestMapper;
import com.sm.graduation.test.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author HelenZhang
 * @Date 2024/3/6 09:39
 * @Description
 */
@Service
public class ComplaintService {
    @Autowired
    private ComplaintMapper complaintMapper;

    public List<Complaint> listAll(Map map) {
        return complaintMapper.listAll(map);
    }

    public Complaint getById(Long id) {
        return complaintMapper.getById(id);
    }

    public int insert(Complaint complaint) {
        return complaintMapper.insert(complaint);
    }

    public int update(Complaint complaint) {
        return complaintMapper.update(complaint);
    }

    public int delete(Integer id) {
        return complaintMapper.delete(id);
    }
}

