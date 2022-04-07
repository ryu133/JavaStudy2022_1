package ch10.Ex07.Ex01;
class AA{
	int a=3;
	int b=4;
	@Override
	public String toString() {
		return "a : "+a+", b: "+b;
	}
}
class BB{
	int a=5;
	int b=6;
	@Override
	public String toString() {
		return "a : "+a+", b: "+b;
	}
}
class CC{
	int a=7;
	int b=8;
	@Override
	public String toString() {
		return "a : "+a+", b: "+b;
	}
}
public class Object_Type {
	public static void main(String[] args) {
		//자바의 모든 객체는 object 타입으로 형변환이 가능하다
		Object aa=new AA();
		Object bb=new BB();
		Object cc=new CC();
		
		Object[] arr1= {aa,bb,cc};
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i].toString()); 
			//object의 tostring 을 호출한 경우 자식의 tostring 호출
		}
		for (Object k : arr1) {
			System.out.println(k);
		} //객체 자체를 출력할 경우 tostring 호출
		
		
	}
}
