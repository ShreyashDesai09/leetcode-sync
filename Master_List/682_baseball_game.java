// LeetCode: 682. Baseball Game
class _682_baseball_game {
    public int calPoints(String[] operations) {
        int[] scores = new int[operations.length];
        int top = -1; 
        int totalSum = 0; 

        for (String op : operations) {
            if (op.equals("+")) {
                int newScore = scores[top] + scores[top - 1];
                scores[++top] = newScore;
                totalSum += newScore;
            } else if (op.equals("D")) {
                int newScore = scores[top] * 2;
                scores[++top] = newScore;
                totalSum += newScore;
            } else if (op.equals("C")) {
                totalSum -= scores[top--];
            } else {
                int newScore = Integer.parseInt(op);
                scores[++top] = newScore;
                totalSum += newScore;
            }
        }
        return totalSum;
    }
}

