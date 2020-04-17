package day2.pojo;

public class User {
       private String name;
       private int age;
       private String address;
       private Teacher tec;      
	public Teacher getTec() {
		return tec;
	}
	public void setTec(Teacher tec) {
		this.tec = tec;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User(String name, int age, String address, Teacher tec) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.tec = tec;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + ", ��ʦ������=" + tec.getTname() + "]";
	}
}