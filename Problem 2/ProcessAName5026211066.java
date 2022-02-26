import java.util.Scanner;

public class ProcessAName5026211066 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: "); //name input
        String fullname = input.nextLine();
        input.close();
        int spcindx = fullname.indexOf(" "); // index of the space between the first and last name
        char name1 = fullname.charAt(0); // first letter of first name
        String name2 = fullname.substring(spcindx+1); // last name

        System.out.println();
        System.out.println("Your name is: "+name2+", "+name1+"."); //name output
    }
}