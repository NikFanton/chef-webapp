package ua.training.model.entity;

public enum GroupOfVegetables {
    UNKNOWN("Unknown"),
    BEANS("Beans"),
    ROOTS("Roots"),
    CABBAGES("Cabbages"),
    NIGHTSHADE("Nightshade"),
    BULBOUS("Bulbous"),
    SALAD_LEAF("Salad leaf"),
    PUMPKIN("Pumpkin");

    GroupOfVegetables(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "GroupOfVegetables{" +
                "name='" + name + '\'' +
                '}';
    }
}
