package ch17.Ex06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

//HashSet으로 변환
//Member 클래스의 memberID를 equals(),hashCode() 오버라이딩

//set은 중복된 값을 저장할 수 있다
//wrapper클래스는 equals(), hashCpde()재정의 되어있음(중복된 값을 식별)
//wrapper 클래스는 Integer,Long, Double, Float, Character, Byte, Short, Boolean (기본자료형 8개)
 
class Member{ //DTO,VO : 각 계층간에 데이터를 받아서 전달해주는 클래스
	private int memberID;
	private String memberName;

	public Member(int memberID,String memberName) { //생성자를 통해 필드 값 할당
		this.memberID=memberID;
		this.memberName=memberName;
	}
	
	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberID +" 입니다.";
	}

	@Override
	public int hashCode() { //memberID 필드의 값이 동일할 때 동일한 해시코드를 만들어줌
		return Objects.hash(memberID); //,로 여러개를 조건(모두 동일할 경우)으로 hashCode를 생성할 수 있다.
//		return this.memberID; //return memberID; //하나의 필드만을 조건으로 hashCode 생성
	}

	@Override
	public boolean equals(Object obj) {//객체의 정보가 object로 업캐스팅
		if (obj instanceof Member)
//			Member mb=(Member)obj; //다운캐스팅
			if (this.memberID==((Member)obj).memberID) {
				return true;
			}
		return false;
	}
	
}

class MemberHashSet{ //MemberHashSet를 객체화하면 hashSet 객체가 생성된다.
	private Set<Member>hashSet;
	public MemberHashSet() { //기본 생성자
		hashSet=new HashSet<Member>();
	}
	
	public void addMember1(Member member){
		//member 객체를 추가하는 메소드
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		//iterator 사용하여 remove
		Iterator<Member>iterator=hashSet.iterator();
		
		while (iterator.hasNext()) {
//			if (hashSet.contains(memberId)) {
//				iterator.remove();
//				return true;
//			}
			Member member=iterator.next();
			int tempid=member.getMemberID();
			if (tempid==memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		//iterator로 저장된 모든 사용자 정보를 출력하는 메소드
		Iterator<Member>iterator=hashSet.iterator();
		
		while (iterator.hasNext()) {
//			Member member=iterator.next();
//			System.out.print(member+" ");
			System.out.println(iterator.next());
		}
		System.out.println();
	}
	public void showSize() {
		System.out.println(hashSet.size());
	}
}

public class ExMemberHashSet {
	public static void main(String[] args) {
		MemberHashSet memberHashSet=new MemberHashSet(); //객체를 생성하는 순간 hashset 필드가 활성화
		//메소드를 호출하기 위해서 객체 생성
		//addMember1(),addMember2(),removeMember(),showAllMember()
		Member memberlee=new Member(1001, "이지원");
		Member memberlee2=new Member(1001, "이지원");
		Member memberkim=new Member(1002, "김지원");
		Member memberpark=new Member(1003, "박지원");
		Member memberhong=new Member(1004, "홍지원");
		
		memberHashSet.addMember1(memberlee);
		memberHashSet.addMember1(memberlee2);
		memberHashSet.addMember1(memberkim);
		memberHashSet.addMember1(memberpark);
		memberHashSet.addMember1(memberhong);//각 객체를 hashSet에 저장
		
		memberHashSet.showSize(); //총 4개여야 함
		
		//모든 사용자 출력
		memberHashSet.showAllMember();
		
		//특정 id를 가진 사용자 제거
		memberHashSet.removeMember(1003);
		
		memberHashSet.showAllMember();
		
	}
}
