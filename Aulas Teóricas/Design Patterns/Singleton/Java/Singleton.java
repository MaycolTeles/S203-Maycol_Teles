
public class LogManager2 {

    private static LogManager2 instance;

    private LogManager2(){}

    public static LogManager2 getInstance(){
        if(instance == null)
            instance = LogManager2();

        return instance;
    }


}