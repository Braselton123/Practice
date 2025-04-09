import java.util.Scanner;
public class CoverterToctof{
    public static void main(String[] args){
     
      Scanner scanner = new Scanner(System.in);
  System.out.println("enter the celsius: ");
    double celsius = scanner.nextDouble();

    double farenheit = (celsius * 9/5)+32;

    System.out.println("farenheit of the celsius is:" + farenheit);
    scanner.close();

    }
}
