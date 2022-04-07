package ch04;

import java.util.Iterator;

public class For_Ex03 {

	public static void main(String[] args) {
		int a; //블락 밖에서 선언된 변수(전역변수), 선언(0), 초기값(x)
		for (a = 0; a < 5; a++) {
			System.out.print(a+" ");
		}
		System.out.println("\n블락 밖에서 출력한 값 "+a);
		System.out.println("=======");
		for (int b = 0; b <= 10; b++) {
			System.out.println(b);
		}
		System.out.println("==========");
		int c;
		for (c = 10; c > 0; c--) {
			System.out.println(c);
		}
		
		//2의 배수
		for (int i = 0; i < 100; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println("");
		//for문 안에서 초기값과 증가값은 여러 변수를 할당할 수 있다.
		for (int i = 0, j=0; i < 10; i++,j++) {
			System.out.println(i+"*"+j+": "+(i*j));
		}
		
		//for문을 사용하여 1부터 10까지 곱한 값 출력하기
		for (int i = 1,j=1; i <= 10; i++) {
			j*=i;
			System.out.println(j);
		}
		//for문을 사용하여 1부터 100까지 더한 값 출력하기
		for (int i = 1,j=0; i <= 100; i++) {
			j+=i;
			System.out.println(j);
		}
		
		//이중 for문을 사용하여 구구단 출력
		for (int i = 1; i < 10; i++) { //i는 단
			for (int j = 1; j < 10; j++) {
				System.out.println(i+"*"+j+" = "+(i*j));
			}System.out.println("=========");
		}
		
		//for문에서 무한루프. 조건이 없을 경우, 초기값과 증가값이 없을 경우
//		for (int i = 0;  ; i++) {
//			System.out.print(i+" ");
//		}
//		for ( ; ; ) {
//			System.out.println("무한루프");	
//		}
		
		//무한루프 탈출
		for (int i = 0; ; i++) {
			if(i>100)break;
			System.out.println(i);
		}
		
		//for문을 사용하여 1부터 1000까지 4의 배수만 더한 값 구하기.  평균값:double
		double j=0;
		for (int i = 1; i<=1000; i++) {
			if(i%4==0)j+=i;
		}
		System.out.println("총합: "+j);
		System.out.println("평균값: "+(j/(1000/4)));
		
	}

}
