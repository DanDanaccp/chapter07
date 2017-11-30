package com.accp.dao.impl;

import com.accp.dao.ProviderDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("ProviderDaoImpl")
public class ProviderDaoImpl implements ProviderDao {

    @Resource(name = "ProviderDao")
    private ProviderDao providerDao;

    public int update(int id,String proName) {
        return providerDao.update(id,proName);
    }

    public int delete(int id) {
        return providerDao.delete(id);
    }
}
