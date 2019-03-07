package day2019305;
/**
 * 
 * @author 40272
 *定义一个数组，存储三个学生对象，然后遍历该数组，得到每一个学生对象的成员变量值
 *
 *student[]  对象数组
 */
public class StudentDemo {
	public static void main(String[] args) {
		//创建数组对象
		Student[] students = new Student[3];
		
		//默认值是Null
		for(int x=0;x<students.length;x++){
			System.out.println(students[x]);
		}
		//创建学生对象元素
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
