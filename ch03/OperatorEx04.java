package ch03;

public class OperatorEx04 {
	//<대입연산자와 축약 표현>
	public static void main(String[] args) {
		//#1. 대입연산자 와 축약 표현
        //@대입연산자 (=, +=, -=, *=, >>=, <<=, >>>=). 수식에서 우선순위가 가장 낮음
        int value1 = 3;
        value1 = value1+3;
        System.out.println(value1);		//6
        System.out.println();
        
        //@축약표현
        int value2; //기본형 자료형인 경우 변수의 값을 넣지 않을 경우 기본값으로 0이 할당
        //참조 자료형일 경우 변수의 값을 할당하지 않을 경우 기본값으로 null
        value2 = 5; System.out.println(value2+=2);		//7
        value2 = 5; System.out.println(value2-=2);		//3
        value2 = 5; System.out.println(value2*=2);		//10
        value2 = 5; System.out.println(value2/=2);		//2
        value2 = 5; System.out.println(value2%=2);		//1
        value2 = 5; System.out.println(value2|=2);		//7
        value2 = 5; System.out.println(value2<<=2);		//20
        value2 = 5; System.out.println(value2>>=2);		//1
        value2 = 5; System.out.println(value2>>>=2);	//1
        
        byte value3;
        value3=-128; System.out.println(value3>>>=2);
	}

}
