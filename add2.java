//addition taking numbers from user

import java.util.Scanner;
class add2{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number = ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number = ");
        int num2 = scanner.nextInt();
        //int num3 = num1+num2;
        System.out.println("Sum is = "+ (num1*num2));
        scanner.close();
    }
}

	