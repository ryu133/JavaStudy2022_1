package ch18.Ex02;

//람다식 문법

@FunctionalInterface //함수형 인터페이스 선언
interface A{
	void method1();
}

@FunctionalInterface
interface B{
	void method2(int a);
}

@FunctionalInterface
interface C{
	int method3();
}

@FunctionalInterface
interface D{
	double method4(int a, int b);
}

public class FunctionToLamdaExpression {
	public static void main(String[] args) {
		//인터페이스의 구현되지 않은 함수를 구현 ==> 람다식
		//1 입력x, 리턴x
		//1-1 익명 이너클래스로 처리
		A a1=new A() {@Override public void method1() {System.out.println("a1 method1");}};
		a1.method1();
		//1-2 람다식으로 처리
			//람다식은 리턴 타입,메소드명이 사라짐 
			//(인풋) -> {구현부;};
		A a2=()->{System.out.println("a2 method1");}; //전체
		A a3=()->System.out.println("a3 method1"); //구현부의 코드가 한 줄일 경우 {}; 생략 가능
		a2.method1();
		a3.method1();

		//2 입력o, 리턴x
		//2-1 익명 내부클래스로 처리
		B b1=new B() {@Override public void method2(int a) {System.out.println("b1 method2 "+a);}}; 
		b1.method2(0);
		//2-2 람다식으로 처리
		B b2=(int a)->{System.out.println("b2 method2 "+a);}; //전체 구문
		//축약된 구문(매개변수 타입, 매개변수가 하나일 경우 (),구현부의 코드가 한 줄일 경우 {}; 생략 가능)
		B b3= a -> System.out.println("b2 method2 "+a); 
		
		b2.method2(0);
		b3.method2(0);
		
		//3 입력x, 리턴o
		//3-1 익명 내부클래스
		C c1=new C() {
			
			@Override
			public int method3() {
				
				return 4;
			}
		};
		System.out.println(c1.method3());
		//3-2 람다식으로 처리
		C c2=() ->{return 4;}; //전체 구문
		C c3=() -> 6; //리턴의 코드가 한줄인 경우 return 생략 가능, 반드시 중괄호와 함께 생락
		System.out.println("c2 method3 돌려받은 값은 "+c2.method3());
		System.out.println("c2 method3 돌려받은 값은 "+c3.method3());
		
		//4 입력o, 리턴o
		//4-1 익명 이너클래스
		D d1=new D() {@Override public double method4(int a, int b) {return a+b;}};
		System.out.println("d1 method4 두 수의 합은 "+d1.method4(1, 3));
		//4-2 람다식
		D d2=(int a, int b) -> {return a+b;}; //전체 구문
		D d3=(a, b) -> a+b; //축약 구문 (매개변수 타입,리턴이 한 줄일 경우 return과 함께 {}; 생략 가능 )
		
		System.out.println("d2 method4 두 수의 합은 "+d2.method4(3, 2));
		System.out.println("d2 method4 두 수의 합은 "+d3.method4(5, 1));
		
	}
}
	
