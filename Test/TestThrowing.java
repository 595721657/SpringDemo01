import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day2.pojo.Teacher;
import day2.pojo.User;
import day2.service.UserService;

class TestThrowing {

	@Test
	void test() {
		//����applicationcontext����
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationcontext6.xml");
		//
		UserService us=(UserService) ctx.getBean("userService");
		Teacher t=new Teacher();
    	t.setId(2);
    	t.setTname("����ʦ");
    	User user=new User("����",20, "�Ĵ�����", t);
        us.save(user);
	}

}
