package ch0607.Ex01;

//class: 설계도, 객체를 생성하기 위한 틀(템플릿)
//객체(Object): 클래스를 복사해서 메모리에서 작동되는 실행코드(집, 차)
//	객체=인스턴스
//인스턴스(객체)화 시킨다. (메인 메서드에서 해야함) ==> A a =new A(); //클래스를 객체화 시켜서 메모리에 로드
		
class A{ //외부 클래스
	int m=3; // 필드(변수): 클래스 블럭에서 선언된 변수를 필드라 호칭
	//필드는 인스턴스화 시켜야 사용 가능. 필드는 메모리의 힙 영역에 생성됨.
	void print() { //메서드: 절차지향언어의 함수. 객체지향언어에서 함수를 메서드라 호칭
		System.out.println("객체 생성 및 활용");
	}
}
class B{//외부 클래스
	String name="홍길동";
	int age=24;
	String phone="010-1111-1111";
	void printName() {
		System.out.println(name);
	}
	void printAge() {
		System.out.println(age);
	}
	void printPhone() {
		System.out.println(phone);
	}
}

public class CreatObjectAndUsinngOfMember { //public class는 하나만 존재함. 파일이름==퍼블릭클래스명
	public static void main(String[] args) {
		A a=new A(); //Class A를 객체화(인스턴스화) 시킨다. RAM에 로드시킨다. 
		System.out.println(a.m);
		a.print();
		
		A b=new A(); //Class A를 객체화 시킴 ~생략~
		System.out.println(b.m);
		b.print();
		
		A c=new A();
		System.out.println(c.m);
		c.print();
		
		
		B d=new B(); //B Class를 d라는 이름으로 객체화 시킨다.
		d.printName(); //d객체의 메서드 호출
		d.printAge();
		d.printPhone();
		
		B e=new B();
		e.printName();
		e.printAge();
		e.printPhone();
	}
}
