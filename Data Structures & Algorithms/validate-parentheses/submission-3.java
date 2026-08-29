class Solution {
    public boolean isValid(String s) {

        Stack<Character> valid = new Stack<>();     

        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                valid.push(c);
            }
            else{
                if (valid.isEmpty()) {
                    return false;
                }

                char top = valid.pop();

                if(c == ')' && top != '('){
                    return false;
                }
                if(c == '}' && top != '{'){
                    return false;
                }
                if(c == ']' && top != '['){
                    return false;
                }
            }
        }

        return valid.isEmpty();
    }
}
