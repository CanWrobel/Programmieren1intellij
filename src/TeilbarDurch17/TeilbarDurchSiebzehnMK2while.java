package TeilbarDurch17;

import java.util.Scanner;
public class TeilbarDurchSiebzehnMK2while {
    public static void main (String[]args) {


        int zahl = 2149; //die Eingabe hierher oder den scanner fragen wenn der Scanner aktiv ist

        System.out.print("Bitte eine natürliche Zahl eingeben: ");
        Scanner scan = new Scanner(System.in);
        zahl = scan.nextInt();
        System.out.println("Die eingelesene Zahl lautet: " + zahl);


        int z1 = zahl % 10; //die erste Ziffer
        int erg = z1 * 5 - (zahl/10%10); // der erste Schritt, Ziffer 1 u 2 irrelevant ab hier
        int length = String.valueOf(zahl).length();
        int loopready = zahl/100;
        int loop = length-2;
        int count = 0; //meine zählvariable <3
        //---System.out.println(zahl+" ist die Eingabe. "+erg+" ist der Ausgang für den Loop. "+length+" ist die Ziffernanzahl. "+loopready+" ist die Eingabe relevant für den Loop. "+loop+" mal den loop. ");
        while (count < loop) {
            boolean even = count % 2 == 0;
            if (even==true){
                erg=erg*5+(loopready%10);
                loopready=loopready/10;
            }
            else {
                erg=erg*5-(loopready%10);
                loopready=loopready/10;
            }
            //    System.out.print(erg+" Ergebnis, "+loop+" mal berechnet "+even+" plus // "); System.out.println("");
            count = count+1;
        }
        boolean ergebnis17 = erg%17==0;
        boolean eingabezahl17 = zahl%17==0;
        System.out.println("Eingabezahl: "+zahl);
        System.out.println("Ergebnis: "+erg);
        System.out.println("Ergebnis ist durch 17 teilbar: "+ergebnis17);
        System.out.println("Eingabe ist durch 17 teilbar: "+eingabezahl17);



    }
}
