package day2019228;
/**
 * 
 * @author 40272
 *查找元素：
 *基本查找，数组元素无序
 *二分查找，数组元素有序（折半查找）
 */
public class ArrayDemo02 {
	public static void main(String[] args) {
		int[] arr = {13,34,56,77,97};
		int index = getIndex(arr, 56);
		System.out.println(index);
		index = getIndex(arr, 13);
		System.out.println(index);
		
	}
	public static int getIndex(int[] arr,int value) {
		int minIndex = 0;
		int maxIndex = arr.length-1;
		int middleIndex = (minIndex+maxIndex)/2;
		
		while(value != arr[middleIndex]){
			if (value>arr[middleIndex]) {
				minIndex = middleIndex+1;
			}else if (value<arr[middleIndex]) {
				maxIndex = middleIndex-1;
			}
			if (maxIndex < minIndex) {
				return -1;		
			}
			middleIndex = (maxIndex+minIndex)/2;
				
		}
		return middleIndex;
	}
}
