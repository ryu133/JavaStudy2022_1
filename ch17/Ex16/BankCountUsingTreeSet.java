package ch17.Ex16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//Account 객체를 TreeSet에 저장. ano[계좌번호],owner[이름], balance[예금 금액]
//TreeSet에 일반 객체를 넣을 때 어떤 컬럼을 정렬할지 지정. Comparable<E>, Comparator<E>
//Account 객체를 수정하지 않고 balance 값이 큰것부터 출력되도록 구성. 내림차순
//compare()에 양수와 음수 바꾸기 or descendingSet()

public class BankCountUsingTreeSet {
	private static TreeSet<Account>accounts=new TreeSet<>(new Comparator<Account>() {
		public int compare(Account o1, Account o2) {
			if ((o1.getBalance())<(o2.getBalance())) {
				return 1;
			}else if (o1.getBalance()==(o2.getBalance())) {
				return 0;
			}else {
				return -1;
			}
		}
	});
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
		
//		NavigableSet<Account>navigableSet=accounts.descendingSet();
//		Iterator<Account>iterator=navigableSet.iterator();
		Iterator<Account>iterator=accounts.iterator();
		
		while (iterator.hasNext()) {
			Account account = iterator.next();
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
		System.out.println("결과: 입금이 성공적으로 되었습니다. ");


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
