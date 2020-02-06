package JavaAdvance.Defining_Classes.Exercises.pokemon_trainer;

public class Pokemon {
    private String name;
    private String element;
    private int health;

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }


    public String getElement() {
        return element;
    }

    public void lowerHealth() {
        this.health -= 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }
}
