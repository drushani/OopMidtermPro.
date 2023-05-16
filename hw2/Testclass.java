package homework2;

public class Testclass {

	public static void main(String[] args) {    
		Dog [] dogs = new Dog[3] ;
		dogs[0] = new Dog( "小吉", 2 ) ;
		dogs[1] = new Dog( "小白", 8 ) ;
		dogs[2] = new Dog( "小黑", 4 ) ;
		MyUtility<Dog> util = new MyUtility<>() ;
		util.mysort( dogs );
		for ( int i = 0 ; i < dogs.length ; i++ ) {
			System.out.println( dogs[i].getName() + " " + dogs[i].getAge() ) ;
		}
		
		System.out.println( "\n" ) ;
		Integer [] numArr = { 2, 8, 4 } ; 
		MyUtility<Integer> util2 = new MyUtility<>() ;
		util2.mysort( numArr ) ;
		for ( int i = 0 ; i < numArr.length ; i++ ) {
			System.out.println( numArr[i] ) ;
		}
		
	}
}