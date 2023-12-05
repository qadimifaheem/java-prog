//addition another way

import java.util.Scanner;
class add{
    int sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number = ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number = ");
        int num2 = scanner.nextInt();
        scanner.close();
        return num1+num2;
    }
}
class plus{
    public static void main(String[] args){
    add a;
    a = new add();
    System.out.println("The answer is = "+ a.sum());
    }
}