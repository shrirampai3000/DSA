class Solution {
    public void reverseString(char[] s) {
        ArrayList<Character> list=new ArrayList<>();
        for (char c : s){
            list.add(c);
        }
        int left=0, right=list.size()-1;
        while(left<right){
            char temp=list.get(left);
            list.set(left, list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
        for(int i=0;i<s.length;i++){
            s[i]=list.get(i);
        }
    }
}