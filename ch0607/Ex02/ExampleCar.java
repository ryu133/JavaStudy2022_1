package ch0607.Ex02;

import java.util.Arrays;
import java.util.Scanner;


public class ExampleCar {
	public static void main(String[] args) {
		//Car class를 객체화해서 5개의 객체를 생성하여 값을 할당하고 출력하기
		
		Car car1=new Car();
		//각 변수의 값을 할당하고 출력하기(메모리 직접 사용, setter를 통해 값을 할당)
		//private 변수명: 캡슐화. 직접 변수의 값을 할당하지 못하도록 한다
		//setter를 통해 값을 부여: 변수의 입력되는 값을 제어할 수 있다
		Car car2=new Car();
		Car car3=new Car();
		Car car4=new Car();
		Car car5=new Car();
		
		//ram에 값을 부여할 때 setter 사용
		car1.setCompany("A");
		car1.setModel("a");
		car1.setColor("blue");
		car1.setMaxSpeed(200);
		
		car2.setCompany("B");
		car2.setModel("b");
		car2.setColor("red");
		car2.setMaxSpeed(210);
		
		car3.setCompany("C");
		car3.setModel("c");
		car3.setColor("white");
		car3.setMaxSpeed(220);
		
		car4.setCompany("D");
		car4.setModel("d");
		car4.setColor("yellow");
		car4.setMaxSpeed(230);
		
		car5.setCompany("E");
		car5.setModel("e");
		car5.setColor("black");
		car5.setMaxSpeed(240);
		
		System.out.println(car1.company+" "+car1.model+" "+car1.color+" "+car1.maxSpeed);
		System.out.println(car2.company+" "+car2.model+" "+car2.color+" "+car2.maxSpeed);
		System.out.println(car3.company+" "+car3.model+" "+car3.color+" "+car3.maxSpeed);
		System.out.println(car4.company+" "+car4.model+" "+car4.color+" "+car4.maxSpeed);
		System.out.println(car5.company+" "+car5.model+" "+car5.color+" "+car5.maxSpeed);
		
		//스캐너로 임의의 정수값을 받아서 합계와 평균 출력하기
		Scanner scanner=new Scanner(System.in);
		int n=0;
		int[] num=new int[100];
		int sum=0;
		double avg=0.0;
		int count=0;
		
		while (scanner.hasNextInt()) {
            int temp = scanner.nextInt();
            count++;
            sum+=temp;
        }
		System.out.println(sum);
		avg=sum/count;
		System.out.println(avg);
		
//		System.out.println("정수 입력 (-1 입력 시 종료)");
//		for (int i = 0; i < num.length; i++) {
//			n=scanner.nextInt();
//			if (n==-1) break;
//			num[i]=n;
//			++count;
//		}
		
		
//		for (int i = 0; i < count; i++) {
//			sum+=num[i];
//		}
//		avg=sum/(count);
//		System.out.println(sum);
//		System.out.println(avg);
		
	}
	static void input(int[]...values) {
		
	}
	
	
}
