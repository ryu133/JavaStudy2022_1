package ch0607.Ex06;
//static 키가 할당된 필드는 모든 객체에서 공유해서 사용하는 메모리 영역

class D{
	int m=3; //인스턴스 필드: 객체화해서 사용
	static int n=5; //static 필드:객체화 할지말지는 선택  Aaaa.n(클래스명으로 호출)  모든 객체에서 공유하는 필드
}

public class Static2 {
	public static void main(String[] args) {
		
		D d1=new D(); //객체 생성
		D d2=new D();
		D d3=new D();
		D d4=new D();
		
		d1.m=5;
		d2.m=6;
		d3.m=7;
		d4.m=8;
		System.out.println(d1.m);
		System.out.println(d2.m);
		System.out.println(d3.m);
		System.out.println(d4.m);
		
		d1.n=10; //객체 이름으로 static 필드를 호출
		d2.n=100;
		System.out.println(d1.n);
		System.out.println(d2.n);
		System.out.println(d3.n);
		System.out.println(d4.n);
		
		D.n=200; //클래스명으로 호출, 객체 생성없이 호출 가능
		System.out.println(d1.n);
		System.out.println(d2.n);
		System.out.println(d3.n);
		System.out.println(d4.n);
		
		d1.m=2;
		System.out.println(d1.m);
		System.out.println(d2.m);
		System.out.println(d3.m);
		System.out.println(d4.m);
	}
}
