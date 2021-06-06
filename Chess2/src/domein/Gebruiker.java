package domein;

import exceptions.NaamIsLeegException;


public class Gebruiker {
	private String naam;

	public Gebruiker(String naam) throws NaamIsLeegException {
		setNaam(naam);
	}

	private void setNaam(String naam) throws NaamIsLeegException {
		if(naam.isEmpty())
			throw new NaamIsLeegException();
		this.naam = naam;
		
	}
	public String getNaam() {
		return naam;
		
	}
}
