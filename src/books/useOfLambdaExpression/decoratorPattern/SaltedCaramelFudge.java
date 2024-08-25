package books.useOfLambdaExpression.decoratorPattern;

public class SaltedCaramelFudge extends CoffeeDecorator{
    protected SaltedCaramelFudge(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + " + Salted caramel fudge";
    }
}
