//A perfect number is a number whose proper divisors (excluding the number itself) add up to the number itself.

class Solution {
    public boolean isPerfect(int n) {
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        return sum==n;
    }
}