package ch16.Ex12;
//제네릭 메소드의 상속: 일반 클래스 내의 제네릭 메소드

class Parent {
	//Number: Boolean,Charactor를 제외한 Wrapper 타입의 클래스가 올 수 있다(기본 자료형의 클래스)
	<T extends Number> void Print(T t) {
		System.out.println(t);
	}
}
class Child extends Parent{//제네릭 메소드 상속은 일반 상속과 같다
	
	
}

public class InheritanceGenerincmethod {
	public static void main(String[] args) {
		//부모 클래스의 제너릭 메소드 사용
		Parent p=new Parent();
		p.<Integer>Print(100);
		p.<Double>Print(4.33);
//		p.<String>Print("asdf"); //오류. Number 타입만 가능
		p.Print(300); //매개변수의 값으로 타입을 알 수 있는 경우 생략 가능
		
		//자식 클래스에서 제네릭 메소드 사용
		Child c=new Child();
		c.<Integer>Print(200);
		c.<Double>Print(200.1234);
		
		
	}
}
