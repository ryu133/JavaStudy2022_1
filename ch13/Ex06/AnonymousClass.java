package ch13.Ex06;

//인터페이스를 상속한 클래스를 생성해 객체 출력
class A{
	C b=new B(); //c타입 
	void abc() {
		b.bcd();
	}
	//이너클래스
	class B implements C{ //인터페이스 c의 추상 메소드 구현하는 b 클래스
		@Override
		public void bcd() {
			System.out.println("인스턴스 내부클래스");
		}
	}
}

interface C{ //추상 메소드 정의 void bcd()
	public abstract void bcd();
}

public class AnonymousClass {
	public static void main(String[] args) {
		A a=new A();
		a.abc(); //인스턴스 이너클래스
		
	}
}
