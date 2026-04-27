package MultiThreading;

import java.io.IOException;

public class Threads {
    static void main(String[] args) throws IOException
    {
        Process process = Runtime.getRuntime().exec("mspaint.exe");
        Process process1 = Runtime.getRuntime().exec("notepad.exe");
    }

}
