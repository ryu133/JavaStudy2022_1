package ch18.Ex09;

interface A{
	B abc(); //리턴 타입이 B 객체
}

class B{
	B() {
		System.out.println("1");
	}
	B(int k){
		System.out.println("2");
	}
}

public class RefOfClassConstructor1 {
	public static void main(String[] args) {
		//1 클래스 생성자 참조
		//익명 이너클래스
		A a1=new A() {
			@Override
			public B abc() { //abc() 호출 시 B 객체의 기본 생성자 참조 (참조: 자신 이외에 다른 구현된 생성자나 메소드를 호출)
				return new B();
			}
		};
		
		//람다식 표현
		A a2=()->{return new B();}; //전체 구문
		A a3=()-> new B(); //축약 구문. return 제거 시 중괄호도 제거해야 함.
		
		//클래스 생성자 참조
		A a4=B::new;
		
		a1.abc();
		a2.abc();
		a3.abc();
		a4.abc();
		
		System.out.println("===============");
		
		
		
		
		
		
		
		
		
	}
}
