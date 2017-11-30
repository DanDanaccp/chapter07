package Top1.cn.accp.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PitchingIn {
    @Before("execution( * Top1.cn.accp.service.ContextService.do*(..))")
    public void before(){
        System.out.println("前置增强");
    }
    @AfterReturning(value = "execution( * Top1.cn.accp.service.ContextService.do*(..))")
    public void AfterReturning(){
        System.out.println("后置增强");
    }
}
