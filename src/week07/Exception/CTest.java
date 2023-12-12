package week07.Exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CTest {
        public static void main(String[] args) throws IOException {

            File f=new File("abc.txt");
            FileReader fr=new FileReader(f);
        }
}
