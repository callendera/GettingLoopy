import java.util.Scanner;
public class CtoF
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double c;
        double f;
        boolean flag = false;
        String temp = "";

        do {
            System.out.print("Enter temperature in celsius: ");
            if (scan.hasNextDouble()) {
                flag = true;
                c = scan.nextInt();
                f = ((c * 9 / 5) + 32);
                System.out.println("The temperature in fahrenheit is " + f);
            } else {
                temp = scan.nextLine();
                System.out.println("Error: Bad Input!!");
            }
        } while(!flag);
    }
}
