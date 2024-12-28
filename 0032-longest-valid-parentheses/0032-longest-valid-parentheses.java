class Solution {
    public int longestValidParentheses(String s) {
           int stack[] = new int[s.length()+1];
         int index=-1;
         int max = 0;
         stack[++index] = -1;
        //  stack.push(-1);
         for(int i=0;i<s.length();i++){
             char ch = s.charAt(i);
             if(ch == '(') {
                   stack[++index] = i;
                //  stack.push(i); // index
             } else {
                 index--;
                //  stack.pop();
                 if(index==-1) {
                     stack[++index] = i;
                 } else {
                    max = Math.max(max, i - stack[index]);
                 }
                //  if(stack.isEmpty()) {
                //      stack.push(i);
                //  } else {
                //     max = Math.max(max, i - stack.peek());
                //  }
                 
             }
         }
         return max;
    }
}