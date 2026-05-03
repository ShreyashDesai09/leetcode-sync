class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();

        int  i = 0;
        while(i < tokens.length)
        {
            
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/") || tokens[i].equals("*"))
            {
                if(tokens[i].equals("+"))
                {
                    int x = st.pop();
                    st.push(st.pop() + x);
                }
                else if(tokens[i].equals("-"))
                {
                    int x = st.pop();
                    st.push(st.pop() - x);
                }
                else if(tokens[i].equals("/"))
                {
                    int x = st.pop();
                    st.push(st.pop() / x);
                }
                else if(tokens[i].equals("*"))
                {
                    int x = st.pop();
                    st.push(st.pop() * x);
                }
            }
            else
            {
                st.push(Integer.parseInt(tokens[i]));
            }

            i++;

        }

        return st.peek();

    }
}
