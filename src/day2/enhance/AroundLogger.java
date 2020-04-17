package day2.enhance;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

public class AroundLogger {
     private Logger log=Logger.getLogger(AroundLogger.class);
     
     public Object aroundLog(ProceedingJoinPoint pd) throws Throwable{
		log.info("����"+pd.getTarget()+"��"+pd.getSignature().getName()+"����,���������:"+Arrays.toString(pd.getArgs()));
		Object result=null;
		try {
    		 //ִ��Ŀ�귽�����õ����ķ���ֵ
    		 result=pd.proceed();
    		 log.info("����"+pd.getTarget()+"��"+pd.getSignature().getName()+"����,�����ķ���ֵ:"+result);
		} catch (Throwable e) {
			log.info("����"+pd.getTarget()+"��"+pd.getSignature().getName()+"����,���������쳣");
			throw e;
		}finally {
			log.info("����"+pd.getTarget()+"��"+pd.getSignature().getName()+"����,��������");
		}
		return result;
	}
}
