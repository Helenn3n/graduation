package com.sm.graduation.registry.service;

import com.sm.graduation.older.pojo.OlderInfo;
import com.sm.graduation.registry.dao.RegistryMapper;
import com.sm.graduation.registry.pojo.Registry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author HelenZhang
 * @Date 2024/3/4 09:27
 * @Description
 */
@Service
public class RegistryService {
    @Autowired
    private RegistryMapper registryMapper;

    public List<Registry> listAll(Map map) {
        return registryMapper.listAll(map);
    }

    public Registry getById(Long elderId) {
        return registryMapper.getById(elderId);
    }

    public int insert(Registry elderInfo) {
        return registryMapper.insert(elderInfo);
    }

    public int update(Registry elderInfo) {
        return registryMapper.update(elderInfo);
    }

    public int delete(Integer id) {
        return registryMapper.delete(id);
    }

}
