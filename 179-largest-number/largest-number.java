class Solution {
    public String largestNumber(int[] nums) {
        List<String> list = new ArrayList<String>();
        for (int n : nums) {
            list.add(String.valueOf(n));
        }

        
        list.sort((a, b) -> (b + a).compareTo(a + b));

        if(list.get(0).equals("0")) return "0";

        return String.join("", list);
    //     String result = Arrays.stream(nums)
    //         .mapToObj(String::valueOf)
    //         .sorted((a, b) -> (b + a).compareTo(a + b))
    //         .reduce("", (s1, s2) -> s1 + s2);

    // return result.startsWith("0") ? "0" : result;
        
    }
}