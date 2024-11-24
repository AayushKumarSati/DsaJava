class Solution {
    public String decodeString(String str) {
        /*
         * we are create in two stack first stack is store the number and second stack
         * store in String
         */

        Stack<Integer> numStack = new Stack<>();
        Stack<String> charStack = new Stack<>();
        // travere in string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {// identifying it is a number or not
                int num = 0;
                // to convert character(digit) into number
                while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    num = num * 10 + (int) (str.charAt(i) - '0');
                    i++;
                }
                i--;// to maintain loops variable
                numStack.push(num);

            } else if (ch != ']') {
                charStack.push(ch + "");
            } else {// if ch=='['closing brackets than
                String ans = "";
                while (!charStack.peek().equals("[")) {
                    ans = charStack.pop() + ans;
                }

                charStack.pop();
                // how many time repeatd in string
                int repeatnumber = numStack.pop();
                StringBuilder sb = new StringBuilder("");
                while (repeatnumber > 0) {
                    sb.append(ans);
                    repeatnumber--;
                }
                charStack.push(sb.toString());

            }
        }
        // finally return ans
        StringBuilder ans = new StringBuilder();
        while (charStack.size() > 0) {
            ans.insert(0, charStack.pop());
        }
        return ans.toString();

    }
}