import java.util.Random;

public class StreetCrossing {
//Takes in favorite number, calculates width based on number
//Calculates how many times of waiting before there is a break
//Sometimes break is a break in traffic, sometimes break is red light and audible walk signal with people
//Checks if they cross while there will be traffic, if so froggo goes squish :( otherwise check if made it across


    private int lanesCrossed;
    private int streetWidth;
    private UI userInterface = new UI();

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
        int randomNum = random.nextInt(5);

        //determines if they survived
        if (randomNum == 4) {
            userInterface.crossAndGetHit();
            return false;
        }
        else {
            userInterface.crossOneLane();
            lanesCrossed++;
            return true;
        }


    }


    public boolean crosswalkGoing() {
        Random random = new Random();
        int randomNum = random.nextInt(10);

        if (randomNum == 9) {
            userInterface.crosswalkSound();
            return true;
        }
        else {
            return false;
        }
    }

    public int getLanesCrossed() {
        return lanesCrossed;
    }

    public int getStreetWidth() {
        return streetWidth;
    }

}
