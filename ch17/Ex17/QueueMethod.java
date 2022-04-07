package ch17.Ex17;

import java.util.LinkedList;
import java.util.Queue;

//Queue: FIFO(First In First Out): 처음 들어간 값이 처음으로 나옴

public class QueueMethod {
	public static void main(String[] args) {
		Queue<Integer>queue1=new LinkedList<Integer>();
		
		//1 예외 처리를 미포함한 메소드(add(),element(),remove())
			//1-1 add(): queue의 값을 추가할 때
//			System.out.println(queue1.element()); //실행 시 오류 발생, 예외처리가 되어있지 않음
			queue1.add(3);
			queue1.add(4);
			queue1.add(5);
			
			//1-2 element(): 제일 처음 들어간 값 확인
			System.out.println(queue1.element());
		
			//1-3 E remove():큐의 값을 빼온다
			System.out.println(queue1.remove());//3
			System.out.println(queue1.remove());//4
			System.out.println(queue1.remove());//5
//			System.out.println(queue1.remove());//빼올 값이 없는 경우 오류 발생
			
			System.out.println("============");
		
		
		//2 예외 처리를 포함한 메소드(offer(),peek(),poll()) <==권장사항
			Queue<Integer>queue2=new LinkedList<>();
			
			System.out.println(queue2.peek()); //null , 예외 처리되어 오류가 발생되지 않음
			
			//2-1 offer(E item): 값을 추가할 때 사용
			queue2.offer(3);
			queue2.offer(4);
			queue2.offer(5);
		
			//2-2 E peek(): 나올 값 미리보기
			System.out.println(queue2.peek());
			
			//2-3 poll(): 값 빼오기
			System.out.println(queue2.poll());//3
			System.out.println(queue2.poll());//4
			System.out.println(queue2.poll());//5
			System.out.println(queue2.poll());//null
	}
}
