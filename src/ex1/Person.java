package ex1;

public class Person {
    private String name;


    public Person() {
        this.name = "Default Name";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getPerson() {
        return name;
    }

    public void setPerson(String name) {
        this.name = name;
    }
}



