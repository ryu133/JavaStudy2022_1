package ch05;

public class Array_Definition_Ex01 {

	public static void main(String[] args) {
//		배열 변수 선언 방법
//		배열은 하나의 배열 변수에 많은 데이터를 저장.
//		배열은 선언 시 동일한 자료형의 값을 저장.(컬렉션은 여러 데이터 타입을 저장)
//		배열은 배열의 값을 저장할 방 크기를 지정하면 방 크기를 수정할 수 없다.
//		(컬렉션은 방 크기가 자동으로 늘어남)
		
		//배열 선언 방법
		
		int[] array1=new int[3]; //선언과 동시에 방 크기 할당
		int[] array2; //선언
		array2=new int[3]; //크기 할당
		
		//배열 변수 선언 방법
		
		int array3[]=new int[3]; //선언과 동시에 방 크기 할당: 자료형[]
		int array4[];
		array4=new int[3];
		
		//배열 변수 선언 방법
		int[] array5[] = new int[3][4]; //선언과 동시에 방 크기 할당: 변수명[]
		int[] array6[];
		array6 = new int[3][4];
		
		// 다양한 배열 선언 (기본자료형 배열, 참조자료형 배열)
		boolean[][] array7 = new boolean[3][4];
		int[][] array8 = new int[2][4];
		double[][] array9 = new double[3][5];
		String[][] array10 = new String[2][6]; //참조자료형 배열	
	}

}
