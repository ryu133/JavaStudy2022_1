package ch14.Ex01;

//Exception은 예외의 최상위 클래스
//ArrayIndexOutOfBoundsException도 Exception의 자식

public class ArrayIndexOutOfBoundsExceptionEx2 {
	public static void main(String[] args) {
		int[] arr=new int[5]; // arr배열에 방 5개 생성, index: 0,1,2,3,4
		
		
		try {
			for (int i = 0; i <= arr.length; i++) {
				arr[i]=i;
				System.out.println(arr[i]);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace(); //예외에 대한 정보 출력
				System.out.println("배열의 인덱스 방 번호를 넘겼습니다.");
		
		}finally {
			System.out.println("finally() 프로그램 종료");
			
		}
		
		
	}
}
