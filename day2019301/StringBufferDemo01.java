package day2019301;

import sun.security.acl.WorldGroupImpl;

/**
 * 
 * @author 40272
 *��ӹ��� :
 *public StringBuffer append(String str):׷�����ݣ������еĺ���
 *public StringBuffer insert(int offset,String str):�������ݣ���ָ��λ�����
 *
 *ɾ������:
 *public StringBuffer deleteCharAt(int index):ɾ��ָ��λ�õ��ַ�
 *public StringBuffer deleteCharAt(int start,int end):ɾ����ָ��Ϊֵ������λ�õ�����
 *
 *�������:
 *public StringBuffer replace(int start,int end,String str):�ø������ַ����滻��ָ��λ�ÿ�ʼ��ָ��λ�ý���������
 *
 *��ȡ����:����ֵ������String ���ͣ�����û�з����ı�
 *public String substring(int start):��ָ��λ�ÿ�ʼ��ĩβ
 *public String substring(int start, int end):��ָ��λ�ÿ�ʼ��ָ��λ�ý���
 */

public class StringBufferDemo01 {
	public static void main(String[] args) {
		//�����ַ�������������
		StringBuffer sb = new StringBuffer();
		
		sb.append("hello").append("world").append("java");
		System.out.println(sb);
		sb.insert(5, "ggsimida");
		System.out.println(sb);
		sb.delete(1, 2);
		System.out.println(sb);
		sb.replace(1, 2, "aa");
		System.out.println(sb);
		String s = sb.substring(1,5);
		System.out.println(s);
		
	}

}
