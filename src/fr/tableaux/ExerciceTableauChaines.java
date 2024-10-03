package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] string1 = {"Toulouse", "Bordeaux", "Montpellier", "Marseille", "Foix"};
        System.out.println(string1[0]/*+ " " + String1[1]+ " " + String1[2]+ " " + String1[3]+ " " + String1[4]*/);
        System.out.println(string1[1]);
        System.out.println(string1[2]);
        System.out.println(string1[3]);
        System.out.println(string1[4]);

        System.out.println(string1.length);

        string1[3] = "Reims";
        System.out.println(string1[0]/*+ " " + String1[1]+ " " + String1[2]+ " " + String1[3]+ " " + String1[4]*/);
        System.out.println(string1[1]);
        System.out.println(string1[2]);
        System.out.println(string1[3]);
        System.out.println(string1[4]);

    }
}
