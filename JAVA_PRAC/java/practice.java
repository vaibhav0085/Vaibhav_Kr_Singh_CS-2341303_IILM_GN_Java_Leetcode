class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 4};
        int n = arr.length;

        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i <= n; i++) {
            xor1 ^= i;
        }

        for (int i = 0; i < arr.length; i++) {
            xor2 ^= arr[i];
        }

        System.out.println("Missing number is: " + (xor1 ^ xor2));
    }
}
