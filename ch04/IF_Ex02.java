package ch04;

public class IF_Ex02 {

	public static void main(String[] args) {
		int value1=2;
		//break가 없을 때: 해당 case로 이동 후 하위의 case를 모두 실행
		switch (value1) {
		case 1: 
			System.out.println("A 학점");
		case 2: 
			System.out.println("B 학점");
		case 3: 
			System.out.println("C 학점");
		default:
			System.out.println("F 학점");
		}
		//break 포함
		int value2=3;
		switch (value2) {
		case 1: 
			System.out.println("A 학점");
			break;
		case 2: 
			System.out.println("B 학점");
			break;
		case 3: 
			System.out.println("C 학점");
			break;
		default:
			System.out.println("F 학점"); //switch의 마지막은 break 생략 가능
		}
		
		value2=2;
		if(value2==1) {
			System.out.println("A(if)");
		}else if(value2==2) {
			System.out.println("B(if)");
		}else if(value2==3) {
			System.out.println("C(if)");
		}else {
			System.out.println("F(if)");
		}
		//switch문 사용해서 점수가 7점 이상은 pass, 7점 이하는 fail을 출력(점수는 1~10)
		int a=10;
		switch (a) {
		case 10:
		case 9:
		case 8:
		case 7:
			System.out.println("pass");
			break;
		default:
			System.out.println("fail");
			break;
		}
		
	}

}
