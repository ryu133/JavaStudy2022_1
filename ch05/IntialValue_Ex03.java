package ch05;

public class IntialValue_Ex03 {

	public static void main(String[] args) {
		//메모리의 초기값
		int value1; //기본 자료형에 초기값을 할당하지 않음
//		System.out.println(value1);
		
		int[] value2; //배열: 참조 자료형
//		System.out.println(value2);
		
		int value3=0; //기본 자료형에 0 값으로 초기값을 할당함
		System.out.println(value3);
		
		int[] value4=null; //참조 자료형은 기본 초기값으로 null-알 수 없는, 빈 상태-값을 부여함
		System.out.println(value4);
		
		//heap 메모리의 초기값(강제 초기화), heap에는 참조 자료형의 값이 할당
		//기본 자료형 배열일 경우  기본값은 boolean: false / 정수형 타입(int, long, short 등): 0 / 실수형 타입(double, float 등): 0.0
		boolean[] array1=new boolean[3]; //기본값 false 할당
		System.out.println(array1[0]+" "+array1[1]+" "+array1[2]);
		System.out.println();
		System.out.println("========for문을 사용하여 배열 안의 값을 출력========");
		for (int i = 0; i < 3; i++) {
			System.out.println(array1[i]);
		}
		System.out.println();
		System.out.println("객체의 메모리 주소: "+array1);
		System.out.println("객체의 방의 개수를 출력: "+array1.length);
		System.out.println("=====for문에 array1.lenth 사용=====");
		for (int i = 0; i < array1.length; i++) {
			System.out.println("array1["+i+"] 방의 값 "+array1[i]);
		}
		
		int[] array2=new int[3]; //0이 기본값으로 할당
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		double[] array3=new double[3]; //0.0 기본값
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}
		//참조 자료형 배열일 경우 기본값은 null
		String[] array4=new String[3]; //null 기본값
		for (int i = 0; i < array4.length; i++) {
			System.out.println(array4[i]);
		}
	}

}
