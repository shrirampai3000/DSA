class Solution {
    private String convert(long num, int base){
        String chars="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder sb=new StringBuilder();

        while(num>0){
            sb.append(chars.charAt((int)(num%base)));
            num/=base;
        }
        return sb.reverse().toString();
    }
    public String concatHex36(int n) {
        long square=1L*n*n;
        long cube=1L*n*n*n;

        return convert(square,16)+convert(cube,36);
    }
}