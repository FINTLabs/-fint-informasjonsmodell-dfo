package Arbeidstaker;

import lombok.Data;

/**
 * Besrkrivelse  av en stilling til en arbeidstaker.
 * @author ole.anders
 * @version 1.0
 * @updated 04-okt-2016 12:44:24
 */
@Data
public class Stilling {

	/**
	 * Koden for tilh�righet til avdeling.
	 * 
	 * For eksempel koden til "Avdeling for Helse og mijl�".
	 */
    private String avdeling;
	/**
	 * Kode for relasjon til funksjon.
	 * 
	 * For eksempel koden til "Studiespesialisering" eller "PEDAGOGISK LEDELSE OG
	 * PEDAGOGISKE FELLESUTGIFTER<b>".</b>
	 */
    private String funksjon;
	/**
	 * �rsl�nn/grunnll�nn i 100 % stilling.
	 */
    private long grunnlonn;
	/**
	 * Kode for relasjon til organisasjonstruktur.
	 * 
	 * Tilsvarer Arbeidssted i HR-system, mens VFS kaller dette for Ansvar og
	 * beskriver det med: "Type 2 = Ansvar, benyttes til � plassere den ansatte p�
	 * riktig skole".
	 * 
	 * For eksempel kode for "Bjerke videreg�ende skole".
	 */
    private String organisasjon;
	/**
	 * Beskriver om stillingen er aktiv, utl�pt eller slettet.
	 * 
	 * Gyldige verdier er: AKTIV, ...
	 */
    private String status;
	/**
	 * En fire- eller sekssifret stillingskode. Firesiffret kodeliste fra KS. Kan v�re
	 * utvidet i tillegg med to siffer. De to siste er egentilpasset.
	 */
    private String stillingskode;
	/**
	 * En unik id/l�penummer for stilling til en ansatt.
	 */
    private int stillingsnummer;
	/**
	 * Angitt stillingsst�rrelse i prossent. Angitt fra 0 til 100.
	 */
    private double stillingsprosent;
	/**
	 * Arbeidstakers stillingstittel i gjeldende stilling.
	 */
    private String stillingstittel;
	/**
	 * Tidsperiode (fra-/tildato) hvor stillingen er aktiv .
	 */
	private Periode stillingsperiode;
}