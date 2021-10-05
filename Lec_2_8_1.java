import java.io.*;
import java.nio.charset.StandardCharsets;

public class Lec_2_8_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader stdin =
                new BufferedReader(
                        new InputStreamReader(System.in));
        System.out.print("Enter a line:");
        System.out.println(stdin.lines());
    }
}
