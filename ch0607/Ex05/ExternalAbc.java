package ch0607.Ex05;

import ch0607.Ex06.Bcd; //ctrl+shift+o : 자동 임포트

//import ch0607.Ex06.Abc; //Abc클래스에 접근 제한자가 default: 외부 패키지에서 접근 불가

public class ExternalAbc extends Bcd{ //ExternalAbc클래스가 Bcd클래스를 상속 받음
	//부모 클래스: Bcd . 자식 클래스: ExternalAbc

	public static void main(String[] args) {
//		Abc abc2=new Abc(); //class 접근 제어자가 default이므로 접근 불가
		
		Bcd bcd1=new Bcd(); //부모 클래스 객체
		ExternalAbc ext=new ExternalAbc(); //자식 클래스 객체
		
		//다른 패키지에서 필드 호출 1. import(public: 클래스 접근 지정자) 2. 객체 생성 3.접근 지정자 확인 후 접근(필드, 메소드)
		bcd1.a=1000; //public 다른 패키지에서 접근 가능
//		bcd1.b=2000; //
		ext.b=2000; //protected 다른 패키지에서 상속관계에 있을 때 자식클래스에서 부모클래스로 접근 가능
//		bcd1.c=3000; 
//		bcd1.d=4000; 
//		
		
	}

}
