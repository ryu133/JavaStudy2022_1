package ch13.Ex09;
//4 인터페이스를 구현하는 클래스가 없는 경우, 메소드의 매개변수로 전달
interface A{
	void abc(); //public abstract
}
class C{
	void cde(A a) {
		a.abc();
	}
}
public class AnonymousClass4 {
	public static void main(String[] args) {
		C c=new C();
		//1 클래스 x (인터페이스를 구현하는 클래스가 없음)+참조변수 생성 o
		A a=new A() {//인터페이스를 구현하는 자식 익명 객체 생성 후 타입을 A로 지정한 참조변수 생성
			@Override
			public void abc() {
				System.out.println("클래스(x)+참조변수(o)");
			}
		};
		c.cde(a);//참조변수를 매개변수로 전달
		
		//2 클래스 x (인터페이스를 구현하는 클래스가 없음)+참조변수 x <<==제일 많이 사용(임시로 한번만 사용핳ㄸ)
		c.cde(new A () {
			@Override
			public void abc() {
				System.out.println("클래스(x)+참조변수(o)");
			}
			
		});
		
		}
		
	}

