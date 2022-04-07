package ch04;

public class DoWhile_Ex05 {

	public static void main(String[] args) {
		//while문과 do while문 비교
		System.out.println("====반복 횟수가 0번인 경우====");
		int a=0;
		while (a<0) {
			System.out.print(a+" "); //조건이 true일 때만 실행됨
			a++;
		}
		a=0;
		do {
			System.out.print(a+" ");
			a++; 
		} while (a<0); //do while문에서 무조건 1번은 실행됨
		System.out.println("\n====반복 횟수가 1인 경우======");
		
		//반복 횟수가 1인 경우
		a=0;
		while (a<1) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println("");
		a=0;
		do {
			System.out.print(a+" ");
			a++;
		} while (a<1);
		System.out.println("\n====반복 횟수가 10번인 경우====");
		
		//반복 횟수가 10번인 경우
		a=0;
		while (a<10) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		a=0;
		do {
			System.out.print(a+" ");
			a++;
		} while (a<10);
		
		
	}

}
