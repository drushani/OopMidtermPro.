package hw4;

public class TestClass {

	public static void main(String[] args) {
		Beverage b = new Beverage() ;
		b.addGreenTea() ;
		b.addMilk();
		b.addSugar() ;
		System.out.println( "飲料成分為" + b.getIngredient() ) ;
		System.out.println( "價錢是" + b.getCost() ) ;
		
		Beverage bb = new Beverage() ;
		bb.addBlackTea() ;
		bb.addPearl() ;
		bb.addSugar() ;
		System.out.println( "飲料成分為" + bb.getIngredient() ) ;
		System.out.println( "價錢是" + bb.getCost() ) ;		
	}

}
