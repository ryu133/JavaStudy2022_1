package ch18.Ex04;

//람다식의 활용
	//1 익명이너클래스를 활용하는 방법
	//2 메소드 참조(1 인스턴스 메소드 참조 2 정적 메소드 참조)
		//메소드 참조: 구현되어 있는 메소드를 참조
		//메소드 참조를 위해서는 리턴타입과 매개변수가 동일해야 함

interface A{
	void abc();
}

class B{
	void bcd() { //인스턴스 메소드: 객체화해야 호출 가능
		System.out.println(" method ");
	}
}

public class RefOfInstanceMethodType1 {
	public static void main(String[] args) {
		//1 인스턴스 메소드 참조 type 1    <= 익명 이너클래스
		A a1=new A() {
			@Override
			public void abc() {
				B b=new B();
				b.bcd();
			}
		};
		
		//2 위의 시나리오를 람다식으로 표현
		A a2=()->{
			B b=new B(); 
			b.bcd();
		};
		
		//3 인스턴스 참조 표현식 type 1
		B b=new B(); //인스턴스 객체를 생성, 객체명::메소드명;  
		A a3=b::bcd; //인스턴스 참조 표현 <<=조건: 리턴 타입이 같아야 함. 매개변수가 동일해야 함.
		
		a1.abc();
		a2.abc();
		a3.abc();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
