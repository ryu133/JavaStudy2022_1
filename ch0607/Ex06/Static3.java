package ch0607.Ex06;
//정적 초기화 블록: 생성자와 같이 static 필드의 값을 호출 시 초기화하는 역할

//생성자와 static 블록
//-생성자: 인스턴스 필드를 초기화, 정적 필드의 값도 초기화
//-static 블록: static 필드의 값을 초기화. 인스턴스 필드의 값은 초기화할 수 없다
class E{
	int a;
	static int b;

	static { 	//정적 초기화 블록(객체 생성없이 클래스명으로 호출할 때 초기화)
		b=5;
		System.out.println("클래스 E가 로딩되었습니다. b:"+b);
	}
	E(){ //생성자: 객체화를 할 때 필드의 값을 초기화
		a=3;
	}
}
public class Static3 {
	public static void main(String[] args) {
		System.out.println(E.b); //객체 생성없이 E.b 호출될 때 static 블록이 작동됨: static의 값을 초기화 함
	}
}
