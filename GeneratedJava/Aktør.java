package Akt�r;

import Identifikasjon.Identifikator;

/**
 * person eller enhet vi samhandler med
 * @author Tor Kjetil
 * @version 1.0
 * @created 28-sep-2016 17.39.21
 */
public abstract class Akt�r {

	/**
	 * det som identifiserer en akt�r
	 */
	public Identifikator identifikator;
	/**
	 * informasjon for � kontakte akt�r
	 */
	public Kontaktinformasjon kontaktinformasjon;

	public Akt�r(){

	}

	public void finalize() throws Throwable {

	}

}