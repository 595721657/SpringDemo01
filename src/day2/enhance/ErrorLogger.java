package day2.enhance;
/*
 * �쳣��ǿ��������
 */

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class ErrorLogger {
      private Logger log=Logger.getLogger(ErrorLogger.class); 
    
      //����һ����ǿ�ķ���
      public void afertThrowing(JoinPoint jp,RuntimeException e) {
		log.info("����"+jp.getTarget()+"��"+jp.getSignature().getName()+"����ʱ�����쳣!!!");
	}
}
