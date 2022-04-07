package ch0607.Ex04;
//명시적 this 키워드 추가 : 반드시 this 키워드 사용해야 되는 경우
class Aa{ //this 키워드를 사용하지 않는 경우: 지역변수로 인식
	int m;
	int n;
	void init(int m,int n) {
		m=m; //this 키를 사용하지 않는 경우 m은 지역변수
		n=n; //this 키를 사용하지 않는 경우 n은 지역변수
	}
}
class Bb{ //this 키를 사용하는 경우
	int m;
	int n;
	void init(int m,int n) {
		this.m=m; //this 키를 명시적으로 반드시 사용해서 m이 필드의 m이고 알려줘야함
		this.n=n;
	}
}

public class ThisKeyword2 {
	public static void main(String[] args) {
		//1필드명과 지역변수명이 같은 경우(this를 사용하지 않는 경우:지역변수)
		Aa aa=new Aa();
		aa.init(2, 3);
		System.out.println(aa.m);
		System.out.println(aa.n);
		
		//2필드명과 지역변수명이 같은 경우(this를 사용하는 경우:필드)
		Bb bb=new Bb();
		bb.init(2, 3);
		System.out.println(bb.m);
		System.out.println(bb.n);
		
	}

}
