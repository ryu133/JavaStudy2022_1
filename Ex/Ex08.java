package Ex;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] unit=new int[] {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int[] m=new int[8];
		
		System.out.print("금액을 입력하시오 >> ");
		int a=sc.nextInt();
		for (int i = 0; i < unit.length; i++) {
			if (a>=unit[i]) {
				m[i]=a/unit[i];
				a-=unit[i]*m[i];
			}else {
				m[i]=0;
			}
			System.out.println(unit[i]+"원 짜리: "+m[i]+"개");
		}
	}

}
