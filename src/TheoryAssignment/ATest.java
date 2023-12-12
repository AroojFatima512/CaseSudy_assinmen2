package StudentManagementSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ATest {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("abc.txt");
        try {
            FileReader fr = new FileReader(f);
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }

    }
}
