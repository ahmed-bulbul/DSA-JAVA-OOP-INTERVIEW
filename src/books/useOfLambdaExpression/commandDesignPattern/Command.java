package books.useOfLambdaExpression.commandDesignPattern;

public interface Command {
    void execute();

    default int sum() {
        return 0;
    }
}
