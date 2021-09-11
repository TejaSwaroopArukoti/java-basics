package mystreams;

import java.io.FileWriter;

public class FileWriterTest {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("001.txt");
        String str = "Just test";
        fw.write(str);
        fw.close();
    }
}
