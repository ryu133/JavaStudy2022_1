package ch16.Ex07;
//제네릭 메소드 내부에서 사용 가능한 메소드: object클래스의 메소드만 사용 가능

class A{
	public <T> void method(T t) {
//		System.out.println(t.length()); //t.length(): string 클래스에서 글자수를 리턴함  //다른 자료형이 들어갈 수 있기 때문에 사용불가
		System.out.println(t.equals("안녕")); //t.equals()는 object 클래스의 메소드라서 사용 가능
	}
	public <T extends Object>void method2(T t){ //extends Object 가 생략되어있다
		System.out.println(t.equals("반갑습니다.")); //object클래스의 메소드만 사용 가능
	}
	public <T extends String> void method3(T t) {
		System.out.println(t.length());
//		System.out.println(t.);
	}
}

public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		A a=new A();
		a.<String>method("안녕");
		
	}

}
