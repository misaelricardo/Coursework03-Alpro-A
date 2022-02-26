import java.util.Random;

public class ComputeMethods5026211066 {
    public double fToC(double degreesF){
        return 5.0/9.0*(degreesF-32); //temperature in celsius
    }
    public double hypotenuse(int a, int b) {
        return  Math.sqrt((a*a)+(b*b)); //hypotenuse of side a and b
    }
    public int roll(){
        Random random = new Random();
        int dice1 = random.nextInt(6)+1; // value of the 1st dice
        int dice2 = random.nextInt(6)+1; // value of the 2nd dice
        return dice1+dice2; // sum of the dice values
    }
}