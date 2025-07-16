import java.util.*;

public class TemperatureConverter 
{
   public static void main(String[] args)
   {
      Scanner i = new Scanner(System.in);

      System.out.print("\n Enter temperature in Celsius: ");
      double celsius = i.nextDouble();

      double fahrenheit = (celsius * 9/5) + 32;

      System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " degree Fahrenheit.");

      i.close();
   }
}
