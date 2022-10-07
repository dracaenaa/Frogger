public class FroggoInfo {
//Stores froggo’s name, favorite color, favorite number, and favorite food


    private final String name;
    private final String favoriteColor;
    private final int favoriteNumber;
    private final String favoriteFood;

    public FroggoInfo(String name, String favoriteColor, int favoriteNumber, String favoriteFood) {
        this.name = name;
        this.favoriteColor = favoriteColor;
        this.favoriteNumber = favoriteNumber;
        this.favoriteFood = favoriteFood;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public int getFavoriteNumber() {
        return favoriteNumber;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }
}
