package edu.saintjoe.cs.brianc.beersongblc;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";
        while (beerNum > 0)  { // While there's bottles 
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;
            if (beerNum == 1) { // Correct for one bottle
                word = "bottle";
                } // endif
            
            // Adjust for case of NO bottles
            if (beerNum > 0) { 
                System.out.println(beerNum +  " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            } // end else 
          } // end while
    }
}

