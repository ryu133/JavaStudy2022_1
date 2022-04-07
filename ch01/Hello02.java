package ch01;

public class Hello02 {

	public static int sum(int n,int m) {
		return n+m;
	}
	
	public static void main(String[] args) {
		int i=20;
		int s;
		char a;//한 글자, 작음 따옴표 사용
		
		s=sum(i,3);
		a='?';
		System.out.println(a);
		System.out.println(s);
	}

}
