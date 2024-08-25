package books.useOfLambdaExpression.decoratorPattern;

import java.util.function.Function;

public class CoffeeApp {
    public static void main(String[] args) {
        var coffee = new VanillaAlmondExtract(
                new SaltedCaramelFudge(
                        new SweetenedMilk(new CoffeeBean())
                )
        );
        System.out.println(coffee.getIngredient());

        // lambda
        Function<Integer,Integer> doubleIt = a -> a * 2;

        calculate(5,doubleIt);


        Function<Integer,Integer> cubeIt = a -> a * a * a;
        Function<Integer,Integer> inc = a -> a +1;

        Integer temp = cubeIt.apply(3);
        Integer result = inc.apply(temp);
        System.out.println(result);

        calculate(3,cubeIt.andThen(inc));

    }

    public static void calculate(Integer value, Function<Integer,Integer> func){
        Integer result = func.apply(value);
        System.out.println(result);
    }
}
