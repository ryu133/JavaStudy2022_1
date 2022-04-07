package ch14.Ex01;

import java.util.Scanner;

//Error: 프로그래머가 제어할 수 없는 부분. (os에서 발생하는 오류,h/w 오류 등등)
//Exception(예외): 프로그래머가 제어할 수 있는 부분 
	//예외가 발생되면 프로그램이 종료됨
	//예외가 발생되더라도 프로그램이 종료되지 않도록 처리(예외처리)

//ArithmeticException: 어떤 수를 0으로 나누면 발생하는 예외
	//컴퓨터는 어떤 수를 0으로 나눌 경우 계산 불가

public class CheckException1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("정수 하나를 입력>>");
		int a=scanner.nextInt();
		int b=10;
		
		try {
			System.out.println(b/a); //0을 입력시 오류
		} catch (ArithmeticException e) {
			//catch 블락: try 블락에서 오류가 발생될 경우 작동됨
			System.out.println("오류 발생. 0으로 나눌 수 없습니다. 다른 수를 입력하세요.");
		}finally {
			System.out.println("프로그램을 종료합니다.");
		}
		
	}
}
