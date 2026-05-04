class Solution {
    public boolean isValid(String s) {
       Stack<Character> list = new Stack<>();
       for(int i = 0 ;i<s.length();i++){
        char c = s.charAt(i);
        if(c=='('||c=='{'||c=='['){
            list.push(c);
        }else if(list.isEmpty()){
            return false;
        } else if(c==')'){
           char  c2 = list.pop();
            if(c2!='('){
                return false;
            }
        }else if(c==']'){
            char c2 = list.pop();
            if(c2!='['){
                return false;
            }
        }else if(c=='}'){
            char c2 = list.pop();
            if(c2!='{'){
                return false;
            }
        }
       }
       return list.isEmpty();
    }
}