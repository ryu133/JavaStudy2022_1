package ch17.Ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//ArrayList
//값에 대해서 index 번호를 가지고 있음. 검색 속도가 빠름
//중간에 값을 추가/삭제 시 부하가 많이 걸릴 수 있음

//LinkedList
//각각의 값에 앞뒤 연결고리를 가지고 있음. 검색 시 index 번호가 할당됨. ArrayList보다 속도 느림
//중간에 값을 추가/삭제 시 부하가 걸리지 않음

public class ArrayListVSLinkedList {
	public static void main(String[] args) {
		//데이터 추가 시간 비교
		List<Integer>al1=new ArrayList<>();
		List<Integer>ll1=new LinkedList<>();
		long startTime=0,endTime=0;
		
		//arraylist에서 데이터 추가 시간
		startTime=System.nanoTime();//System.nanoTime(): 정적 메소드, 앞뒤 비교?
		for (int i = 0; i < 100000; i++) {
			al1.add(0,i);
		}
		endTime=System.nanoTime();
		System.out.println("arraylist 데이터 추가 시간 "+(endTime-startTime)+"ns");
		
		//linkedlist에서 데이터 추가 시간: arraylist보다 빠름
		startTime=System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			ll1.add(0,i);
		}
		endTime=System.nanoTime();
		System.out.println("linkedlist 데이터 추가 시간 "+(endTime-startTime)+"ns");
		
		//검색 시 비교: arraylist가 linkedlist보다 빠르다
		startTime=System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			al1.get(i);
		}
		endTime=System.nanoTime();
		System.out.println("arraylist 데이터 검색 시간 "+(endTime-startTime)+"ns");
		
		startTime=System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			ll1.get(i);
		}
		endTime=System.nanoTime();
		System.out.println("linkedlist 데이터 검색 시간 "+(endTime-startTime)+"ns");
		
		//데이터 삭제 시 실행 시간 비교 : linkedlist가 빠르다
		startTime=System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			al1.remove(0);
		}
		endTime=System.nanoTime();
		System.out.println("arraylist 데이터 삭제 시간 "+(endTime-startTime)+"ns");
		
		startTime=System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			ll1.remove(0);
		}
		endTime=System.nanoTime();
		System.out.println("linkedlist 데이터 삭제 시간 "+(endTime-startTime)+"ns");
		
	}
}
