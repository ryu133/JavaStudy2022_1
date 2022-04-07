package ch02;

public class PrimaryDataType_2 {

	public static void main(String[] args) {
		//<char 자료형에 값을 할당하는 방식>
		//문자로 저장하는 방법
		char value1='A';
		char value2='가';
		char value3='3';
		
		//정수로 저장하는 방법
		char value4=65; //65는 대문자 A(아스키 코드)
		char value5 = 0xac00; //16진수로 값을 할당
        char value6 = 51;
        System.out.println(value4); //A
        System.out.println(value5); //가
        System.out.println(value6); //3
        System.out.println();
				
        //#4-3. 유니코드로 직접 입력
        char value7 = '\u0041';
        char value8 = '\uac00';
        char value9 = '\u0033';
        System.out.println(value7); //A
        System.out.println(value8); //가
        System.out.println(value9); //3	
	}

}
