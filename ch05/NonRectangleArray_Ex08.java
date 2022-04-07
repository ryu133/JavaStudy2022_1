package ch05;

public class NonRectangleArray_Ex08 {

	public static void main(String[] args) {
//		비정방행렬 선언과 값 대입 방법1
//		비정방형 배열이란 행에 따라서 열의 개수가 서로 다른 2차원 행렬
		int[][] array1=new int[2][];//행의 개수만 생성해서 방의 크기를 만듬
		array1[0]=new int[2]; //index 0 행의 열의 방 2개 생성
		array1[0][0]=1;
		array1[0][1]=2;
		array1[1]=new int[3]; //index 1행의 열의 방 3개 생성
		array1[1][0]=3;
		array1[1][1]=4;
		array1[1][2]=5;
		
		System.out.println(array1[0][0]+" "+array1[0][1]);
		System.out.println(array1[1][0]+" "+array1[1][1]+" "+array1[1][2]);
		
		int[][] array2=new int[2][];
		array2[0]=new int[] {1,2};
		array2[1]=new int[] {3,4,5};
		
		System.out.println(array2[0][0]+" "+array1[0][1]);
		System.out.println(array2[1][0]+" "+array1[1][1]+" "+array1[1][2]);
		
//		비정방행렬 선언과 값 대입 방법2
		int[][] array3=new int[][] {{1,2},{3,4,5}}; //초기값을 아는 경우
		System.out.println(array3[0][0]+" "+array3[0][1]);
		System.out.println(array3[1][0]+" "+array3[1][1]+" "+array3[1][2]);
		
		int[][] array4;
		array4=new int[][] {{1,2},{3,4,5}};
		System.out.println(array4[0][0]+" "+array4[0][1]);
		System.out.println(array4[1][0]+" "+array4[1][1]+" "+array4[1][2]);
		
//		비정방행렬 선언과 값 대입 방법3
		int[][] array5= {{1,2},{3,4,5}}; //초기값을 아는 경우
		System.out.println(array5[0][0]+" "+array5[0][1]);
		System.out.println(array5[1][0]+" "+array5[1][1]+" "+array5[1][2]);
		
//		int[][] array6;
//		array6= {{1,2},{3,4,5}}; //오류 발생
//		System.out.println(array5[0][0]+" "+array5[0][1]);
//		System.out.println(array5[1][0]+" "+array5[1][1]+" "+array5[1][2]);
	}

}
