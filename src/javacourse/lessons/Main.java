package javacourse.lessons;

public class Main {
    public static void main(String[] args){


        Birds ostrich2 = new Ostrich();
        Birds ostrich = new Ostrich();
        Birds crow = new Crow();

        Test test = new Test();
        test.foo(ostrich);
    }
}
