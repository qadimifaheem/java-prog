//find the prime number with some conditions

import java.util.Scanner;
class prime
{
    public static void main(String[] agrs)
    {
        Scanner scanner = new Scanner(System.in);
        int c=0, d=3 , e=0 , f=3;
        do
        {
            System.out.println("\nEnter the 1st +ve integer\n");
            int n1 = scanner.nextInt();
            if(n1>0)
            {
                do
                {
                    System.out.println("\nEnter the 2nd +ve integer\n!!But 2nd num - "+n1+" should be > 50!!\n");
                    int n2 = scanner.nextInt();
                    int n3;
                    int i;
                    n3=n2-n1;
                    if(n3>50)
                    {
                        System.out.println("\nThe number is valid\nThe prime numbers from "+n1+" to "+n2+" are below\n");
                        for (i = n1; i <= n2; i++)
                        {
                            if (p(i))
                            {
                                    System.out.println(i);
                            }
                        }
                        System.exit(0);
                    }
                    else
                    {
                        e++;
                        f--;
                        System.out.println("\nThe number after subtraction of 2nd and 1st number is "+n3+"\nYou have "+f+" tries left to put +ve integer");
                    }
                    if(e==3)
                    {
                        System.exit(0);
                    }
                }while(e<3);   
            }
            else
            {
                c++;
                d--;
                System.out.println("\nYou have entered -ve integer\nYou have "+d+" tries left to put +ve integer");
            }
            if(c==3)
            {
                System.exit(0);
            }
        }while(c<3);
    }
    public static boolean p(int num)
    {
        if ((num <= 1))
        {
            return false;
        }
        else
        {
            for (int i = 2; i <= Math.sqrt(num); i++)
            {
                if (num % i == 0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}
