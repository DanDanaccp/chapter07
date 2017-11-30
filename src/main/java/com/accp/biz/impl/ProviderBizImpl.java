package com.accp.biz.impl;

import com.accp.biz.ProviderBiz;
import com.accp.dao.ProviderDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
@Transactional
@Service("ProviderBiz")
public class ProviderBizImpl implements ProviderBiz {

    @Resource(name = "ProviderDao")
    private ProviderDao providerDao;

    @Transactional(propagation = Propagation.REQUIRED)
    public int update(int id,String proName) {
        return providerDao.update(id,proName);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public int delete(int id) {
        return providerDao.delete(id);
    }
}
