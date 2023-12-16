import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<Integer>();
        for(int i = 0; i<intStrs.length ; i++){
            String ans = "";
            for(int j = s; j<s+l; j++){
                ans += intStrs[i].charAt(j);
            }
            if(Integer.parseInt(ans)>k){
                
                answer.add(Integer.parseInt(ans));
            }
        }
        return answer;
    }
}