import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code here
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];
        for (int i = 0; i < names.length; i++){
            System.out.println("Enter Student's name:");
            String studentName =  scanner.next();
            names[i] = studentName;
        }
        System.out.println("You have entered the following names:");
        for (String name : names){
            System.out.println(name);
        }
    }
}
