package interview;

import java.io.Closeable;
import java.io.IOException;

public class Test {

    public void display(){

        System.out.println("Hello");
    }
}


class A implements Cloneable {


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}