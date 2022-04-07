package ch16.Ex09;

import ch0607.Ex05.ExternalAbc;

//generic method의 범위 지정

class A{ //일반 클래스 내의 제너릭 메소드
	
	//Number: boolean,char를 제외한 6개의 기본 자료형 타입을 의미함
	public <T extends Number> void method1(T t) {
		System.out.println(t.intValue()); //number 타입의 메소드 , 정수만 출력됨 
	}
}
interface MyInterface{
	void print(); //public abstract 생략됨
}
class B{ //제네릭 타입 내부에서 인터페이스를 적용할 때는 extends 키를 사용한다
	public <T extends MyInterface> void method2(T t) {
		//T t(타입): 상속된 인터페이스를 구현한 클래스만 올 수 있다
		t.print(); 
	}
}
class C implements MyInterface{ //인터페이스를 구현한 클래스
	@Override
	public void print() {
		System.out.println("인터페이스를 구현한 클래스 - 출력");
	}
}
class D{
	public <T extends String>void abc(T t){
		System.out.println(t); //string은 tostring() 재정의 되어있음
		System.out.println(t.toString());
	}
}

public class BoundedTypeOfGenericMethod {
	public static void main(String[] args) {
		A a=new A();//일반 클래스 객체 생성 후 제너릭 메소드 호출
		a.<Double>method1(5.8);
		a.method1(22.5); //매개변수로 타입을 식별할 수 있는 경우 생략 가능
		a.<Long>method1(100000L);
		a.<Float>method1(100.12345F);
//		a.<Boolean>method1(true); //number 타입이 아니므로 오류
		
		B b=new B();
		//method2의 매개변수로 인터페이스와 인터페이스를 구현한 클래스가 올 수 있다 
		b.<MyInterface> method2(new MyInterface() {
			//인터페이스를 구현한 내부 익명 클래스 
			@Override
			public void print() {
				System.out.println("print() 익명 클래스로 출력");
			}
		});
		b.<MyInterface> method2(new C());
		
		//익명 클래스로 제네릭 메소드를 호출 후 매개변수
		b.method2(new MyInterface() {
			
			@Override
			public void print() {
				System.out.println("익명으로 처리된 클래스 출력");
			}
		});
		
		D d=new D();
		d.<String>abc("안녕");
		d.abc("하세요");
		
	}
	
}
