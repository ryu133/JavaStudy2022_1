package ch05;

import java.util.Arrays;

import javax.naming.InitialContext;

public class CreatStringObject02 {

	public static void main(String[] args) {
		//객체의 값을 복사한 후 수정했을 때의 변화
		//1 문자열 수정 (객체 내의 내용은 변경이 불가 --> 새로운 객체 생성)
		
		//참조 자료형일 때는 Stack의 주소값을 복사 (기본형은 값 복사)
		String str1 = new String("안녕");
		String str2 = str1;
		
		str1="안녕하세요."; //별도의 메모리 공간에 생성됨
		
		System.out.println(str1);
		System.out.println(str2);
		
		//배열인 경우 (값을 변경하면 수정됨)
		int[] array1=new int[] {3,4,5};
		int[] array2=array1;
		
		array1[0]=6;
		array1[1]=7;
		array1[2]=8;
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
	}

}
