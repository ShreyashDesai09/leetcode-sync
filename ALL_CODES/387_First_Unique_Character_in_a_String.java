class Solution {
    public int firstUniqChar(String s) {
    
        int check = -1;
        for(int i = 0 ; i < s.length() ; i++)
        {
            boolean count = duplicateChecker(i , s);
            if(count == false)
            {
                check = i;
                break;
            }
        }

        return check;


    }

    public boolean duplicateChecker(int j , String s)
    {
        boolean repeated = false;
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(i == j)
                continue;
            else if(s.charAt(i) == s.charAt(j))
            {
                repeated = true;
                count = i;
                break;
            }
        }

        if(repeated == true)
            return true;
        else
            return false;
    }
}
