package domein;

import java.util.ArrayList;
import java.util.List;

public class Repository {
	private List<Gebruiker> spelers;
	public Repository() {
		spelers = new ArrayList<>();
	}
	public List<Gebruiker> geefSpelers(){
		return spelers;
	}
	public void voegSpelerToe(Gebruiker speler) {
		spelers.add(speler);
	}
}
