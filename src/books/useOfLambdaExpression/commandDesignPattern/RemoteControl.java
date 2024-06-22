package books.useOfLambdaExpression.commandDesignPattern;

import books.defaultMethod.A;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {

    private List<Command> history = new ArrayList<>();

    public void press(Command command){
        history.add(command);
        command.sum();
        command.execute();
    }
}
