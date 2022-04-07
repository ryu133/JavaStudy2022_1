package ch03;

import java.util.Scanner;

public class Test0223 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수값을 입력하세요.");
		int a=sc.nextInt();
//		if(a%3==0) {
//			System.out.println("3의 배수입니다.");
//		}else {
//			System.out.println("3의 배수가 아닙니다.");
//		}
		System.out.println((a%3==0)?"3의 배수입니다.":"3의 배수가 아닙니다.");
	}

}
