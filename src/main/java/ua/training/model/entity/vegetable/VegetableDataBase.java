package ua.training.model.entity.vegetable;

public enum VegetableDataBase {
    PEANUTS("peanuts", 548),
    ALMOND("almond", 645),
    WALNUT("walnut", 648),
    HAZELNUT("hazelnut", 704),
    CUCUMBER("cucumber", 15),
    TOMATO("tomato", 10),
    BULB_ONIONS("bulb_onions", 50),
    BOILED_POTATOES("boiled_potatoes", 80),
    CARROT("carrot", 35),
    WHITE_CABBAGE("white_cabbage", 30),
    PARSLEY("parsley", 36);

    VegetableDataBase(String name, int calories) {
        this.name = name;
        this.caloriesPerHundredGrams = calories;
    }

    private String name;
    private int caloriesPerHundredGrams;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCaloriesPerHundredGrams() {
        return caloriesPerHundredGrams;
    }

    public void setCaloriesPerHundredGrams(int caloriesPerHundredGrams) {
        this.caloriesPerHundredGrams = caloriesPerHundredGrams;
    }
}
