// LeetCode: 13. Roman to Integer
class _13_roman_to_integer {
    public int romanToInt(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            char next = (i + 1 < s.length()) ? s.charAt(i + 1) : ' ';

            if (current == 'I') {
                if (next == 'V' || next == 'X') {
                    number -= 1; 
                } else {
                    number += 1;
                }
            } 
            else if (current == 'V') {
                number += 5; 
            } 
            else if (current == 'X') {
                if (next == 'L' || next == 'C') {
                    number -= 10;
                } else {
                    number += 10;
                }
            } 
            else if (current == 'L') {
                number += 50;
            } 
            else if (current == 'C') {
                if (next == 'D' || next == 'M') {
                    number -= 100;
                } else {
                    number += 100;
                }
            } 
            else if (current == 'D') {
                number += 500;
            } 
            else if (current == 'M') {
                number += 1000;
            }
        }
        return number;
    }
}
