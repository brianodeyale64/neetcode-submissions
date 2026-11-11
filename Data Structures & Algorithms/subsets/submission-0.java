class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] nums, int i, List<Integer> bag, List<List<Integer>> res)
    {
        if(i == nums.length)
        {
            res.add(new ArrayList<>(bag));
            return;
        }
        bag.add(nums[i]);
        backtrack(nums, i + 1, bag, res);

        bag.remove(bag.size() - 1);
        backtrack(nums, i + 1, bag, res);
    }
}
