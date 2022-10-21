package Homework_two_five;

public class Dog {
    private String DogName;
    private int DogAge;

    public Dog(String DogName, int DogAge){
        this.DogName = DogName;
        this.DogAge = DogAge;
    }

    public void setDogName(String dogName) {
        DogName = dogName;
    }

    public void setDogAge(int dogAge) {
        DogAge = dogAge;
    }

    public String getDogName() {
        return DogName;
    }

    public int getDogAge() {
        return DogAge;
    }

    public int AgeConvertor(){
        return this.DogAge*7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "DogName='" + DogName + '\'' +
                ", DogAge=" + DogAge +
                '}';
    }
}
