import java.util.*;
public class reverse {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the no. of element:");
     int n= sc.nextInt();
     int[] arr = new int[n];

     for(int i=0; i<n; i++){
        System.out.print("enter the element: ");
        arr[i]=sc.nextInt();
     }

     System.out.println("element are :");
     for(int i=0; i<n; i++){
        System.out.println(arr[i]+ " " );
     }

    }
}