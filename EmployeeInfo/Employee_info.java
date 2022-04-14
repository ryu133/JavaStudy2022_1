package EmployeeInfo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

import ch17.Ex16.Account;

class Employee{ //사원의 정보르르 담은 클래스
	int empNo; //사원 번호
	String empName; //사원 이름
	String phone; //연락처
	int age; //나이
	String dept; //부서
	String compRank; //직급
	
	public Employee(int empNo,String empName,String phone,int age,String dept,String compRank) {
		this.empNo=empNo;
		this.empName=empName;
		this.phone=phone;
		this.age=age;
		this.dept=dept;
		this.compRank=compRank;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCompRank() {
		return compRank;
	}
	public void setCompRank(String compRank) {
		this.compRank = compRank;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee)
			if ((this.empNo)==(((Employee)obj).empNo)) {
				return true;
			}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empNo);
	}
}



public class Employee_info {
	private static TreeSet<Employee>employees=new TreeSet<>(new Comparator<Employee>() {
		public int compare(Employee o1, Employee o2) {
			if ((o1.getEmpNo())<(o2.getEmpNo())) {
				return -1;
			}else if (o1.getEmpNo()==(o2.getEmpNo())) {
				return 0;
			}else {
				return 1;
			}
		}
	});
	private static Scanner scanner=new Scanner(System.in);
	
	private static void createEmployee() {
		System.out.println("사번: ");
		int empNo=scanner.nextInt();
		System.out.println("이름: ");
		String empName=scanner.next();
		System.out.println("연락처: ");
		String phone=scanner.next();
		System.out.println("나이: ");
		int age=scanner.nextInt();
		System.out.println("부서: ");
		String dept=scanner.next();
		System.out.println("직급: ");
		String compRank=scanner.next();
		
		Employee employee=new Employee(empNo, empName, phone, age, dept, compRank);
		employees.add(employee);
		System.out.println(empName+"님의 정보가 정상적으로 등록되었습니다.");
	}
	private static void employeeList() {
		Iterator<Employee>iterator=employees.iterator();
		
		while (iterator.hasNext()) {
			Employee employee = iterator.next();
			if (employee!=null) {
				System.out.print(employee.getEmpNo());
				System.out.print("    ");
				System.out.print(employee.getEmpName());
				System.out.print("    ");
				System.out.print(employee.getPhone());
				System.out.print("    ");
				System.out.print(employee.getAge());
				System.out.print("    ");
				System.out.print(employee.getDept());
				System.out.print("    ");
				System.out.print(employee.getCompRank());
				System.out.print("    ");
				System.out.println();
			}
		}
	}
	private static void reviseEmployee(){
		System.out.println("수정할 사번: ");
		int empNo=scanner.nextInt();
		
		Employee employee=findEmployee(empNo);
		
		if (employee==null) {
			System.out.println("결과: 해당 사원은 존재하지 않습니다. ");
			return;
		}
		
		System.out.println("수정할 필드 선택 [1. 연락처, 2. 나이, 3. 부서, 4. 직급]: ");
		int reNo=scanner.nextInt();
		
		if (reNo==1) {
			System.out.println("연락처 수정 >>");
			String phone=scanner.next();
			employee.setPhone(phone);
		}else if (reNo==2) {
			System.out.println("나이 수정 >>");
			int age=scanner.nextInt();
			employee.setAge(age);
		}else if (reNo==3) {
			System.out.println("부서 수정 >>");
			String dept=scanner.next();
			employee.setEmpName(dept);
		}else if (reNo==4) {
			System.out.println("직급 수정 >>");
			String compRank=scanner.next();
			employee.setCompRank(compRank);
		}
		
		System.out.println("결과: 성공적으로 완료되었습니다. ");
	}
	
	private static void removeEmployee() {
		System.out.println("삭제할 사번: ");
		int reNo=scanner.nextInt();
		
		Employee employee =findEmployee(reNo);
		
		if (employee==null) {
			System.out.println("결과: 해당 사원은 존재하지 않습니다. ");
			return;
		}
		
		employees.remove(employee);
		System.out.println(employee.getEmpName()+" 사원이 삭제되었습니다.");
		
	}
	
	private static Employee findEmployee(int empNo) {
		Employee employee=null;
		Iterator<Employee>iterator=employees.iterator();
		while (iterator.hasNext()) {
			Employee em1 = (Employee) iterator.next();
			int dbNo=em1.getEmpNo();
			if (dbNo==empNo) {
				employee=em1;
				return employee;
			}
		}
		return employee;
	}
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("=========사원관리 프로그램==========");
			System.out.println("# 1. 사원정보 신규등록");
			System.out.println("# 2. 사원정보 검색");
			System.out.println("# 3. 사원정보 수정");
			System.out.println("# 4. 사원정보 삭제");
			System.out.println("# 5. 프로그램 종료");
			System.out.println("===============================");
			System.out.println("메뉴 입력 : ");
			
			int selectNo=scanner.nextInt();
			
			if (selectNo==1) {
				createEmployee();
			}else if (selectNo==2) {
				employeeList();
			}else if (selectNo==3) {
				reviseEmployee();
			}else if (selectNo==4) {
				removeEmployee();
			}else if (selectNo==5) {
				break;
			}
		}
		
		scanner.close();
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
	}
}
