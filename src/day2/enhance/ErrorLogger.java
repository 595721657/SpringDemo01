package day2.enhance;
/*
 * 异常增强的切面类
 */

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class ErrorLogger {
      private Logger log=Logger.getLogger(ErrorLogger.class); 
    
      //定义一个增强的方法
      public void afertThrowing(JoinPoint jp,RuntimeException e) {
		log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法时发生异常!!!");
	}
}
