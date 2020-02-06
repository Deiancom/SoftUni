package JavaAdvance.Defining_Classes.Lab.constructors;

public class Car {
    private String make;
    private String model;
    private  int power;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Car(String make, String model, int power) {
        this.make = make;
        this.model = model;
        this.power = power;

    }
}
