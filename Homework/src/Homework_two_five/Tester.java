package Homework_two_five;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        ArrayList<Dog> Dogs = new ArrayList<>();
        int NumberOfDogs;
        Scanner sc = new Scanner(System.in);
        System.out.print("Сколько собак в приюте?" + '\n');
        NumberOfDogs = sc.nextInt();
        //Добавление собак
        for (int i = 0; i < NumberOfDogs ;i++){
            String dogName;
            System.out.print("Имя " + (i+1) + " собаки: ");
            dogName = sc.next();
            int dogAge;
            System.out.print("Возраст собаки: ");
            dogAge = sc.nextInt();
            Dogs.add(new Dog(dogName, dogAge));
        }
        while(true) {
            System.out.print("""
                    Выберите ваши действия:
                    1: Добавить собак в приют.
                    2: Конвертировать возраст собаки в человеческий.
                    3: Показать всех собак в приюте.
                    4: Выйти из приюта
                    """);
            int choose = sc.nextInt();
            switch (choose) {
                case (1) -> {
                    System.out.print("Сколько собак вы хотите добавить?" + '\n');
                    int NewNumberOfDogs = sc.nextInt();
                    for (int i = 0; i < NewNumberOfDogs; i++) {
                        String dogName;
                        System.out.print("Имя " + (i + 1) + " собаки: ");
                        dogName = sc.next();
                        int dogAge;
                        System.out.print("Возраст собаки: ");
                        dogAge = sc.nextInt();
                        Dogs.add(new Dog(dogName, dogAge));
                    }
                }
                case (2) -> {
                    System.out.print("Возраст какой собаки вы хотите узнать?" + '\n');
                    String Dog = sc.next();
                    for (int i = 0; i < Dogs.toArray().length; i++) {
                        if (Dogs.get(i).getDogName().equals(Dog)) {
                            System.out.print("Человеческий возраст собаки по имени " + Dogs.get(i).getDogName() + " равняется " + Dogs.get(i).AgeConvertor() + " лет" + '\n');
                        }
                    }
                }
                case (3) -> {
                    for (int i = 0; i < Dogs.toArray().length; i++) {
                        System.out.print((i + 1) + "-я собака:" + '\n' + "Имя: " + Dogs.get(i).getDogName() + '\n' + "Возраст: " + Dogs.get(i).getDogAge() + '\n');
                    }
                }
                case (4) -> {
                    System.out.print("До свидания");
                    System.exit(0);
                }
                default -> {
                    System.out.print("Не известная команда, попробуйте выбрать другую команду");
                    choose = sc.nextInt();
                }
            }
        }
    }
}
