package aops.logger;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;


/**
 * Ϊҵ����еķ��� ��ǿ����־��Ϣ��
 * @author ����
 * @@����ʱ�� 2020��4��14������4:11:46
 */
public class UserServiceLogger {
	private Logger log=Logger.getLogger(UserServiceLogger.class);
      //���÷���ǰ����ǿ����
	  public void before(JoinPoint jp) {
		log.info("����"+jp.getTarget()+"��"+jp.getSignature().getName()+"��������������"+Arrays.toString(jp.getArgs()));
	}
	  //���÷��������ǿ����
	  public void after(JoinPoint jp,Object result) {
		log.info("����"+jp.getTarget()+"��"+jp.getSignature().getName()+"��������������ֵ��"+result);
	}
}
