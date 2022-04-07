package ch05;

import java.util.Arrays;

public class ReadArrayData_Ex05 {

	public static void main(String[] args) {
		int[] array=new int[] {3,4,5,6,7};
		//배열 방(index)의 길이 ㅣ구하기
		System.out.println(array.length); //방의 개수를 출력. 5
		
		//출력하기1. 방 번호를 직접 찍어서 출력. 특정 방 번호의 값을 출력
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
//		System.out.println(array[5]); //ArrayIndexOytOfBoundsException, 방 번호를 초과한 경우 출력 시 오류
		
		System.out.println();
		
		//출력하기2. for문을 사용하여 특정 범위를 지정해서 출력
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		for (int i = 1; i < 3 ; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		
		//출력하기3. 향상된 for문. 처음 방부터 마지막 방까지 순환하면서 출력. 범위를 지정해서 출력할 수 없다.
		for (int i : array) { //for(출력할 자료형 변수 : 배열){실행구문}
			System.out.print(i+" ");
		}
		System.out.println();
		
		//출력하기4. Arrays.toString(배열변수명) 배열 변수의 모든 값을 출력
		System.out.println(Arrays.toString(array));
		
	}

}
