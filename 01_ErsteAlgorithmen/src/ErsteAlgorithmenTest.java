import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ErsteAlgorithmenTest {

    //Kontante wird verwendet fuer die Genauigkeit beim Wurzelziehen
    public static final double EPS = 0.0000001;

    @Test
    /** 
     * Dieser Test prüft, ob die Methode für ein leeres Array die Spannweite 0 berechnet.
     */
    public void testSpannweiteWithoutAnyValues() {
        int result = ErsteAlgorithmen.spannweite(new int[] {});
        assertEquals(0, result, "Spannweite ungleich 0");
    }

    @Test
    /**
     * Dieser Test prüft, ob die Methode für ein Array mit einem Wert die Spannweite 0 berechnet.
     */
    public void testSpannweiteWithOneValue() {
        int result = ErsteAlgorithmen.spannweite(new int[] { 0 });
        assertEquals(0, result, "Spannweite ungleich null");
    }

    @Test
    /**
     * Dieser Test prüft, ob die Methode für ein gefülltes Array die Spannweite korrekt berechnet.
     */
    public void testSpannweiteWithMultipleValues1() {
        int[] values = { 1, 2, 3, 2, 3, 4, 5, 3, 0};
        int result = ErsteAlgorithmen.spannweite(values);
        assertEquals(5, result, "Spannweite nicht korrekt");
    }

    @Test
    /**
     * Dieser Test prüft, ob die Methode für ein gefülltes Array die Spannweite korrekt berechnet.
     */
    public void testSpannweiteWithMultipleValues2() {
        int[] values = { 1, 2, 3, 2, 3, 4, 5, 3, 9};
        int result = ErsteAlgorithmen.spannweite(values);
        assertEquals(8, result, "Spannweite nicht korrekt");
    }

    @Test
    /**
     * Dieser Test prüft die Primfaktorzerlegung für 7.
     */
    public void testPrimfaktorzerlegungOnSeven() {
        int[] result = ErsteAlgorithmen.primfaktorzerlegung(7);
        assertArrayEquals(new int[] { 7 }, result, "Primfaktoren nicht korrekt");
    }

    @Test
    /**
     * Dieser Test prüft die Primfaktorzerlegung für 32.
     */
    public void testPrimfaktorzerlegungOnThirtytwo() {
        int[] result = ErsteAlgorithmen.primfaktorzerlegung(32);
        assertArrayEquals(new int[] { 2, 2, 2, 2, 2 }, result, "Primfaktoren nicht korrekt");
    }

    @Test
    /**
     * Dieser Test prüft die Primfaktorzerlegung für 50.
     */    
    public void testPrimfaktorzerlegungOnFifty() {
        int[] result = ErsteAlgorithmen.primfaktorzerlegung(50);
        assertArrayEquals(new int[] { 2, 5, 5 }, result, "Primfaktoren nicht korrekt");
    }

    @Test
    /**
     * Dieser Test prüft die Primfaktorzerlegung für 270.
     */
    public void testPrimfaktorzerlegungOnTwoHundredSeventy() {
        int[] result = ErsteAlgorithmen.primfaktorzerlegung(270);
        assertArrayEquals(new int[] { 2, 3, 3, 3, 5 }, result, "Primfaktoren nicht korrekt");
    }

    @Test
    /**
     * Dieser Test prüft die Wurzelapproximierung für 81.
     */
    public void testQuadratwurzelOnEightyOne() {
        double result = ErsteAlgorithmen.quadratwurzel(81.0, EPS);
        assertEquals(9.0, result, EPS, "Wurzel nicht korrekt");
    }

    @Test
    /**
     * Dieser Test prüft die Wurzelapproximierung für 25.
     */
    public void testQuadratwurzelOnTwentyFive() {
        double result = ErsteAlgorithmen.quadratwurzel(25.0, EPS);
        assertEquals(5.0, result, EPS, "Wurzel nicht korrekt");
    }
    
    @Test
    /**
     * Dieser Test prüft die Wurzelapproximierung für 3.
     */
    public void testQuadratwurzelOnThree() {
        double result = ErsteAlgorithmen.quadratwurzel(3.0, EPS);
        assertEquals(Math.sqrt(3.0), result, EPS, "Wurzel nicht korrekt");
    }
}
