package Top1.cn.accp.test;

import Top1.cn.accp.entity.Context;
import Top1.cn.accp.service.ContextService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ContextXml.xml");
        ContextService context = ac.getBean(ContextService.class);
        context.doPost();
    }
}
