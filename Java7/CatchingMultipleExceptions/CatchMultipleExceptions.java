package Java7.CatchingMultipleExceptions;

import java.util.logging.Logger;
import java.util.logging.Level;

public class CatchMultipleExceptions {
    private final static Logger LOGGER = Logger.getLogger(CatchMultipleExceptions.class.getName());

    public static void main(String[] args){
        beforeJava7();
        withJava7();
    }

    public static void beforeJava7(){
        int arr[] = {1,2,3};
        try{
            for(int i=0;i<arr.length+1;i++){
                System.out.println(arr[i]);
            }
        } catch(NullPointerException ex){
            LOGGER.log(Level.SEVERE,ex.getMessage());
        } catch(ArrayIndexOutOfBoundsException ex){
            LOGGER.log(Level.SEVERE,ex.getMessage());
        }
    }

    public static void withJava7(){
        int arr[] = {1,2,3};
        try{
            for(int i=0;i<arr.length+1;i++){
                System.out.println(arr[i]);
            }
        } catch(NullPointerException | ArrayIndexOutOfBoundsException ex){
            LOGGER.log(Level.SEVERE,ex.getMessage());
        }
    }
}
