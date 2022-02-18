import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	double length = 0;
    double width = 0;
    double area;
    double perimeter;
    double diagonal;
    String trash = " ";

        Scanner console = new Scanner(System.in);

        System.out.print("Enter length: ");

        if (console.hasNextDouble())
        {
            length = console.nextDouble();
            console.nextLine();
        }
        else
        {
            trash = console.nextLine();
            System.out.println("Invalid input: " + trash + " Restart program");
            System.exit(0);
        }

        System.out.print("Enter width: ");

        if (console.hasNextDouble())
        {
            width = console.nextDouble();
            console.nextLine();
        }
        else
        {
            trash = console.nextLine();
            System.out.println("Invalid input: " + trash + " Restart program");
            System.exit(0);
        }

        area = length * width;
        System.out.println("The area of the rectangle is " + area + " Units squared ");

        perimeter = (length + length) * (width + width);
        System.out.println("The perimeter of the rectangle is " + perimeter + " Units");

        diagonal = Math.sqrt(Math.pow(length , 2 )) + (Math.pow(width , 2));
        System.out.println("The length of the Diagonal is " + diagonal + " Units ");



    }
}
