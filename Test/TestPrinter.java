import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import print.Printer;

class TestPrinter {

	@Test
	void test() {
	    //1.创建applicationContext对象
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationcontext1.xml");
		//2.通过getBean方法获取配置的bean信息，并保存这个对象
		Printer print=(Printer) ctx.getBean("colorPrint");
	    //3.调用方法实现操作
		print.print();
	}

}
