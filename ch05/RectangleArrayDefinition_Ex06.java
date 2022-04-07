package ch05;

public class RectangleArrayDefinition_Ex06 {

	public static void main(String[] args) {
		//2차원 배열 선언하기
//		선언&방 할당
		int[][] array1=new int[3][4]; //행3 열4
//		선언 후 방 할당
		int[][] array2;
		array2=new int[3][4];
		
//		참조 변수의 초기값 int : 0
		System.out.println(array1[0][2]);
		
		int array3[][]=new int[3][4];
		int array4[][]; 
		array4=new int[3][4];
		
		int[] array5[]=new int[3][4];
		int[] array6[];
		array6=new int[3][4];
		
//		다양한 자료형의 배열 선언(기본 자료형 배열, 참조 자료형 배열)
		boolean[][] array7=new boolean[3][4]; //false
		int[][] array8=new int[2][4]; //0
		double[][] array9=new double[3][5]; //0.0
		String[][] array10=new String[2][6]; //참조 자료형 기본값: null
		
	}

}
