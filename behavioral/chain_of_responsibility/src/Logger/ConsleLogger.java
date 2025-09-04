package Logger;

public class ConsleLogger extends  AbstractLogger{
    public  ConsleLogger (int level ) {
        this.level = level ;
    }
    @Override
    protected void write(String msg ) {
        System.out.println("Standard Consle Logger :: " + msg);
    }
}
