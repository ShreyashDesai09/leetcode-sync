class Solution {
    public String convert(String s, int numsRows) {

        if (numsRows == 1 || s.length() <= numsRows) return s;
        
        int i = 0, j = 0 , x = 0;

        char convArr[][] = new char [numsRows][s.length()];

        while(x < s.length())
        {
            if(i == 0)
            {
                while(i < numsRows && x < s.length())
                {
                    convArr[i][j] = s.charAt(x);
                    x++; 
                    i++;
                }
                i -= 2;
                j++;
            }
            else if(i == numsRows - 1 || i > 0)
            {
                convArr[i][j] = s.charAt(x);    
                x++;
                i--;
                j++;
            }

        }

        StringBuffer strbuf = new StringBuffer();

        for(int r = 0 ; r < convArr.length ; r++)
        {
            for(int c = 0 ; c < convArr[r].length ; c++)
            {
                if(convArr[r][c] == '\0')
                    continue;
                else 
                    strbuf.append(convArr[r][c]);
            }
        }

        return strbuf.toString();

    }
}
