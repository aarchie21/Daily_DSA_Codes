import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Stack myStack=new Stack();
        int choice, new_data;  
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Get Top value");
            System.out.println("4. Get Height");
            System.out.println("5. Print Stack");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                System.out.print("Enter the value to be pushed: ");
                new_data = sc.nextInt();
                myStack.push(new_data);
                break;

                case 2:
                System.out.println("The popped value is : "+myStack.pop().value);
                break;

                case 3:
                myStack.getTop();
                break;

                case 4:
                myStack.getHeight();
                break;

                case 5:
                myStack.printStack();
                break;

                case 6:
                System.out.println("Exiting...");
                return;

                default:
                System.out.println("Enter a valid choice");
                break;
            }
        }
    }
}