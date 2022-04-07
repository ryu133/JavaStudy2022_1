package ch05;

public class ReadArrayData_2D_Ex09 {

	public static void main(String[] args) {
//		2차원 데이터 배열의 길이
		int[][] array1=new int[2][3];
		System.out.println(array1.length); //2차원 배열인 경우: .length(행의 개수를 출력)!중요
		System.out.println(array1[0].length); //index 1의 열의 개수
		System.out.println(array1[1].length); //index 2의 열의 개수
		int[] array11=new int [10];
		System.out.println(array11.length); //1차원 배열인 경우: .length(열의 개수를 출력)!중요
		System.out.println();
		
//		2차원 데이터 배열의 출력방법1
		int[][] array2=new int[][] {{1,2},{3,4,5}};
		System.out.println(array2.length); //행
		System.out.println(array2[0].length); //0행의 열
		System.out.println(array2[1].length); //1행의 열
		
//		배열의 index번호로 출력하는 방법 :값이 적은 경우
		System.out.println(array2[0][0]+" "+array2[0][1]);
		System.out.println(array2[1][0]+" "+array2[1][1]+" "+array2[1][2]);
		
		//이중 for문 사용해서 출력하는 방법 :값이 많은 경우
		for (int i = 0; i < array2.length; i++) { //행
			for (int j = 0; j < array2[i].length; j++) { //열
				System.out.print(array2[i][j]+" ");
			}
			System.out.println();
		}
		
//		for each
		System.out.println();
		for (int[] array : array2) { //2차원 배열의 행의 값을 1차원 배열 변수에 담고(array) 
			for (int k : array) { //배열의 값을 변수에 담아서 출력
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}

}
