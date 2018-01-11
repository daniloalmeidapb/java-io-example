import java.io.*;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("input.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader reader = new BufferedReader(isr);

        String row = reader.readLine();
        while (row != null) {
            System.out.println(row);
            row = reader.readLine();
        }

        reader.close();

        // simple
        Scanner sc = new Scanner(new File("input.txt"));
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
