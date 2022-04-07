package ch0607.Ex06;

import ch0607.Ex05.C; //ctrl+shift+o >>import 단축키

public class ExC {

	public static void main(String[] args) {
		//다른 클래스에 존재함/ public만 접근/ model, color 메모리로 접근 불가
		//company, model과 color는 setter를 public으로 할당후 출력
		C c=new C();

		c.maxSpeed=300; //다른 패키지의 클래스에서는 public,protected(상속)
		c.setCompany("쉐보레");
		c.setModel("에쿠스");
		c.setColor("black");
		c.setMaxSpeed(300);
		
		c.print();
	}

}
