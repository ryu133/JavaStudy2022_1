package ch13.Ex04;

//지역 이너클래스 : 클래스의 메소드 내부에 선언된 클래스
//메소드 내부의 필드는 final 키가 생략됨. 값 수정 불가
//지역 이너클래스에서 사용되는 지역 변수는 자동으로 final로 선언된다. 생략 시 컴파일러가 자동으로 할당함

class A{
	int a=3;//필드: 힙 공간에 저장(초기화 필수)
			//필드의 초기값을 할당 후 수정할 때는 객체화하여 값을 수정해야 함
			//생성자는 setter를 통해 초기값 할당 후 객체 생성해서 생성자를 통해 초기값 할당
	
	A (){}
	A(int a){
		this.a=a;
	}
	public void setA(int a) {//setter를 통해서 필드의 값을 초기화함
		this.a=a;
	}
	void ccc() {
		//지역변수: 메소드 내부의 변수, 메모리의 스택 공간에 저장
		int a=3; //초기화
		a=4;//지역변수 값 변경
		a=10;
	}
	void abc() {
		int b=5; //지역변수 : 메소드 내에 선언된 변수
		//지역 이너클래스에서 사용될 때 자동으로 final 키가 컴파일러에 의해서 할당됨
//		b=10;	
		int c=10;
		c=10;
		class B{
			void bcd() {
				System.out.println(a);//필드
				System.out.println(b);//지역변수(final 생략됨)
				a=5; //필드 값 수정 가능
//				b=7; //지역 이너클래스에서 사용되는 지역변수는 자동으로 final 키가 컴파일러에 의해 할당 
			}
		}
		B bb=new B();
		bb.bcd();
	}
}
public class InnerClass4 {
	public static void main(String[] args) {
		A a=new A();
		a.abc();
		
	}
}
