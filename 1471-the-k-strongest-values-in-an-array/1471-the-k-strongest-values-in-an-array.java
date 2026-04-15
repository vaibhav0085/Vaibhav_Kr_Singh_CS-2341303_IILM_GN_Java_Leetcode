class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int median = arr[(n - 1) / 2];
        
        int[] result = new int[k];
        int left = 0, right = n - 1;
        int index = 0;
        
        while(index < k) {
            if(Math.abs(arr[right] - median) >= Math.abs(arr[left] - median)) {
                result[index++] = arr[right--];
            } else {
                result[index++] = arr[left++];
            }
        }
        
        return result;
    }
}