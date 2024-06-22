package books.useOfLambdaExpression.commandDesignPattern.remove;

import books.useOfLambdaExpression.commandDesignPattern.Command;
import books.useOfLambdaExpression.commandDesignPattern.Tv;

public class OffCommand implements Command {

    private Tv tv;

    public OffCommand(Tv tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.switchOff();
    }
}
