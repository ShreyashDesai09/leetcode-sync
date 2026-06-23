class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();

        int length = Math.max(a.length() , b .length());

        length += 1;

        int i = 0;
        
        int c = 0;
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;

        while(length > i)
        {
            if(bLength >= 0 && aLength >= 0)
            {
                if(a.charAt(aLength) == '1' && b.charAt(bLength) == '1' && c == 0)
                {
                    ans.insert(0 , '0');
                    c = 1;
                    length--;
                    aLength--;
                    bLength--;
                }
                else if(a.charAt(aLength) == '1' && b.charAt(bLength) == '1' && c == 1)
                {
                    ans.insert(0 , '1');
                    c = 1;
                    length--;
                    aLength--;
                    bLength--;
                }
                else if(a.charAt(aLength) == '1' && b.charAt(bLength) == '0' && c == 0)
                {
                    ans.insert(0 , '1');
                    c = 0;
                    length--;
                    aLength--;
                    bLength--;
                }
                else if(a.charAt(aLength) == '0' && b.charAt(bLength) == '1' && c == 0)
                {
                    ans.insert(0 , '1');
                    c = 0;
                    length--;
                    aLength--;
                    bLength--;
                }
                else if(a.charAt(aLength) == '0' && b.charAt(bLength) == '1' && c == 1)
                {
                    ans.insert(0 , '0');
                    c = 1;
                    length--; aLength--; bLength--;
                }
                else if(a.charAt(aLength) == '1' && b.charAt(bLength) == '0' && c == 1)
                {
                    ans.insert(0 , '0');
                    c = 1;
                    length--; aLength--; bLength--;
                }
                
                else if(a.charAt(aLength) == '0' && b.charAt(bLength) == '0' && c == 1)
                {
                    ans.insert(0 , '1');
                    c = 0;
                    length--; aLength--; bLength--;
                }
                else 
                {
                    ans.insert(0 , '0');
                    c = 0; 
                    length--; aLength--; bLength--;
                }
            }
            else
            {
                if(bLength >= 0 && aLength < 0)
                {
                    if(b.charAt(bLength) == '1' && c == 0)
                    {
                        ans.insert(0 , '1');
                        c = 0;
                        length--;
                        bLength--;
                    }
                    else if(b.charAt(bLength) == '1' && c == 1)
                    {
                        ans.insert(0 , '0');
                        c = 1;
                        length--;
                        bLength--;
                    }
                    else if(b.charAt(bLength) == '0' && c == 0)
                    {
                        ans.insert(0, '0');
                        length--;
                        bLength--;
                    }
                    else
                    {
                        ans.insert(0, '1');
                        c = 0;
                        length--;
                        bLength--;
                    }
                }
                else if(aLength >= 0 && bLength < 0)
                {
                    if(a.charAt(aLength) == '1' && c == 0)
                    {
                        ans.insert(0 , '1');
                        c = 0;
                        length--;
                        aLength--;
                    }
                    else if(a.charAt(aLength) == '1' && c == 1)
                    {
                        ans.insert(0 , '0');
                        c = 1;
                        length--;
                        aLength--;
                    }
                    else if(a.charAt(aLength) == '0' && c == 0)
                    {
                        ans.insert(0, '0');
                        length--;
                        aLength--;
                    }
                    else
                    {
                        ans.insert(0, '1');
                        c = 0;
                        length--;
                        aLength--;
                    }
                }
                else
                {
                    if(c == 1)
                    {
                        ans.insert(0, '1');
                        c = 0;
                    }
                    length--;
                }
            }
        }

        String answer = ans.toString();

        return answer;

    }
}
