class Solution {
    public boolean isArmstrong(int n) {
        if(n == 0) return true;

        int count = 0;
        int originalNum = n;
        
        //to count number of digits
        while(n>0){
            n = n/10;
            count++;
        }

        //to calculate sum to check isArmstrong
        n = originalNum;
        int sum = 0;
        while(n > 0){
            sum += Math.pow((n%10), count);
            n = n/10;
        }

        if(originalNum == sum){
            return true;
        }
        else return false;
    }
}