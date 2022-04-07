package ch13.Ex03;
//정적이너클래스에서 외부클래스의 정적 필드나 정적 메소드는 접근 가능
class A{
	int a=3; //인스턴스 필드, 객체화 후 접근 가능
	static int b=4; //static 필드, 객체 생성없이 접근 가능&생성 후 접근 가능
	void method1() { //인스턴스 메소드: 객체 생성 후 접근 가능
		System.out.println("instance method");
	}
	static void method2() { //정적 메소드: 객체를 생성하지 않고 접근 가능&생성 후 접근 가능
		System.out.println("static method");
	}
	static class B{ //정적 이너 클래스: 외부 객체를 생성하지 않고 객체 생성 가능	
		void bcd() {
			//1 정적 클래스에서 외부 클래스의 인스턴스 필드 접근 불가
//			System.out.println(a); //a: 외부 클래스의 인스턴스 필드
			System.out.println(b); //static 이너클래스에서 외부클래스의 static 필드나 메소드 접근 가능
			//2 메소드 호출
//			method1(); //인스턴스 메소드 호출 불가
			method2(); //정적 메소드 호출 가능
			
		}
	}
}
public class InnerClass {
	public static void main(String[] args) {
		//static이너클래스 객체 생성
		A.B b=new A.B(); //정적이너클래스는 외부 객체 생성없이 객체 생성
		b.bcd();
		
		
//		이너클래스가 정적 클래스가 아닐 떄
//		A a=new A();//외부클래스 객체 생성 후
//		A.B b=a.new b();//이너클래스 객체 생성
		
	}
}
