public class Application {
//Runs while froggo is alive and hasn’t finished crossing
//Calls classes/class methods

    public static void main(String[] args) {

        Application app = new Application();
        app.run();
    }



    private void run() {

        boolean isRunning = true;
        UI userInterface = new UI();

        userInterface.opening();
        int number = userInterface.getInfo();
        StreetCrossing streetCrossing = new StreetCrossing(number);
        userInterface.waitObservation();

        //run while loop until froggo dies
        while (isRunning) {

            if (streetCrossing.crosswalkGoing()) {
                if (userInterface.willCross()) {
                    userInterface.crossSafelyWithCrosswalk();
                    isRunning = false;
                }
                else {
                    userInterface.crosswalkWait();
                }
            }
            else {
                if (userInterface.willCross()) {
                    isRunning = streetCrossing.crossStreet();
                } else {
                    userInterface.waitObservation();
                }

            }
            if (streetCrossing.getStreetWidth() == streetCrossing.getLanesCrossed()) {
                userInterface.crossToOtherSideOfRoad();
            }


        }


    }
}
