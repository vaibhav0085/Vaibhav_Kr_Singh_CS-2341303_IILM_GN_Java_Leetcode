import java.util.Arrays;

public class productOfArrayExeptItself {

    public static int[] productExceptSelf(int[] nums) {   // ← static added
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int product = 1;

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }

            ans[i] = product;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] result = productExceptSelf(nums);

        System.out.println(Arrays.toString(result));
    }
}
