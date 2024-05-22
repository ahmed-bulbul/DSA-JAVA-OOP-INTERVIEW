package books.defaultMethod;

public interface Conversable {

    default void hi(){
        System.out.println("Hi");
    }
}

interface ConversablePlus {
    default void hi(){
        System.out.println("Hi");
    }
}

class Human implements Conversable,ConversablePlus{


    public static void main(String[] args) {
        Human human = new Human();
        human.hi();
    }

    @Override
    public void hi() {
        Conversable.super.hi();
    }
}
