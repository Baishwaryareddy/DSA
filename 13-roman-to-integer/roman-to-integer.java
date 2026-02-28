class Solution {
    public int romanToInt(String s) {
        int sum=0;
        int start=0;
       while(start<s.length()){
        if(start + 1 < s.length() &&
               check(s.charAt(start + 1)) > check(s.charAt(start))) {
                sum += check(s.charAt(start + 1)) - check(s.charAt(start));
                start += 2; 
            }
        else{
            sum+=check(s.charAt(start));
            start++;
        }
       }
       return sum; 
    }
    int check(char ch){
        if(ch=='I'){
            return 1;
        }
        else if(ch=='V'){
            return 5;
        }
        else if(ch=='X'){
            return 10;
        }
        else if(ch=='L'){
            return 50;
        }
        else if(ch=='C'){
            return 100;
        }
        else if(ch=='D'){
            return 500;
        }
        else {
            return 1000;
        }
    }
}