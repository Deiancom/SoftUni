package JavaAdvance.Defining_Classes.Exercises.car_salesman;

public class Car {

    private String model;
    private Engine engine;
    private String weight;
    private String color;

    public String getEngineModel() {
        return this.engine.getModel();
    }

    public String getEnginePower() {
        return this.engine.getPower();
    }

    public String getEngineDisplacement() {
        return this.engine.getDisplacement();
    }

    public String getEngineEfficiency() {
        return this.engine.getEfficiency();
    }

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = "n/a";
        this.color = "n/a";
    }

    public String getModel() {
        return model;
    }


    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s:%n" +
                        "%s:%n" +
                        "Power: %s%n" +
                        "Displacement: %s%n" +
                        "Efficiency: %s%n" +
                        "Weight: %s%n" +
                        "Color: %s", this.getModel(), this.getEngineModel(),
                this.getEnginePower(), this.getEngineDisplacement(),
                this.getEngineEfficiency(), this.getWeight(), this.getColor());
    }
}
