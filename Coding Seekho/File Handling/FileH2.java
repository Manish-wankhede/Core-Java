import java.io.*;

public class FileH2 {
    public static void main(String[] args) throws IOException {
        // File h1 = new File("a.txt");
        String str = "Institude";
        FileOutputStream f1 = new FileOutputStream("a.txt", true);

        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            f1.write(ch[i]);
        }

        f1.close();

    }
}
