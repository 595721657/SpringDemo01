import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import computer.Computer;

class TestComputer {

	@Test
	void test() {
		//1.创建applicationcontext对象
		ApplicationContext atc=new ClassPathXmlApplicationContext("applicationcontext2.xml");
		//2.得到compuer对象
		Computer com=(Computer) atc.getBean("computer");
		//输出结果
		com.print();
	}

}
