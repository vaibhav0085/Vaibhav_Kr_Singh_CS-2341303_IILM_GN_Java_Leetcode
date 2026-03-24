public class LinearSearching {
    public static void main(String args[]){
        int[] arr ={1,2,3,4,5,6};
        int key=6;
        for(int i =0; i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("found at index: "+ i);
                return;
            }
        } 
        System.out.println();
    }
}
