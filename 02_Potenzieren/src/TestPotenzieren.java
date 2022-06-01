import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestPotenzieren {

	@Test
	/**
	 * Dieser Test prüft, ob der iterative Algorithmus 0 hoch 6 richtig berechnet
	 */ 
	public void testPotenziereIterativMitBasisNull() {
		assertEquals(0,Potenzieren.potenziereIterativ(0,6) ,0.001, "0 hoch 6 ergab nicht 0");
	}	
	
	@Test
	/**
	 * "Dieser Test prüft, ob der iterative Algorithmus 6 hoch 0 richtig berechnet
	 */
	public void testPotenziereIterativMitExpNull() {
		assertEquals(1,Potenzieren.potenziereIterativ(6,0),0.001, "6  hoch 0 ergab nicht 1");
	}

	@Test
	/**
	 * Dieser Test prüft, ob der iterative Algorithmus 4 hoch 3 richtig berechnet
	 */
	public void testPotenziereIterativMitVerschBasenUndExponenten1() {
		assertEquals(64,Potenzieren.potenziereIterativ(4,3) ,0.001, "4  hoch 3 ergab nicht 64");
	}
	
	@Test
	/**
	 * Dieser Test prüft, ob der iterative Algorithmus 10 hoch 3 richtig berechnet
	 */
	public void testPotenziereIterativMitVerschBasenUndExponenten2() {
		assertEquals(1000,Potenzieren.potenziereIterativ(10,3),0.001, "10 hoch 3 ergab nicht 1000");
	}
	
	@Test
	/**
	 * Dieser Test prüft, ob der iterative Algorithmus 1 hoch 90 richtig berechnet
	 */
	public void testPotenziereIterativMitVerschBasenUndExponenten3() {
		assertEquals(1,Potenzieren.potenziereIterativ(1,90) ,0.001, "1  hoch 90 ergab nicht 1");
	}
	
	@Test
	/**
	 * Dieser Test prüft, ob der rekursive Algorithmus 0 hoch 6 richtig berechnet
	 */
	public void testPotenziereRekursivMitBasisNull() {
		assertEquals(0,Potenzieren.potenziereRekursiv(0,6) ,0.001, "0 hoch 6 ergab nicht 0");
	}	
	
	@Test
	/**
	 * Dieser Test prüft, ob der rekursive Algorithmus 6 hoch 0 richtig berechnet
	 */
	public void testPotenziereRekursivMitExpNull() {
		assertEquals(1,Potenzieren.potenziereRekursiv(6,0),0.001, "6  hoch 0 ergab nicht 1");
	}

	@Test
	/**
	 * Dieser Test prüft, ob der rekursive Algorithmus 4 hoch 3 richtig berechnet
	 */
	public void testPotenziereRekursivMitVerschBasenUndExponenten1() {
		assertEquals(64,Potenzieren.potenziereRekursiv(4,3) ,0.001, "4  hoch 3 ergab nicht 64");
	}
	
	@Test
	/**
	 * Dieser Test prüft, ob der rekursive Algorithmus 10 hoch 3 richtig berechnet
	 */
	public void testPotenziereRekursivMitVerschBasenUndExponenten2() {
		assertEquals(1000,Potenzieren.potenziereRekursiv(10,3),0.001, "10 hoch 3 ergab nicht 1000");
	}
	
	@Test
	/**
	 * Dieser Test prüft, ob der rekursive Algorithmus 1 hoch 90 richtig berechnet
	 */
	public void testPotenziereRekursivMitVerschBasenUndExponenten3() {
		assertEquals(1,Potenzieren.potenziereRekursiv(1,90) ,0.001, "1  hoch 90 ergab nicht 1");
	}
	
}
