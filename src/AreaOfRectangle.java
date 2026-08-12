import java.util.Scanner;

public class AreaOfRectangle{
    public static void main(String[] args){

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter width :");
        width = scanner.nextDouble();

        System.out.print("enter height :");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("the area is : " + area);


        scanner.close();
    }

}