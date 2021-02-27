public class QuestionTwo {
    // [1,2,9] -> [1,3,0]
    public void incrementInteger(int[] A) {
        int n = A.length - 1;
        A[n]++;

        for(int i = n; i > 0 && A[i] == 10; i--) {
            A[i - 1]++;
            A[i] = 0;
        }

        if(A[0] == 10) {
            int[] answer = new int[n + 1];
            answer[0] = 1;
            return answer;
        }

        return A;
    }
}
