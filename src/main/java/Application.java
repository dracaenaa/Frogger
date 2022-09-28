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

        
        boolean decision = userInterface.willCross();




    }
}
