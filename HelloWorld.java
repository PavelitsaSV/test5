import java.util.Random;
import java.io.*;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        String name , city;
        int age;
/*
        for (int i = 0; i < 5; i++) {
            Random  random= new Random();
            System.out.println("HelloWorld  "+random.nextInt(100));
        }
*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        name = reader.readLine();
        int nAge = Integer.parseInt(reader.readLine());
        System.out.println( "Через "+ nAge +" " + name +" захватит мир. Му-ха-ха!");
    }
}
