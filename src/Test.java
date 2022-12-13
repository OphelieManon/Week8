import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner fileScanner = new Scanner(new File("students.obj"));
        while (fileScanner.hasNext()){
            System.out.println(fileScanner.nextLine());
        }
        fileScanner.close();
    }
}
