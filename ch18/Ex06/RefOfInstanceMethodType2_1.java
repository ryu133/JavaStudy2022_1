package ch18.Ex06;

interface A{
	void abc(B b,int k);
}

class B{
	void bcd(int k) { //인스턴스 메소드
		System.out.println(k);
	}
}

public class RefOfInstanceMethodType2_1 {
	public static void main(String[] args) {
		//인스턴스 메소드 참조 type2 - 인스턴스 메소드
		//익명 이너클래스
		
		A a1= new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		//람다식 표현
		A a2= (B b, int k) -> {b.bcd(k);};
		
		//인스턴스 메소드 참조
		A a3=B::bcd;	//<= B 객체를 입력받아서 bcd() 메소드를 호출
			//객체명에 대문자가 들어가는 경우 1. 정적 메소드 2. 인스턴스 메소드지만 매개변수로 객체가 들어갈(입력될) 때 
		
		B b=new B();
		
		a1.abc(b, 7);
		a1.abc(b, 8);
		a1.abc(b, 9);
		
		
		
		
		
	}
}
