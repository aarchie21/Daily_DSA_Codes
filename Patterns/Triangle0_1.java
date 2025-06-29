public class Triangle0_1 {
    public static void main(String[] args) {
        // 0
        // 0 1
        // 0 1 0
        // 0 1 0 1
        // 0 1 0 1 0
        
        int row;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        row = sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i % 2 == 0 && j % 2 != 0 || i % 2 != 0 && j % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }  
            }
            System.out.println();
        }

        // OR
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print((i+j) % 2 + " ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
