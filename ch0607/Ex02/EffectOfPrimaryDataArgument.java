package ch0607.Ex02;

public class EffectOfPrimaryDataArgument {
	int abc; //필드 (heap 영역에 저장됨). 객체화 필요
	static int twice(int a) {
		a=a*2;
		return a;
	}
	
	public static void main(String[] args) {
		int a=3; // 지역변수(stack 영역에 변수명과 값이 저장됨)
		int result1=twice(3);
		System.out.println(result1);
		System.out.println(a);
	}
}
