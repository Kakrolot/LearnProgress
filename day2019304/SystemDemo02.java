package day2019304;

import java.util.Arrays;

/**
 * 
 * @author 40272
 *
 */
public class SystemDemo02 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};
		
		System.arraycopy(arr, 1, arr2, 2, 2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}

}
