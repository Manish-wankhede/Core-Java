import java.io.*;

public class Buffer {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter((new FileWriter("a.txt")));
        bw.write("Hello Buffer");
        bw.close();

        BufferedReader br = new BufferedReader((new FileReader("a.txt")));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}