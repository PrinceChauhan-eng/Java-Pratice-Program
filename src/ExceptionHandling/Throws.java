package ExceptionHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


class ReadAndWrite{
    void readFile() throws FileNotFoundException
    {
        FileInputStream fs = new FileInputStream("c:/Test.txt");
    }

    void saveFile()throws FileNotFoundException{
        FileOutputStream op = new FileOutputStream("c:/xyz.txt");
    }

}

public class Throws {
    static void main(String[] args) {
        ReadAndWrite rw = new ReadAndWrite();
        try {
            System.out.println("Java");
            rw.readFile();
            System.out.println("King");

        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        try {
            rw.saveFile();
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("Hello");

    }
}
