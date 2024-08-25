package books.useOfLambdaExpression.fluentProgramming;

public class SandwichMaker {

    public static void main(String[] args) {
//        Sandwich sandwich = new Sandwich();
//        sandwich.setBread("White");
//        sandwich.setMeat("Beef");
//        sandwich.setCheese("Cheddar");
//        sandwich.addVegetables("Tomato");
//        sandwich.addVegetables("Cucumber");
//
//        sandwich.make();

//        Sandwich sandwich = new Sandwich()
//                .setBread("White")
//                .setMeat("Beef")
//                .setCheese("Cheddar")
//                .addVegetables("Tomato")
//                .addVegetables("Cucumber")
//                .make();
//
//        System.out.println(sandwich);


        Sandwich sand = Sandwich.make(sandwich -> sandwich
                .setBread("White")
                .setMeat("Beef")
                .setCheese("Cheddar")
                .addVegetables("Tomato")
                .addVegetables("Cucumber"));

        System.out.println(sand);

    }
}
