class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;

        
    }

    private void backtrack(int[] c, int remaining, int start, List<Integer> path,   List<List<Integer>> res)
    {
        if(remaining == 0)
        {
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = start; i < c.length; i++)
        {
            if(i > start && c[i] == c[i - 1]) continue;
            if(c[i] > remaining) break;

            path.add(c[i]);
            backtrack(c, remaining - c[i], i + 1, path, res);
            path.remove(path.size() - 1);
        }
    }
}
