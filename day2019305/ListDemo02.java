package day2019305;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo02 {
	public static void main(String[] args) {
		//�������϶���
		List list = new ArrayList();
		Student s1 = new Student("���¸�",2);
		Student s2 = new Student("����",18);
		
		list.add(s1);
		list.add(s2);
		
		//��������
		Iterator it = list.iterator();
		while(it.hasNext()){
			Student s = (Student)it.next();	
			System.out.println(s.getName()+"----"+s.getAge());
		}
	}
}
