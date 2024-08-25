package books.useOfLambdaExpression.decoratorPattern;

public class SweetenedMilk  extends CoffeeDecorator{
    protected SweetenedMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getIngredient() {
        return super.getIngredient()+ " + Sweetened Milk";
    }
}
