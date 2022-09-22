package Homework_two;

public class Point {
    double x;
    double y;
    public Point(double x, double y){this.x = x;this.y = y;}
    public void setX(double x){this.x = x;}
    public double getX(){return x;}
    public void setY(double y){this.y = y;}
    public double getY(){return y;}
    public String toString(){
        return "Point{ " + "x=" + x + ", y=" + y + '\'' + '}';
    }
}
