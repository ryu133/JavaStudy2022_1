package ch10.Ex07.Ex01;
//object class의 toString 메소드 : 객체를 출력할 때 object tostring() 호출
//tostring(): 패키지명.클래스명@해시코드
//해시코드: 객체가 가르키고 있는 힙 메모리에 번지를 해시코드로 변환(암호화)
//재정의해서 사용 : 객체의 정보를 출력할 때/ 필드 값, 메소드 호출할 떄
class A{
	int m=3;
	int n=4;
}
class B{ //extends Object
	int a=3;
	int b=4;
	
	@Override
	public String toString() {
		return "a : "+a+", b : "+b;
	}
}
public class ObjectMethod_toString {
	public static void main(String[] args) {
		A a=new A();
		System.out.println(a);//패키지명.클래스명@해시코드  (16진수)
		System.out.println(a.toString());
		System.out.printf("%x\n",a.hashCode()); //x: 16진수
		
		B b=new B();
		System.out.println(b); //tostring() 재정의해서 객체의 필드 정보를 출력
		
		
	}
}
