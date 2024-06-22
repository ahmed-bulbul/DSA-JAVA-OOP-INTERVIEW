package books.useOfLambdaExpression.commandDesignPattern.remove;

import books.useOfLambdaExpression.commandDesignPattern.Command;
import books.useOfLambdaExpression.commandDesignPattern.Tv;

public class OnCommand implements Command {

    private Tv tv;

    public OnCommand(Tv tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.switchOn();
    }
}
