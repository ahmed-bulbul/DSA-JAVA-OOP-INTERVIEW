package books.useOfLambdaExpression.decoratorPattern;


@FunctionalInterface
public interface Coffee {
    String getIngredient();

    static Coffee withSaltedCaramelFudge(Coffee coffee){
        return () -> coffee.getIngredient()
                                    + " + Salted caramel Fudge";
    }

    static Coffee withSweetenedMilk(Coffee coffee){
        return () -> coffee.getIngredient()
                                    + " + Sweetened Milk ";

    }

    static Coffee withDarkCookieCrumb(Coffee coffee){
        return () -> coffee.getIngredient()
                                    + " + Dark Cookie";
    }

    static Coffee withVanillaAlmondExtract(Coffee coffee){
        return () -> coffee.getIngredient()
                                    + " + Vanila/almond extract";
    }
}
