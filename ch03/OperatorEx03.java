package ch03;

public class OperatorEx03 {
	/*논리연산자와 비트연산자를 이용한 논리연산*/
	public static void main(String[] args) {
		//#1.논리연산자(&&, ||, ^, !)
        //@AND (&&) false 하나라도 있으면 false
        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(true && (5<3)); //false
        System.out.println((5<=5) && (7>2)); //true
        System.out.println(false && true); //false 숏서킷o
        System.out.println();
        
        //@OR (||)true 하나라도 있으면 true 
        System.out.println(true || true); //true 숏서킷o
        System.out.println(true || false); //true
        System.out.println(false || (5<3)); //false
        System.out.println((5<=5) || (7>2)); //true
        System.out.println();
        
        //@XOR (^)두 값이 같을 때 false. 두 값이 다를 때 true. 숏서킷 발생x
        System.out.println(true ^ true); //false
        System.out.println(true ^ false); //true
        System.out.println(false ^ (5<3)); //false
        System.out.println((5<=5) ^ (7>2)); //false
        System.out.println();
        
        //@NOT (!) 반대
        System.out.println(!true); //false
        System.out.println(!false); //true
        System.out.println(false || !(5<3)); //true
        System.out.println((5<=5) || !(7>2)); //true
        
        //#2. 비트연산자로 논리연산 수행(&, |, ^, ~)
        System.out.println(true & true); //true
        System.out.println(true & false); //false
        System.out.println(true | (5<3)); //true
        System.out.println((5<=5) | (7>2)); //true
        System.out.println();
        
        //@숏 서킷 사용 여부 (논리연산자는 O, 비트연산자 X) 앞부분의 연산 결과를 인지할 수 있을 떄 뒷부분은 연산을 생략
        int value1 = 3;
        System.out.println(false && ++value1>6); //false
        System.out.println(value1); //3
        
        int value2 = 3;
        System.out.println(false & ++value2>6); //false
        System.out.println(value2); //4
        
        int value3 = 3;
        System.out.println(true || ++value3>6); //true
        System.out.println(value3); //3
        
        int value4 = 3;
        System.out.println(true | ++value4>6); //true
        System.out.println(value4); //4
	}

}
