package mystreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("002.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String ch = "My world! ";
        bw.write(ch);
        bw.close();
    }
}
