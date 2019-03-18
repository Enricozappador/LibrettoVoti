package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.List;

public class Test_Libretto {

	public static void main (String[] args ) {
		Libretto libr = new Libretto(); 
		
		libr.add(new Voto(30, "Analisi I", LocalDate.of(2017, 01, 15)) );
		libr.add(new Voto(18, "Analisi II", LocalDate.of(2018, 01, 22)) );
		libr.add(new Voto(20, "Fisica I", LocalDate.of(2017, 06, 18)) );
		libr.add(new Voto(25, "Fisica II", LocalDate.of(2017, 01, 15)) );
		libr.add(new Voto(27, "Basi di Dati", LocalDate.of(2018, 01, 27)) );
		libr.add(new Voto(19, "Ricerca Operativa", LocalDate.of(2018, 07, 22)) );
		libr.add(new Voto(26, "Economia", LocalDate.of(2018, 06, 25)) );
		libr.add(new Voto(22, "Statistica", LocalDate.of(2018, 02, 10)) );
		libr.add(new Voto(29, "Logistica", LocalDate.of(2019, 02, 20)) );
		libr.add(new Voto(27, "Informatica", LocalDate.of(2017, 02, 20)) );
		
		List<Voto> venticinque = libr.cercaVoti(25);
		
		System.out.println(venticinque); 
		
		Voto a1 = libr.cercaEsame("Analisi I"); 
		Voto a3 = libr.cercaEsame("Analisi III"); 
		System.out.println(a1);
		System.out.println(a3);
		
	}
}
