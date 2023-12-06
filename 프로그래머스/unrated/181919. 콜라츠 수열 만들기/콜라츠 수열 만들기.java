import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<Integer>();
        int i = n;
        answer.add(i);
        while(i!=1){
            if(i%2==1){
                i = 3*i+1;
            }
            else{
                i = i / 2;
            }
            answer.add(i);
        }
        return answer;
    }
}