package ch0607.Ex05;

public class ExC {
	public static void main(String[] args) {
		
		C c=new C();
//		c.company="삼성 자동차"; //private 외부 클래스에서 접근 불가
		c.model="그랜저"; //default
		c.color="black"; //protected
		c.maxSpeed=250; //public
		c.print();
		
	}
}
