package com.accp.service;

import com.accp.biz.ProviderBiz;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("ProviderService")
public class ProviderService {
    @Resource(name = "ProviderBiz")
    private ProviderBiz providerBiz;

    public int update(int id,String proName){
        return providerBiz.update(id,proName);
    }

    public int delete(int id){
        return providerBiz.delete(id);
    }
}