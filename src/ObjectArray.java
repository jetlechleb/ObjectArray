class Monkey { //we have monkey class
    String type = "Spider monkey"; //we have our monkey object, that is our spider monkey

    public static void heLLO() {
        System.out.println("hello"); //we have our monkey method, which does what it says
    }
}

public class ObjectArray {

    public static void main(String[] args) {

        Monkey m1 = new Monkey();
        Monkey m2 = new Monkey();
        Monkey m3 = new Monkey();

        Monkey[] monkeys = {m1,m2,m3};

        for (Monkey m: monkeys) {
            m.heLLO();
        }

    }
}
