import java.util.Scanner;

//2d array encrypt
class eny
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentance you want to be encrypted\n");
        String l= scanner.nextLine();
        int leng= l.length();
        System.out.println("The length of a string is "+leng);

        System.out.println("\nEnter the number of cloumns : \n");
        int a=scanner.nextInt();

        char [][] z= new char[6][a];

        int pos=0;

        for(int i=0;i<z.length;i++)
        {
            for(int j=0;j<z[i].length;j++)
            {
                z[i][j]=l.charAt(pos);
            }
        }
        for(int j=0;j<z[a].length;j++)
        {
            System.out.println(z[0][j]+""+z[1][j]+""+z[2][j]+""+z[3][j]+""+z[4][j]+""+z[5][j]);
        }
    }
}
