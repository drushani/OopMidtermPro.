package hw3;

class TelevisionAdapter extends Remote {
	private Television t ;
	
	public TelevisionAdapter(){
		t = new Television() ;
	}
	
	public void execute() {
		if ( t.getStatus() ) {
			t.off();
		}
		else {
			t.on();
		}
	}
}
