import java.util.Arrays;

public class basics {
    public static void main(String[] args) {
        String[] names = {"naman", "shaurya", "gaurav", "ansh"};

        names[1] = "nobita";
        int numofnames = names.length;
        Arrays.sort(names);
        // Arrays.fill(names, "naman"); // filled the array- names with value- naman.

        System.out.println(names[1]);
        System.out.println(numofnames);

        for(int i = 0; i < names.length; i++){
          System.out.print(names[i] + " ");
        }

        for(String name : names){
          System.out.println(name);
        }
    }
}
