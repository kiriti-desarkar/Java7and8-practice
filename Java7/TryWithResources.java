package Java7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// No need to close resource uses AutoCloseable
public class TryWithResources{
    public static void main(String[] args) throws FileNotFoundException, IOException{
    try(BufferedReader br = new BufferedReader(
        new FileReader(
            "C:/udemy/java7and8newfeatures/Java7and8-practice/Java7/test.txt"));){
            String sCurrentLine;
            while((sCurrentLine = br.readLine()) != null){
                System.out.println(sCurrentLine);
            }
        }

    }
}