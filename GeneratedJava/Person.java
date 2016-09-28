package Person;

import felles.ISO.ISO 3166 - Landkoder.Landkode;
import Adresse.GeografiskAdresse;
import Akt�r.Akt�r;

/**
 * private, fysiske personer
 * @author Tor Kjetil
 * @version 1.0
 * @created 28-sep-2016 17.31.25
 */
public abstract class Person extends Akt�r {

	/**
	 * dato for d�dsfall
	 */
	public dateTime d�dsdato;
	/**
	 * land hvor d�dsfall fant sted
	 */
	public Landkode d�dsland;
	/**
	 * sted hvor d�dsfall fant sted
	 */
	public string d�dssted;
	/**
	 * fullt utskrevet navn
	 */
	public string fulltNavn;
	/**
	 * land for f�dsel
	 */
	public Landkode f�deland;
	/**
	 * sted for f�dsel
	 */
	public string f�dested;
	/**
	 * dato for f�dsel
	 */
	public dateTime f�dselsdato;
	/**
	 * kj�nn for person
	 * 
	 * Merknad: Sosialt kj�nn? Se ISO 5218 - Representation of Human Sexes. 
	 */
	public Kj�nn kj�nn;
	/**
	 * navn p� person
	 */
	public Personnavn navn;
	/**
	 * navn f�r navneendring av ulike �rsaker, for eksempel pikenavn
	 */
	public Personnavn opprinneligNavn;
	/**
	 * persons stilling i forhold til ekteskap eller partnerskap
	 */
	public Sivilstand sivilstand;
	/**
	 * rettslig b�nd mellom en person og en stat og best�r av b�de plikter og
	 * rettigheter [wikipedia]
	 */
	public Landkode statsborgerskap;
	public GeografiskAdresse adresse;

	public Person(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}