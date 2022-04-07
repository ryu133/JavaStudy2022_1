package ch04;
import java.util.Scanner;
public class If_Ex06 {
	public static void main(String[] args) {
		//Scanner scanner=new Scanner(System.in);
		int num1=10;
		int num2=2;
		char operator='0';
		
		int result=0;
		
		if (operator=='+') {
			result=num1+num2;
		}else if (operator=='-') {
			result=num1-num2;
		}else if (operator=='*') {
			result=num1*num2;
		}else if(operator=='/'){
			result=num1/num2;
		}else {
			System.out.println("연산자 오류 입니다.");
			return; //종료
		}
		System.out.println("결과 값은 "+result+"입니다.");
		
	}

}
