import java.util.Random;

public class StreetCrossing {
//Takes in favorite number, calculates width based on number
//Calculates how many times of waiting before there is a break
//Sometimes break is a break in traffic, sometimes break is red light and audible walk signal with people
//Checks if they cross while there will be traffic, if so froggo goes squish :( otherwise check if made it across


    private int lanesCrossed = 0;
    private int streetWidth;

    public StreetCrossing(int favoriteNumber) {
        if (favoriteNumber > 4) {
            this.streetWidth = favoriteNumber;
        }
        else {
            this.streetWidth = favoriteNumber * 2;
        }
    }

    public boolean crossStreet() {
        Random random = new Random();
        int randomNum = random.nextInt(12);

        //testing random num generator, returning true so build succeeds
        System.out.println(randomNum);
        return true;
    }




    public int getStreetWidth() {
        return streetWidth;
    }

}
