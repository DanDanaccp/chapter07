package Top1.cn.accp.biz.Impl;

import Top1.cn.accp.biz.ContextBiz;
import Top1.cn.accp.dao.ContextDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ContextBizImpl")
public class ContextBizImpl implements ContextBiz {
    @Resource(name = "ContexDaotImpl")
    private ContextDao dao;

    public void setDao(ContextDao dao) {
        this.dao = dao;
    }

    public void Context(String name, String Context) {
        dao.Context(name,Context);
    }
}
