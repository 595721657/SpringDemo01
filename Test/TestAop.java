import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aops.pojo.User;
import aops.service.UserService;

class TestAop {

	@Test
	void test() {
		//1.创建applicationContext对象
		ApplicationContext atc=new ClassPathXmlApplicationContext("applicationcontext3.xml");
		//通过getbean获得对象 
		UserService us=(UserService) atc.getBean("userService");
		//调用方法
		User user=new User(1, "张三", 20);
		us.saveUser(user);
	}

}
