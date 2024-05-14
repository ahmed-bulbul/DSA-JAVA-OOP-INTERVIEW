package books.lambda;

public class Human {
    public void talk(){
        System.out.println("Hello World!!");
    }

    Human baby = new Human(){
        @Override
        public void talk(){
            System.out.println("a-ga a-da");
        }
    };

}
