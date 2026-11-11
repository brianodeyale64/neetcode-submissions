class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(0, new ArrayList<>(), 0, nums, target, res);
        return res;
    }

    private void dfs(
        int i, List<Integer> cur, int total, int[] nums, int target, List<List<Integer>> res)
        {
            if(total == target)
            {
                res.add(new ArrayList<>(cur));
                return;
            }

            if(i >= nums.length || total > target) return;

            cur.add(nums[i]);
            dfs(i, cur, total + nums[i], nums, target, res);
            cur.remove(cur.size() -1);

            dfs(i + 1, cur, total, nums, target, res);
        }
}
