package day2019306;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo {
	public static void main(String[] args) {
		//�������϶���
		ArrayList<Persion> array =new ArrayList<Persion>();
		//����Ԫ�ض���
	    Persion p1 = new Persion("�ܲ�",40);
	    Persion p2 = new Persion("����",37);
	    Persion p3 = new Persion("�����",24);
	    
	    //���Ԫ��
	    array.add(p1);
	    array.add(p2);
	    array.add(p3);
	    
	    //����
	    Collections.sort(array, new Comparator<Persion>() {

			@Override
			public int compare(Persion o1, Persion o2) {
				// TODO Auto-generated method stub
				return p2.getAge()-p1.getAge();
			}
		});
	    for(Persion p:array){
	    	System.out.println(p.getName()+"---"+p.getAge());
	    }
	}
	
	
	

}
