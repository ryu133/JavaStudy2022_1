package ch0607.Ex02;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {
	public static void main(String[] args) {
		//배열의 길이가 고정되지 않고 가변길이인 경우
		//1 method1(int...values) <<--가변길이를 처리하는 input 매개변수 설정
		method1(); //메소드 오버라이딩: 메소드명은 모두 동일. 매개변수의 타입, 개수에 따라 해당 메소드 호출
		System.out.println();
		method1(1,2);
		System.out.println();
		method1(1,2,3);
		System.out.println();
		method1(1,2,3,4);
		System.out.println();
		method1(1,2,3,4,5);
		
		method2("안녕","방가");
		method2("월","화","수","목","금","토","일");
		method2("토끼","호랑이","여루","곰");
		
	}
	
	static void method1(int...values) {
		System.out.println(values.length);
		System.out.println(Arrays.toString(values));
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		for (int i : values) {
			System.out.println(i);
		}
	}
	
	static void method2(String...values) { //valuse는 배열을 담는 변수
//		System.out.println(values.length);
		System.out.println(Arrays.toString(values));
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		for (String a : values) {
			System.out.println(a);
		}
		
	}
	
//	static void method1() {
//		System.out.print("매ㅐㄱ변수가 없ㅇ는 메소드 호출");
//	}
//	static void method1(int a, int b) {
//		System.out.print(a+", "+b);
//	}
//	static void method1(int a, int b, int c) {
//		System.out.print(a+", "+b+", "+c);
//	}
//	static void method1(int a, int b, int c, int d) {
//		System.out.print(a+", "+b+", "+c+", "+d);
//	}
//	static void method1(int a, int b, int c, int d, int e) {
//		System.out.print(a+", "+b+", "+c+", "+d+", "+e);
//	}
}
