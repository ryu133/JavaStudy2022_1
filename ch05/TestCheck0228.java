package ch05;

import java.util.Arrays;

public class TestCheck0228 {

	public static void main(String[] args) {
		int[] arr1=new int[100];
		//for문을 사용해서 arr1배열의 각 방에 값을 입력
		for (int i = 0; i < arr1.length; i++) { //for문을 사용해서 배열 방에 값을 할당
			arr1[i]=i+1; //arr1[0~99]=i+1; 배열 변수에 값을 넣어준다
		}
		//출력구문 for
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(i+"번째 방의 값: "+arr1[i]);
		}
		System.out.println("=================");
		//for each
		for (int i : arr1) {
			System.out.println(i);
		}
		//Arrays.toString(arr1)
		System.out.println(Arrays.toString(arr1));
		
	}

}
