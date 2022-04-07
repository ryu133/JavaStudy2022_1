package ch13.Ex07.Ex1;

//2 인터페이스의 추상 메소드를 구현한 익명 내부클래스를 만들어 호출: 한번만 사용하는 경우

interface A{ //인터페이스 , 추상 메소드를 정의
	void cry(); //추상 메소드 (public abstract)
	void fly();
}
class B{ 
	A a=new A() { //인터페이스는 객체화할 수 없지만 익명 내부 클래스를 생성해서 구현 가능
		//A 인터페이스를 구현한 자식 클래스 블락: 클래스 이름이 없다(컴파일러가 랜덤한 이름으로 자동 할당함)
		@Override
		public void cry() {
			System.out.println("왈왈");
		}
		@Override
		public void fly() {
			System.out.println("암냠냠");
		}
	}; 
	void abc() {
		a.cry();
		a.fly();
	}
	
}
public class AnonymousClass2_1 {
	public static void main(String[] args) {
		B b=new B();
		b.abc();
	}
}
