package JavaFundamentals.ObjectsAndClasses.Exercise.opinion_poll;

public class OpinionPoll {
    String name;
    int age;

    public OpinionPoll(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", this.name, this.age);
    }
}
