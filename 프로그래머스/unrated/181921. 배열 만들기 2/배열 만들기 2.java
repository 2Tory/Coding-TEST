import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> answer = new ArrayList<Integer>();
        for(int i = l; i<=r; i++){
            String s = Integer.toString(i);
            boolean t = true;
            for(int j = 0; j<s.length(); j++){
                if(s.charAt(j) != '5' && s.charAt(j) != '0'){
                    t = false;
                }
            }
            if(t){
                answer.add(i);
            }
        }
        
        if(answer.size() == 0){
            answer.add(-1);
        }
        return answer;
    }
}