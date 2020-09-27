class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arrList = new ArrayList<String>();
        for(int i = 1 ; i <= n ; i ++) {
            if( i % 3 == 0 && i % 5 == 0) {
                arrList.add("FizzBuzz");
            }
            else if( i % 3 == 0) {
                arrList.add("Fizz");
            }
            else if (i % 5 == 0) {
                arrList.add("Buzz");
            }
            else {
                arrList.add(String.valueOf(i));
            }
        }
        return arrList;
    }
}