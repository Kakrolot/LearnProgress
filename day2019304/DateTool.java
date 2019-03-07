package day2019304;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 
 * @author 40272
 *��һ�´ӳ��������ھ����˶�����
 *����:
 *    A:����¼����ĳ���������
 *    B:������ַ���ת��Ϊһ������
 *    C:ͨ�����ڻ�ȡ��һ������ֵ
 *    D:��ȡ��ǰʱ��ĺ���ֵ
 *    E:��D-c�ĵ�һ������ֵ
 *    F:��E�õ��ĺ���ֵ�����һ���켴��
 */
public class DateTool {
	public static void main(String[] args) throws ParseException {
		//����¼�����������
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ĳ�������:(yyyy-mm-dd)");
		String s = sc.nextLine();
		
		//������ַ�ת����Ϊһ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date d = sdf.parse(s);
		
		//ͨ�����ڻ�ȡ��һ������ֵ
		long myTime = d.getTime();
		
		//��ȡ��ǰʱ��ĺ���ֵ
		long nowTime = System.currentTimeMillis();
		
		//��D-C�õ�һ������ֵ
		long dateTIme = nowTime-myTime;
		
		//���õ��ĺ���ֵת��Ϊ��
		System.out.println("����������������Ѿ���:"+(dateTIme/1000/60/60/24)+"����");
	}

}
