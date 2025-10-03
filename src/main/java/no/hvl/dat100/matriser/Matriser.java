package no.hvl.dat100.matriser;

public class Matriser {

    // a)
    public static void skrivUt(int[][] matrise) {

        if (matrise == null) {
            return;
        }

        for (int[] rad : matrise) {

            for (int variabel : rad) {

                System.out.print(variabel + " ");
            }

            System.out.println();
        }
    }

    // b)
    public static String tilStreng(int[][] matrise) {

            if (matrise == null) {
                return "";
            }

            String resultat = "";

            for (int i = 0; i < matrise.length; i++) {
                int[] rad = matrise[i];

                for (int j = 0; j < rad.length; j++) {

                    resultat = resultat + rad[j];

                    if (j < rad.length - 1) {
                        resultat = resultat + " ";
                    }
                }

                resultat = resultat + "\n";
            }

            return resultat;
        }

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {

        if (matrise == null) {
            return null;
        }

        int rader = matrise.length;

        int kolonner = (rader > 0) ? matrise[0].length : 0;

        int[][] nyMatrise = new int[rader][kolonner];

        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < matrise[i].length; j++) {

                nyMatrise[i][j] = matrise[i][j] * tall;
            }
        }

        return nyMatrise;

    }

    // d)
    public static boolean erLik(int[][] a, int[][] b) {

        if (a == null && b == null) {
            return true;
        }

        if (a == null || b == null) {
            return false;
        }

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {

            if (a[i].length != b[i].length) {
                return false;
            }

            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }

        return true;

    }
}

