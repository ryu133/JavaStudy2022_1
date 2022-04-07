package ch17.Ex05;

import java.util.ArrayList;

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
	
	
}

class MemberArrayList{ //MemberArrayist를 객체화하면 arraylist 객체가 생성된다.
	private ArrayList<Member>arrayList;
	public MemberArrayList() { //기본 생성자
		arrayList=new ArrayList<Member>();
	}
	
	public void addMember1(Member member){
		//member 객체를 받아서 마지막 방에 값을 추가하는 메소드
		arrayList.add(member);
	}
	public void addMember2(int i,Member member) {
		//특정 index에 값을 추가(삽입)
		try {
			arrayList.add(i, member);
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("예외가 발생되었습니다. index를 정확하게 입력하세요.");
		}
	}
	public boolean removeMember(int memberId) {
		
		for (int i = 0; i < arrayList.size(); i++) {
			Member member=arrayList.get(i); //각 방에 저장된 Member 객체를 member 참조변수에 할당
			int id=member.getMemberID(); //객체의 getMemberID()로 객체 내부의 memberID 값을 가져옴 
			//?arrayList의 각 방에 있는 Member 객체 
			if (id==memberId) {
				arrayList.remove(i);
				System.out.println("회원님의 ID("+memberId+")는 삭제되었습니다.");
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		//arraylist에 저장된 모든 사용자 정보를 출력하는 메소드
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i)); //각 방의 Member 객체를 가져와서 출력
		}
		System.out.println(arrayList);
	}
	public void showSize() {
		System.out.println(arrayList.size());
	}
}

public class ExMemberArrayList {
	public static void main(String[] args) {
		MemberArrayList memberArrayList=new MemberArrayList(); //객체를 생성하는 순간 arrayList 필드가 활성화
		//메소드를 호출하기 위해서 객체 생성
		//addMember1(),addMember2(),removeMember(),showAllMember()
		Member memberlee=new Member(1001, "이지원");
		Member memberkim=new Member(1002, "김지원");
		Member memberpark=new Member(1003, "박지원");
		Member memberhong=new Member(1004, "홍지원");
		
		memberArrayList.addMember1(memberlee);
		memberArrayList.addMember1(memberkim);
		memberArrayList.addMember1(memberpark);
		memberArrayList.addMember1(memberhong);//각 객체를 arraylist에 저장
		
		memberArrayList.showAllMember();
		memberArrayList.showSize();

		//특정 index방에 추가적 사용자 추가
		memberArrayList.addMember2(3, memberhong);
		memberArrayList.addMember2(6, memberhong); //예외처리
		
		memberArrayList.showSize();
		
		//모든 사용자 출력
		memberArrayList.showAllMember();
		
		//특정 id를 가진 사용자 제거
		memberArrayList.removeMember(1002);
		
		memberArrayList.showSize();
		
	}
}
