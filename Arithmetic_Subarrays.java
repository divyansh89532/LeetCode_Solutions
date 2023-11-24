class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans_bool = new ArrayList<Boolean>();
        for (int i = 0; i < l.length; i++) {
            int flag = 0;
            int[] arr = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            Arrays.sort(arr);
            int diff = arr[1] - arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] - arr[j] != diff) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                ans_bool.add(true);
            } else {
                ans_bool.add(false);
            }

        }
        return ans_bool;
    }
}
