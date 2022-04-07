package ch12.Ex02;
//인터페이스(interface): 외부와 내부를 연결시켜주는 접점
//객체 생성 불가. 타입은 설정 가능
//모든 필드는 반드시 앞에 public static final가 있다
//모든 메소드는 public abstract 생략됨(java 1.8) (default 메소드 제외)

interface A{ //정식 표현
	public static final int A=3; //인터페이스 필드의 정식 표현
	public abstract void abc(); //인터페이스 메소드의 정식 표현
}
interface B{ //인터페이스의 생략된 표현(많이 씀)
	int A=3; 
	void abc();
}
abstract class C{ //추상클래스는 abstract 생략 불가
	abstract void abc(); //생략 시 오류 발생
}


public class Interface1 {
	public static void main(String[] args) {
		//인터페이스는 객체 생성 불가(미완성 메소드를 포함하므로). 타입 설정 가능
//		A a=new A();//A가 인터페이스이므로 객체 생성 불가
		
		//1 interface의 static 필드 출력
		System.out.println(A.A); //인터페이스의 필드 출력, A <== static
		System.out.println(B.A);
		
		//2 final 영향으로 값 수정 불가
//		A.A=5; //final이 설정되어있기 때문에 값을 변경할 수 없다
//		B.A=6; 
	}
}
