class Solution {

    public Boolean isAnagram(String s, String t) {
        char[] S=s.toCharArray();
        char[] T=t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);
        return Arrays.equals(S,T);

    }

}
