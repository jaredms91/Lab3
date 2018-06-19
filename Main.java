import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner menu = new Scanner(System.in);
        int mpg;
        double tankCap;
        double percent;

        while (true) {
            System.out.print("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
            if (menu.hasNextInt()) {
                mpg = menu.nextInt();
                if (mpg>0){
                    break;
                } else {
                    System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
                    System.exit(0);
                }
            } else {
                System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
                System.exit(0);
            }
        }

        while (true){
            System.out.print("Enter your car's tank capacity(gallons) as a positive decimal: ");
            if(menu.hasNextDouble()){
                tankCap = menu.nextDouble();
                if (tankCap>0){
                    break;
                } else {
                    System.out.println("ERROR: ONLY POSITIVE DECIMAL NUMBERS ARE ACCEPTED FOR TANK CAPACITY!!!");
                    System.exit(0);
                }
            } else {
                System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
                System.exit(0);
            }
        }

        while(true){
            System.out.print("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
            if (menu.hasNextDouble()) {
                percent = menu.nextDouble();
                if (percent>=0 && percent<=100){
                    break;
                } else {
                    System.out.println("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
                    System.exit(0);
                }
            } else {
                System.out.println("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
                System.exit(0);
            }
        }

        double rawRange = mpg*tankCap*(percent*.01);
        int rawRangeInt = (int) rawRange;

        if (rawRange<=25){
            System.out.print("Attention! Your current estimated range is running low: " + rawRangeInt + " miles left!!!");
        } else {
            System.out.print("Keep driving! Your current estimated range is: " + rawRangeInt + " miles!");
        }
    }
}
