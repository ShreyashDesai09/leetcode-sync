// LeetCode: 392. Is Subsequence
class _392_is_subsequence {
    public boolean isSubsequence(String s, String t) {
        
        int count = 0;

        boolean answer = false;

        if(s.length() < t.length())
        {
            for(int i = 0 ; i <= s.length() -1 ; i++)
            {

                boolean present = false;
                int newCount = 0;
                int j = count;
                while(j <= t.length() - 1 )
                {
                    if(s.charAt(i) == t.charAt(j))
                    {
                        newCount = j;
                        present = true;
                        break;
                    }
                    j++;
                }
            
                if(present != true)
                {
                    answer = false;
                    return false;
                }
                else if(present == true && count > newCount)
                {
                    answer = false;
                    return false;
                }
                else 
                {
                    count = newCount;
                    count++;
                }        
                }
                return true;
        }
        else if(s.length() == 0 && t.length() == 0)
        {
            return true;
        }
        else if(s.length() == 0 && t.length() != 0)
        {
            return false;
        }
        else
        {
            return false;
        }

        


    }
}
