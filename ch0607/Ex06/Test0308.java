package ch0607.Ex06;

import java.util.Scanner;

//임의의 운동의 이름을 넣고 해당 운동의 구성원(명수)를 넣어서
//출력하는 프로그램으로 작성 후 전체 합 및 평균을 구하는 프로그램을 작성하세요
public class Test0308 {

	static void method(String...valuse){
		int sum=0; 
		double avg;
		for (int i = 0; i < valuse.length; i++) {
			if (i%2==0) {

				
			}else {
				sum+=Integer.parseInt(valuse[i]);
			}
			
		}
		avg=(double)sum/valuse.length*2; 
		System.out.println("운동 종목 구성원의 총 합계: "+sum);
		System.out.println("운동 종목의 평균 구성원 수: "+avg);
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while (true) {
			System.out.println("입력>>");
			
			String exrecise=scanner.nextLine(); 
			String[] array1=exrecise.split(" ");
			
			if (exrecise.equals("그만")) {
				System.out.println("종료");
				scanner.close();
				break;
			}
			else {
				System.out.println("출력>>");
				for (int i = 0; i < array1.length; i++) { 
					if (i%2==0) {
						System.out.print(array1[i]+" : ");
					
					}else if (i==array1.length-1) {
						System.out.print(array1[i]);
					}
					else{
						System.out.print(array1[i]+", ");
					}
				}
					System.out.println();
					method(array1);
			}
		}
	
	}
}


