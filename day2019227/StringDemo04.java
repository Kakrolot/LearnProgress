package day2019227;
/**
 * 
 * @author 40272
 *String��Ļ�ȡ����
 *int length():�����ַ����ĳ��ȡ��ַ��ĸ�����
 *char charAt(int index):�����ַ�����ָ��λ�õ��ַ�
 *int indexOf(int ch):����ָ���ַ����ַ����е�һ�γ��ֵ�λ�� 97��'a'
 *int indexOf(String str):����ָ���ַ������ַ�����һ�˳��ֵ�λ��
 *int indexOf(int ch,int fromIndex):����ָ���ַ���ָ��λ�ÿ�ʼ���ַ����е�һ�γ��ֵ�λ��
 *int indexOf(String str,int fromIndex):����ָ���ַ�����ָ��λ�ÿ�ʼ���ַ����е�һ�γ��ֵ�λ��
 *String substring(int start):���ش�ָ��λ�ÿ�ʼ��ĩβ���ִ�
 *String substring(int start,int end):���ش�ָ��λ�ÿ�ʼ��ָ��λ�ý������ִ�------ע������Ҳ���
 */
public class StringDemo04 {
	public static void main(String[] args) {
		String s = "helloworld";
		
		//int length():�����ַ������ȡ��ַ��ĸ�����
		System.out.println("length():"+s.length());
		System.out.println("--------------------");
		
		//char charAt(int index):�����ַ�����ָ��λ�õ��ַ�
		System.out.println("charAt():"+s.charAt(0));
		System.out.println("charAt():"+s.charAt(3));
		System.out.println("---------------------");
		
		//int indexOf(int ch):����ָ���ַ����ַ����е�һ�γ��ֵ�λ��
		System.out.println("indexOf():"+s.indexOf('1'));
		//int indexOf(int ch,int fromIndex):����ָ���ַ���ָ��λ�ÿ�ʼ���ַ����е�һ�γ��ֵ�λ��
		System.out.println("indexOf():"+s.indexOf('1',4));
		
		//String substring(int start,int end):����ָ��λ�ÿ�ʼ��ָ��λ�ý������ִ�
		System.out.println("substring():"+s.substring(2,5));
	}

}
