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
 *   @return 
 */
	public boolean add(Voto v) {
		if (!this.esisteGiaVoto(v) && !this.votoConflitto(v)) {
		voti.add(v);
		return true;
	}
		else {
			return false; 
		}
	}
	/**
	 * Selezione il sottoinsieme di voti che hanno il punteggio specificato
	 * @param punti punteggio da ricerca
	 * @return lista di {@link Voto} aventi quel punteggio (eventualmente vuota) 
	 */
	
public List<Voto> cercaVoti(int punti) {
	List<Voto> result = new ArrayList<Voto> ();
	
	for(Voto v: this.voti) {
		if(v.getPunti()== punti) {
			result.add(v); 
		}
	}
	return result; 

	
	// Tre metodi per stampare i voti migliore risulta il 3

	//public void StampaVoti (int voto) {}

	//public String StampaVoti2(int voto) {}

	//public List<Voto> cercaVoti(int voto)

}
//solo int o char si posso confrontare con == devo usare equals

/**
 * Ricerca un {@link Voto} relativo al corso di cui è specificato il nome 
 * @param nomeEsame nome del corso da ricercare 
 * @return il {@link Voto} corrispondente, oppure il {@link null}
 */

public Voto cercaEsame(String nomeEsame) {
	//for (Voto v: this.voti) {
		//if(v.getCorso().equals(nomeEsame)) {
			//return v; POsso implemaentarlo come }}
	
	Voto voto = new Voto(0, nomeEsame, null); 
	
int pos = this.voti.indexOf(voto); 

if(pos==-1) 
	return null; 

else 
	return this.voti.get(pos);

}
/**
 * Dato un {@link Voto}, determina se esiste già un voto con uguale corso ed uguale 
 * punteggio
 * @param v
 * @return{@code true}, se ha trovato corso con punteggio uguale, 
 * {@code false} se non ha trovato un corso, oppure l'ha trovato con un voto diverso
 */

public boolean esisteGiaVoto(Voto v) {
	
	
	 int pos= this.voti.indexOf(v);
	  if (pos==-1) 
	  return false; 
	 else 
	  return (v.getPunti() == this.voti.get(pos).getPunti());
}
/**
 * Mi dice se il {@link Voto} {@code v} è in conflitto con uno dei  
 * @param v
 * @return{@code true} se il voto esiste ed ha punteggio diverso, 
 * {@code false} se il voto non esiste, oppure esiste ma ha lo stesso punteggio
 */

public boolean votoConflitto(Voto v)
{
	 int pos= this.voti.indexOf(v);
	  if (pos==-1) 
	  return false; 
	 else 
	  return (v.getPunti() != this.voti.get(pos).getPunti());	
}
public String toString() { 
	return this.voti.toString();
}
	 
	  
	 
	
	/**Voto trovato = this.cercaEsame(v.getCorso()); 
	if (trovato== null)
		return false; 
	if(trovato.getPunti()==v.getPunti()) {
		return true; 
	} else {
		return false; 
	}
	*/

public Libretto librettoMigliorato() {
	Libretto nuovo = new Libretto();
	for (Voto v: nuovo.voti) {
		
		//nuovo.add(new Voto(v.getPunti(),v.getCorso(), v.getData())); ma meglio aggiungere clone in voto 
		
		 nuovo.add(v.clone());
	}
	for (Voto v: nuovo.voti) {
		//v.setPunti(v.getPunti()+1);
		int punti = v.getPunti();
	
		if (punti<24)
			punti =punti+1 ;
			else if (punti <= 28)
				punti=punti+2;
		v.setPunti(punti);
		
	}
	
	return nuovo;
}

public void cancellaVotiScarsi() {
	List<Voto> cancellare = new ArrayList<Voto>();
	for(Voto v : this.voti) {
		if(v.getPunti()<24) {
			this.voti.remove(v);
		}
	}
	this.voti.removeAll(cancellare);
}


}

