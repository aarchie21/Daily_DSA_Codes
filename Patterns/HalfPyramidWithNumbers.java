import java.util.Scanner;
public class HalfPyramidWithNumbers {

    public static void main(String[] args) {
        // 1 
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        
        int row;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        row=sc.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}

    
