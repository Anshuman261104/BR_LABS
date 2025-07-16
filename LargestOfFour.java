import java.util.Scanner;
public class LargestOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();
        sc.close();

        int largest = (a > b) ? ((a > c) ? ((a > d) ? a : d) : ((c > d) ? c : d)) :
                ((b > c) ? ((b > d) ? b : d) : ((c > d) ? c : d));

        System.out.println("The largest number is: " + largest);
    }

}
