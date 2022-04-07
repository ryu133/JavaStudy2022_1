package ch0607.Ex06;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
//		임의의 운동 이름을 넣고 해당 운동의 구성원을 넣어서 출력하는 프로그램을 작성 후,
//		전체 합 및 평균을 구하는 프로그램을 작성하세요.
		
//		예)
//		입력>>
//		탁구 2 야구 9 축구 11 농구 6 씨름 2
//		출력>>
//		탁구 : 2 , 야구 : 9 , 축구 : 11 , 농구 : 6 , 씨름 : 2
//		운동종목의 구성원 총 합계:
//		운동종목의 평균 구성원 수:
//			
//		"그만"이라고 입력하면 프로그램 종료
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("운동종목과 구성원수를 공백을 이용해서 입력하세요.");
		System.out.println("입력>>\n탁구 2 야구 9 축구 11 농구 6 씨름 2");

		String str; //전체 string값을 인풋받는 변수
		String[] arr; //공백을 기준으로 잘라서 배열에 저장하는 변수
		
		int sum; //운동 구성원의 멤버의 합을 저장하는 변수
		int memberCount=0;
		double avg; //평균을 구하는 변수: (double)전체 구성원의 합/종목의 수
		int b; //각 종목의 구성원을 담는 변수
		do {
			sum=0;
			avg=0;
			memberCount=0;
			b=0;
			
			str=scanner.nextLine(); //.next(): 공백까지 String에 받음 / .nextLine(): 엔터까지 String에 받음
			if (str.equals("그만")) {break;} //str은 참조자료형이므로 .equals() 메소드 사용
			arr = str.split(" "); //str을 공백 기준으로 잘라서 arr에 저장
			for (int i = 0; i < arr.length; i++) { //.lenth : 배열의 index 0 ~ 마지막 방까지
				if (i%2!=0) { //i: 방의 번호. 숫자만 가져올 예정
					b=Integer.parseInt(arr[i]); //각 방의 String 타입을 정수로 변환
					sum+=b; //arr 안의 숫자 b를 sum에 더하기
					memberCount++; //avg=sum/memberCount
				}
			}
			
			avg=(double)sum/memberCount; //평균
			System.out.println(str);
			System.out.println("구성원의 총합: "+sum);
			System.out.println("구성원의 평균: "+avg);
			
		} while (true);
		
		
		
		
	}
}
