import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Queue myQueue=new Queue();
        int choice, new_data;  
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Get First value");
            System.out.println("4. Get Last value");
            System.out.println("5. Get Length");
            System.out.println("6. Print Queue");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                System.out.print("Enter the value to be enqueued  : ");
                new_data = sc.nextInt();
                myQueue.enqueue(new_data);
                break;

                case 2:
                System.out.println("The dequeued value is : "+myQueue.dequeue().value);
                break;

                case 3:
                myQueue.getFirst();
                break;

                case 4:
                myQueue.getLast();
                break;

                case 5:
                myQueue.getLength();
                break;

                case 6:
                myQueue.printQueue();
                break;

                case 7:
                System.out.println("Exiting...");
                return;

                default:
                System.out.println("Enter a valid choice");
                break;
            }
        }
    }
}