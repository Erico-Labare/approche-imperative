package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] tableau = {1,2};
        boolean bolleenne = false;

        if (tableau.length >= 1) {
            if (tableau[0] == tableau[tableau.length - 1]) {
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
