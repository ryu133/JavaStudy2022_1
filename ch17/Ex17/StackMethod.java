package ch17.Ex17;

import java.util.Stack;

//Stack 자료구조 : LIFO(Last In First Out): 제일 마지막에 저장한 값이 제일 처음으로 나옴


public class StackMethod {

	public static void main(String[] args) {
		Stack<Integer>stack=new Stack<>();
		
		//1 E push(E element): stack에 값을 넣을 때 사용
		stack.push(2);
		stack.push(3);
		stack.push(5);
		stack.push(7);
		
		//2 E peek(): 가져올 값을 위에서 쳐다봄(위에서 보이는 값?)
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println();
		
		//3 search(Object o): 검색(값을 넣었을 때 index 번호를 출력, 주의! 방 번호는 위에서 1부터 할당)
		System.out.println(stack.search(7)); //1
		System.out.println(stack.search(3)); //3
		System.out.println(stack.search(5)); //2
		System.out.println(stack.search(2)); //4
		System.out.println(stack.search(9)); //값이 존재하지 않을 경우 -1 리턴
		
		//4 E pop(): 스택의 값 빼오기, 제일 마지막에 넣은 값부터 가져올 수 있다
		System.out.println(stack.pop()); //7
		System.out.println(stack.pop()); //3
		System.out.println(stack.pop()); //5
		System.out.println(stack.pop()); //2
		System.out.println(stack);
		System.out.println();
		
		//5 boolean empty(): 비어있을 때 true 리턴
		System.out.println(stack.empty());
		
		
		
	}

}
