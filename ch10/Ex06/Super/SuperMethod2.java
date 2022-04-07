package ch10.Ex06.Super;

//자식 객체를 생성할 때 부모 클래스의 기본 생성자를 먼저 호출. super() 
//모든 자식 객체의 생성자에는 super() 생략되어 있음

class A{
	A(){
		System.out.println("A class 기본 생성자");
	}
	A(int a){
		System.out.println("A class 정수 1개 생성자 "+a);
	}
	A(int a,int b){
		System.out.println("A class 정수 2개 생성자 "+a+", "+b);
	}
}
class B extends A{
	B(){
//		super();
		System.out.println("B class 기본 생성자");
	}
	B(String a){
		super(3, 5);
		System.out.println("B class 문자열 1개 생성자 "+a);
	}
}
class C extends B{
	C(){
		super("c에서 호출");
		System.out.println("C class 기본 생성자");
	}
}
public class SuperMethod2 {
	public static void main(String[] args) {
		C c=new C();
		
	}
}
