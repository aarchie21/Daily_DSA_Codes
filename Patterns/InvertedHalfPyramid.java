import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
    
        // * * * * *
        // * * * *
        // * * *
        // * * 
        // * 
        
        int row;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        row=sc.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=row;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        // OR
        for(int i= row;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
