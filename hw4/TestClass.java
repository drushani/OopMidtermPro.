package hw4;

public class TestClass {

	public static void main(String[] args) {
		Beverage b = new Beverage() ;
		b.addGreenTea() ;
		b.addMilk();
		b.addSugar() ;
		System.out.println( "���Ʀ�����" + b.getIngredient() ) ;
		System.out.println( "�����O" + b.getCost() ) ;
		
		Beverage bb = new Beverage() ;
		bb.addBlackTea() ;
		bb.addPearl() ;
		bb.addSugar() ;
		System.out.println( "���Ʀ�����" + bb.getIngredient() ) ;
		System.out.println( "�����O" + bb.getCost() ) ;		
	}

}
