package ch0607.Ex02;

import java.util.Arrays;

	
public class ArrayArgumentMethod {
	//static 있으면서 같은 클래스에 존재하는 메소드: 메소드 이름으로 호출 가능
	//다른 패키지에서 접근 가능하도록 설정: 접근 제어자(public, protected, default, private)
	//접근 제어자가 생략되어있으면 default 값을 가짐(같은 패키지 안에서 접근 가능)
	
	static void printArray(int[] a) { 
		
		System.out.println(Arrays.toString(a));
		//for문, for each 사용한 출력
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//배열을 매개변수로 가지는 메소드 호출
		int[] a=new int[] {1,2,3}; //배열변수를 선언하고 값을 넣은 후
		
		printArray(a); //배열변수를 메소드 호출 시 배열변수 입력
		
		printArray(new int[] {4,5,6,7,8});
		
//		printArray(1,2,3); //오류 발생
	}
}
