package learnprogress;
/*
�ҹ����ɽ������������壺8848m����������һ���㹻���ֽ�ţ����Ϊ��0.01m��
���ʣ����۵����ٴΣ��Ϳ��Ա�֤��Ȳ��������������ĸ߶�?
������
	A:��ʼ������
		�ҹ����ɽ������������壺8848m����������һ���㹻���ֽ�ţ����Ϊ��0.01m��
	B:ͳ�Ʊ���
		���۵����ٴ�
	C:�ж�����
		ֽ�ź��<=8848
	D:�仯������
		ֽ�ź��ÿ�۵�һ������ǰ��2��
*/
public interface WhileTest {
	public static void main(String[] args) {
		//��ʼ����
		int end = 884800;
		int start = 1;
		
		//����ͳ�Ʊ���
		int count = 0;
		
		//whileѭ��
		while(start<=end){
			count++;
			//start = start*2;
			start *= 2;
		
		}
		System.out.println("�۵�������Ҫ��"+count+"��");
	}

}
