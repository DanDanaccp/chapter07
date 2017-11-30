package com.accp.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("ProviderDao")
public interface ProviderDao {
    int update(@Param("id") int id,@Param("proName") String proName);
    int delete(@Param("id") int id);
}
