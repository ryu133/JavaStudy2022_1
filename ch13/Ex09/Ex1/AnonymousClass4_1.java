package ch13.Ex09.Ex1;

interface A{
	void cry();
	void fly();
}
class C{
	void abc(A a) {
		a.cry();
		a.fly();
	}
}
public class AnonymousClass4_1 {
	public static void main(String[] args) {
		C c=new C();
		//1 구현하는 클래스 없음, 참조변수 o
		A a=new A(){ //참조변수 a 생성
			@Override
			public void fly() {
				System.out.println("fly");				
			}
			@Override
			public void cry() {
				System.out.println("cry");
			}
		};
		c.abc(a);
		
		
		
		//2 구현하는 클래스 없음, 참조변수 x  (많이 쓰는 방법)
		c.abc(new A() {
			@Override
			public void fly() {
				System.out.println("fly");				
			}
			@Override
			public void cry() {
				System.out.println("cry");
			}
		});
		
	}
}
