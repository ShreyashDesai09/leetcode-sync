[Zclass Solution {

    public int uniquePaths(int m, int n) {

        if(m == 0 || n == 0) return 0;
        if(m == 1 || n == 1) return 1;
        
        double mFact = m - 1;
        double nFact = n - 1;


        double num = mFact + nFact;

        double i = 0;
        i = mFact - 1;
        while(i > 1)
        {
            mFact *= i;    
            i--;
        }

        i = nFact - 1;
        while(i > 1)
        {
            nFact *= i;    
            i--;
        }

        i = num - 1;
        while(i > 1)
        {
            num *= i;    
            i--;
        }

        double den = mFact * nFact;

        return (int) Math.round(num / den);
    }
}
