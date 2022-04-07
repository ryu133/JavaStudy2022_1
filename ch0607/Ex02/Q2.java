package ch0607.Ex02;

import java.util.Iterator;
import java.util.Scanner;

public class Q2 {
	
	static void method(String...valuse){
		int sum=0; //들어온 정수를 함하는 변수
		double avg; //평균값을 저장하는 변수
		
		for (int i = 0; i < valuse.length; i++) {
			//sum=sum+valuse[i]; //valuse의 각 방의 값이 String 타입이므로 정수 타입으로 변환
//			sum=sum+Integer.parseInt(valuse[i]);
			//Integer.parseInt(String):숫자형 String 타입을 정수로 변한
			sum+=Integer.parseInt(valuse[i]);
		}
		avg=(double)sum/valuse.length; //형변환 반드시 필요
		System.out.println("임의의 정수 합계: "+sum);
		System.out.println("임의의 정수 평균: "+avg);
	}

	public static void main(String[] args) {
		//scanner로 임의의 정수 값을 받아서 합계와 평균을 출력
		Scanner scanner=new Scanner(System.in);
		System.out.println("정수 값을 입력하시오.");
		
		String num=scanner.nextLine(); //공백이 들어가므로 전체 정수 값을 String 으로 받음
		String[] array1=num.split(" "); //split: 구분자를 기준으로 글자를 잘라서 배열에 저장
		
		System.out.println("당신이 입력한 정수는 ");
		for (int i = 0; i < array1.length; i++) { //입력 값을 출력
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		method(array1); //가변길이 메소드 method를 호출하면서 매개변수로 array1을 넣어준다
		
	}

}
