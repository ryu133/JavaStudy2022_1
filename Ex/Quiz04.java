package Ex;

import java.util.Objects;

class E extends Object{//切郊税 乞窮 適掘什澗 object税 切縦 適掘什戚陥.
						//object 適掘什拭 舛税吉 五社球研 紫遂拝 呪 赤陥.
	String name;
	E(){} //奄沙 持失切: 適掘什 鎧拭 陥献 持失切亜 糎仙拝 凶 須採拭辞 奄沙持失切研 硲窒拝 凶 持繰鞠檎 照喫
	E(String name){
		this.name=name; //古鯵痕呪 戚硯, 姥薄採拭辞 古鯵痕呪研 閤澗 痕呪誤, 琶球税 痕呪誤戚 乞砧 疑析拝 井酔
	}					//this: 切縦税 梓端
	@Override
	public String toString() { //梓端 切端研 窒径拝 凶 toString() 硲窒喫
		return "戚硯 : " + name + " "; //this.name
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) { //穣蝶什特 希びけけけけけけけけけけけ
		if (this.name == ((E)obj).name) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
class Student2{
	int studentID;
	String name;
	int kor;
	int eng;
	
	Student2(int studentID,String name,int kor, int eng){
		this.studentID=studentID;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.studentID==((Student2)obj).studentID) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return studentID+", "+name+", "+kor+", "+eng;
	}
}
public class Quiz04 {
	public static void main(String[] args) {
		Student2 s1=new Student2(111,"a",88,85);
		Student2 s2=new Student2(222,"b",89,87);
		Student2 s3=new Student2(333,"c",87,88);
		Student2 s4=new Student2(111,"d",86,89);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		//studentID 亜 旭精 井酔 "旭精 俳持脊艦陥." 窒径
		//== : 奄沙展脊(boolean, byte, shot, int, long, double, float, char)  8
		//equals() : 凧繕展脊(壕伸, 梓端, string)
		
		//object税 toString(),equals()研 仙舛税
				// : 梓端税 爽社研 搾嘘. 仙舛税背辞 梓端 鎧税 働舛 琶球税 葵聖 搾嘘
		//toString():梓端 切端研 窒径 獣 爽社葵 窒径喫 鳶徹走誤.適掘什誤@背習坪球
				//神獄虞戚漁背辞 梓端税 琶球 舛左 窒径
		//
//		System.out.println(s1.equals(s4)); //true
		if (s1.equals(s4)) {
			System.out.println("旭精 俳持脊艦陥.");
			
		}else {
			System.out.println("陥献 俳持脊艦陥.");
			
		}
		
		
		E e1=new E(); //奄沙持失切 硲窒: 琵税 琶球税 葵精 悪薦 段奄鉢喫
		System.out.println(e1.name); //null
		E e2=new E("壱丞戚");
		System.out.println(e2.name);
		E e3=new E("壱丞戚");
		System.out.println(e2==e3); //凧繕展脊税 ==澗 梓端税 爽社 搾嘘
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e2.equals(e3)); //equals() 梓端税 爽社 搾嘘
		//object税 toString(),equals()澗 仙舛税背辞 紫遂
		
		
		
	}

}
