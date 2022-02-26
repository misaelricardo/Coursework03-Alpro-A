import java.util.Scanner;

public class TestClass5026211066 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        ComputeMethods5026211066 comp = new ComputeMethods5026211066();

        // output of fToC method

        System.out.println();
        System.out.println(" FAHRENHEIT TO CELSIUS CONVERTER\n ");
        System.out.print("Enter a temperature in Fahrenheit: ");
        double tempF = input.nextDouble();
        double tempC = comp.fToC(tempF);
        System.out.println("The temp in Celsius is "+ tempC+ " degree.\n");

        //output of hypotenuse method

        System.out.println(" HYPOTENUSE CALCULATOR \n");
        System.out.print("Enter the length of side A: ");
        int length_a = input.nextInt();
        System.out.print("Enter the length of side B: ");
        int length_b = input.nextInt();
        double hypotenuse = comp.hypotenuse(length_a,length_b);
        System.out.println("Hypotenuse is "+hypotenuse+".");
        System.out.println();

        //output of roll method

        System.out.println(" SUM OF TWO DICE VALUES GENERATOR \n");
        int sum = comp.roll();
        System.out.println("The sum of the dice values is "+sum+".");

        input.close();
    }
}