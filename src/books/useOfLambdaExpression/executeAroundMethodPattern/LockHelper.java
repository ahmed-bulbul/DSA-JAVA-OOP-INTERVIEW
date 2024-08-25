package books.useOfLambdaExpression.executeAroundMethodPattern;

import java.util.concurrent.locks.Lock;

public class LockHelper {
    public static void withLock(Lock lock, VoidBusinessCode voidBusinessCode){
        lock.tryLock();
        try {
            voidBusinessCode.apply();
        }finally {
            lock.unlock();
        }
    }

    public static int withLock(Lock lock, IntBusinessCode intBusinessCode){
        lock.tryLock();
        try {
            return intBusinessCode.apply();
        }finally {
            lock.unlock();
        }
    }
}
