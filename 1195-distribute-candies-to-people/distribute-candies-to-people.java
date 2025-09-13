class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int give = 1; 
        int i = 0;   

        while (candies > 0) {
            int toGive = Math.min(give, candies);
            result[i] += toGive;
            candies -= toGive;
            give++;
            i = (i + 1) % num_people; 
        }

        return result;
    }
}
