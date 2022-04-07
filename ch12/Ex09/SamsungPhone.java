package ch12.Ex09;

public class SamsungPhone implements Phone{
	//인터페이스에서 정의한 메소드를 구현함
	@Override
	public void sendCall() {
		System.out.println("ringring~");
	}
	@Override
	public void receiveCall() {
		System.out.println("receive call~");
	}
	
	//추가적인 samsungphone의 기능 추가
	public void flash() {
		System.out.println("light on");
	}
	
	
}
