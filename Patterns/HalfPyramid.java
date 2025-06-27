import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        // * 
        // * *
        // * * *
        // * * * *
        // * * * * *
        
        int row;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        row=sc.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}
