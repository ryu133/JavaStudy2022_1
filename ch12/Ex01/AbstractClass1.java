package ch12.Ex01;



class AA{ //일반 클래스 : 객체 생성 시 필드와 메소드는 힙 메모리에 저장
			//heap: 반드시 초기화됨
			//필드는 힙에 필드명과 값
			//인스턴스 메소드: 클래스 영역의 인스턴스 영역에 메소드의 구현코드까지 저장
			//힙에는 포인터 정보만 가진다
	int a;
	double b;
	char c;
	boolean d;
	byte e;
	float f;
	String g; //참조변수 
	
	void cry() {} 
	@Override
		public String toString() {
			return a+", "+b+" ,"+c+", "+d+", "+e+", "+f+", "+g;
		}
}
//추상 클래스를 객체화하는 방법 1
// 상속을 통해서 자식 클래스를 생성 후 자식 클래스에서 재정의하고 자식클래스를 객체로 생성
// 많은 객체를 생성할 때 사용함

//추상 클래스를 객체화하는 방법 2
// 상속 없이 main 메소드에서 익명 객체를 생성
// 임시로 한번만 사용할 때 사용함(이벤트)
abstract class A{ //추상 클래스 : 미완성 메소드를 포함하므로 객체 생성이 불가함
	abstract void abc(); //추상 메소드(미완성 메소드) : 구현부가 존재하지 않는 메소드
}

class B extends A{ //추상 클래스를 구현한 객체 : 빈번하게 사용할 경우
	@Override
	void abc() {
		System.out.println("방법1: 자식 클래스로 추상 메소드 구현 후 객체 생성");
	}
	
}
public class AbstractClass1 {
	public static void main(String[] args) {
		//1 AA 클래스는 객체화 가능
		AA aa=new AA(); //필드 : 초기화 , 일반 메소드(구현부가 존재하는 메소드)
		System.out.println(aa); //객체를 생성하려면 heap 공간에 값이 반드시 들어가 있어야 함
		
		//2 A 클래스(추상클래스) 객체화 불가(미완성 메소드 때문)
//		A a=new A(); //객체 생성 불가 (추상 메소드를 포함하기 때문)
		
		//3 추상 클래스가 구현된 자식 클래스 생성, 객체를 여러개 생성할 때 
		A a1=new B(); //자식 클래스 생성, 부모타입
		A a2=new B();
		A a3=new B();
		
		//4 메소드 호출
		a1.abc(); //A의 abc() 호출로 B의 abc() 작동  <오버라이딩>
		a2.abc();
		a3.abc();
		
		
		
		
	}
}
