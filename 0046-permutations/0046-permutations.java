class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void per(int[] nums, int start, int end){
        if(start == end){
            List<Integer> list = new ArrayList<>();

            for (int num : nums) {
                list.add(num);
            }

            result.add(list);
            return;
        }

        for (int i = start; i <= end; i++) {
            swap(nums, start, i);
            per(nums, start + 1, end);
            swap(nums, start, i);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        per(nums, 0, nums.length - 1);

        return result;
    }
}