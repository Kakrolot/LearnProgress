package day2019305;
//创建学生类
public class Student {
	private String name;
	private int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Student(String name,int age){
		super();
		this.age = age;
		this.name = name;	
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student[name="+name+",age="+age+"]";
	}

}
