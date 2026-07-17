class Solution {
    public int[] shortestToChar(String s, char c) {
       int n = s.length();
       int [] answer = new int[n];
       
       for(int i = 0 ; i < n ; i++) {
            answer[i] = Integer.MAX_VALUE;
       } 

       for(int i = 0 ; i < n ; i++) {
        if(s.charAt(i) == c) {
            answer[i] = 0;
            
            for(int j = 0 ; j < n ; j++) {
                if(Math.abs(j - i) < answer[j])
                    answer[j] = Math.abs(j - i);
            }
        }
       }

       return answer;
    }
}
