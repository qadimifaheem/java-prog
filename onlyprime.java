//check that the number is prime number
import java.util.Scanner;
class onlyprime
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num1 = scanner.nextInt();
        if(isPrime(num1))
            {
                System.out.println(num1 + " is the prime number");
            }
        else
            {
            System.out.println(num1 + " is not prime number");
            }
        scanner.close();
    }
    public static boolean isPrime(int num)
    {
        if((num <=1))
        {
            return false;
        }
        else
        {
            for(int i=2;i<=Math.sqrt(num);i++)
            {
                if(num % i == 0)
                {
                    return false;
                }

            }
            return true;

        }
    }
}
