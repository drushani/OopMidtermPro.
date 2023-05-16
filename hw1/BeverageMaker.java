package homework1;

abstract class BeverageMaker { 
	
	public final void prepare( String IceKind ) { // �[�B
		boilWater() ;
		brew() ;
		pourInCup() ;
		addIce( IceKind ) ;
		addCondiment() ;
	}
	
	public final void prepare() { // �S�[�B
		boilWater() ;
		brew() ;
		pourInCup() ;
		addCondiment() ;
	}
	
	public void boilWater() {
		System.out.println( "�N��" ) ;
	}
	
	public void brew() {}
	
	public void pourInCup() {
		System.out.println( "�˶i�M�l" ) ;
	}
	
	public void addIce( String IceKind ) {
		System.out.println( IceKind ) ;
	}
	
	public void addCondiment() {}
	

}