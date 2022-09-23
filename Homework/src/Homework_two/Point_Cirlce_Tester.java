package Homework_two;
import java.util.Scanner;


public class Point_Cirlce_Tester {
    public static void main(String[] args){
        int array_size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Размер массива: ");
        array_size = sc.nextInt();
        Circle[] array = new Circle[array_size];
        for (int i = 0; i < array_size; ++i) {
            array[i] = new Circle(new Point(i + 1, array_size - 1));
            System.out.println(array[i]);
        }
    }
}
