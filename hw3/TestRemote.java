package hw3;

public class TestRemote {

	public static void main(String[] args) {
		Remote [] arr = { new TelevisionAdapter(), new SoundboxAdapter(), new LightAdapter() } ;
		Remote r = new Remote(arr) ;
		r.buttonClicked(0);
		r.buttonClicked(1);
		r.buttonClicked(2);
		r.pressAllButtons();
	}

}
