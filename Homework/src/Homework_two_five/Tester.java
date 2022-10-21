package Homework_two_five;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        ArrayList<Dog> Dogs = new ArrayList<Dog>();
        Scanner sc = new Scanner(System.in);
        String dogName;
        System.out.print("Имя собаки: ");
        dogName = sc.next();
        int dogAge;
        System.out.print("Возраст собаки: ");
        dogAge = sc.nextInt();
        Dogs.add(new Dog(dogName, dogAge));
    }
}
