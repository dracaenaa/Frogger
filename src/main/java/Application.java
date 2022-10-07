public class Application {
//Runs while froggo is alive and hasn’t finished crossing
//Calls classes/class methods

    public static void main(String[] args) {

        Application app = new Application();
        app.run();
    }

    UI userInterface = new UI();
    boolean isRunning = true;
    FroggoInfo froggoInfo = null;

    private void run() {

        userInterface.opening();
        froggoInfo = new FroggoInfo(userInterface.receiveNameInput(), userInterface.receiveFavoriteColorInput(),
                userInterface.receiveFavoriteNumberInput(), userInterface.receiveFavoriteFoodInput());

        StreetCrossing streetCrossing = new StreetCrossing(froggoInfo.getFavoriteNumber());
        userInterface.waitObservation();

        //run while loop until froggo dies
        while (isRunning) {

            if (streetCrossing.crosswalkGoing()) {
                handleCrosswalkOn();;
            }
            else {
                if (userInterface.willCross(froggoInfo)) {
                    isRunning = streetCrossing.crossStreet();
                } else {
                    userInterface.waitObservation();
                }
            }
            if (streetCrossing.getStreetWidth() == streetCrossing.getLanesCrossed()) {
                userInterface.crossToOtherSideOfRoad(froggoInfo);
                isRunning = false;
            }


        }


    }

    private void handleCrosswalkOn() {
        if (userInterface.willCross(froggoInfo)) {
            userInterface.crossSafelyWithCrosswalk(froggoInfo);
            isRunning = false;
        }
        else {
            userInterface.crosswalkWait(froggoInfo);
        }
    }
}
