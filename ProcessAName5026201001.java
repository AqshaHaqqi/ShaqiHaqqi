import java.util.Scanner;

public class ProcessAName5026201001 {
      public static void main(String[] args) {
                  
             Scanner in = new Scanner(System.in);

             System.out.print("Enter your first name: ");
             String first = in.next();
             System.out.print("Enter your last name: ");
             String last = in.next();

             String initials = last + ", " + first.substring(0,1) + ". ";
             System.out.println(initials);
       }

}