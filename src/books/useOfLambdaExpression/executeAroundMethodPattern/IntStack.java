package books.useOfLambdaExpression.executeAroundMethodPattern;

import java.util.HexFormat;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class IntStack {
    private Integer[] elements = new Integer[16];
    private Lock lock = new ReentrantLock();
    private int size = -1;

    public void push(Integer value){
        lock.tryLock();

        try {
            if(size++ >= elements.length){
                resize();
            }
            elements[size] = value;
        }finally {
            lock.unlock();
        }
    }

    public void pushUsingLambda(Integer value){
        LockHelper.withLock(lock,()->{
            if (size++ >=elements.length){
                resize();
            }
            elements[size] = value;
        });
    }

    public int pop(){
        return LockHelper.withLock(lock,()->{
            Integer e = elements[size--];
            elements[size] = null;
            return e;
        });
    }

    private void resize() {
    }
}
