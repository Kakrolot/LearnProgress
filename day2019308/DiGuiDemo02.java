package day2019308;
//�ݹ���Ҫ����һ������
public class DiGuiDemo02 {
	public static void main(String[] args) {
		System.out.println("5�Ľ׳���:"+jc(5));
	}
	public static int jc(int n) {
		if(n==1){
			return 1;//1���ǳ���
		}else {
			return n*jc(n-1);
		}
		
	}
}
