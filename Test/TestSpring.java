import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestSpring {

	@Test
	void test() {
		//1.通过spring的配置文件来创建一个对象
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	    //2.通过applicationContext对象的方法取获得配置文件的bean
		SpringTest test=(SpringTest)ctx.getBean("test");
	    //3.调用这个对象的方法来实现输出
		test.print();
	}
     @Test
     public void testExample() {
    	//1.通过spring的配置文件来创建一个对象
 		@SuppressWarnings("resource")
 		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
 	    //2.通过applicationContext对象的方法取获得配置文件的bean
 		SpringTest test1=(SpringTest)ctx.getBean("testExample");
 		SpringTest test2=(SpringTest)ctx.getBean("testE");
 	    //3.调用这个对象的方法来实现输出
 		test1.print();
 		test2.print();
     }
     @Test
     public void testE() {
    	//1.通过spring的配置文件来创建一个对象
  		@SuppressWarnings("resource")
  		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
  	    //2.通过applicationContext对象的方法取获得配置文件的bean
  		SpringTest test1=(SpringTest)ctx.getBean("testExample01");
  		SpringTest test2=(SpringTest)ctx.getBean("testExample02");
  	    //3.调用这个对象的方法来实现输出
  		test1.print();
  		test2.print();
     }
}
