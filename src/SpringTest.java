
public class SpringTest {
	  //��һ������Ϊname
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
      //��ʾname��ֵ
	public void print() {
		System.out.println(name+"˵��"+content);
	}
}
