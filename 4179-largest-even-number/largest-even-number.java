class Solution {
    public String largestEven(String s) {
        int index = -1;
        //we will be mov ing from right to left, since we need to chec k the values from right to extreme left
        for (int i=s.length()-1; i>=0; i--) {
            if (s.charAt(i) == '2') {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return "";
        }
        // substring returns from(inclusive) to last index(exclusive)
        return s.substring(0, index+1);
    }
}