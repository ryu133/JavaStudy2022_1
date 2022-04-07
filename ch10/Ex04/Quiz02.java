package ch10.Ex04;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		//
		Scanner scanner=new Scanner(System.in);
		boolean run=true;
		int num=0; //스캔 받을 변수
		
		do {
			System.out.println("=====================================================");
			System.out.println("1. 19단 출력 | 2. 홀수단만 출력 | 3. 3의 배수단만 출력 | 4. 종료");
			System.out.println("=====================================================");
			System.out.println("번호를 입력해주세요 >>> ");
			num=scanner.nextInt();
			if (num==1) { //이중 for 사용 19단 출력
				for (int i = 1; i < 20; i++) {
					for (int j = 1; j < 20; j++) {
						System.out.println(i+"*"+j+"="+(i*j));
					}
				}
			}else if(num==2){ //홀수단
				for (int i = 1; i < 20; i++) {
					if (i%2==1) {
						for (int j = 1; j < 20; j++) {
							System.out.println(i+"*"+j+"="+(i*j));
						}	
					}
				}
				
			}else if (num==3) {//3의 배수
				for (int i = 1; i < 20; i++) {
					if (i%3==0) {
						for (int j = 1; j < 20; j++) {
							System.out.println(i+"*"+j+"="+(i*j));
						}	
					}
				}
			}else if (num==4) {//프로그램 종료
				run=false;
//				break;
			}
		} while (run);
		scanner.close();
		System.out.println("프로그램 종료");
	}
}
	
