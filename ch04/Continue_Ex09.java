package ch04;

public class Continue_Ex09 {

	public static void main(String[] args) {
		//단일 loop에서 continue
		for (int i = 0; i < 10; i++) {
			continue;
//			System.out.println("출력구문오류");
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i+" ");
			continue; //continue는 조건없이 하위에 실행문을 사용하면 오류
//			System.out.println();
		}
		
		//조건 사용 continue
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				continue;
			}
			System.out.println(i);
		}
		//조건 사용 break
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				break;
			}
			System.out.println(i);
		}
		
		//다중 loop에서 continue
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j==3) {
					continue;
				}
				System.out.println(i+", "+j);
			}
		}
		//다중 loop에서 break
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j==3) {
					break;
				}
				System.out.println(i+", "+j);
			}
		}
		
		//continue에서 label 사용
POS2:	for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j==3) {
					continue POS2;
				}
				System.out.println(i+", "+j);
			}
		}
		//break에서 label 사용
System.out.println("\n break에서 label 사용");
POS3:	for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j==3) {
					break POS3;
				}
				System.out.println(i+", "+j);
			}
}

		
	}

}
