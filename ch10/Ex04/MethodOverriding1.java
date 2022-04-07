package ch10.Ex04;
//메소드 오버라이딩
class Animal{
	void cry() {	}
}
class Bird extends Animal{
	@Override
	void cry() {
		System.out.println("짹짹");
	}
}
class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("야옹");
	}
}
class Dog extends Animal{
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}
public class MethodOverriding1 {

	public static void main(String[] args) {
		//1 각각의 타입으로 선언, 각각의 타입으로 생성
		Animal aa=new Animal();
		Bird bb=new Bird();
		Cat cc=new Cat();
		Dog dd=new Dog();
//		aa.cry(); //animal class cry()
		bb.cry(); //bird class cry()
		cc.cry(); //cat class cry()
		dd.cry(); //dog class cry()
		System.out.println("====");
		
		//2 animal 타입으로 선언, 자식 타입으로 생성: 동적 바인딩에 의해서 
		//부모의 cry()를 호출할 경우 자식의 오버로딩된 메소드로 바인딩됨
		Animal ab=new Bird(); //ab는 animal,bird 타입을 내포. animal의 필드와 메소드 접근 가능
		Animal ac=new Cat(); //ac는 animal,cat 타입을 내포. animal의 필드와 메소드 접근 가능
		Animal ad=new Dog(); //ad는 animal,dog 타입을 내포. animal의 필드와 메소드 접근 가능
		
		ab.cry();//animal cry()를 호출할 경우 동적 바인딩에 의해서 bird cry()를 호출한다
		ac.cry();//animal cry()를 호출할 경우 동적 바인딩에 의해서 cat cry()를 호출한다
		ad.cry();//animal cry()를 호출할 경우 동적 바인딩에 의해서 dog cry()를 호출한다
		System.out.println("====");
		
		//3 객체 배열로 관리
		Animal[] animal= {ab,ac,ad};
		//객체 타입[] 배열 이름 = {객체, 객체, 객체};
		
		for (Animal k : animal) {
			k.cry();
		}
		for (int i = 0; i < animal.length; i++) {
			animal[i].cry();
		}
	}

}
