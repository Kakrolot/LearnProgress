package day2019304;
/**
 * 
 * @author 40272
 *System:System �����һЩ���õ����ֶκͷ����������ܱ�ʵ����
 *       public static void gc():��������������
 *       public static void exit(int status):��ֹ��ǰ�������е�Java
 *       ���������������״̬�룻���ݹ�������0��״̬���ʾ�쳣��ֹ��
 *       public static long currentTimeMills():�����Ժ���Ϊ��λ�ĵ�ǰ����
 *       
 *       public static void arraycopy(Object src,int stcPos,Object destPos,int length)
 *       
 */
public class SystemDemo {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++){
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("����ʱ:"+(end-start)+"����");
	}
}
