package Homework_two;

public class Author {
    private String name;
    private String Email;
    private char gender;

    public Author(String name, String Email, char gender){
        this.name = name;
        this.Email = Email;
        this.gender = gender;
    }

    public String getName(){ return name;}

    public void setName(String name){this.name = name;}

    public String getEmail(){return Email;}

    public void setEmail(String Email){this.Email = Email;}

    public char getGender(){return gender;}
    public String toString(){
        return "Author{" + "name=" + name + ", Email=" + Email + ", gender=" + gender + '\'' + '}';
    }
}
