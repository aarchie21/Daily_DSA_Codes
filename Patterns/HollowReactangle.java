import java.util.*;
public class HollowReactangle {
    public static void main(String[] args) {
        // * * * * *
        // *       *
        // *       *
        // * * * * *
     int col;
        int row;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        col=sc.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        row=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||j==0||i==row-1||j==col-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
