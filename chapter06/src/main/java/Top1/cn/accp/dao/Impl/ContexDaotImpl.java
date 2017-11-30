package Top1.cn.accp.dao.Impl;

import Top1.cn.accp.dao.ContextDao;
import org.springframework.stereotype.Repository;

@Repository("ContexDaotImpl")
public class ContexDaotImpl implements ContextDao {
    public void Context(String name, String Context) {
        System.out.println(name+"说："+Context);
    }
}
