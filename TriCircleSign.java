import java.util.Scanner;
/**
 * TriCircleSign
 */
public class TriCircleSign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        boolean y = true;

        do {
            // prompt user to enter the length of a side triangle 
            System.out.println("Enter the length of a side of your triangle: ");
            double l = in.nextDouble();
            
            // prompt user to enter string for sign
            System.out.println("Enter the string you would like on your sign: ");
            in.nextLine();
            String sign = in.nextLine();
            

            // calculate area and radius
            double s = (3 * l) / 2;
            double t = s * (Math.pow(s-l, 3));
            double r = (Math.pow(l, 3)) / (4 * Math.sqrt(t));
            double area = ((Math.PI) * (Math.pow(r, 2)));

            // count nonblank characters 
            int Characters = 0; 
            for (int i = 0; i < sign.length(); i++) { 
                if (sign.charAt(i) != ' ') {
                Characters++;
                }
            } 

            // Calculate total cost of sign 
            double square = (area * 2.35);
            double chara = (1.45 * Characters);
            double total = (square + chara);

            // print out 2 decimal places 
            System.out.printf("$%.2f\n", total);
            // System.out.println();
            
            // Prompt user to enter decisions
            System.out.println("Would you like to create another sign? Enter quit to exit. ");
            input = in.nextLine();
            if (input.equals("quit")){
                y = false;
            }
        } while (y);

    }
}