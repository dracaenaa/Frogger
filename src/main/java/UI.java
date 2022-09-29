import java.util.Scanner;

public class UI {

//Prompts player for froggo name, favorite color,
//favorite number (froggo can only count up to 10),
//favorite food, and mood, stores in FroggoInfo object

//Displays what froggo hears/smells

//Prompts for and accepts user input: wait a bit, or cross one lane

//If they cross, display if they are still alive,
//if they made it across, or if they died

//If they make it across, they get their favorite food


    FroggoInfo froggoInfo = new FroggoInfo();
    Scanner myScanner = new Scanner(System.in);



    //introduction to game
    public void opening() {
        System.out.println("Your froggo escaped! But they realized they don't like the big outside world :(");
        System.out.println("Your froggo wants to get home to you, but they got stuck at a street crossing!");
        System.out.println("They can't see anything because they got dirt in their eyes, and their tongue is tied from all the flied they've caught.");
        System.out.println("Get ready to help your froggo cross the street!\n");
    }

    //prompt if they want to cross or wait
    public boolean willCross() {
        System.out.println("Should " + froggoInfo.getName() + " wait or cross?");
        String decision = myScanner.nextLine();
        return decision.equalsIgnoreCase("cross");
    }

    //display if they got hit


    //display what they hear/smell if they go and don't get hit



    //display what they hear/smell if they wait, and at beginning


    //prompt for froggo info, store info, and store in object in FroggoInfo
    public int getInfo() {


        System.out.println("First, we need to know a bit about your froggo to help them.");

        //receive name input
        System.out.println("What's their name?");
        String name = myScanner.nextLine();
        froggoInfo.setName(name);

        //receive favorite color input
        System.out.println("What's their favorite color?");
        String favoriteColor = myScanner.nextLine();
        froggoInfo.setFavoriteColor(favoriteColor);

        //receive favorite number input
        System.out.println("What's their favorite number? Please enter a number, " + froggoInfo.getName() + " can count from 1-10 :)");
        String favoriteNumber = myScanner.nextLine();

        //entry validation
        while (!favoriteNumber.equals("1") && !favoriteNumber.equals("2") && !favoriteNumber.equals("3") &&
                !favoriteNumber.equals("4") && !favoriteNumber.equals("5") && !favoriteNumber.equals("6") &&
                !favoriteNumber.equals("7") && !favoriteNumber.equals("8") && !favoriteNumber.equals("9") &&
                !favoriteNumber.equals("10")) {
            System.out.println(froggoInfo.getName() + " can only count from 1-10, they don't know what that means :(");
            System.out.println("Please enter a number:");
            favoriteNumber = myScanner.nextLine();
        }
        froggoInfo.setFavoriteNumber(Integer.parseInt(favoriteNumber));

        //receive favorite food input
        System.out.println("What's their favorite food?");
        String favoriteFood = myScanner.nextLine();
        froggoInfo.setFavoriteFood(favoriteFood);

        return froggoInfo.getFavoriteNumber();
    }



}
