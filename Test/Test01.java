import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day2.pojo.Teacher;
import day2.pojo.User;
import day2.service.UserService;

class Test01 {

	@Test
	void test() {
		//创建一个applicationcontext对象
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationcontext4.xml");
		//
		User user=(User) ctx.getBean("user");
		System.out.println(user.toString());
		System.out.println("===================================");
		User user1=(User) ctx.getBean("user1");
		System.out.println(user1.toString());
	}
    @Test
    public void test02() {
    	//创建一个applicationcontext对象
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationcontext4.xml");
    	UserService us=(UserService) ctx.getBean("userService");
    	Teacher t=new Teacher();
    	t.setId(2);
    	t.setTname("张老师");
    	User user=new User("张三",20, "四川德阳", t);
        us.save(user);
    }
}
