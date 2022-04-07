package ch13.Ex08.Ex1;
//3 메소드의 매개변수로 전달: 
// 3-1 객체 생성 후 매개변수로 전달(클래스명o, 참조변수o)
// 3-2 객체 생성 후 매개변수로 전달(클래스명o, 참조변수x)

interface A{ //인터페이스 , 추상 메소드를 정의
	void cry(); //추상 메소드, (public abstract)
	void fly();
}
class B implements A{ //B는 A인터페이스를 구현하는 클래스
	@Override
	public void cry() {System.out.println("멍멍: 매개변수 전달 후 출력");}
	@Override
	public void fly() {System.out.println("날지 않음: 매개변수 전달");}
}
class C{ //C 객체의 abc() 호출 시 A 타입을 매개변수로 받음
	void abc(A a) { //하위 자식 클래스가 매개변수로 들어올 경우 A 타입으로 자동 업캐스팅됨
		a.cry();
		a.fly();
	}
}
public class AnonymousClass3_1 {
	public static void main(String[] args) {
		//1 클래스가 존재 o + 참조변수 o
		C c=new C();
		A a=new B(); //B를 객체화해서 A타입으로 생성. a: 참조변수
		
		c.abc(a);
		
		System.out.println("=====================");
		
		//2 클래스가 존재 o + 참조변수 x
		c.abc(new B());
		
	}
}
