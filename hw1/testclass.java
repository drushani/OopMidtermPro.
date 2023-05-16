package homework1;

public class testclass {

	public static void main(String[] args) {
		System.out.println( "©@°Ø: " ) ;
		BeverageMaker b1 = new CoffeeMaker() ;
		b1.prepare() ;
		System.out.println( "\n¯ù:" ) ;
		BeverageMaker b2 = new TeaMaker() ;
		b2.prepare( "¥h¦B" ) ;
	}

}
