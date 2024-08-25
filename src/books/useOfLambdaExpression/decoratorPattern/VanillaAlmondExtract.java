package books.useOfLambdaExpression.decoratorPattern;

public class VanillaAlmondExtract extends CoffeeDecorator{
    protected VanillaAlmondExtract(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + " + Vanilla/almond extract";
    }


}
