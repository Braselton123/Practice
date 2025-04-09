import java.util.Scanner;
public class ReactangleArea{
    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the width of the Reactangle: ");
double width = scanner.nextDouble();

System.out.println("Enter the hight of the Reactangle: ");
double hight = scanner.nextDouble();

double area = width*hight;

System.out.println("Enter the area of the Reactangle: " + area);
scanner.close();
}
}
