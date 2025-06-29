import java.util.*;
public class SolidRectangle {
    public static void main(String[] args) {
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        int col;
        int row;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        col=sc.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        row=sc.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}