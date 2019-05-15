package ex1;

public class Teacher extends Person {
    private String teacher = "Pam";

    public String getTeacher(){
        return teacher;
    }

    public String toString()
    {
        return "Hello Mr/Mrs " + getTeacher() ;
    }
}
