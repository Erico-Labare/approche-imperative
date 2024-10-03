package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] tableau = new int[10];
        boolean bolleenne = false;

        if (tableau.length >= 1) {
            if (tableau[0] == 6 || tableau[tableau.length - 1] == 6) {
                bolleenne = true;
            } else {
                bolleenne = false;
            }
        } else {
            bolleenne = false;
        }
        System.out.print(bolleenne);
    }
}
