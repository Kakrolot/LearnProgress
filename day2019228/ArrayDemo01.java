package day2019228;
/*
 * ð������
 */
public class ArrayDemo01 {
	public static void main(String[] args) {
		//��������
		int[] arr = {24,69,80,57,13};
		bubbleSort(arr);//ð������
		printArray(arr);//��������
		
		
	}
	public static void printArray(int[] arr) {
		System.out.println("[");
		for(int x = 0;x < arr.length;x++)
			if (x==arr.length-1) {
				System.out.println(arr[x]);
			}else {
				System.out.println(arr[x]+" ");
			}
		System.out.println("]");
		
	}
	public static void bubbleSort(int[] arr) {
		for(int x = 0;x<arr.length-1;x++){
			for(int y = 0;y <arr.length-1-x;y++){
				if(arr[y]>arr[y+1]){
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
				}
			}
		}
	}

}
