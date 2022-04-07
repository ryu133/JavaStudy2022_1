package ch04;

public class Test0225 {

	public static void main(String[] args) {
//		1. continue 사용. 1단~19단 중 홀수인 단만 출력

POS1:	for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if (i%2==0) {
					System.out.println("==========");
					continue POS1;
				}
				System.out.println(i+"*"+j+"= "+(i*j));
			}
		}

//		2. continue 사용. 1단~19단 중 3의 배수인 단만 출력
POS3:		for (int i = 0; i < 20; i++) {
	POS2:		for (int j = 0; j < 20; j++) {
					if (i%3==0) {
						System.out.println(i+"*"+j+"= "+(i*j));
						continue POS2;
					}
				}
				System.out.println("===========");
				continue POS3;
			}
	}

}
