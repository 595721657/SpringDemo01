package day2.enhance;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

public class AroundLogger {
     private Logger log=Logger.getLogger(AroundLogger.class);
     
     public Object aroundLog(ProceedingJoinPoint pd) throws Throwable{
		log.info("调用"+pd.getTarget()+"的"+pd.getSignature().getName()+"方法,方法的入参:"+Arrays.toString(pd.getArgs()));
		Object result=null;
		try {
    		 //执行目标方法并得到它的返回值
    		 result=pd.proceed();
    		 log.info("调用"+pd.getTarget()+"的"+pd.getSignature().getName()+"方法,方法的返回值:"+result);
		} catch (Throwable e) {
			log.info("调用"+pd.getTarget()+"的"+pd.getSignature().getName()+"方法,方法发生异常");
			throw e;
		}finally {
			log.info("调用"+pd.getTarget()+"的"+pd.getSignature().getName()+"方法,方法结束");
		}
		return result;
	}
}
