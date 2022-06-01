import java.util.ArrayList;
import org.junit.jupiter.params.aggregator.ArgumentAccessException;

public class ErsteAlgorithmen {

    public static int spannweite(int[] folge) {
        //Bitte hier die Loesung ergaenzen
        //Die O-Notation dieses Algorithmus ist O(n)
        if (folge.length > 1){
            int kleinsteZahl = folge[0];
            int groessteZahl = folge[0];

            for(int i = 1; i <= folge.length-1; i++ ){
                if(kleinsteZahl > folge[i]){
                    kleinsteZahl = folge[i];
                }
                if(groessteZahl < folge[i]){
                    groessteZahl = folge[i];
                }
            }
            return groessteZahl - kleinsteZahl;
        }
        return 0;
    }
    
    
    public static int[] primfaktorzerlegung(int zahl) {
        //Bitte hier die Loesung ergaenzen
        ArrayList<Integer> zahlen = new ArrayList<Integer>();
        int primfaktor = 2;

        while(zahl > 1){
            if(zahl % primfaktor == 0){
                zahlen.add(primfaktor);
                zahl = zahl / primfaktor;
            } else {
                if(primfaktor == 2){
                    primfaktor = 3;
                } else {
                    primfaktor = primfaktor + 2;
                }
            }
        }

        int primfaktoren[] = new int[zahlen.size()];

        for(int i = 0; i < zahlen.size(); i++){
            primfaktoren[i] = zahlen.get(i);
        }

        return primfaktoren;
    }
    
    public static double quadratwurzel(double x, double eps) {
        //Bitte hier die Loesung ergaenzen
        double yn = x/2;
        double ynminus1 = 0;
        double bedingung = yn - ynminus1;

        while(machePositiv(bedingung) > eps){
            ynminus1 = yn;
            yn = (ynminus1 + (x / ynminus1)) / 2;
            bedingung = yn - ynminus1;
        }
        return yn;
    }

    public static double machePositiv(double x){
        if(x < 0){
            x = x * (-1);
        }
        return x;
    }
        
}
