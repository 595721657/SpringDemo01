import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day2.pojo.TestEntity;

class Testentitys {

	@Test
	void test() {
		//����һ��applicationcontext����
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationcontext5.xml");
		TestEntity test=(TestEntity) ctx.getBean("entity");
		test.showValue();
	}

}
