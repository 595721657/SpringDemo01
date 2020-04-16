import org.junit.jupiter.api.Test;

import Aop.Agency;

class TestLand {

	@Test
	void test() {
		//创建一个代理对象
		Agency agency=new Agency();
		//调用代理的方法
		agency.Agencytenement();
	}

}
