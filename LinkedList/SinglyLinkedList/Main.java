import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        LinkedList myLinkedList = new LinkedList();
        int choice, new_data;  
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Append to the List");
            System.out.println("2. Prepend to the List");
            System.out.println("3. Remove at Last");
            System.out.println("4. Remove at First");
            System.out.println("5. Get the element at a particular index");
            System.out.println("6. Set the element at a particular index");
            System.out.println("7. Insert the element at a particular index");
            System.out.println("8. Remove the element at a particular index");
            System.out.println("9. Reverse the List");
            System.out.println("10. Display");
            System.out.println("11. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to be inserted: ");
                    new_data = sc.nextInt();
                    myLinkedList.append(new_data);
                    break;
                case 2:
                    System.out.print("Enter the value to be inserted: ");
                    new_data = sc.nextInt();
                    myLinkedList.prepend(new_data);
                    break;
                case 3:
                    myLinkedList.RemoveAtLast();
                    System.out.println("Last element is deleted");
                    break;
                case 4:
                    System.out.println(myLinkedList.RemoveAtFirst());
                    break;
                case 5:
                    System.out.print("Enter the index: ");
                    int index = sc.nextInt();
                    System.out.println(myLinkedList.get(index).value);
                    break;
                case 6:
                    System.out.print("Enter the index: ");
                    index = sc.nextInt();
                    System.out.print("Enter the value: ");
                    new_data = sc.nextInt();
                    myLinkedList.set(index, new_data);
                    System.out.println("The value at "+index+" has been changed");
                    break;
                case 7:
                    System.out.print("Enter the index: ");
                    index = sc.nextInt();
                    System.out.print("Enter the value: ");
                    new_data = sc.nextInt();
                    myLinkedList.insert(index,new_data);
                    break;
                case 8:
                    System.out.print("Enter the index: ");System.out.print("Enter the index: ");
                    index = sc.nextInt();
                    myLinkedList.remove(index);
                    break;
                case 10:
                    myLinkedList.printList();
                    break;
                case 9:
                    myLinkedList.reverse();
                    break;
                case 11:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

// public class Main {

//     public static void main(String[] args) {
//         LinkedList myLinkedList = new LinkedList(1);
//         myLinkedList.append(2);
//         myLinkedList.append(3);
//         myLinkedList.append(4);
//         myLinkedList.append(5);

//         int k = 2;
//         int result = myLinkedList.findKthFromEnd(k).value;

//         System.out.println(result); // Output: 4

//         /*
//             EXPECTED OUTPUT:
//             ----------------
//             4
            
//         */
        
//     }
    

        

    
 
