package ch0607.Ex02;

public class A {
	//1 리턴 타입이 없는 메소드-void 메소드명(){실행코드}
	public void print() {
		System.out.println("안녕");
	}
	
	//2 리턴 타입이 있는 메소드-자료형 메소드명(){실행코드}
	public int data() {
		return 3; 
	}
	
	//3 리턴 타입: double
	public double sum(int a, double b) {
		return a+b;
	}
	
	//4 리턴 타입이 void + 메소드 내부에서 리턴을 포함: (함수 종료의 의미)
	public void printMethod(int m) {
		if (m<0||m>12) {
			System.out.println("잘못된 입력값입니다. 1~12까지만 입력이 가능합니다.");
			return ;//메소드 종료를 의미
		}System.out.println(m+"월입니다. ");
	}
	
}
