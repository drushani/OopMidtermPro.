package hw3;

class LightAdapter extends Remote {
	private Light l ;
	
	public LightAdapter() {
		l = new Light();
	}
	
	public void execute() {
		if ( l.getBrightness() == 0 ) {
			l.dim();
		}
		else if ( l.getBrightness() == 1 ) {
			l.bright();
		}
		else {
			l.off();
		}
	}
}
