package Homework_two;
import java.util.Scanner;
public class Class_Test {
    public static void main(String[] args){
        //Author test
        /*String name;
        String Email;
        char gender = 'M';*/
        Scanner sc = new Scanner(System.in);
        /*
        System.out.print("Введите имя автора: ");
        name = sc.next();
        System.out.print("Введите электронную почтуа втора: ");
        Email = sc.next();
        Author author = new Author(name, Email, gender);
        author.setName(name);
        author.setEmail(Email);
        System.out.println("Имя автора: " + author.getName());
        System.out.println("Электронная почта автора: " + author.getEmail());
        System.out.println("пол автора: " + author.getGender() );*/

        //Ball test
        double x = 0.0;
        double y = 0.0;
        Ball ball1 = new Ball(x,y);
        System.out.println(ball1.getX());
        System.out.println(ball1.getY());
        System.out.print("Введите x: ");
        x = sc.nextInt();
        System.out.print("Ввеите y: ");
        y = sc.nextInt();
        Ball ball= new Ball(x,y);
        ball1.setX(x);
        System.out.println(ball.getX());
        ball.setY(y);
        System.out.println(ball.getY());
    }
}
