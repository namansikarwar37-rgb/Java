import java.util.Scanner;

public class userInput{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your name : ");
        String name = scanner.nextLine();

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        System.out.print("Enter your GPA : ");
        double GPA = scanner.nextDouble();

        System.out.println("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("hello " + name);
        System.out.println("your age is " + age);
        System.out.println("your GPA is " + GPA);
        System.out.println("Student : " + isStudent);
        scanner.close();

    }
}
