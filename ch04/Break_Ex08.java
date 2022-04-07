package ch04;

public class Break_Ex08 {

	public static void main(String[] args) {
		//단일 loop에서 break
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			break; //break를 만나면 해당 구문을 빠져나옴
		}
		
		//for if break
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				break;
			}
			System.out.print(i+" ");
		}
		
		//다중 loop에서 break(하나의 반복문만 빠져나옴)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i==2) {
					break;
				}
				System.out.println(i+", "+j);
			}
		}
		
		//다중 loop 완전히 탈출. 1. label 사용 2. 조건 false로 만들기
		//1
POS1:		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i==2) {
					break POS1;
				}
				System.out.println(i+", "+j);
			}
		}
		//2
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i==2) {
					i=10;
					break;
				}
				System.out.println(i+", "+j);
			}
		}

		
	}

}
