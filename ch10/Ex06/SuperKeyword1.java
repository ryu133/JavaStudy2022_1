package ch10.Ex06;
//super: 부모 클래스(상속관계에서 부모)
//this: 자기 자신의 객체

//오버라이딩: 부모의 메소드가 완전히 삭게되지 않음
class A{
	void abc() {
		System.out.println("A class abc()");
	}
}
class B extends A{
	@Override
	void abc() {
		System.out.println("B class abc()");
	}
	void bcd() {
		abc(); //this. 생략됨 
		super.abc(); 
	}
}
public class SuperKeyword1 {
	public static void main(String[] args) {
		//객체 생성
		B bb=new B();
		//메소드 호출
		bb.bcd(); //B class abc()
		
	}
}
