import java.util.Scanner;
public class YourDetails
{
    public static void main(String[]args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Your Age : ");
        String age = sc.nextLine();
        System.out.println("Enter Your Address :");
        String address = sc.nextLine();

        System.out.println("Your name is : " + name);
        System.out.println("Your age is : " + age);
        System.out.println("Your address is : " + address);
        sc.close();
    }
}
