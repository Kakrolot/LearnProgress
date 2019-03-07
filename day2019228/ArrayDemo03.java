package day2019228;

import java.util.Arrays;

/**
 * 
 * @author 40272
 *使用array工具类
 */
public class ArrayDemo03 {
	public static void main(String[] args) {
		int[] arr = {24,13,69,80,57};
		System.out.println(Arrays.toString(arr));//把数组转成字符串
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//快速排序
		
		System.out.println(Arrays.binarySearch(arr, 24));//二分查找
	
	}
}
