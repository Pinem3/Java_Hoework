package Homeworkone;
import java.util.Scanner;
public class One_five {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите числоб факториал которого вы желаете найти: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = num; i > 0 ; i--){
            fact *=i;
        }
        System.out.print("Факториал числа ");
        System.out.print(num);
        System.out.print(" = ");
        System.out.print(fact);
    }
}
