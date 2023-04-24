package Java7.nioFiles;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsInJava7 {
    private static String HOME_DIR = "C:/udemy/java7and8newfeatures/Java7and8-practice/Java7";

    public static void main(String[] args) {
        buildPath();
    }

    private static void buildPath() {
        Path path = Paths.get(HOME_DIR,"nioFile","Test.txt");
        Path fileName = path.getFileName();
        System.out.println("File Name is : "+fileName);
        System.out.println("File system is : "+path.getFileSystem());
        System.out.println("File system separator is : "+path.getFileSystem().getSeparator());
        for(int i =0;i<path.getNameCount();i++){
            Path subPath = path.getName(i);
            System.out.println("Path location at index : "+(i+1)+" is "+subPath.toString());
        }
        System.out.println("Sub path is : "+path.subpath(0, 2));
        System.out.println("Root path is : "+path.getRoot());
        System.out.println("Parent path is : "+path.getParent());
    }
    
}
