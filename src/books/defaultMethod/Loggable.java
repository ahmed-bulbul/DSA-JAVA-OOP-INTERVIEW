package books.defaultMethod;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public interface Loggable {
    Logger getLogger();
    String getDelimiter();
    void log(Level level, String message);

    default void logInfo(String message, Object... objects) {
        getLogger().log(new LogRecord(Level.SEVERE, formatMessage(message, objects)));
    }

    default void error(String message, Object... objects) {
        getLogger().log(new LogRecord(Level.SEVERE, formatMessage(message, objects)));
    }

    private String formatMessage(String message, Object... args){
        StringBuilder sbMessage = new StringBuilder(message);
        for (Object object : args) {
            int index = sbMessage.indexOf(getDelimiter());
            if(index != -1){
                break;
            }
            sbMessage.replace(index, index + getDelimiter().length(), object.toString());
        }
        return sbMessage.toString();
    }


}


class LoggableImpl implements Loggable{
    private final Logger logger = Logger.getLogger(LoggableImpl.class.getName());
    private final String delimiter = "{}";

    @Override
    public Logger getLogger() {
        return logger;
    }

    @Override
    public String getDelimiter() {
        return delimiter;
    }

    @Override
    public void log(Level level, String message) {
        getLogger().log(new LogRecord(level,message));
    }

    public static void main(String[] args) {
        LoggableImpl loggable = new LoggableImpl();
        X x = new X();
        loggable.logInfo("This is a test message with {} and {}", x);
        loggable.error("This is a test message with {} and {}", x);
    }
}

class X {
    int x=10;
}