package day2.enhance;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class AfterLogger {
     private Logger log=Logger.getLogger(AfterLogger.class);
     
     //定义一个最终增强的切面方法
     //最终增强,其实就是在业务方法执行后在执行的操作
     public void afterlog(JoinPoint jp) {
		log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法结束");
	}
}
