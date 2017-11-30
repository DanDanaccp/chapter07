package com.accp.biz;

import org.springframework.stereotype.Service;

@Service("ProviderBiz")
public interface ProviderBiz {
    int update(int id,String proName);
    int delete(int id);
}
