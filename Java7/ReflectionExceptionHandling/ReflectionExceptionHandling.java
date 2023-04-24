package Java7.ReflectionExceptionHandling;

import java.util.logging.Logger;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;

public class ReflectionExceptionHandling {

    private final static Logger LOGGER = Logger.getLogger(ReflectionExceptionHandling.class.getName());

    public static void main(String[] args){
        beforeJava7();
        withJava7();
    }

    private static void beforeJava7() {
        try{
            Class.
            forName("Java7.CatchingMultipleExceptions.CatchMultipleExceptions").
            getMethod("withJava7").
            invoke(null,new Object[]{}); 
        } catch ( IllegalAccessException | 
        InvocationTargetException | 
        NoSuchMethodException | 
        ClassNotFoundException ex) {
            LOGGER.log(Level.SEVERE,ex.getMessage());
        }
    }

    private static void withJava7() {
        try{
            Class.
            forName("Java7.CatchingMultipleExceptions.CatchMultipleExceptions").
            getMethod("withJava7").
            invoke(null,new Object[]{}); 
        } catch (ReflectiveOperationException ex) {
            LOGGER.log(Level.SEVERE,ex.getMessage());
        }        
    }

    
}
