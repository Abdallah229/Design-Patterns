package Logger;

abstract public class AbstractLogger {

    public  static  int INFO = 1 ;
    public  static  int DEBUG  = 2 ;
    public  static int Error = 3 ;

    protected  int level ;

    protected  AbstractLogger nextLogger ;

   public void setNextLogger(AbstractLogger nextLogger ) {
        this.nextLogger = nextLogger ;
    }

    abstract  protected  void write (String message ) ;
   public  void logMessage (int level , String message ) {
       if (this.level <= level ) {
           write(message);
       }
if (nextLogger != null ) {
    nextLogger.logMessage(level , message);
}
   }
}
