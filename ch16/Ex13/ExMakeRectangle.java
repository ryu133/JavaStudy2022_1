package ch16.Ex13;

//두 점의 좌표 값을 사용해서 넓이를 구하는 프로그램을 작성.
//제네릭 메소드 사용

class Point<T,V>{ //한 점의 좌표를 저장하는 클래스
	T x; //한 점의 x 좌표
	V y; //한 점의 y 좌표
	
	Point(T x,V y){ //생성자. setter 대신 생성자를 통해서 값을 초기화(할당)
		this.x=x;
		this.y=y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
	
}

class GenericMethod{
	public static <T,V> double makeRectangle(Point<T,V>p1,Point<T,V>p2) {
		
		double height=(double)p2.getY()-(double)p1.getY();
//		double width=(double)(p2.getX()-p1.getX());//??
		double width=(double)p2.getX()-(double)p1.getX();
		
//		double left=((Number)p1.getX()).doubleValue();
//		double right=((Number)p2.getX()).doubleValue();
//		double top=((Number)p1.getY()).doubleValue();
//		double bottom=((Number)p2.getY()).doubleValue();
//		
//		double width=right-left;
//		double height=bottom-top;
		
		return width*height; //가로 * 세로=넓이 를 리턴
	}
}
public class ExMakeRectangle {
	public static void main(String[] args) {
		Point<Double,Double>p1=new Point<Double,Double>(1.0, 2.0);
		Point<Double,Double>p2=new Point<Double,Double>(10.0, 50.0);
		
		double rect=GenericMethod.<Double,Double> makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 "+rect+" 입니다.");
		
		
	}

}
