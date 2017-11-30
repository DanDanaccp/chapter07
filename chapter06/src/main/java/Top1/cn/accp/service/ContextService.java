package Top1.cn.accp.service;

import Top1.cn.accp.biz.ContextBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
@Controller("ContextService")
public class ContextService {
    @Resource(name = "ContextBizImpl")
    private ContextBiz contextBiz;
    @Value("张嘎")
    private String name;
    @Value("三天不打小鬼子，手痒痒")
    private String context;

    public void setContextBiz(ContextBiz contextBiz) {
        this.contextBiz = contextBiz;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContext(String context) {
        this.context = context;
    }
    public void doPost(){
        contextBiz.Context(name,context);
    }
}
