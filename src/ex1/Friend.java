package ex1;

public class Friend extends Person {
    private String name;


    public Friend() {
        this.name = "Default Name";
    }

    public Friend(String name) {
        this.name = name;
    }

    private String getFriend() {
        return name;
    }

    public void setFriend(String name) {
        this.name = name;
    }



    public String toString()
    {
        return "What's up " + getFriend();
    }
}



