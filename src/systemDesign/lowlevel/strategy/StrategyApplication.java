package systemDesign.lowlevel.strategy;

public class StrategyApplication {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(10, 20));

        context = new Context(new OperationSubstract());
        System.out.println(context.executeStrategy(10, 20));

        context = new Context(new OperationMultiply());
        System.out.println(context.executeStrategy(10, 20));
    }

}
