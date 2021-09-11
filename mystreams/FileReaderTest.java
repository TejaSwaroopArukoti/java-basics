package mystreams;

import java.io.FileReader;

public class FileReaderTest {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("001.txt");
        int ch = fr.read();

        while( ch!= -1) {
            System.out.print((char)ch);
            ch = fr.read();
        }

        fr.close();
    }   
}
