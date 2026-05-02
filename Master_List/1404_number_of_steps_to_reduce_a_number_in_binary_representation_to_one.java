// LeetCode: 1404. Number of Steps to Reduce a Number in Binary Representation to One
class _1404_number_of_steps_to_reduce_a_number_in_binary_representation_to_one {
    public int numSteps(String s) {
        int ans = 0;
        int carry = 0;

        for (int i = s.length() - 1; i > 0; i--) {
            int numberBit = (s.charAt(i) - '0') + carry;

            if (numberBit == 1) {
                ans += 2;
                carry = 1;
            } else if (numberBit == 0) {
                ans += 1;
                carry = 0;
            } else if (numberBit == 2) {
                ans += 1;
                carry = 1;
            }
        }

        return ans + carry;
    }
}
