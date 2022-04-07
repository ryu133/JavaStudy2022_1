package ch16.Ex07;
//제너릭 클래스: 클래스를 선언할 때 타입 변수는 선언 <T> <<정의, 객체를 생성할 때 T에 적용할 타입을 지정

//제네릭 메소드: 일반 클래스 내부에 메소드 선언 시 제네릭 타입 변수 사용

class GenericMethod1{ //일반 클래스
	public <T> T method1(T t) { //제너릭 메소드
		return t;
	}
	
	public <T> boolean method2(T t1,T t2) {
		return t1.equals(t2); //두 값을 비교해서 true or false 리턴
		//기본 자료형일 경우 값을 비교, 참조 자료형일 경우 객체의 주소 비교, 
		//string인 경우 오버라이딩 되어있기(equals()가 재정의됨) 때문에 값을 비교
		//integer,double equals()가 재정의 되어있음
	}
	public <K,V> void method3(K k,V v) {
		System.out.println(k+", "+v);
	}
	public <K,V> void method4() {
		System.out.println("매개변수가 인풋 값으로 없는 경우 생략시 오류");
	}
	
}

public class GenericMethod {

	public static void main(String[] args) {
		//일반 클래스 객체 생성 후 제너릭 메소드 호출
		GenericMethod1 gm=new GenericMethod1();
		String str1=gm.<String>method1("안녕"); 
		String str2=gm.method1("안녕"); //타입을 알 수 있는 경우 생략 가능(호출할 때) 매개변수로 값이 들어갈 때 생략 가능
		System.out.println(str1);
		System.out.println(str2);
		
		Integer integer1=gm.<Integer>method1(1523);
		Integer integer2=gm.<Integer>method1(1327);
		System.out.println(integer1);
		System.out.println(integer2);
		
		Boolean b1=gm.<Boolean>method1(true);
		Boolean b2=gm.<Boolean>method1(false);
		System.out.println(b1);
		System.out.println(b2);
		
		Boolean bd1=gm.<Double>method2(2.55, 6.45); //false
		Boolean bd2=gm.<Double>method2(2.55, 2.55); //true
		System.out.println(bd1);
		System.out.println(bd2);
		
		gm.<String,Integer>method3("국어", 90);
		gm.method3("영어", 80);
		gm.<Integer,String>method3(500, "서버 에러");
		gm.method3(402, "파일을 찾을 수 없습니다.");
		
		gm.method4();
		
	}

}
