package ch0607.Ex06;
import ch0607.Ex05.Bb; //class B는 클래스 접근 제어자가 default이기 때문에 다른 패키지에서 접근 불가
public class ExternalClass2 {

	public static void main(String[] args) {
//		B b=new B(); //오류
		
		//다른 패키지의 클래스에서 Bb클래스를 접근하는 경우
			//1. import 먼저 사용
		//2. Bb 클래스의 접근 제한자는 public
		//3. 필드, 메소드의 접근 제한자에 따라서 접근 가능:protected(상속관계),public /불가능: private, default
		
		Bb bb=new Bb(); //다른 패키지의 클래스(가능 조건: 클래스 접근 제어자에 public)
		
//		bb.a=10; //(private)같은 클래스 내에서만 접근 
//		bb.b=20; //(default)같은 패키지 내에서 접근
//		bb.c=30; //(protected)다른 패키지에서 접근(상속관계일 때만)
		bb.d=40; //(public)다른 패키지에서 접근
		
//		bb.print1(); //private
//		bb.print2(); //default
//		bb.print3(); //protected
		bb.print4(); //public
	}

}
