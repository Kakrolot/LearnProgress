package day2019305;
/**
 * 
 * @author 40272
 *����һ�����飬�洢����ѧ������Ȼ����������飬�õ�ÿһ��ѧ������ĳ�Ա����ֵ
 *
 *student[]  ��������
 */
public class StudentDemo {
	public static void main(String[] args) {
		//�����������
		Student[] students = new Student[3];
		
		//Ĭ��ֵ��Null
		for(int x=0;x<students.length;x++){
			System.out.println(students[x]);
		}
		//����ѧ������Ԫ��
		Student s1 = new Student("liuyi",21);
		Student s2 = new Student("yyf",22);
		Student s3 = new Student("longDD",33);
		
		students[1] = s1;
		students[0] = s2;
		students[2] = s3;
		
		for(int x=0;x<students.length;x++){
			Student s = students[x];
			System.out.println();
			System.out.println(s.getName()+"---"+s.getAge());
		}
		
		
	}
}
