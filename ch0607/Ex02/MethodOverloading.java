package ch0607.Ex02;

import java.security.PublicKey;

import kosmo.Print;

//메소드 오버로딩: 하나의 메소드 영역에 매개변수의 타입, 개수에 따라서 각각 다른 메소드가 호출됨 (Java)
//메소드 오버라이딩: 상속에서 부모 클래스의 메소드를 재정의해서 사용

class B{
	static String name="BTS"; //static 이 붙으면 객체 생성없이 호출 가능
	static void print() {
		System.out.println(name);
		System.out.println("static이 붙은 메서드");
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		//static: 객체 생성 없이 바로 호출해서 사용 가능하도록 함
		//객체 이름이 아니라 클래스 이름으로 호출해서 사용 가능
		
		System.out.println(B.name); //객체 이름이 아닌 클래스 이름으로 호출이 가능
		B.print(); 					//클래스 이름으로도 호출
		
		 print1(); //static이고 동일한 클래스에 생성된 메서드는 바로 호출 가능
		
		 print1(2); //매개변수가 1개이고 정수 타입의 메소드를 호출
		 print1(5.5); //매개변수가 1개이고 실수 타입의 메소드를 호출
		 print1(2,8); //매개변수가 2개이고 정수 타입의 메소드를 호출
		 
		}
		
	//메소드 오버라이딩: 메소드 이름은 동일. 매개변수 타입, 매개변수 개수에 따라 해당 메소드 호출
	//JVM이 동일한 메소드 이름의 데이터 타입이나 개수에 따라서 해당 메소드를 작동
	//주의! 매개변수의 타입과 개수가 같으면 오류 발생
	public static void print1() {
		System.out.println("데이터가 없습니다.");
	}
	public static void print1(int a) {
		System.out.println("정수: "+a);
	}
	public static void print1(double b) {
		System.out.println("실수: "+b);
	}
//	public static void print1(double k) { //동일한 데이터 타입과 개수라면 오류 발생
//		System.out.println("실수: "+k);
//	}
	public static void print1(int a, int b) {
		System.out.println("a: "+a+", b: "+b);
	}
	

}
