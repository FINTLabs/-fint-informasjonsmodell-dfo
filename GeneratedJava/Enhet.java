package Enhet;

import Adresse.GeografiskAdresse;
import Akt�r.Akt�r;

/**
 * Alle hovedenheter, underenheter og organisasjonsledd som er identifisert med et
 * organisasjonsnummer
 * 
 * Merknad: Forslag til definisjon med utgangspunkt i Enhetsregisteret
 * @author Tor Kjetil
 * @version 1.0
 * @created 28-sep-2016 17.39.45
 */
public abstract class Enhet extends Akt�r {

	/**
	 * Navn p� enhet som er registrert i Enhetsregisteret
	 */
	public string navn;
	/**
	 * Femsifret kode som tildeles p� bakgrunn av enhetens virksomhet/bransje. Bygger
	 * p� EU sin n�ringsstandard (NACE) som best�r av fire siffer. Det femte sifferet
	 * er nasjonalt niv�
	 */
	public string n�ringskode;
	/**
	 * Inndeling av enheter ut fra hvordan disse er organisert (eierform,
	 * ansvarsforhold, regelverk og lignende)
	 */
	public string organisasjonsform;
	/**
	 * Nisifret nummer som entydig identifiserer enheter i Enhetsregisteret
	 */
	public string organisasjonsnummer;
	public GeografiskAdresse adresse;

	public Enhet(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}