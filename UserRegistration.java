package UserRegistration;
import java.util.Scanner;
import java.lang.*;
public class UserRegistration {

    private static final Scanner scan = new Scanner(System.in);
    public static  void main(String[] args) {
        validateUserData();
    }
    public static void validateUserData()
    {
        System.out.println("Enter Your First name");
        String name = scan.next();
        System.out.println("The first name is: " + name);
        String pattern = "^([A-Z]{1})([a-z]{2,})$";

        if( name.matches(pattern))
        {
            System.out.println("Name is Valid");
        }
        else
        {
            System.out.println("Name is Invalid");
        }
    }
    public static void validateUserLastName()
    {
        System.out.println("Enter Your Last name");
        String name = scan.next();
        System.out.println("The Last name is: " + name);
        String pattern = "^([A-Z]{1})([a-z]{2,})$";
        if( name.matches(pattern))
        {
            System.out.println("Name is Valid");
        }
        else
        {
            System.out.println("Name is Invalid");
        }
    }

    public static void validEmail()
    {
        System.out.println("Enter Your Email");
        String name = scan.next();
        System.out.println("The Email is: " + name);
        String pattern = "^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2}([.][a-zA-Z]{2,4}){0,1}$";
        if( name.matches(pattern))
        {
            System.out.println("Name is Valid");
        }
        else
        {
            System.out.println("Name is Invalid");
        }
    }

    public static void validMobileNo()
    {
        System.out.println("Enter Your Mobile No.");
        String name = scan.nextLine();

        System.out.println("The Mobile No is: " + name);
        String pattern =  "^([0-9]{2})[ ]([1-9]{1}[0-9]{9})$";
        if( name.matches(pattern))
        {
            System.out.println("Name is Valid");
        }
        else
        {
            System.out.println("Name is Invalid");
        }
    }

    public static void validPassword()
    {
        System.out.println("Enter Your Password.");
        String name = scan.nextLine();

        System.out.println("The Password is: " + name);
        String pattern =  "^[A-Za-z0-9]{8,}$";
        if( name.matches(pattern))
        {
            System.out.println("Name is Valid");
        }
        else
        {
            System.out.println("Name is Invalid");
        }
    }
    public static void passwordAtLeastOneUpperCase()
    {
        System.out.println("Enter Your Password.");
        String name = scan.nextLine();

        System.out.println("The Password is: " + name);
        String pattern =  "^(.*[A-Z]{1}[A-Za-z0-9]{7,})$";
        if( name.matches(pattern))
        {
            System.out.println("Name is Valid");
        }
        else
        {
            System.out.println("Name is Invalid");
        }
    }
}
