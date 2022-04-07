package ch16.Ex06.Ex1;

public class PrintTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter =new GenericPrinter<>();
		powderPrinter.setMaterial(new Powder());
		
		Powder powder=powderPrinter.getMaterial(); //객체를 가져와서 powder에 할당
		powder.doPrinting();
		System.out.println(powder);
		
		
		GenericPrinter<Plastic> plasticPrinter =new GenericPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic=plasticPrinter.getMaterial();
		plastic.doPrinting();
		System.out.println(plastic);
		plasticPrinter.printing();
		
		//water는 material의 하위클래스나 인터페이스가 아니므로 타입에 저장할 수 없다
//		GenericPrinter<Water> waterPrinter =new GenericPrinter<>();
//		waterPrinter.setMaterial(new Water());
//		Water water=waterPrinter.getMaterial();
//		water.doPrinting();
//		System.out.println(water);
	}

}
