final class Model {
    private String name;
    private String lastname;
    private int height;
    private double weight;
    private boolean smokes;

    Model(String name, String lastname, int height, double weight, boolean smokes) {
        this.name = name;
        this.lastname = lastname;
        this.height = height;
        this.weight = weight;
        this.smokes = smokes;
    }
    Model() {
        this.name = "Sezen";
        this.lastname = "Aksu";
        this.height = 60;
        this.weight = 132.5;
        this.smokes = true;
    }
}

