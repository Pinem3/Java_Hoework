package Homework_two;

public class Circle {
    private double radius;
    private Point centre;
    public Circle(){this.centre.setXY(0.0,0.0);}
    public Circle(Point centre){this.centre = centre;}

    public Point getCentre(){return centre;}
    public String toString(){
        return "Circle{ " + "x=" + this.centre.getX() +
                ", y=" + this.centre.getY() + '}';
    }

}
