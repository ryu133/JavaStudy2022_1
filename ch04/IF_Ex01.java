package ch04;

public class IF_Ex01 {

	public static void main(String[] args) {
		int value=5;
		if(value>3) {
			System.out.println("실행1: 조건이 참일 때 실행");
		}
		
		boolean bool1=true;
		boolean bool2= false;
		if(bool1) {
			System.out.println("실행2");
		}else {
			System.out.println("실행3");
		}
		if(bool2) {
			System.out.println("실행4");
		}else {
			System.out.println("실행5");
		}
		
		System.out.println((bool1)?"실행6":"실행7");
		System.out.println((bool2)?"실행6":"실행7");
		
		int value3=85;
		if(value3>=90) {
			System.out.println("A학점, 점수는: "+value3);
		}else if(value3>=80) {
			System.out.println("B, 점수는: "+value3);
		}else if(value3>=70) {
			System.out.println("C, 점수는: "+value3);
		}else{
			System.out.println("D, 점수는: "+value3);
		}
		
		if(value3>=90) {
			System.out.println("A학점, 점수는: "+value3);
		}else if(value3>=70) {
			System.out.println("C, 점수는: "+value3);
		}else if(value3>=80) {
			System.out.println("B, 점수는: "+value3);
		}else{
			System.out.println("D, 점수는: "+value3);
		}
		System.out.println("===========");
		//조건을 부여할 때 세밀하게 적용
		
		//value3=69;
		if(value3<=100&&value3>=90) 
			{
				System.out.println("A학점");
			}
		else if(value3<80&&value3>=70) 
			{
				System.out.println("C학점");
			}
		else if(value3<90&&value3>=80) 
			{
				System.out.println("B학점");
			}
		else
			{
				System.out.println("D학점");
			}
		
		//if문에서 실행문이 하나일 때 {중괄호} 생략 가능
		if(3<5)System.out.println("안녕\n");
		if(3>5)System.out.println("hi2");
		if(3<5)System.out.println("Hi4\n");
	}

}
