public class ButterflyPattern {
    public static void main(String[] args) {
        // *               *
        // * *           * *
        // * * *       * * *
        // * * * *   * * * *
        // * * * * * * * * *
        // * * * *   * * * *
        // * * *       * * *
        // * *           * *
        // *               *

        int row;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        row = sc.nextInt();
        // for(int i=0;i<row;i++)
        // {
        //     for(int j=0;j<=i;j++)    
        //     {
        //         System.out.print("* ");
        //     }
        //     for(int j=0;j<2*(row-i)-2;j++)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int j=0;j<=i;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        for(int i=row;i>0;i--)
        {
            for(int j=0;j<=i;j++)    
            {
                System.out.print("* ");
            }
            for(int j=2*(row-i)-2;j>2;j--)
            {
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        // // Upper part of the butterfly
        // for (int i = 1; i <= row; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 1; j <= 2 * (row - i); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Lower part of the butterfly
        // for (int i = row; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 1; j <= 2 * (row - i); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        sc.close();
    }

    
}
