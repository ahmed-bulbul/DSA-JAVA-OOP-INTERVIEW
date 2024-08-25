package books.useOfLambdaExpression.decoratorPattern;

import java.util.function.Function;
import java.util.stream.Stream;

public class CoffeeDecoratorUsingLambda {
    public static Coffee getCoffeeWithExtras(Coffee coffee, Function<Coffee,Coffee> ... ingredients){

        Function<Coffee,Coffee> initial = kopi -> kopi; // or: Function<Coffee,Coffee> init = Function.identity();

        for(Function<Coffee,Coffee> ingredient : ingredients){
            initial = ingredient.andThen(ingredient);
        }

        //same as above
        Stream.of(ingredients)
                .reduce(kopi -> kopi, (func1, func2) ->
                        func1.andThen(func2));
        //shorter
        Stream.of(ingredients)
                .reduce(Function.identity(),Function::andThen);

        return initial.apply(coffee);
    }


    public static Coffee getCoffeeWithExtras2(Coffee coffee, Function<Coffee,Coffee> ... ingredients){
        Function<Coffee,Coffee> reduced = Stream.of(ingredients)
                .reduce(Function.identity(),Function::andThen);

        return reduced.apply(coffee);
    }

    public static void main(String[] args) {
        var coffee = getCoffeeWithExtras2(new CoffeeBean(),
                Coffee::withDarkCookieCrumb,
                Coffee::withSweetenedMilk,
                Coffee::withVanillaAlmondExtract);

        System.out.println(coffee.getIngredient());
    }

}
