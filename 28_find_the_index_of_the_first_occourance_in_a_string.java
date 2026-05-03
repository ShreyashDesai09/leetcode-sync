class 28_find_the_index_of_the_first_occourance_in_a_string {
    public int strStr(String haystack, String needle) {
        
        if(haystack.length() == 0 || needle.length() == 0) return -1;

        int i = 0; 
        int count = 0;
        int hit = 0;
        while(i < haystack.length() - needle.length() + 1)
        {
            hit = i;
            count = 0;
            for(int j = 0 ; j < needle.length() ; j++)
            {
                if(haystack.charAt(i) == needle.charAt(j))
                {
                    count++;
                    i++;
                }
                else
                {
                    break;
                }
            }
            if(count == needle.length())
                break;
            i = hit + 1;
        }

        if(count == needle.length())
            return hit;
        return -1;

    }
}
