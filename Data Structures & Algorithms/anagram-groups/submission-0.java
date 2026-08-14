class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String Key = new String(chars); 

        if (map.containsKey(Key))
        {
            map.get(Key).add(s);
        } 
        else 
        {
            map.put(Key, new ArrayList<>());
            map.get(Key).add(s);
        }
        } 
        return new ArrayList<>(map.values());   
    }
}
