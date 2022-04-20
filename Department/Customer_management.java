package Department;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/*
 * ��ȭ���� �� ���� ���α׷�(��� ������)
 * 
 *  �� ���: 1. �Ϲݰ�(silver) : ���ʽ� ����Ʈ(%1����), ����(����)
 *  		2. gold : ����Ʈ 2%, ���� 5%
 *  		3. vip : ����Ʈ 5%, ���� 10%, ��� �������� ����
 */

class Customer{ //�Ϲ� ��(silver)
	int coustomerID; //�� ID
	String customerName; //�� �̸�
	String customerGrade; //�� ��� (silver,gold,vip)
	double bonusPoint; //����Ʈ
	double bonusRatio; //����Ʈ ������ (silver: 1%, gold: 2%, vip: 5%)
	
	
	//�����ڿ��� �⺻���� 2���� �ʵ��� ���� �ε� : customerGread: Silver, bonusRatio: 1%

	public Customer(int coustomerID, String customerName, String customerGrade, Double bonusPoint, double bonusRatio) {
		this.coustomerID = coustomerID;
		this.customerName = customerName;
		this.customerGrade = customerGrade;
		this.bonusPoint = bonusPoint;
		this.bonusRatio = bonusRatio;
	}
	public double calcPrice(int price) {		//���� Ŭ�������� �������̵��ؼ� ó��
		//��ǰ�� ������ �޾Ƽ� ���ʽ� ����Ʈ�� �����ϴ� �ڵ�
		bonusPoint+=price*bonusRatio;
		return price;// ���ε� ������ ����
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
	double saleRatio; //��ǰ ���η� (�����ڿ��� �⺻����
	
	
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
	//�����ڿ��� �⺻���� 3���� �ʵ��� ���� �ε� : customerGread: Gold, bonusRatio: 2%, sailRatio: 5%

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
	private int agentID; //������, setter, �ʵ�(x)
	double saleRatio;  //���� 10%
	
	
	public VipCustomer(int coustomerID, String customerName, String customerGrade, double bonusPoint, double bonusRatio,
			int agentID, double saleRatio) {
		super(coustomerID, customerName, customerGrade, bonusPoint, bonusRatio);
		this.agentID = agentID;
		this.saleRatio = saleRatio;
	}


	//�����ڿ��� �⺻���� 3���� �ʵ��� ���� �ε� : customerGread: Vip, bonusRatio: 5%, sailRatio: 10%
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
			//�� ID(customerID) �ߺ����� �ʵ��� ó��
		
		while (true) {
			System.out.println("====================================================================================");
			System.out.println(" 1. �Ϲݰ� ��� | 2. VIP ����� | 3. Gold �� ��� | 4. ���� ��� | 5. ��ǰ���� | 6. ���� ");
			System.out.println("====================================================================================");
			System.out.println("���� >>");

			int selectNo=scanner.nextInt();
			
			if (selectNo==1) {
				System.out.println("==�Ϲݰ� ��� �Դϴ�. ==");
				System.out.println("�� ���̵� : ");
				int customerID=scanner.nextInt();
				System.out.println("���̸� : ");
				String customerName=scanner.next();
				
				Customer customer=new Customer(customerID, customerName, "SILVER", 0.0, 0.01);
				customers.add(customer);
				
			}else if (selectNo==2) {
				System.out.println("==VIP �� ��� �Դϴ�. ==");
				System.out.println("�� ���̵� : ");
				int customerID=scanner.nextInt();
				System.out.println("���̸� : ");
				String customerName=scanner.next();
				System.out.println("��翡����Ʈ(ID) ��� : ");
				int agentID=scanner.nextInt();
				
				Customer customer=new VipCustomer(customerID, customerName, "VIP", 0, 0.05, agentID, 0.1);
				customers.add(customer);
				
			}else if (selectNo==3) {
				System.out.println("==Gold �� ��� �Դϴ�. ==");
				System.out.println("�� ���̵� : ");
				int customerID=scanner.nextInt();
				System.out.println("���̸� : ");
				String customerName=scanner.next();
				
				Customer customer=new GoldCustomer(customerID, customerName, "GOLD", 0, 0.02, 0.05);
				customers.add(customer);
				
			}else if (selectNo==4) {
				System.out.println("==�� ���� ���  �Դϴ�. ==");
				for (Customer customer : customers) {
					System.out.println(customer);
				}
				
			}else if (selectNo==5) {
				System.out.println("==��ǰ������ ������ �ּ��� ==");
				System.out.println("�� ���̵� : ");
				int customerID=scanner.nextInt();
				System.out.println("���� ��ǰ ���� :  ");
				int price=scanner.nextInt();
				
				
				Customer customer=null;
				Iterator<Customer>iterator=customers.iterator();
				while (iterator.hasNext()) {
					Customer c1=iterator.next();
					int customerId=c1.coustomerID;
					if (customerId==customerID) {
						customer=c1;
						double p1=customer.calcPrice(price);
						System.out.println(customerID+" ���� "+p1+"�� ���� �ϼ̽��ϴ�.");
						System.out.println(customerID+" ������ ����� "+customer.customerGrade +" �̰� ���� ����Ʈ�� "+customer.bonusPoint +"�̰� ������ "+(price-p1)+"�� �Ǿ����ϴ�. ");
					}
				}
				

				if (customer==null) {
					System.out.println("������ ID�� �������� �ʽ��ϴ�.");
				}
				
				
								
			}else if (selectNo==6) {
				break;
			}
		
		
		}
		
		scanner.close();
		System.out.println("����");
		
		
		
		
		
		
	}
}
