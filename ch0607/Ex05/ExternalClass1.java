package ch0607.Ex05;

class B{ //외부 클래스: public이 올 수 없다. default 생략됨
			//다른 패키지의 클래스에서는 접근 불가, 같은 패키지 내에서만 접근 가능
	private int a=1; //private: 같은 클래스 내에서만 사용
	int b=2; //default: 같은 패키지 내의 다른 클래스에서 접근 가능
	protected int c=3; //protected: default 포함+다른 패키지에 접근 가능(상속된 경우만)
	public int d=4; //public : 다른 패키지에서 접근이 가능
	
	//private < default < protected < public
	
	private void print1() { //같은 클래스에 존재하는 메소드
		a=10;
		b=20;
		c=30;
		d=40;
	}
	void print2() { //같은 클래스에 존재하는 메소드
		a=10;
		b=20;
		c=30;
		d=40;
	}
	protected void print3() { //같은 클래스에 존재하는 메소드
		a=10;
		b=20;
		c=30;
		d=40;
	}
	public void print4() { //같은 클래스에 존재하는 메소드
		a=10;
		b=20;
		c=30;
		d=40;
	}
}

public class ExternalClass1 {

	public static void main(String[] args) {
		B b=new B(); //default 접근 제어자가 class 이름에 할당/같은 클래스에 존재하므로 B class를 생성할 수 있다.
		Bb bb=new Bb();
		
		//같은 패키지의 다른 클래스에서 접근
//		bb.a=10; //private: a는 bb클래스 내에서만 사용 가능
		bb.b=20; //default:같은 패키지의 클래스에서 접근 가능
		bb.c=30; //protected: default를 포함. 다른 패키지에서 상속관계일때만 가능
		bb.d=40; //public: protected 포함. 다른 패키지에서 접근 가능
		
//		bb.print1(); //private 오류발생, 클래스 내부에서만 호출
		bb.print2(); //default
		bb.print3(); //protected
		bb.print4(); //public
	}

}
