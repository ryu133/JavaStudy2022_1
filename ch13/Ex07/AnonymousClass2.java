package ch13.Ex07;
//익명 이너클래스를 사용하여 인터페이스 객체 생성
class A{
	C b=new C() { //익명 이너 클래스
		public void bcd() {
			System.out.println("익명 이너클래스");
		};
	};
	void abc() {
		b.bcd();
	}
	
}

interface C{ //추상 메소드 정의 void bcd()
	public abstract void bcd();
}

public class AnonymousClass2 {
	public static void main(String[] args) {
		A a=new A();
		a.abc(); //익명 이너클래스
		
		
		
	}
}
