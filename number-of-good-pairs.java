class Solution {
    public int numIdenticalPairs(int[] a) {
        Map<Integer,Integer> m=new HashMap<>();
        int c=0;
        for(int x:a){ c+=m.getOrDefault(x,0); m.put(x,m.getOrDefault(x,0)+1); }
        return c;
    }
}
