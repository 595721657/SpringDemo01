package day2.enhance;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class AfterLogger {
     private Logger log=Logger.getLogger(AfterLogger.class);
     
     //����һ��������ǿ�����淽��
     //������ǿ,��ʵ������ҵ�񷽷�ִ�к���ִ�еĲ���
     public void afterlog(JoinPoint jp) {
		log.info("����"+jp.getTarget()+"��"+jp.getSignature().getName()+"��������");
	}
}
