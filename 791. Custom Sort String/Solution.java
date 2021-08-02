class Solution {
    public String customSortString(String order, String str) {
        int count = 0;
        char term;
        char[] strArr = str.toCharArray();

        for (char ch : order.toCharArray()) {
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i] == ch) {
                    term = strArr[count];
                    strArr[count] = ch;
                    strArr[i] = term;
                    count++;
                }
            }
        }
        return String.valueOf(strArr);
    }
}
