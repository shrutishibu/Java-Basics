//The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.

//Solution
class Solution {
    public int GCD(int n1, int n2) {
        int gcd = 1;
        int n = Math.min(n1, n2);
        for(int i=n; i>0; i--){
            if(n1%i ==0 && n2%i ==0){
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}