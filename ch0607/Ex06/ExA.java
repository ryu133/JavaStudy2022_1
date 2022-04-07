package ch0607.Ex06;

public class ExA {

	public static void main(String[] args) {
		//다른 패키지의 객체를 사용하는 방법
		//1. 전체 클래스 이름을 사용하는 방법
		ch0607.Ex05.A a=new ch0607.Ex05.A(); //클래스의 전체 이름을 사용: 패키지명.클래스명 
		 
//		a.m=10; //접근 불가  default는 다른 패키지의 클래스에서는 접근 불가
		a.print2();
		
	}

}
