package ch13.Ex06.Ex1;

//1 인터페이스의 추상 메소드를 구현한 클래스를 만들어 호출: 빈번하게 사용하는 경우

interface A{ //인터페이스 , 추상 메소드를 정의
	void cry(); //추상 메소드, (public abstract)
	void fly();
}
class B{
	A a=new C();
	void abc() {
		a.cry();
		a.fly();
	}
	class C implements A{ //class C는 A 인터페이스의 메소드를 구현한 클래스
		@Override
		public void cry() {
			System.out.println("멍멍");
		}
		@Override
		public void fly() {
			System.out.println("못 날아");
		}
	}
}
public class AnonymousClass1 {
	public static void main(String[] args) {
		B b=new B();
		b.abc();
	}
}
