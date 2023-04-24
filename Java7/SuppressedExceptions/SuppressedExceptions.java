package Java7.SuppressedExceptions;

import java.util.logging.Logger;
import java.util.logging.Level;

public class SuppressedExceptions {

    private final static Logger LOGGER = Logger.getLogger(SuppressedExceptions.class.getName());

    public static void main(String[] args){
        try {
            beforeJava7();
        } catch( Exception ex){
            LOGGER.log(Level.SEVERE,ex.getMessage());
        }

        try{
            withJava7();
        } catch(Exception ex){
            LOGGER.log(Level.SEVERE,ex.getMessage());
            final Throwable[] suppressedExceptions = ex.getSuppressed();
            for(Throwable exception:suppressedExceptions){
                LOGGER.log(Level.SEVERE,exception.getMessage());
            }
        }

        
}

    /**
     * Sample implementation before Java 7
     * @throws Exception
     */
    private static void beforeJava7() throws Exception {
        CustomDirtyResource cr = null;
        try{
            cr = new CustomDirtyResource();
            cr.readFromResource();
        } finally {
            cr.close();
        }
    }

        /**
     * Sample implementation with Java 7
     * @throws Exception
     */
    private static void withJava7() throws Exception {
        try(CustomDirtyResource cr = new CustomDirtyResource();){
            cr.readFromResource();
        }
    }

}
