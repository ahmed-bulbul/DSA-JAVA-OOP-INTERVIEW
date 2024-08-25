package books.useOfLambdaExpression.decoratorPattern;

public class DarkCookieCrumb extends CoffeeDecorator{
    protected DarkCookieCrumb(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getIngredient() {
        return super.getIngredient()+" + Dark cookie Crumb";
    }
}
