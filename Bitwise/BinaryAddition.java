/*
* Given two binary strings, return their sum (also a binary string).
*/
public class Solution {
    public String addBinary(String A, String B) {
        StringBuilder sb = new StringBuilder();
        int i =A.length()-1;
        int j = B.length()-1;
        int carry = 0;
        while (i >=0 && j >=0) {
            int a = Character.getNumericValue(A.charAt(i));
            int b = Character.getNumericValue(B.charAt(j));
            int sum = a + b + carry;
            sb.insert(0, sum % 2);
            carry = sum/2;
            i--;
            j--;
        }

        while (i >=0) {
            int a = Character.getNumericValue(A.charAt(i));
            int sum = a + carry;
            sb.insert(0, sum % 2);
            carry = sum/2;
            i--;
        }

        while (j >=0) {
            int b = Character.getNumericValue(B.charAt(j));
            int sum = b + carry;
            sb.insert(0, sum % 2);
            carry = sum/2;
            j--;
        }
        if (carry == 1) {
            sb.insert(0, carry);
        }
        return sb.toString();
    }
}
