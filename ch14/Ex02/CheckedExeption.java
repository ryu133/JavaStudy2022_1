package ch14.Ex02;

import java.io.FileInputStream;
import java.io.InputStreamReader;

//checked exception (일반예외): 컴파일 단계에서 예외가 발생
//컴파일하기(빌드) *.java  ==> *.class  전에 예외처리
//unChecked Exception (실행예외), Runtime Exception : 실행 시 예외가 발생될 수 있다.
//예외처리 필수는 아니지만 하는 것을 권장

class A{
	B b;
	
	A(){}
	A(B b){
		this.b=b;
	}
	interface B{
		void cry();
	}
	void abc() {
		b.cry();
	}
}

public class CheckedExeption {
	public static void main(String[] args) {
		//1 일반 예외: 컴파일 단계에서 에외처리가 필요
		//InterruptedException: 스레드 중간에 키어들기가 발생하면 예외가 발생
		//Thread.sleep(1000);
		
		//ClassNotFoundException: 클래스를 찾지 못하는 예외
		//Class cls = Class.forName("java.lang.Object");
		
		//IOException: 네트워크에서 값을(정보) 못읽어올 수 있는 예외
		InputStreamReader in=new InputStreamReader(System.in);
//		in.read();
		
		//FileNotFoundException: 파일을 찾지 못하는 예외가 발생될 수 잇다
//		FileInputStream flStream =new FileInputStream("text.txt");
		
		//NullPointerException : 객체가 null인 상태에서 객체의 필드나 메소드를 호출할 떄
		//실행예외(unchecked Exeption): 실행 시 발생되는 예외'
		A a1=new A();
//		a1.abc(); //컴파일 단계에서 예외가 발생되지 않고 실행 시 발생
		
		
	}}