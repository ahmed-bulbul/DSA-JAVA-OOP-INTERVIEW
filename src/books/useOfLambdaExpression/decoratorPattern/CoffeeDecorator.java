package books.useOfLambdaExpression.decoratorPattern;

public abstract class CoffeeDecorator implements Coffee{
    private final Coffee coffee;

    protected CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getIngredient() {
        return coffee.getIngredient();
    }
}
