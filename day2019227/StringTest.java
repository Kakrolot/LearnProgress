package day2019227;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 40272
 * ģ���½�������λ��ᣬ����ʾ���м���
 * ����:
 *      A:�����̶����û���������
 *      B:����¼���û���������
 *      C:�Ƚ��û���������
 *      D:�������λ���
 */
public class StringTest {
	public static void main(String[] args) {
		//�����̶����û���������
		//String username = "admin";
		//String password = "admin";
		
		for(int x = 0; x < 3; x++){
			//x = 0,1,2
			
			//����¼����������
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û���:");
			String name = sc.nextLine();
			System.out.println("����������:");
			String pwd = sc.nextLine();
			
			
			//�Ƚ��û���������
			if("admin".equals(name)&&"admin".equals(pwd)){
				System.out.println("��½�ɹ�");
				break;
			}else {
				if(2-x == 0){
					System.out.println("�˺ű�����������೤��ϵ");
				}else {
					System.out.println("��½ʧ�ܣ��㻹��"+(2 - x)+"�λ���");
				}
			}
			
			
		}
	}

}
