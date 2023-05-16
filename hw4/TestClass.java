package hw4;

public class TestClass {

	public static void main(String[] args) {
		Beverage b = new Beverage() ;
		b.addGreenTea() ;
		b.addMilk();
		b.addSugar() ;
		System.out.println( "都Θだ" + b.getIngredient() ) ;
		System.out.println( "基窥琌" + b.getCost() ) ;
		
		Beverage bb = new Beverage() ;
		bb.addBlackTea() ;
		bb.addPearl() ;
		bb.addSugar() ;
		System.out.println( "都Θだ" + bb.getIngredient() ) ;
		System.out.println( "基窥琌" + bb.getCost() ) ;		
	}

}
