package ch05;

public class CreatStringObject01 {

	public static void main(String[] args) {
		//String 객체 생성 1: new키를 사용해서 객체 생성. Heap영역의 별도의 공간에 저장
		//RAM(메모리)의 값을 절대 공유하지 않는다.
		String str1=new String("안녕"); //new 객체를 생성(Heap 메모리에 저장)
		System.out.println(str1); //String은 객체를 출력했을 때 객체의 값이 출력.
									//String만 가지는 특수한 기능. 보통 객체 자체를 출력하면 Heap메모리의 번지 출력
									//객체의 값을 출력할 때는 객체명.toString() 재정의 객체의 값을 찍을 수 있음
		
		String str11=new String("안녕"); //str1과 str11는 별도의 메모리 공간에 저장(Heap에 따로 저장됨)
		
		if (str1==str11) { //참조 자료형일 경우 ==은 주소를 비교
			System.out.println(true);
		}else {
			System.out.println(false); //별도의 주소임
		}
		
		//2 리터럴의 값을 바로 할당: 같은 값일 경우 RAM(메모리)의 값을 공유하게 됨 (Heap)
		String str2="안녕하세요."; 
		String str22="안녕하세요."; //동일한 메모리 공간을 공유하게 됨 
		
		if (str2==str22) { //참조 자료형일 경우 ==은 주소를 비교
			System.out.println(true); //같은 주소임
		}else {
			System.out.println(false);
		}
		
	}

}
