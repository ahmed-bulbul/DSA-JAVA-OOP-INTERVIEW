package books.useOfLambdaExpression.fluentProgramming;

import books.defaultMethod.A;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Sandwich {
    private String bread;
    private String meat;
    private String cheese;
    private List<String> vegetables = new ArrayList<>();

    private Sandwich(){

    }


//    public void setBread(String bread){
//        this.bread = bread;
//    }
//
//    public void setMeat(String meat){
//        this.meat = meat;
//    }
//
//    public void setCheese(String cheese){
//        this.cheese = cheese;
//    }
//
//    public void addVegetables(String vegetables){
//        this.vegetables.add(vegetables);
//    }
//
    //public void make(){
    //    System.out.println("Making a sandwich");
    //}


    public Sandwich setBread(String bread){
        this.bread = bread;
        return this;
    }
    public Sandwich setMeat(String meat){
        this.meat = meat;
        return this;
    }

    public Sandwich setCheese(String cheese){
        this.cheese = cheese;
        return this;
    }

    public Sandwich addVegetables(String vegetable){
        this.vegetables.add(vegetable);
        return this;
    }
    public Sandwich make(){
        System.out.println("Making a sandwich : ");
        return this;
    }

    public static Sandwich make(Consumer<Sandwich> sandwichConsumer){

        System.out.println("Making a sandwich");
        Sandwich sandwich = new Sandwich();
        sandwichConsumer.accept(sandwich);

        return sandwich;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", vegetables=" + vegetables +
                '}';
    }
}
