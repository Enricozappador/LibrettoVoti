package it.polito.tdp.libretto;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<Voto> ();
	}
/**
 *  aggiunge un nuovo voto al libretto 
 *   @param v il {@link Voto} da aggiungere
 */
	public void add(Voto v) {
		voti.add(v); 
	}
	
public List<Voto> cercaVoti(int voto) {
	List<Voto> result = new ArrayList<Voto> ();
	
	for(Voto v: this.voti) {
		if(v.getPunti()== voto) {
			result.add(v); 
		}
	}
	return result; 
}
	
	// Tre metodi per stampare i voti migliore risulta il 3

	//public void StampaVoti (int voto) {}

	//public String StampaVoti2(int voto) {}

	//public List<Voto> cercaVoti(int voto)


}

