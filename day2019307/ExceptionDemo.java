package day2019307;
/**
 * 
 * @author 40272
 *java �д����쳣
 *A:try...catch... finally
 *B:throws
 *
 *try...catch...finally��ʽ
 *try{
 *        ���ܳ�������Ĵ���
 * }catch(�쳣���� ����){
 *        ��Ե�����
 * }finally{
 *        �ͷ���Դ�Ĵ���
 * }
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("hello");
		
		int a = 10;
		int b = 0;
		try{
			System.out.println(a/b);
		}catch(ArithmeticException e){
			System.out.println("��������Ϊ0");
		}
		
		System.out.println("world");
	}

}
