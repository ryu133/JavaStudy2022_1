package ch10.Ex05;
class A{
	A(){} //기본 생성자: 클래스 내의 다른 생성자가 존재하지 않을 경우 생략 가능
	//인스턴스 메소드 오버라이딩: 상속 관계에서 메소드 오버라이딩은 인스턴스 메소드만 오버라이딩 된다.
	//상속관계에서 인스턴스 필드, 스택 필드, 스택 메소드는 오버라이딩되지 않는다
	//오버라이딩할 때는 시그니쳐(식별자)가 같아야 한다. 리턴타입, 메소드명, 매개변수 타입, 매개변수 개수
	void print() {
		System.out.println("class A");
	}
}
class B extends A{
	@Override
	void print() {
		System.out.println("class B");
	}
}
class C extends A{
	@Override
	void print() {
		System.out.println("class C");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		//1 A 타입 A 생성자 
		A a=new A();
		a.print();
		//2 B 타입 B 생성자
		B b=new B();
		b.print();
		//3 C 타입 C 생성자
		C c=new C();
		c.print();
		//4 A 타입 B 생성자(오버라이딩으로 A의 print() 호출 시 B의 print() 출력됨 
		A ab=new B();
		ab.print(); //A 메소드 호출 ==> B 메소드 출력
		//5 A 타입 C 생성자(오버라이딩으로 A의 print() 호출 시 C의 print() 출력됨
		A ac=new C();
		ac.print();
		
		System.out.println("========");
		A[] arr= {ab,ac}; 
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].print();
		}
		System.out.println("========");
		for (A k : arr) {
			k.print();
		}
		
	}
}
