package ch12.Ex09;

public class PhoneEx {
	public static void main(String[] args) {
		//samsungphone 타입으로 지정
		SamsungPhone s1=new SamsungPhone();
		s1.printLogo(); //인터페이스에서 상속되어 내려온 기능
		s1.sendCall();
		s1.receiveCall();
		s1.flash();
		
		System.out.println("===============");
		
		//phone 타입으로 업캐스팅
		Phone s2=new SamsungPhone();
		s2.printLogo();
		s2.sendCall();
		s2.receiveCall();
		SamsungPhone ss=(SamsungPhone)s2; //다운캐스팅
		ss.flash();
		
	}

}
