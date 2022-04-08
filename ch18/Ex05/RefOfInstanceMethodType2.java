package ch18.Ex05;

//2 메소드 참조 (정적 메소드 표현)
	//메소드 참조: 내가 구현하지 않고 구현된 메소드를 참조해서 사용
	//정적 메소드 참조

interface A{
	void abc();
}

class B{
	static void bcd() { //static 메소드: 클래스명으로 호출 가능
		System.out.println("method");
	}
}

public class RefOfInstanceMethodType2 {
	public static void main(String[] args) {
		//정적 메소드 참조 
		//1 이너클래스로 처리
		A a1=new A() {
			@Override
			public void abc() {
				B.bcd(); //static이 적용된 정적 메소드 호출, 객체 생성없이 클래스명으로 호출
			}
		};
		
		//2 람다식 표현
		A a2=()->{B.bcd();};
		
		//3 정적 메소드 참조
		A a3=B::bcd;
		
		a1.abc();
		a2.abc();
		a3.abc();
		
		
		
		
		
	}
}
