package ch04;

public class While_Ex04 {

	public static void main(String[] args) {
		//while문 기본 문법
		int a=0; //초기식
		
		while (a<10) { //조건식
			System.out.print(a+" ");
			a++; //증감식
		} //0 1 2 3 4 5 6 7 8 9   --> 10번 출력
		System.out.println("");
		
		//for문으로 변환
		for (int i = 0; i < 10 ; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//while문의 10부터 시작해서 1씩 감소
		int b=10;
		while (b>0) {
			System.out.print(b+" ");
			b--;
		}
		//for문의 10부터 시작해서 1씩 감소
		System.out.println();
		for (int i = 10; i > 0 ; i--) {
			System.out.print(i+" ");
		}
		
		//while문의 무한루프
//		while (true) {
//			System.out.println("while 무한루프 발생");
//		}
		int c=0;
		while (true) {
			if (c>100) {
				break;
			}
			System.out.print(c+" ");
			c++;
		}
		
		
	}

}
