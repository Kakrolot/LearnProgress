package day2019305;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author 40272
 *ȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
 *�����¼��ϵķ�ʽ��
 *             A�����弯�ϣ��洢���ظ���Ԫ��
 *             B:�����¼���
 *             C:�����ɼ��ϣ���ȡ���ɼ����е�ÿһ��Ԫ��
 *             D:�Ǿͼ��ϵ�ÿһ��Ԫ�ص��¼�����ȥ�ң�����û��
 *             �оͲ����
 *             û�о����
 *             E:�����¼���
 */
public class ArrayListTest {
	public static  void main(String[] args) {
		//���弯�ϣ��洢���ظ���Ԫ��
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("android");
		array.add("world");
		array.add("java");
		array.add("javaee");
		array.add("java");
		array.add("java");
		array.add("java");
		array.add("android");
		//�����¼���
		ArrayList<String> newArray = new ArrayList<String>();
		//�����ɼ��ϣ���ȡ���ɼ����е�ÿһ��Ԫ��
		for(int x=0;x<array.size();x++){
			String s = (String)array.get(x);
			//�Ǿɼ��ϵ�ÿһ��Ԫ�ص��¼�����ȥ�ң���û�У�û�о����
			if(!newArray.contains(s)){
				newArray.add(s);
			}
		}
		Iterator<String> it = newArray.iterator();
		while(it.hasNext()){
			String s = (String) it.next();
			System.out.println(s);
		}
		
	}

}
