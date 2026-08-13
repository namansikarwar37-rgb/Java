import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int age = 0;

        if(age >= 18){
          System.out.println("you are an adult!");
        }
        else if(age < 0){
          System.out.println("You haven't been born yet");
        }
        else if(age == 0){
          System.out.println("It's your first day on earth ;) ");
        }
        else{
          System.out.println("You are not an adult :(");
        }
    }
}
