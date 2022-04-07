package ch05;

public class ValueAssignment_Ex02 {

	public static void main(String[] args) {
		//배열 변수의 방에 값 할당하기 
		int[] array1=new int[3]; //배열 변수: array1. 방 크기: 3. 방 번호(index): 0, 1, 2
		//array1[0], array1[1], array1[2]
		
		array1[0]=3;
		array1[1]=4;
		array1[2]=5;
		
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		
		//
		int[] array2;
		array2=new int[3];
		
		array2[0]=3;
		array2[1]=4;
		array2[2]=5;
		
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
		
		//
		int[] array3=new int[] {4,5,6,7,8};
		
		System.out.println(array3[0]);
		System.out.println(array3[1]);
		System.out.println(array3[2]);
		System.out.println(array3[3]);
		System.out.println(array3[4]);
		
		//
		int[] array4;
		array4=new int[] {3,4,5};
		
		System.out.println(array4[2]);
		
		int[] array5= {11,12,13};
		System.out.println(array5[0]+" "+array5[1]+" "+array5[2]);
		
//		오류발생
//		int[] array6;
//		array6= {11,12,13};
//		System.out.println(array6[0]+" "+array6[1]+" "+array6[2]);
		
		
	}

}
