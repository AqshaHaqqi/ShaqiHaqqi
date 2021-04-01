import java.util.Scanner;

public class ProcessAName5026201001 {
      public static void main(String[] args) {
            Substring();
      }            
      public static void Substring(){
             Scanner in = new Scanner(System.in);

             System.out.print("Enter your name: ");
             String name =in.nextLine();
             String firstName = name.substring(0,1);
             String lastName = name.substring(name.indexOf(" ") + 1);
             int nameLength = name.substring(0,name.indexOf(" ")).length();
             System.out.print(nameLength);
             System.out.printf("\nYour name is: %s, %s.", lastName, firstName);
       }

}
