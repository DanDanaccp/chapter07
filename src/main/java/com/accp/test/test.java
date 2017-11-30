package com.accp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.accp.service.ProviderService;

public class test {
    public static void main(String[] args) {
        ApplicationContext ac =new ClassPathXmlApplicationContext("SpringAndMyBatisConfig.xml");
        ProviderService bean = ac.getBean(ProviderService.class);
        if(bean.delete(16)>0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
        if (bean.update(1,"wo")>0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
    }
}
