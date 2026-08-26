import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

      Random random = new Random();

      int number1;
      int number3;
      int number2;


      number1 = random.nextInt(1, 7); //First number is inclusive and the other is exclusive.
      number2 = random.nextInt(1, 7);
      number3 = random.nextInt(1, 7);


      System.out.println(number1);
      System.out.println(number2);
      System.out.println(number3);

      // Double number;
      // number = random.nextDouble();
      // System.out.println(number);





    }
}
