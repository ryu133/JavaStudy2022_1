package ch10.Ex04;
//오버로딩과 오버라이딩
/* 메소드 오버로딩: 동일한 메소드 이름으로 매개변수 타입,개수에 따라 해당 메소드가 호출(상속 관련x)
 *	생성자에서 많이 사용됨
 * 
 * 메소드 오버라이딩: 반드시 상속 관계에서 사용
 * 	부모의 메소드를 자식에서 새롭게 정의해서 사용
 * 		1 상속관계 2 메소드의 시그니처가 같아야 함(메소드명, 매개변수 개수, 매개변수 타입)
 * 		3 자식에서 부모의 접근제어자와 같거나 더 넓은 범위여야 함
 * */

class Ab{
	void print1() { //overriding
		System.out.println("Ab클래스의 print1");
	}
	void print2() { //overloading
		System.out.println("Ab클래스의 print2");
	}
}
class Bc extends Ab{
	@Override
	void print1() {
		System.out.println("Bc class print1");
	}
	void print2(int a) { //overloading
		System.out.println("Bc class print2");
	}
}

public class OverloadingVsOverriging {
	public static void main(String[] args) {
		//Ab 타입 선언, Ab 타입 생성자 호출
		Ab aa=new Ab(); 
		aa.print1(); //Ab class print1
		aa.print2(); //Ab class print2
		
		//Bc 타입 선언, Bc 타입 생성자 호출
		Bc bb=new Bc();
		bb.print1(); //Bc class print1
		bb.print2(); //Ab class print2   부모
		bb.print2(2); //Bc class print2
		
		//Ab 타입 선언, Bc 타입 생성자 호출
		Ab cc=new Bc();
		cc.print1(); //오버라이딩됨. 동적 바인딩에 의해서 Bc print1 호출
		cc.print2(); //Ab 클래스만 호출 가능
		
	}
}
