package mystreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FilesReading {
    public static void main(String[] args) throws IOException {
        FileInputStream f1 = new FileInputStream("mystreams/mytext.txt");
        while(true) {
            int num = f1.read();
            if(num==-1)
            break;
            System.out.print((char)num);
            
        }
        f1.close();
    }
}
