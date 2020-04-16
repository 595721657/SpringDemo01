import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import print.Printer;

class TestPrinter {

	@Test
	void test() {
	    //1.����applicationContext����
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationcontext1.xml");
		//2.ͨ��getBean������ȡ���õ�bean��Ϣ���������������
		Printer print=(Printer) ctx.getBean("colorPrint");
	    //3.���÷���ʵ�ֲ���
		print.print();
	}

}
