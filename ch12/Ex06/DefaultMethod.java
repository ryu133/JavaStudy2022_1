package ch12.Ex06;
//interface의 default 메소드: 인터페이스 내에서 구현부가 있는 메소드를 정의할 때 사용(자바 1.8 이후 새롭게 추가된 기능)
//기존의 구현되어있는 인터페이스에서 새로운 기능을 추가할 때 하위 클래스에서 재정의 필요없이 새로운 기능을 추가할 때 사용
	//public default void bcd(){}
//default 키워드를 넣어야함(접근 지정자 아님)

interface A{
	void abc(); //2005 생성 메소드. public abstract 생략됨. 구현부가 없는 추상 메소드
	
	default void bcd() { //2020 생성 메소드
		System.out.println("A interface bcd()");
	}
//	void ttt(); //상위 클래스에서 새로운 추상 메소드를 추가하면 상속된 모든 하위 클래스는 오류 발생
}
class B implements A{ //2005 생성 클래스
	public void abc() { 
		System.out.println("B class abc()");
	}
}
class C implements A{
	public void abc() {
		System.out.println("C class abc()");
	}
	public void bcd() { //default 메소드 오버라이딩 가능
		System.out.println("C class bcd()");
	}
}

public class DefaultMethod {
	public static void main(String[] args) {
		//객체 생성
		A a1=new B();
		A a2=new C();
		
		a1.abc();
		a1.bcd();
		a2.abc();
		a2.bcd();
	}
}
