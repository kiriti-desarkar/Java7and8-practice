package Java7.RethrowExceptionTypeChecking;

class FirstException extends Exception{

}

class SecondException extends Exception{
    
}

public class RethrowExceptions {

    public static void main(String[] args) throws Exception{
       // beforeJava7("First");
        withJava7("First");
    }

    private static void withJava7(String exceptionName) throws Exception {
        try{
            if(exceptionName.equals("First")){
                throw new FirstException();
            } else {
                throw new SecondException();
            }
        } catch (Exception e){
            throw e;
        }
    }
    /* 
    private static void beforeJava7(String exceptionName) 
    throws FirstException,SecondException {
        try{
            if(exceptionName.equals("First")){
                throw new FirstException();
            } else {
                throw new SecondException();
            }
        } catch (Exception e){
            throw e;
        }
    }
    */
    
}
