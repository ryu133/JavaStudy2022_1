package Ch11.Ex04;
//추상 클래스를 사용하지 않는 경우 
// 자식 클래스에서 메소드 오버라이딩 시 오버라이딩이 오타를 통해 잘못 구현될 수 있음
//
class Animal{
	void cry() {} 
}
class Cat extends Animal{
	void cRy() {
		System.out.println("야옹");
	}
}
class Dog extends Animal{
	void Cry() {
		System.out.println("멍멍");
	}
}
public class AbstractModifier2 {
	public static void main(String[] args) {
		Animal a1=new Cat();
		Animal a2=new Dog();

		a1.cry();
		a2.cry();
		
	}
}
