package pattern_commande.recepteur;

public class Stereo {

	String string;

	public Stereo(String string) {
		this.string = string;
	}

	public void setVolume(int volume) {
	}

	public void marche() {
		System.out.println(this.string +": marche");
	}
	public void arret() {
		System.out.println(this.string +": marche");
	}

	public void setCD() {
	}

}
