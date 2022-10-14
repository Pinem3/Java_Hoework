package Homework_two_four;

public class shop {
    private String ComputerName;
    public shop(String ComputerName){this.ComputerName = ComputerName;}

    public String GetComputerName(){return ComputerName;}

    public void SetComputerName(String ComputerName){this.ComputerName = ComputerName;}

    public String ToString(){
        return "Circle{ " + "Cumputer Name = " + this.ComputerName + '}';
    }
}
