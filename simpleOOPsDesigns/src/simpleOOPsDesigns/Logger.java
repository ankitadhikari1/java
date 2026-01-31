package simpleOOPsDesigns;

interface LoggerInterface {
    void log(String message);
}

class ConsoleLogger implements LoggerInterface {
    public void log(String message) {
        System.out.println("Console logger is logging");
        System.out.println("message - " + message);
    }
}

class FileLogger implements LoggerInterface {
    public void log(String message) {
        System.out.println("File logger is logging");
        System.out.println("message - " + message);
    }
}

class DBLogger implements LoggerInterface {
    public void log(String message) {
        System.out.println("DB logger is logging");
        System.out.println("message - " + message);
    }
}

class LoggerFactory {

    public LoggerInterface getLogger(String loggerName) {

        if ("consolelogger".equalsIgnoreCase(loggerName)) {
            return new ConsoleLogger();
        } 
        else if ("filelogger".equalsIgnoreCase(loggerName)) {
            return new FileLogger();
        } 
        else if ("dblogger".equalsIgnoreCase(loggerName)) {
            return new DBLogger();
        } 
        else {
            throw new IllegalArgumentException("Invalid logger type");
        }
    }
}

class LoggerManager {

    private static volatile LoggerManager instance;
    private LoggerFactory loggerFactory;

    private LoggerManager() {
        loggerFactory = new LoggerFactory();
    }

    public static LoggerManager getInstance() {
        if (instance == null) {
            synchronized (LoggerManager.class) {
                if (instance == null) {
                    instance = new LoggerManager();
                }
            }
        }
        return instance;
    }

    public void log(String loggerName, String message) {
        LoggerInterface logger = loggerFactory.getLogger(loggerName);
        logger.log(message);
    }
}

public class Logger {

    public static void main(String[] args) {

        LoggerManager obj1 = LoggerManager.getInstance();
        obj1.log("consolelogger", "this is printing in console log");

        LoggerManager obj2 = LoggerManager.getInstance();
        obj2.log("dblogger", "this is printing in DB log");

        System.out.println(obj1 == obj2);
    }
}
