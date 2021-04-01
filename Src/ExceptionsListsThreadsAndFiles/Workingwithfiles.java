package ExceptionsListsThreadsAndFiles;
import java.io.File;

public class Workingwithfiles {
    public static void main(String[] args) {
        File file = new  File("a.txt");

        if(file.exists())
        {
            System.out.println("Yesy");
        }
    }
}

