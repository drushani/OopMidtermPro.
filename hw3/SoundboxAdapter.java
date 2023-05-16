package hw3;

class SoundboxAdapter extends Remote {
	private Soundbox s ;
	
	public SoundboxAdapter() {
		s = new Soundbox();
	}
	
	public void execute() {
		if ( s.getLevel() == 0 ) {
			s.low();
		}
		else if ( s.getLevel() == 1 ) {
			s.medium();
		}
		else if (s.getLevel() == 2) {
			s.high();
		}
		else {
			s.off();
		}
	}
}
