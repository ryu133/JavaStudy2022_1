package Ch11.Ex05;

import ch10.Ex01.Animal;

//추상 클래스르르 사용해서 기능을 구현하는 경우
abstract class Aninal{
	abstract void cry(); //추상 메소드 : 선언만 되어있고 구현부가 없는 메소드
}
class Cat extends Aninal{
	@Override
	void cry() {
		System.out.println("야옹");
	}
}
class Dog extends Aninal{
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}
public class AbstractModifier3 {
	public static void main(String[] args) {
		Aninal a1=new Cat(); //추상 클래스는 타입으로 지정될 수 있따.
		Aninal a2=new Dog();
		
		a1.cry();
		a2.cry();
		
		//추상 클래스는 객체화할 수 없다
//		Aninal a3=new Animal(); 
	}
}
