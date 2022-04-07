package ch12.Ex07;
interface A{ //부모 인터페이스
	default void abc() { //인터페이스에서 구현부가 있는 메소드를 정의할 때 default 필요
		System.out.println("A interface abc()");
	}
}
class B implements A{ //extends Object 생략됨
	public void abc() { //overriding
		A.super.abc(); //super.abc();는 object 클래스의 abc()를 호출
		System.out.println("B class abc()");
	}
}
public class DefaultMethod2 {
	public static void main(String[] args) {
		B b=new B();
		b.abc(); //B class abc() 호출
		
		A a=new B(); //객체 생성은 불가, 타입은 가능
		a.abc();
	}
}
