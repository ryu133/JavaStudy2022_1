package ch0607.Ex06;

import ch0607.Ex05.ExternalAbc;

public class Bcd { //부모 클래스
	public int a=10;
	protected int b=20; //자식 클래스에서 접근할 필드
	int c=30;
	private int d=40;
	
	//Bcd(){ } //<==기본 생성자: 필드의 초기값을 할당하여 객체를 생성
	
	public void print1() {
		System.out.println("다른 패키지에서 접근 가능: public");
	}
	protected void print2() {
		System.out.println("다른 패키지에서 접근 가능: protected(상속관계일 때)");
	}
	void print3() {
		System.out.println("같은 패키지에서 접근 가능: default");
	}
	private void print4() {
		System.out.println("같은 클래스에서 접근 가능: private");
	}
}
