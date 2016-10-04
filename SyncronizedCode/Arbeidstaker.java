package Arbeidstaker;

import lombok.Data;

import java.util.List;

/**
 * Alle arbeidstakere i HR. Inneholder ikke leverand�rrepresentant (eksterne
 * konsulenter etc) og oppdragstaker (politikere, ressurser med timel�nn, sensorer,
 * etc).
 * @author Tor Kjetil
 * @version 1.0
 * @updated 04-okt-2016 09:50:22
 */
@Data
public class Arbeidstaker extends Person {

	/**
	 * Inneholder en liste over alle stillinger til en arbeidstaker.
	 */
    private List<Stilling> stillinger;
	/**
	 * Dato for n�r den ansatte startet, og evtuelt sluttdato.
	 */
	public Periode ansettelsesperiode;
	/**
	 * Kontaktinformasjon for arbeidstaker, knyttet til sitt arbeidsforhold.
	 */
	public Kontaktinformasjon kontaktinformasjonArbeidssted;

}