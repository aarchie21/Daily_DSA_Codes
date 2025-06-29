import java.util.Scanner;
public class FloydsTriangle {
    public static void main(String[] args) {
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        
        int row, num = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        row = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        sc.close();
    }
}