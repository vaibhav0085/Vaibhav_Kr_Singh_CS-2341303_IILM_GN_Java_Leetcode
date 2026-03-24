public class BinaruSearch {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6};
        int key=5;
        int low =0;
        int high=arr.length-1;

        while(low<=high){
            int  mid=(low+high)/2;

            if(arr[mid]==key){
                System.out.print("element at index:"+ mid);
                return;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.print("not present");
    }
}
