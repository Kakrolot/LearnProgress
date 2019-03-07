package day2019306;

import com.sun.xml.internal.bind.v2.runtime.NameList;

public class Persion implements Comparable<Persion>{
	private String name;
	private int age;
	public Persion() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Persion(String name,int age) {
		// TODO Auto-generated constructor stub
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
	public int compareTo(Persion o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
