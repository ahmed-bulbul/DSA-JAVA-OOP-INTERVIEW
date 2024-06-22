package books.useOfLambdaExpression.commandDesignPattern;

public class TvClient {

    public static void main(String[] args) {
        Tv tv = new Tv();
//        Command onCommand = new OnCommand(tv);
//        Command offCommand = new OffCommand(tv);

        RemoteControl remoteControl = new RemoteControl();
//        remoteControl.press(onCommand);
//        remoteControl.press(offCommand);

//        remoteControl.press(()->tv.switchOn());
//        remoteControl.press(()->tv.switchOff());


        remoteControl.press(tv::switchOn);
        remoteControl.press(tv::switchOff);
        remoteControl.press(()->tv.mySum(10,20));
    }
}
