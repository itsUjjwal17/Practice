import java.util.HashMap;
class a {
    public int removeSmallestSubarray(int[] nums, int p) {
        // Edge case: if the sum of the array is already divisible by p
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % p == 0) {
            return -1;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int minLength = Integer.MAX_VALUE;
        map.put(0, -1); // Initialize the map with a key of 0 and value of -1

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int remainder = prefixSum % p;
            if (map.containsKey(remainder)) {
                minLength = Math.min(minLength, i - map.get(remainder));
            }
            if (!map.containsKey(remainder)) {
                map.put(remainder, i);
            }
        }

        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }
}
