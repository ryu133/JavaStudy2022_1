package ch18.Ex03;

import java.util.Scanner;

//1스캐너 사용 double 매개변수 입력 후 두 값을 +,-,*,/ (사칙연산) 구현해서 출력
//2 방법1 람다식
//3 방법2 인터페이스를 구현한 자식 객체를 사용
//4 방법3 익명 이너클래스
//5 arithmeticexception 처리: 0으로 나누면 예외 발생

@FunctionalInterface
interface ArithMetic{
	void arithMeticOpr(double a,double b);
}
class A implements ArithMetic{
	@Override
	public void arithMeticOpr(double a, double b) {
		System.out.println("자식 클래스 객체 사용\n+ : "+(a+b)+"\n- : "+(a-b)+"\n* : "+(a*b)+"\n/ : "+(a/b));
	}
}

public class ArithmeticOpperator {
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("첫 번째 정수 입력: ");
			double aa=scanner.nextDouble();
			System.out.println("두 번째 정수 입력: ");
			double bb=scanner.nextDouble();
			
			try {
				if (aa==0||bb==0) {
					throw new ArithmeticException();
				} 
				ArithMetic am= (a,b)-> System.out.println("람다식 사용\n+ : "+(a+b)+"\n- : "+(a-b)+"\n* : "+(a*b)+"\n/ : "+(a/b));
				am.arithMeticOpr(aa, bb);
				
				
				System.out.println();
				
				ArithMetic a=new A();
				a.arithMeticOpr(aa, bb);
				
				System.out.println();
				
				ArithMetic amc=new ArithMetic() {
					@Override
					public void arithMeticOpr(double a, double b) {
						System.out.println("익명 이너클래스 사용\n+ : "+(a+b)+"\n- : "+(a-b)+"\n* : "+(a*b)+"\n/ : "+(a/b));
					}
				};
				amc.arithMeticOpr(aa, bb);
			} catch (ArithmeticException e) {
				System.err.println("0을 넣을 수 없습니다.");
			}
			
			
			
		}
}
