package day2019228;

import java.util.Arrays;

/**
 * 
 * @author 40272
 *ʹ��array������
 */
public class ArrayDemo03 {
	public static void main(String[] args) {
		int[] arr = {24,13,69,80,57};
		System.out.println(Arrays.toString(arr));//������ת���ַ���
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//��������
		
		System.out.println(Arrays.binarySearch(arr, 24));//���ֲ���
	
	}
}
