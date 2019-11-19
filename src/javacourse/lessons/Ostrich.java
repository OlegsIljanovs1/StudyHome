package javacourse.lessons;

public class Ostrich extends Birds {

    public Ostrich(String name, Wings wings) {
        super(name, wings);
    }

    public void hideHead(){
        System.out.println("I am Ostric and i am scared");
    }
}
