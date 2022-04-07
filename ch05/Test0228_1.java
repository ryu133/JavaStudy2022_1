package ch05;

import java.util.Arrays;

public class Test0228_1 {

	public static void main(String[] args) {
//		배열변수명 arr1[100]
//			배열의 값: [0] 1  [1] 2  [2] 3 ~ [99] 100 
//			출력: for, 향상된 for, arrays.tostring()
		int[] arr1=new int[100];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=i+1;
			System.out.print(i+"번째 방:"+arr1[i]+" . ");
		}
		
		System.out.println();
		
		for (int i : arr1) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(arr1));
	}

}
