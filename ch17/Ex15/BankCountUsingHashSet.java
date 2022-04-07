package ch17.Ex15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;


class Account{ //계좌정보를 저장하는 객체, 중요한 필드, private(캡슐화)
				//DTO,VO <==각 계층으로 필드의 값을 저장하고 전달
				//객체명 필드접근(x), 생성자(o), getter(o), setter(o)
	private String ano; //계좌 번호
	private String owner; //계좌 주, 이름
	private int balance; //통장 금액
	
	public Account(String ano,String owner,int balance) { //객체 생성 시 필드의 값을 받아서 필드에 로드
		this.ano=ano;
		this.owner=owner;
		this.balance=balance;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Account)
			if ((this.ano).equals(((Account)obj).ano)) {
				return true;
			}
		return false;
	}
	@Override
		public int hashCode() {
			return Objects.hash(ano);
		}
}
public class BankCountUsingHashSet {
	//컬렉션(ArrayList<E>)을 사용해서 Account 객체 등록
	//배열은 방의 크기가 고정됨
	//컬렉션은 방의 크기가 동적임.무한히 저장할 수 있음
	private static Set<Account>accounts=new HashSet<>();
	//컬렉션의 방에 값을 넣을 경우 add():제일 마지막 방에 값을 추가, size()<==컬렉션의 개수
	//각 방의 값을 삭제 시 remove(i)
	private static Scanner scanner=new Scanner(System.in);
	
	
	private static void creatAccount() {
		//계좌 생성 - 스캐너로 계좌번호,이름,초기 통장금액 입력받음
		//배열 객체에 저장
		System.out.println("1. 계좌 생성");
		System.out.println("계좌 번호를 입력하세요 >>");
		String ano=scanner.next(); //계좌 번호를 입력받아서 ano 변수에 할당(메소드 내에서만 사용하는 지역변수)
		System.out.println("이름을 입력하세요 >>");
		String owner=scanner.next();
		System.out.println("계좌 개설 시 초기 금액을 입력하세요 >>");
		int balance=scanner.nextInt();
		//각 필드의 정보를 사용자로부터 할당받아서 객체를 생성 후 객체에 필드값을 저장
		Account newAccount=new Account(ano, owner, balance); //생성자를 통해서 객체에 필드값 적용 후 객체 생성
		
		accounts.add(newAccount);
		System.out.println("계좌 생성 완료");
	}
			
	private static void accountList() {
		//계좌 목록 출력 - 배열에 저장된 객체를 가져와서 객체 정보 출력(계좌번호,이름,금액)
		//배열의 각 방을 순회하면서 null이 아닌 경우 배열에서 객체르르 꺼내서 필드의 정보를 출력
		System.out.println("2. 계좌 목록");
		Iterator<Account>iterator=accounts.iterator();
		while (iterator.hasNext()) {
			Account account = (Account) iterator.next();
			if (account !=null) {
				System.out.print(account.getAno());
				System.out.print("    ");
				System.out.print(account.getOwner());
				System.out.print("    ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}
	private static void deposit() {
		//예금 - 계좌번호를 입력받아서 객체에서 해당 계좌를 찾아 입금금액을 입력받아 해당 계좌에 저장 (for 사용)
		//1 사용자로부터 입금할 계좌를 받아야 함
		//2 사용자로부터 받은 계좌번호를 배열에 저장된 객체내의 계좌 번호를 확인 후 해당 계좌에 입금
		
		System.out.println("3. 예금하기");
		System.out.println("예금할 계좌를 입력해주세요 >>");
		String ano=scanner.next();
		System.out.println("예금할 금액을 입력하세요 >>");
		int balance=scanner.nextInt();
		
		Account account=findAccount(ano);
		
		if (account==null) {
			System.out.println("결과: 해당 계좌가 존재하지 않습니다. ");
			return;
		}
		account.setBalance(account.getBalance()+balance);
		System.out.println("결과: 입금이 성공적으로 입금되었습니다. ");

		
//		Iterator<Account>iterator=accounts.iterator();
//		while (iterator.hasNext()) {
//			Account account=iterator.next();
//			if ((account.getAno()).equals(ano)) {
//				account.setBalance(account.getBalance()+balance);
//				accounts.add(account);
//				System.out.println("결과: 입금이 성공적으로 입금되었습니다. ");
//				return;
//			}
//		}
//		System.out.println("결과: 해당 계좌가 존재하지 않습니다. ");

//		String ano=scanner.next();
//		for (int i = 0; i < accountArray.length; i++) {
//			if((accountArray[i].getAno()).equals(ano)) {
//				System.out.println("예금할 금액: ");
//				int b=scanner.nextInt();
////				accountArray[i].setBalance(accountArray[i].getBalance()+b);
////				accountArray[i]=new Account(accountArray[i].getAno(),accountArray[i].getOwner() , b+accountArray[i].getBalance());
//			}
//		}
	}
	private static void withdraw() {
		//출금 - 계좌번호를 입력받아 해당 계좌를 객체에서 찾아서 출금 (for 사용)
		
		System.out.println("4. 출금하기");
		System.out.println("출금할 계좌를 입력해주세요 >>");
		String ano=scanner.next();
		System.out.println("출금할 금액을 입력하세요 >>");
		int balance=scanner.nextInt();
		
		Account account=findAccount(ano);
		
		if (account==null) {
			System.out.println("결과: 해당 계좌가 존재하지 않습니다. ");
			return;
		}
		account.setBalance(account.getBalance()-balance);
		System.out.println("결과: 출금이 성공적으로 되었습니다. ");

		
//		Iterator<Account>iterator=accounts.iterator();
//		while (iterator.hasNext()) {
//			Account account=iterator.next();
//			if ((account.getAno()).equals(ano)) {
//				account.setBalance(account.getBalance()-balance);
//				accounts.add(account);
//				System.out.println("결과: 출금이 성공적으로 입금되었습니다. ");
//				return;
//			}
//		}
//		System.out.println("결과: 해당 계좌가 존재하지 않습니다. ");
	}
	//배열에서 Account 객체 내에 ano(계좌번호)와 동일한 계좌를 찾아서 찾은 객체를 리턴으로 돌려줌
	//예금, 출금할 때 사용되는 공통 코드, 여러 메소드에서 중복 사용될 때 별도의 메소드를 생성해서 중복 코드를 간단하게 만들어 준다.
	private static Account findAccount(String ano) { 
		Account account=null;
		
		Iterator<Account>iterator=accounts.iterator();
		while (iterator.hasNext()) {
			Account a1 = (Account) iterator.next();
			String dbAno=a1.getAno();
			if (dbAno.equals(ano)) {
				account=a1;
				return account;
			}
		}
//		for (int i = 0; i < accounts.size(); i++) {
//			if (accounts.iterator()!=null) { //배열 방의 값이 null이 아닐 경우
//				//각 객체의 방의 ano를 담는 변수 선언
//				String dbAno; //배열의 각 방에 저장된 객체의 ano를 dbAno 변수에 할당
//				if (dbAno.equals(ano)) {
//					account=accounts.iterator(); //account 참조 변수는 객체에 주소 정보를 담는다
//					break;
//				}
//			}
//		}
		return account;
	}
	
	public static void main(String[] args) {
		boolean run=true;
		while (run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.println("선택>>");
			int selectNo=scanner.nextInt();
			
			if (selectNo==1) {
				creatAccount(); 
			}else if (selectNo==2) {
				accountList();
			}else if (selectNo==3) {
				deposit();
			}else if (selectNo==4) {
				withdraw();
			}else if (selectNo==5) {
				run=false;
				//break;
			}
			
			
		}
		scanner.close();
		System.out.println("프로그램 종료");
		
	}

}
