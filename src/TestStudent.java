import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) throws IOException {
        String fileName;
        Student student = new Student();
        System.out.println("Enter the name of the file: ");
        Scanner scanner = new Scanner(System.in);
        fileName = scanner.nextLine();
        PrintWriter pw = new PrintWriter(new FileWriter(fileName));
        do {
            System.out.println("Enter name : ");
            student.setName(scanner.nextLine());
            System.out.println("Enter Major : ");
            student.setMajor(scanner.nextLine());
            System.out.println("Enter GPA : ");
            student.setGPA(Double.parseDouble(scanner.nextLine()));
            pw.println(student.getName() + "," + student.getMajor() + "," + student.getGPA());
            System.out.println("Continue Y/N?");
        } while (scanner.nextLine().charAt(0) == 'Y');
        pw.close();
        Scanner fileScanner = new Scanner(new File("src/students.obj"));
        while (fileScanner.hasNext()){
            System.out.println(fileScanner.nextLine());
        }
        fileScanner.close();
        Scanner fileScan = new Scanner(new File("students.obj"));
        while (fileScanner.hasNext()){
            System.out.println(fileScanner.nextLine());
        }
        fileScan.close();
    }
}
