package learnprogress;
/*
����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
˼·��
	��ͷ��ʼ���������αȽ�Ԫ�أ�ֻҪ�ҵ��ˣ��ͷ��ظô���������
*/

public class ArrayTest {
	public static void main(String[] args) {
		//����һ������
		 int[] arr = {12,29,86,79,43};
		 //д����ʵ��
		 int index = getIndex(arr,79);
		 System.out.println("79�������е������ǣ�"+index);
		 int index2 = getIndex(arr, 179);
		 System.out.println("179�������е������ǣ�"+index2);
				 
		 
	}
	public static int getIndex(int[] arr,int key) {
		int index = -1;
		for(int x=0;x<arr.length;x++){
			if(arr[x] == key){
				index = x;
				break;
			}
		}
		return index;
	}
}
