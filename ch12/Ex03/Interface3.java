package ch12.Ex03;

interface A {}
interface B {}

//1 단일 인터페이스 상속
class C implements A {} //C 클래스는 A 인터페이스를 구현(상속)
//2 다중 인터페이스 상속
class D implements A,B {} //D 클래스는 다중 구현(상속) 가능
//3 클래스와 인터페이스 상속 (extends와 implements의 순서는 고정)
	//extends: 동일한 타입 상속 / implements: 다른 타입 상속
	//클래스 다중 상속 불가 , 인터페이스 다중 상속 가능
class E extends C implements A,B {} 
public class Interface3 {
	public static void main(String[] args) {
		
	}
}
