package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

        for(int r = 0; r < tabell.length; r++){

            int rad = tabell[r];

            System.out.println(rad);

        }

	}



	// b)
	public static String tilStreng(int[] tabell) {

        if(tabell.length == 0){
            return "[]";
        }

        String tall = "[";

        for(int r = 0; r < tabell.length; r++){

            tall = tall + tabell[r];

            if(r < tabell.length - 1){
                tall = tall + ",";
            }
        };

        tall = tall + "]";

        System.out.println(tall);

        return tall;

    }



	// c)
	public static int summer(int[] tabell) {

        int tall = 0;

        for(int s = 0; s < tabell.length; s++){

            tall = tall + tabell[s];

        }

        System.out.println(tall);

        return tall;

	}



	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

       boolean nummer = false;

       int nr = 0;

       while(!nummer && nr < tabell.length) {
           if (tabell[nr] == tall) {
               nummer = true;
           }
           nr++;
       }

        System.out.println(nummer);

        return nummer;

	}



	// e)
	public static int posisjonTall(int[] tabell, int tall) {

        for(int i = 0; i < tabell.length; i++) {

            if (tabell[i] == tall) {

                System.out.println(tabell[i]);

                return i;
            }

        }

        System.out.println(-1);

        return -1;

	}



	// f)
	public static int[] reverser(int[] tabell) {

        int[] reverser = new int[tabell.length];

        for(int i = 0; i < tabell.length; i++){

            reverser[i] = tabell[tabell.length - i - 1];

        }

        return reverser;

	}



	// g)
	public static boolean erSortert(int[] tabell) {

      if(tabell == null || tabell.length < 2){
          return true;
      }

      int nummer = 0;

      while(nummer < tabell.length-1){

          if(tabell[nummer] > tabell[nummer+1]){
              return false;
          }

          nummer++;

      }

      return true;

	}



	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

        int totalLengde = tabell1.length + tabell2.length;

        int[] nyTabell = new int[totalLengde];

        for(int i = 0; i < tabell1.length; i++){
            nyTabell[i] = tabell1[i];
        }

        for(int i = 0; i < tabell2.length; i++){
            nyTabell[i+tabell1.length] = tabell2[i];
        }

        return nyTabell;

	}
}
