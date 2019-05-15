package ex1;

public class Doctor extends Person {
    private String doctor = "Barbara";

    public String getDoctor()
    {
        return doctor;
    }


    public String toString()
    {
        return "Good Morning/Afternoon Dr " + getDoctor();
    }
}
