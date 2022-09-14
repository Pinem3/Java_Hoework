package Homeworkone;
import java.util.Scanner;
public class One_one {
    public static void main(String[] args) {
        int maslet = 0;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Введите размер массива в виде целого числа");
            maslet = sc.nextInt();
        }while(maslet<=0);
        int[] mas = new int[maslet];
        int massum = 0;
        System.out.println("Введите целое значение массива: ");
        for (int i = 0; i<maslet; i++){
            mas[i] = sc.nextInt();
            massum+=mas[i];
        }
        int avenum = massum/maslet;
        System.out.print("Среднее значение массива: ");
        System.out.print(avenum);
    }
}
