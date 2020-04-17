
public class SpringTest {
	  //有一个属性为name
      private String name;
      private String content;
      
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
      public SpringTest() {
		super();
	}

	public SpringTest(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}

	//显示name的值
	public void print() {
		System.out.println(name+"说："+content);
	}
}
