package ch05;

import java.util.Arrays;

public class Test0228_2 {

	public static void main(String[] args) {
//		배열 변수명 arr2[300]
//			0번째 방: 3, 1번째 방: 6, 2번째 방: 9 ~
//				for 문을 사용해서 3의 배수만 저장
//				출력: for, foreach, Arrays.toString, 홀수번방의 값만 출력 범위:100~300
		int[] arr2=new int[300];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=(3*i)+3; //(i+1)*3
			System.out.println(i+"번째 방의 값:"+arr2[i]);
		}
		
		System.out.println();
		
		for (int i : arr2) {
			System.out.println(i);
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(arr2));
		
		for (int i = 100; i < arr2.length; i++) {
			if (i%2==1) { //i%2!=0
				System.out.println(arr2[i]);
			}
		}

	}

}
