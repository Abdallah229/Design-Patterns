import Logger.* ;
public class Main {
    public  static AbstractLogger getChainOfLoggers () {
        AbstractLogger consleLogger = new ConsleLogger(AbstractLogger.INFO) ;
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.Error) ;
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG) ;

        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(consleLogger);
        return  errorLogger ;
    }
    public static void main(String[] args) {

        AbstractLogger chainLogger = getChainOfLoggers() ;

        chainLogger.logMessage(AbstractLogger.INFO ,"This is an info message");
        chainLogger.logMessage(AbstractLogger.DEBUG ,"This is a debug message");
        chainLogger.logMessage(AbstractLogger.Error ,"This is an error message");

    }
}