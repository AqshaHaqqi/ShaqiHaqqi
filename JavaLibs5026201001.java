import java.util.Scanner;

public class JavaLibs5026201001 {

      public static void main(String[] args) {
            Scanner papoiScan = new Scanner( System.in );

System.out.println( "What's Your Favorite Food? : ");
String food = papoiScan.nextLine();

System.out.println( "What's your favorite thing in the world? : ");
String thing = papoiScan.nextLine();

System.out.println( "What's your favorite number? : ");
int number = papoiScan.nextInt();

int jumlah = number + number;

System.out.println( "How tall are you?(Meters) : ");
double height = papoiScan.nextDouble();

double dollar = height + height;

System.out.print( "When you was a kid, your favorite food was " + food);
System.out.println( ", but then you bought " + thing + " you started to stop eating.");
System.out.println( "Then you bought " + thing + " for " + number + " days straight!");
System.out.println( "Time passes, and now you have " + jumlah + (" ") + thing);
System.out.println( "And then, when you wanted to buy once more, you checked your wallet.");
System.out.print( "You only have " + height + " Dollars left!" );
System.out.println( " While you need " + dollar + " Dollars :(");
System.out.print( "Now, you are so broke :( ");
System.out.print( "and you started to eat your " + thing);
System.out.println( " while you crying like a baby ");
System.out.print( "But you know, that your stomach cannot digest it ");
System.out.println( "and then you died.");
System.out.println( "THE END");

           papoiScan.close();
      }

}