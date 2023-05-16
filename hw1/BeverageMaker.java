package homework1;

abstract class BeverageMaker { 
	
	public final void prepare( String IceKind ) { // 加冰
		boilWater() ;
		brew() ;
		pourInCup() ;
		addIce( IceKind ) ;
		addCondiment() ;
	}
	
	public final void prepare() { // 沒加冰
		boilWater() ;
		brew() ;
		pourInCup() ;
		addCondiment() ;
	}
	
	public void boilWater() {
		System.out.println( "煮水" ) ;
	}
	
	public void brew() {}
	
	public void pourInCup() {
		System.out.println( "倒進杯子" ) ;
	}
	
	public void addIce( String IceKind ) {
		System.out.println( IceKind ) ;
	}
	
	public void addCondiment() {}
	

}