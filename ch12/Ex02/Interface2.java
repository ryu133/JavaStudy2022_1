package ch12.Ex02;
/*
interface를 구현하는 클래스
overriding : 완전한 메소드를 자식 클래스에서 새롭게 재정의
implements : 미완성 메소드를 완성시킴
extends : 부모 클래스의 기능을 상속받아서 자신의 기능을 추가해서 확장
*/
interface AA{
	void cry(); //추상 메소드, public abstract 생략됨
	void run();
}
class BB implements AA{ //BB class는 AA interface의 미완성된 메소드를 구현함
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	@Override
	public void run() {
		System.out.println("펄쩍");
	}
}
public class Interface2 {
	public static void main(String[] args) {
		AA aa=new BB(); //BB: 인터페이스의 미완성 메소드를 구현한 클래스
		aa.cry();
		aa.run();
	}
}
