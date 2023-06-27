class Solution {
    public int distributeCandies(int[] candyType) {
        int totalCandies = candyType.length;
        HashSet<Integer> types = new HashSet<Integer>();
        for(int candies : candyType){
            types.add(candies);
        }
        int half = totalCandies/2;
        return Math.min(half,types.size());  
    }
}