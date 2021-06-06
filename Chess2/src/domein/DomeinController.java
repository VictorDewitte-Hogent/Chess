package domein;

import java.util.List;

import exceptions.NaamIsLeegException;
import utility.Language;

public class DomeinController {
	private Repository repo;
	
	private Language t;
	public DomeinController(Language t) {
		repo = new Repository();
		
		this.t = t;
		
	}
	public void meldAan(String naam) throws NaamIsLeegException {
		Gebruiker g1 = new Gebruiker(naam);
		repo.voegSpelerToe(g1);
	}
	
}
