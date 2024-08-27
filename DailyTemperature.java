// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int popped = st.pop();
                result[popped] = i - popped;
            }
            st.push(i);
        }

        return result;

    }
}