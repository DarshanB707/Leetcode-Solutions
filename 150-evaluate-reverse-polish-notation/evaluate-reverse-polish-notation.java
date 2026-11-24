class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int a = 0, b = 0, c = 0;
        for(int i = 0;i<tokens.length;i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && 
                !tokens[i].equals("*") && !tokens[i].equals("/")){
                s.push(Integer.parseInt(tokens[i]));
            }else{
                b = s.pop();
                a = s.pop();
                c = 0;
                if(tokens[i].equals("+")){
                    c = a + b;
                }else if(tokens[i].equals("-")){
                    c = a - b;
                }else if(tokens[i].equals("*")){
                    c = a * b;
                }else{
                    c = a / b;
                }
                s.push(c);
            }
        }
        return s.pop();
    }
}