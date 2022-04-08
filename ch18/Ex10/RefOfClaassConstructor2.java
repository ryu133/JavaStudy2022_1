package ch18.Ex10;

interface A{
	B abc(int k); //리턴 타입이 B 객체
}

class B{
	B() {
		System.out.println("1");
	}
	B(int k){
		System.out.println("2");
	}
}

public class RefOfClaassConstructor2 {
	public static void main(String[] args) {
		//1 클래스 생성자 참조
			//익명 이너클래스
			A a1=new A() {
				@Override
				public B abc(int k) { //abc() 호출 시 B 객체의 생성자 참조 (참조: 자신 이외에 다른 구현된 생성자나 메소드를 호출)
					return new B(3);
				}
			};
			
			//람다식 표현
			A a2=(int k)->{return new B(3);}; //전체 구문
			A a3=(k)-> new B(3); //축약 구문(약식 표현). return 제거 시 중괄호도 제거해야 함. 매개변수가 하나일 경우 자료형 생략 가능
			
			//클래스 생성자 참조
			A a4=B::new; //B의 2 생성자 호출
			
			a1.abc(3);
			a2.abc(3);
			a3.abc(3);
			a4.abc(3);
				
	}
}
