package hw3;

import java.util.Collections;
import java.util.LinkedList ;

class Remote {
	private LinkedList<Remote> control ;
	
	public Remote(){
		
	}
	
	public Remote( Remote[] array ) {
		control = new LinkedList<>();
		Collections.addAll(control,array);
	}
	
	public void buttonClicked( int buttonId ) {
		Remote obj = control.get(buttonId);
		obj.execute();
	}
	
	public void pressAllButtons() {
		for( Remote obj : control ) {
			obj.execute();
		}
	}
	
	public void execute() {}
}
