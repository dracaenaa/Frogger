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
    StreetCrossing streetCrossing = null;

    private void run() {

        handleIntroOutputAndInput();

        //run while loop until froggo dies
        while (isRunning) {

            if (streetCrossing.crosswalkGoing()) {
                handleCrosswalkOn();
            }
            else {
                handleIfCrossOrNot();
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

    private void handleIfCrossOrNot() {
        if (userInterface.willCross(froggoInfo)) {
            isRunning = streetCrossing.crossStreet();
        } else {
            userInterface.waitObservation();
        }
    }

    private void handleIntroOutputAndInput() {
        userInterface.opening();
        froggoInfo = new FroggoInfo(userInterface.receiveNameInput(), userInterface.receiveFavoriteColorInput(),
                userInterface.receiveFavoriteNumberInput(), userInterface.receiveFavoriteFoodInput());

        streetCrossing = new StreetCrossing(froggoInfo.getFavoriteNumber());
        userInterface.waitObservation();
    }
}
