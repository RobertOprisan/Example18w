import java.util.Scanner;
public class Example18w {
    public static void main(String[] args) {
        double hours, price, gross, taxes, netPay;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter price hours");
        price = input.nextDouble();
        System.out.println("Enter hours");
        hours = input.nextDouble();

        if (hours > 35) {
            gross = 35 * price * (hours - 35) * price * 1.5;
        } else {
            gross = hours * price;
        }
        System.out.println("Gross salary = " + gross);
        taxes = 0;

        if (gross > 500){
            if (gross > 900) {
                taxes = 400 * 0.25 + (gross - 500) * 0.25;
            }
        }
        netPay = gross - taxes;
        System.out.println("Taxes = " + taxes);
        System.out.println("Net Pay = " + netPay);
    }
}
