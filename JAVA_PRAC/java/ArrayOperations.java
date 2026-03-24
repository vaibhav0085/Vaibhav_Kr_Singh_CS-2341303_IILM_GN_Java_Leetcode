import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[100]; // extra space for insertion

        // Input elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;
        do {
            System.out.println("\n--- ARRAY OPERATIONS ---");
            System.out.println("1. Print Array");
            System.out.println("2. Insert Element");
            System.out.println("3. Delete Element");
            System.out.println("4. Update Element");
            System.out.println("5. Search Element");
            System.out.println("6. Reverse Array");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                // 1. Print
                case 1:
                    System.out.print("Array: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                // 2. Insert
                case 2:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();

                    for (int i = n; i >= pos; i--) {
                        arr[i] = arr[i - 1];
                    }
                    arr[pos - 1] = val;
                    n++;
                    break;

                // 3. Delete
                case 3:
                    System.out.print("Enter position to delete: ");
                    pos = sc.nextInt();

                    for (int i = pos - 1; i < n - 1; i++) {
                        arr[i] = arr[i + 1];
                    }
                    n--;
                    break;

                // 4. Update
                case 4:
                    System.out.print("Enter position to update: ");
                    pos = sc.nextInt();
                    System.out.print("Enter new value: ");
                    val = sc.nextInt();

                    arr[pos - 1] = val;
                    break;

                // 5. Search
                case 5:
                    System.out.print("Enter element to search: ");
                    val = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == val) {
                            System.out.println("Found at position " + (i + 1));
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Element not found");
                    break;

                // 6. Reverse
                case 6:
                    int start = 0, end = n - 1;
                    while (start < end) {
                        int temp = arr[start];
                        arr[start] = arr[end];
                        arr[end] = temp;
                        start++;
                        end--;
                    }
                    System.out.println("Array reversed");
                    break;

                case 7:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 7);

        sc.close();
    }
}

// import java.util.*;
// public class ArrayOperations {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[100];
       
//         System.out.println("Enter the elements: ");
//         for (int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         int choice;
//         do { 
//             System.out.println("\n--- ARRAY OPERATIONS ---");
//             System.out.println("1. Print Array");
//             System.out.println("2. Insert Element");
//             System.out.println("3. Delete Element");
//             System.out.println("4. Update Element");
//             System.out.println("5. Search Element");
//             System.out.println("6. Reverse Array");
//             System.out.println("7. Exit");
//             System.out.print("Enter choice: ");
//             choice = sc.nextInt();

//             switch (choice) {
//                 case 1: System.out.println("enter the element: ");
//                 for (int i = 0;i < n; i--){
//                     System.out.println(arr[i]+" ");
//                 }
//                 System.out.println();
//                 break; 

//                 case 2: System.out.println("enter the element to insert: ");
//                 int pos=sc.nextInt();
//                 System.out.println("enter the vlaue: ");
//                 int value=sc.nextInt();
//                 for(int i=n; i>+pos;i--){
//                     arr[i]=arr[i-1];
//                 }
//                 arr[pos-1]=value;
//                 n++;
//                 break;
                 
//                 case 3: System.out.println("enter the value to delete: ");
//                 pos=sc.nextInt();
//                 System.out.println("the the value:");
//                 value=sc.nextInt();

//                 for(int i = pos-1; i<n-1;i++){
//                   arr[i]=arr[i-1];
//                 }
//                 n--;
//                 break;

//                 case 4: System.out.println("exit");
//                 break;
//                 default:
//                 System.out.print("invalid input");

//             }
//         } while (choice!=4);
//         sc.close();
//     }
// }
