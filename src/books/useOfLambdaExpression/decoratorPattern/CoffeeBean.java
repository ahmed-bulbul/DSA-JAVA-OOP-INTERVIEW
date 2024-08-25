package books.useOfLambdaExpression.decoratorPattern;

public class CoffeeBean implements Coffee{
    @Override
    public String getIngredient() {
        return "Coffee bean";
    }
}
