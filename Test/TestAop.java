import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aops.pojo.User;
import aops.service.UserService;

class TestAop {

	@Test
	void test() {
		//1.����applicationContext����
		ApplicationContext atc=new ClassPathXmlApplicationContext("applicationcontext3.xml");
		//ͨ��getbean��ö��� 
		UserService us=(UserService) atc.getBean("userService");
		//���÷���
		User user=new User(1, "����", 20);
		us.saveUser(user);
	}

}
