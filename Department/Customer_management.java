package Department;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/*
 * 백화점의 고객 관리 프로그램(상속 다형성)
 * 
 *  고객 등급: 1. 일반고객(silver) : 보너스 포인트(%1적립), 할인(없음)
 *  		2. gold : 포인트 2%, 할인 5%
 *  		3. vip : 포인트 5%, 할인 10%, 담당 에이젼드 존재
 */

class Customer{ //일반 고객(silver)
	int coustomerID; //고객 ID
	String customerName; //고객 이름
	String customerGrade; //고객 등급 (silver,gold,vip)
	double bonusPoint; //포인트
	double bonusRatio; //포인트 적립률 (silver: 1%, gold: 2%, vip: 5%)
	
	
	//생성자에서 기본으로 2개의 필드의 값을 로드 : customerGread: Silver, bonusRatio: 1%

	public Customer(int coustomerID, String customerName, String customerGrade, Double bonusPoint, double bonusRatio) {
		this.coustomerID = coustomerID;
		this.customerName = customerName;
		this.customerGrade = customerGrade;
		this.bonusPoint = bonusPoint;
		this.bonusRatio = bonusRatio;
	}
	public double calcPrice(int price) {		//하위 클래스에서 오버라이딩해서 처리
		//물품의 가격을 받아서 보너스 포인트를 적립하는 코드
		bonusPoint+=price*bonusRatio;
		return price;// 할인된 가격을 리턴
	}
	@Override
	public String toString() {
		return "Customer [coustomerID=" + coustomerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + (int)bonusRatio*100 + "%]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			if (this.coustomerID==((Customer)obj).coustomerID) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(coustomerID);
	}
}
	

class GoldCustomer extends Customer{
	double saleRatio; //물품 할인률 (생성자에서 기본으로
	
	
	public GoldCustomer(int coustomerID, String customerName, String customerGrade, double bonusPoint,
			double bonusRatio, double saleRatio) {
		super(coustomerID, customerName, customerGrade, bonusPoint, bonusRatio);
		this.saleRatio = saleRatio;
	}


	@Override
	public double calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		price-=(price*saleRatio);
		return price;
	}
	//생성자에서 기본으로 3개의 필드의 값을 로드 : customerGread: Gold, bonusRatio: 2%, sailRatio: 5%

	@Override
	public String toString() {
		return "GoldCustomer [coustomerID=" + coustomerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + (int)bonusRatio*100 +"%, saleRatio=" + (int)saleRatio*100+ "%]";
	}


	public double getSaleRatio() {
		return saleRatio;
	}


	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof GoldCustomer) {
			if (this.coustomerID==((GoldCustomer)obj).coustomerID) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(coustomerID);
	}
	
}

class VipCustomer extends Customer{
	private int agentID; //생성자, setter, 필드(x)
	double saleRatio;  //할인 10%
	
	
	public VipCustomer(int coustomerID, String customerName, String customerGrade, double bonusPoint, double bonusRatio,
			int agentID, double saleRatio) {
		super(coustomerID, customerName, customerGrade, bonusPoint, bonusRatio);
		this.agentID = agentID;
		this.saleRatio = saleRatio;
	}


	//생성자에서 기본으로 3개의 필드의 값을 로드 : customerGread: Vip, bonusRatio: 5%, sailRatio: 10%
	@Override
	public double calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		price-=(price*saleRatio);
		return price;
	}
	

	@Override
	public String toString() {
		return "VipCustomer [coustomerID=" + coustomerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + (int)bonusRatio*100 +"%, agentID=" + agentID + ", saleRatio=" + (int)saleRatio*100+ "%]";
	}


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof VipCustomer) {
			if (this.coustomerID==((VipCustomer)obj).coustomerID) {
				return true;
			}
		}
		return false;
	}


	@Override
	public int hashCode() {
		return Objects.hash(coustomerID);
	}
	
}

public class Customer_management {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Set<Customer>customers=new HashSet<>();
			//고객 ID(customerID) 중복되지 않도록 처리
		
		while (true) {
			System.out.println("====================================================================================");
			System.out.println(" 1. 일반고객 등록 | 2. VIP 고객등록 | 3. Gold 고객 등록 | 4. 정보 출력 | 5. 물품구매 | 6. 종료 ");
			System.out.println("====================================================================================");
			System.out.println("선택 >>");

			int selectNo=scanner.nextInt();
			
			if (selectNo==1) {
				System.out.println("==일반고객 등록 입니다. ==");
				System.out.println("고객 아이디 : ");
				int customerID=scanner.nextInt();
				System.out.println("고객이름 : ");
				String customerName=scanner.next();
				
				Customer customer=new Customer(customerID, customerName, "SILVER", 0.0, 0.01);
				customers.add(customer);
				
			}else if (selectNo==2) {
				System.out.println("==VIP 고객 등록 입니다. ==");
				System.out.println("고객 아이디 : ");
				int customerID=scanner.nextInt();
				System.out.println("고객이름 : ");
				String customerName=scanner.next();
				System.out.println("담당에이젼트(ID) 등록 : ");
				int agentID=scanner.nextInt();
				
				Customer customer=new VipCustomer(customerID, customerName, "VIP", 0, 0.05, agentID, 0.1);
				customers.add(customer);
				
			}else if (selectNo==3) {
				System.out.println("==Gold 고객 등록 입니다. ==");
				System.out.println("고객 아이디 : ");
				int customerID=scanner.nextInt();
				System.out.println("고객이름 : ");
				String customerName=scanner.next();
				
				Customer customer=new GoldCustomer(customerID, customerName, "GOLD", 0, 0.02, 0.05);
				customers.add(customer);
				
			}else if (selectNo==4) {
				System.out.println("==고객 정보 출력  입니다. ==");
				for (Customer customer : customers) {
					System.out.println(customer);
				}
				
			}else if (selectNo==5) {
				System.out.println("==물품가격을 지불해 주세요 ==");
				System.out.println("고객 아이디 : ");
				int customerID=scanner.nextInt();
				System.out.println("구매 물품 가격 :  ");
				int price=scanner.nextInt();
				
				
				Customer customer=null;
				Iterator<Customer>iterator=customers.iterator();
				while (iterator.hasNext()) {
					Customer c1=iterator.next();
					int customerId=c1.coustomerID;
					if (customerId==customerID) {
						customer=c1;
						double p1=customer.calcPrice(price);
						System.out.println(customerID+" 고객님 "+p1+"원 지불 하셨습니다.");
						System.out.println(customerID+" 고객님의 등급은 "+customer.customerGrade +" 이고 현재 포인트는 "+customer.bonusPoint +"이고 할인은 "+(price-p1)+"원 되었습니다. ");
					}
				}
				

				if (customer==null) {
					System.out.println("고객님의 ID가 존재하지 않습니다.");
				}
				
				
								
			}else if (selectNo==6) {
				break;
			}
		
		
		}
		
		scanner.close();
		System.out.println("종료");
		
		
		
		
		
		
	}
}
