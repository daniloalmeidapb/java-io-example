import java.io.*;

public class OutputTest {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("output.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Testing the write in file");
        bw.newLine();
        bw.write("Content next row");
        bw.newLine();

        bw.close();

        // simple
        PrintStream out = new PrintStream("output.txt");
        out.println("Testing the write in file");
        out.println("Content next row");
    }
}
