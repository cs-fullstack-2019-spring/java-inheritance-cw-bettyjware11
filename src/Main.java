import ex1.Person;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ex1();
//        ex2();
    }
    private static void ex1(){
        ArrayList<Person> ex1List = new ArrayList<Person>();
        ex1List.add(new Person());
        ex1List.add(new Person());
        ex1List.add(new Person());
        ex1List.add(new Person());


        System.out.println(ex1List.get(0).getPerson());
        System.out.println(ex1List.get(0).getFriend());
        System.out.println(ex1List.get(0).getTeacher());
        System.out.println(ex1List.get(0).getDoctor());


    }
}
