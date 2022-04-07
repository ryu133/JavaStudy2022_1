package ch13.Ex10;
//이너인터페이스: 클래스 내부에 인터페이스가 선언, 외부 클래스 안에서 간단하게 사용할 목적으로 클래스 내부에 선언
// static이 자동으로 컴파일러에 의해서 생성 <<==주의

class A{
	interface B{ //static 생략됨
		void bcd();//public abstract
	}
}
//이너인터페이스를 구현한 클래스 C
class C implements A.B {  //A.B: A class의 이너인터페이스 B    //A,B: A와 B 인터페이스
	@Override
	public void bcd() {
		System.out.println("이너인터페이스를 구현한 클래스 C");
	}
	
}
public class InnerInterface1 {
	public static void main(String[] args) {
		
		C c=new C(); //자신의 메소드를 직접 호출
		c.bcd();
		
		//1 자식 객체를 직접 생성 후 출력(자식클래스가 구현된 경우)
		A.B ab=new C();//부모의 타입으로 업캐스팅 후 오버라이딩 함
		ab.bcd();
		
		//2 익명이너클래스로 출력(자식 클래스없이 출력)
		A.B b=new A.B() { //A.B: A 클래스 내부의 인터페이스 B
			@Override
			public void bcd() {
				System.out.println("익명이너클래스로 객체 생성 후 출력");
			}
		};
		b.bcd();
	}
}
