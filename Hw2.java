import java.util.Scanner;
import java.lang.System;
/**
 *
 * @author Victoria
 */
public class Hw2 {
    public static void main(String[] args) {
        int Pin = 1234;
        
 //       Scanner scan = new Scanner(System.in);
        System.out.println("Enter you PIN number: ");
 //1       int p = scan.nextInt();
        
        int count = 0;
        while(count < 3)
        {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        
        if(p == Pin)
        {
            System.out.println("Your PIN is correct! ");
            System.exit(1);
        //    return String.format("Your PIN is correct! ");
        }
        else if( p != Pin && count < 2)
        {
            System.out.println("Your PIN is incorrect! ");
            count++;
        }
        else
        {
        System.out.println("Your card is blocked!");
        System.exit(1);
        }
        }
    //    return String.format("Your card is blocked!" );
    }

}

