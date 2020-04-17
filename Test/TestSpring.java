import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestSpring {

	@Test
	void test() {
		//1.ͨ��spring�������ļ�������һ������
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	    //2.ͨ��applicationContext����ķ���ȡ��������ļ���bean
		SpringTest test=(SpringTest)ctx.getBean("test");
	    //3.�����������ķ�����ʵ�����
		test.print();
	}
     @Test
     public void testExample() {
    	//1.ͨ��spring�������ļ�������һ������
 		@SuppressWarnings("resource")
 		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
 	    //2.ͨ��applicationContext����ķ���ȡ��������ļ���bean
 		SpringTest test1=(SpringTest)ctx.getBean("testExample");
 		SpringTest test2=(SpringTest)ctx.getBean("testE");
 	    //3.�����������ķ�����ʵ�����
 		test1.print();
 		test2.print();
     }
     @Test
     public void testE() {
    	//1.ͨ��spring�������ļ�������һ������
  		@SuppressWarnings("resource")
  		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
  	    //2.ͨ��applicationContext����ķ���ȡ��������ļ���bean
  		SpringTest test1=(SpringTest)ctx.getBean("testExample01");
  		SpringTest test2=(SpringTest)ctx.getBean("testExample02");
  	    //3.�����������ķ�����ʵ�����
  		test1.print();
  		test2.print();
     }
}
