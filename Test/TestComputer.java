import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import computer.Computer;

class TestComputer {

	@Test
	void test() {
		//1.����applicationcontext����
		ApplicationContext atc=new ClassPathXmlApplicationContext("applicationcontext2.xml");
		//2.�õ�compuer����
		Computer com=(Computer) atc.getBean("computer");
		//������
		com.print();
	}

}
