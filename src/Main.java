import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String name, address, fileName;
        int age;
        System.out.println("Enter the name of the file: ");
        Scanner scanner = new Scanner(System.in);
        fileName = scanner.nextLine();
        PrintWriter pw = new PrintWriter(new FileWriter(fileName));
        do {
            System.out.println("Enter name : ");
            name = scanner.nextLine();
            System.out.println("Enter address : ");
            address = scanner.nextLine();
            System.out.println("Enter age : ");
            age = Integer.parseInt(scanner.nextLine());
            pw.println(name + " lives at " + address + " and is " + age + " years old ");
            System.out.println("Continue Y/N?");
            pw.flush();
        } while (scanner.nextLine().charAt(0) == 'Y');
        pw.close();

        Scanner fileScanner = new Scanner(new File("users.txt"));
        while (fileScanner.hasNext()){
            System.out.println(fileScanner.nextLine());
        }
        fileScanner.close();
    }
}